package com.actitime.genericlib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseClass {
	public static WebDriver driver;
	public FileLib fLib = new FileLib();

	@BeforeSuite
	public void configBS() {
		System.out.println("connect to database");
	}

	@BeforeClass
	public void configBC() throws Throwable {
		System.out.println("launch browser");
		String browser = fLib.getPropertyKeyValue("browser");
		if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String uRl = fLib.getPropertyKeyValue("url");
		driver.get(uRl);
	}

	@BeforeMethod
	public void configBM() throws Throwable {
		System.out.println("login");
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys(fLib.getPropertyKeyValue("username"));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(fLib.getPropertyKeyValue("password"));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Getting Started Shortcuts']")).click();
	}

	@AfterMethod
	public void configAM() {
		System.out.println("logout");
		driver.findElement(By.id("logoutLink")).click();
	}

	@AfterClass
	public void configAC() {
		System.out.println();
		driver.close();
	}

}
