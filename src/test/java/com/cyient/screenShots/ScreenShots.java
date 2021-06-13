package com.cyient.screenShots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.cyient.base.WebDriverWrapper;

public class ScreenShots extends WebDriverWrapper {

	@Test
	public void testScreenShots() throws IOException
	{
		
		ScreenShots.takeScreenShot(driver, "F:\\Company\\test.PNG");
		
		
	}
	
	public static void takeScreenShot(WebDriver driver, String filePath) throws IOException
	{
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile=new File(filePath);
		FileUtils.copyFile(SrcFile, DestFile);
		
	}
	
	
}
