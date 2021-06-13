package com.cyient.utilities;

import java.io.IOException;


import org.testng.annotations.DataProvider;

public class DataProviderUtilies {

	@DataProvider
	public Object[][] addToCartExcelData() throws IOException
	{
		Object[][] main= ExcelUtilies.getSheetIntoObjectArray("src/test/resources/testData/ChumbakExcelData.xlsx", "AddToCartExcel");
		return main;
	}
	
	@DataProvider
	public Object[][] validateOrderExcelData() throws IOException
	{
		Object[][] main= ExcelUtilies.getSheetIntoObjectArray("src/test/resources/testData/ChumbakExcelData.xlsx", "ValidateOrderExcel");
		return main;
	}
	
	@DataProvider
	public Object[][] ContactUsExcelData() throws IOException
	{
		Object[][] main= ExcelUtilies.getSheetIntoObjectArray("src/test/resources/testData/ChumbakExcelData.xlsx", "ContactUsExcel");
		return main;
	}
	
	
}
