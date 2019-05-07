package com.actitime.trial_object_repository_lib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TrialCreateCustomer {@FindBy(id = "customerLightBox_nameField")
private WebElement customerName;
@FindBy(id = "customerLightBox_descriptionField")
private WebElement CustomerDescEdt;
@FindBy(xpath = "//span[@class='buttonTitle'and text()='Create Customer']")
private WebElement createCustomerBtn;

public void createCustomer(String CustomerName) {
	customerName.sendKeys(CustomerName);
	createCustomerBtn.click();

}
public void createCustomer(String CustomerName,String CustomerDesc) {
	
	customerName.sendKeys(CustomerName);
	CustomerDescEdt.sendKeys(CustomerDesc);
	createCustomerBtn.click();
}

}
