package com.cyient.test;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.cyient.base.WebDriverWrapper;
import com.cyient.page.AddToCartPage;
import com.cyient.utilities.DataProviderUtilies;

public class AddToCartTest extends WebDriverWrapper {

	@Test(dataProvider="addToCartExcelData", dataProviderClass= DataProviderUtilies.class)
	public void addToCart(String searchItem,String expectedValue ) throws InterruptedException
	{
		AddToCartPage cart= new AddToCartPage(driver);
		cart.chumbakStoreSearch();
		cart.enterTShirt(searchItem);
		Thread.sleep(1000);
		cart.selectFirstImage();
		cart.switchToWindow();
		cart.clikSize();
		cart.chooseSize();
		cart.addToCart();
		cart.proceedToCheckOut();
		cart.signUp();
		String actualValue= cart.errorMessage();
		
		Assert.assertEquals(actualValue, expectedValue);
		
	}
	

}
