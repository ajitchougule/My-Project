package com.actitime.genericlib;

/**
 * @author Ajit
 */

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverCommonLib {
	/**
	 * 
	 * @param driver
	 */
	public void waitForPageToLoad(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	/**
	 * 
	 * @param driver
	 * @param element
	 */
    public void waitForElementToPresent(WebDriver driver,WebElement element)
    {
    	WebDriverWait wait = new WebDriverWait(driver,20);
    	wait.until(ExpectedConditions.visibilityOf(element));
   }
    
    /**
     * 
     * @param element
     * @param options
     */
   public void Select(WebElement element,String options)
   {
	   Select sel = new Select(element);
	   sel.selectByVisibleText(options);
   }
   /**
    * 
    * @param element
    * @param index
    */
   public void Select(WebElement element,int index)
   {
	   Select sel = new Select(element);
	   sel.selectByIndex(index);
	  
   }
    
}
