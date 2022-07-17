package com.ZeroUtilityClasses;

import java.io.FileInputStream;
import java.io.IOException;

public class DataFetch
{
	public static void main(String[] args) throws IOException 
	{
		String path = "E:\\Mock Group no-9 Buy and Sell test cases.xlsx\\";
		
		FileInputStream file = new FileInputStream(path);
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
//		XSSFSheet sheet = workbook.getSheet("Test Cases");
//		
//		XSSFRow row = sheet.getRow(8);
//		
//		XSSFCell cell = row.getCell(6);
//		
//		String value = cell.getStringCellValue();
//		System.out.println(value);
		
		
		// method  chaining
		
		String value = workbook.getSheet("Test Cases").getRow(8).getCell(6).getStringCellValue();		
		System.out.println(value);
		
	}

}
