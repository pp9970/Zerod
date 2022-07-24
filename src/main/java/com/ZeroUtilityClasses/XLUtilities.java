package com.ZeroUtilityClasses;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class XLUtilities
{
	public XLUtilities(String path)
	{
		this.path=path;
	}
	
	public FileInputStream fi;
	public XSSFWorkbook workbook;
	public XSSFSheet sheet;
	public XSSFRow row;
	public XSSFCell cell;
	String path="";
	
	public int getRowcount(String sheetname) throws IOException
	{
		fi=new FileInputStream(path);
		workbook= new XSSFWorkbook(fi);
		sheet = workbook.getSheet(sheetname);
		int rowcount = sheet.getLastRowNum();
		workbook.close();
		fi.close();
		return rowcount;
	}
	
	public int getCellcount(String sheetname, int rownum) throws IOException
	{
		fi=new FileInputStream(path);
		workbook= new XSSFWorkbook(fi);
		sheet = workbook.getSheet(sheetname);
		row=sheet.getRow(rownum);
		int cellcount = row.getLastCellNum();
		workbook.close();
		fi.close();
		return cellcount;
	}
	
	public String getCellvalue(String sheetname, int rownum, int colnum) throws IOException
	{
		fi=new FileInputStream(path);
		workbook= new XSSFWorkbook(fi);
		sheet = workbook.getSheet(sheetname);
		row=sheet.getRow(rownum);
		cell=row.getCell(colnum);
		
		String data = cell.getStringCellValue();
//		DataFormatter formatter = new DataFormatter();
//		String data = formatter.formatCellValue(cell);
		
		workbook.close();
		fi.close();
		return data;
	}
	

}
