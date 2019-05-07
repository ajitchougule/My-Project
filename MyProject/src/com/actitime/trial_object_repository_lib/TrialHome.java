package com.actitime.trial_object_repository_lib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import com.trial.gen_lib.TrialBaseClass;


@Test
public class TrialHome extends TrialBaseClass {
	@FindBy(xpath = "//div[text()='TASKS']")
	private WebElement taskImg;
	@FindBy(xpath = "//div[text()='USERS']")
	private WebElement userImg;
	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement logoutLink;

	public void clickOnTaskImage() {
		taskImg.click();
	}
	public void clickOnUserImg()
	{
		userImg.click();
	}
	public void clickOnlogout()
	{
		logoutLink.click();
	}
}
