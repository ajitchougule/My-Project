package com.trial.gen_lib;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class TrialBaseClass extends TrialFileLib {
	public TrialFileLib fLib = new TrialFileLib();
	
public static WebDriver driver;
	@BeforeSuite
	public void configBS() {
		System.out.println("connect to the database ");
	}

	@BeforeClass
	public void confogBC() throws IOException {
		System.out.println("launch a browser");
		driver = new FirefoxDriver();
		String URL=fLib.getPropertyKeyValue("url");
		driver.get(URL);
	}

	@BeforeMethod
	public void confiMBM() throws IOException, InterruptedException {
		System.out.println("log in into the application");
		
		String userName=fLib.getPropertyKeyValue("username");
		String passWord=fLib.getPropertyKeyValue("password");
		 
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(3000);
		
		driver.findElement(By.id("username")).sendKeys(userName);
		
		driver.findElement(By.name("pwd")).sendKeys(passWord);
		 
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Getting Started Shortcuts']")).click();
	}

	@AfterMethod
	public void conficAM() {
		System.out.println("log out from the application");
		
		
		driver.findElement(By.id("logoutLink")).click();
	}

	@AfterClass
	public void configAC() {
		System.out.println("close the browser");
		driver.close();
		
	}

	@AfterSuite
	public void configAS() {
		System.out.println("close database");
	}

}
