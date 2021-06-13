package com.cyient.page;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCartPage {

	private By searchLocator= By.xpath("//div[@class='st-search-bar hidden-mobile']");
	private By enterLocator= By.xpath("//input[@placeholder='Type here, search anything.']");
	private By chooseImageLocator= By.xpath("//div[contains(@title,'Scalloped Leaf Printed Tee')]");
	private By clickSizeLocator= By.xpath("//span[@class='animated btn btn-lg btn-lg-new btn-ghost-black btn-full-width btn-no-round select-size-btn']");
	private By chooseSizeLocator= By.xpath("//p[contains(text(),'XS')]");
	private By addToCartLocator= By.xpath("//button[contains(text(),'Add to Cart')]");
	private By proceedLocator= By.xpath("//a[@class='btn btn-lg btn-lg-new btn-blue-t btn-full-width btn-round']");
	private By signUpLocator= By.xpath("//span[@ng-show='parent_form.checkout_page || checkout_screen_modal']");
	
	private WebDriver driver;
	
	public AddToCartPage(WebDriver driver)
	{
		this.driver= driver;
	}
	
	public void chumbakStoreSearch()
	{
		driver.findElement(searchLocator).click();
		
	}
	public void enterTShirt(String searchItem )
	{
		driver.findElement(enterLocator).sendKeys(searchItem);
	}
	public void selectFirstImage()
	{
		driver.findElement(chooseImageLocator).click();
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
	public void clikSize()
	{
		driver.findElement(clickSizeLocator).click();
	}
	public void chooseSize()
	{
		driver.findElement(chooseSizeLocator).click();
	}
	public void addToCart()
	{
		driver.findElement(addToCartLocator).click();
	}
	public void proceedToCheckOut()
	{
		driver.findElement(proceedLocator).click();
	}
	public void signUp()
	{
		driver.findElement(signUpLocator).click();
	}
	public String errorMessage()
	{
		String actualVale= driver.findElement(By.xpath("//ul[@ng-show='!parent_form.checkout_page || parent_form.show_email_input']")).getText();
		return actualVale;
	}
	
	
}
