package org.testing.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Base {
	public static WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manish.singh\\Downloads\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		
	}
	
	
	
	@AfterMethod
	public void closebrowser()
	{
		driver.quit();
	}
	
	
}
