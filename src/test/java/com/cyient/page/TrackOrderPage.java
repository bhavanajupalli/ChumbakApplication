package com.cyient.page;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TrackOrderPage {

	private By profileLocator= By.xpath("//span[@class='arrow-down-xs MT10 ML5 arrow-down-black']");
	private By trackLocator= By.xpath("//a[normalize-space()='Track order']");
	private By validateIdLocator= By.xpath("//input[@placeholder='Order ID']"); 
	private By validateMailLocator= By.xpath("//input[@name='email_id']");
	
	
	
	private WebDriver driver;
	
	public TrackOrderPage(WebDriver driver)
	{
		this.driver= driver;
	}
	public void clickOnProfile()
	{
		driver.findElement(profileLocator).click();
	}
	public void selectTrackOrder() 
	{
		driver.findElement(trackLocator).click();
	}
	public String validateOrderId()
	{
		String actualValue=driver.findElement(validateIdLocator).getAttribute("placeholder");
		return actualValue;
	}
	public String validateEmail()
	{
		String actualValue1=driver.findElement(validateMailLocator).getAttribute("placeholder");
		return actualValue1;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
