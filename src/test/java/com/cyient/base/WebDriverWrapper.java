package com.cyient.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class WebDriverWrapper {

	protected WebDriver driver;
	
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
		driver =new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//System.setProperty("webdriver.chrome.driver", "ChumbakMiniProject/src/test/resources/driver/chromedriver.exe");
		driver.get("https://www.chumbak.com");
		Thread.sleep(1000);
	}
		
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	

}
