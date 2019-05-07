package com.actitime.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenTask {
@FindBy(linkText="Projects & Customers")
private WebElement projectAndCustomerLink;

public void clickOnProjectAndCustomer()
   {
	projectAndCustomerLink.click();
   }
}
