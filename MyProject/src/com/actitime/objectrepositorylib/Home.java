package com.actitime.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.actitime.genericlib.BaseClass;

public class Home extends BaseClass{
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
