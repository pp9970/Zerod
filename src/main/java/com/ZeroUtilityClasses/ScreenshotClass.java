package com.ZeroUtilityClasses;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotClass 
{
	public static void takeScreenShot(WebDriver driver) throws IOException
	{
		Date d = new Date();
		DateFormat d1 = new SimpleDateFormat("DD-MM-YY && hh-mm-ss");
		String date = d1.format(d);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File Source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot"+ date +" "+" .jpg");
		FileHandler.copy(Source, dest);
	}
	
	

}
