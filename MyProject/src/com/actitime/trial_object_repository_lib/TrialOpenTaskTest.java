package com.actitime.trial_object_repository_lib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TrialOpenTaskTest {
	@FindBy(linkText="Projects & Customers")
	private WebElement projectAndCustomerLink;

	public void clickOnProjectAndCustomer()
	   {
		projectAndCustomerLink.click();
	   }

}
