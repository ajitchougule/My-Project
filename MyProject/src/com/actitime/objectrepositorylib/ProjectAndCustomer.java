package com.actitime.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProjectAndCustomer {
@FindBy(xpath="//span[text()='Create Customer']")
private WebElement createCustomerBtn;
@FindBy(xpath="//span[@class='successfully created']")
private WebElement succesMsg;

public void clickOnCreateCustomerBtn()
{ createCustomerBtn.click();
	}

public WebElement getSuccesMsg()
{ return succesMsg;
	}
}
