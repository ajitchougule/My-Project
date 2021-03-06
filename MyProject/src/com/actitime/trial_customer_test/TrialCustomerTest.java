package com.actitime.trial_customer_test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.actitime.objectrepositorylib.CreateCustomer;
import com.actitime.objectrepositorylib.Home;
import com.actitime.objectrepositorylib.OpenTask;
import com.actitime.objectrepositorylib.ProjectAndCustomer;
import com.trial.gen_lib.TrialBaseClass;

public class TrialCustomerTest extends TrialBaseClass {
	@Test 
	public void craeteCustomerTest() throws Throwable
	{
		String CustomerName = fLib.getExcelData("Sheet1", 1, 2);
		
		Home hp= PageFactory.initElements(driver, Home.class);
		hp.clickOnTaskImage();
		
		OpenTask op = PageFactory.initElements(driver, OpenTask.class);
		op.clickOnProjectAndCustomer();
		
		ProjectAndCustomer pac = PageFactory.initElements(driver, ProjectAndCustomer.class);
		pac.clickOnCreateCustomerBtn();
		
		CreateCustomer cp= PageFactory.initElements(driver, CreateCustomer.class);
		cp.createCustomer(CustomerName);
		String actSuccesMsg=pac.getSuccesMsg().getText();
		
		boolean status =actSuccesMsg.contains("successfully created");
		Assert.assertFalse(status);
		}
}
