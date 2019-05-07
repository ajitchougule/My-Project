package sagar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo 
{
	

	public static void main(String[] args)
	{
		//System.setProperty("WebDriver.gecko.driver","F:\\SeleniumImp\\MyProject\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https:/google.com");
		
	}
}
