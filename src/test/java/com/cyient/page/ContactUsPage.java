package com.cyient.page;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactUsPage {

	private By menuLocator= By.xpath("//a[@class='help-icon pull-left']");
	private By contactLocator= By.xpath("//span[normalize-space()='contact us']");
	private By validPhoneLocator= By.linkText("1-800-420-1200");
	private By validEmailLocator= By.linkText("help@chumbak.in");
	private By hrefNoLocator= By.linkText("1-800-420-1200");
	private By hrefEmailLocator= By.linkText("help@chumbak.in");
	
	private WebDriver driver;
	public ContactUsPage(WebDriver driver)
	{
		this.driver= driver;
	}
	public void clickMenu()
	{
		driver.findElement(menuLocator).click();
	}
	public void clickContactUs()
	{
		driver.findElement(contactLocator).click();
	}
	public String validatePhoneNo()
	{
		String actualValue=driver.findElement(validPhoneLocator).getText();
		return actualValue;
	}
	public String validateEmail()
	{
		String actualValue1=driver.findElement(validEmailLocator).getText();
		return actualValue1;
	}
	public void validateHrefOfNo()
	{
		driver.findElement(hrefNoLocator).click();
	}
	public void switchToWindow() throws InterruptedException
	{
		Set<String> tabs=driver.getWindowHandles();
		for(String tabsSessions:tabs)
		{			
			driver.switchTo().window(tabsSessions);
			System.out.println(driver.getTitle());
		}
	}
	public void validateHrefOfMail()
	{
		driver.findElement(hrefEmailLocator).click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
