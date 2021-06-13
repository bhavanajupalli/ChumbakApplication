package com.cyient.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.cyient.base.WebDriverWrapper;
import com.cyient.page.TrackOrderPage;
import com.cyient.utilities.DataProviderUtilies;

public class TrackOrderTest  extends WebDriverWrapper{

	@Test(dataProvider = "validateOrderExcelData", dataProviderClass = DataProviderUtilies.class )
	public void trackOrder(String expectedOrderId, String expectedEmail )
	{
		TrackOrderPage track= new TrackOrderPage(driver);
		track.clickOnProfile();
		track.selectTrackOrder();
		String actualOrder= track.validateOrderId();
		String actualEmail= track.validateEmail();
	
		
		Assert.assertEquals(actualOrder, expectedOrderId);
		Assert.assertEquals(actualEmail, expectedEmail);
			
	}

}
