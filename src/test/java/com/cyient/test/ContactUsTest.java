package com.cyient.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.cyient.base.WebDriverWrapper;
import com.cyient.page.ContactUsPage;
import com.cyient.screenShots.ScreenShots;
import com.cyient.utilities.DataProviderUtilies;

public class ContactUsTest extends WebDriverWrapper {

	@Test(dataProvider = "ContactUsExcelData", dataProviderClass = DataProviderUtilies.class )
	public void contactUs(String expectedNo,String expectedMail) throws InterruptedException, IOException
	{
		ContactUsPage contact= new ContactUsPage(driver);
		contact.clickMenu();
		contact.clickContactUs();
		String actualNo= contact.validatePhoneNo();
		String actualMail= contact.validateEmail();
		contact.validateHrefOfNo();
		Thread.sleep(1000);
		contact.validateEmail();
		contact.switchToWindow();
		
		
		Assert.assertEquals(actualNo, expectedNo);
		Assert.assertEquals(actualMail, expectedMail);	
		
		ScreenShots scrshot= new ScreenShots();
		scrshot.testScreenShots();
		
		
		
	}
	
}
