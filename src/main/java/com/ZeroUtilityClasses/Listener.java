package com.ZeroUtilityClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener
{
	
	WebDriver driver;
	
	public void OnTestStart(ITestResult result)
	{
		System.out.println("sanity test is started");
	}
	
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Test case is sucessfully passed");
	}
	
	public void onTestSkippped(ITestResult result)
	{
		System.out.println("test case is skipped");
	}
	
	public void onTestfailure(ITestResult result) throws IOException
	{
		System.out.println("Test case is failed and hence taking screenshot");
		
		ScreenshotClass.takeScreenShot(driver);
	}
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		System.out.println("test case is failed within percentage");
	}
	
	public void onstart(ITestResult result)
	{
		System.out.println("test start");
	}
	
	public void onfinish(ITestResult result)
	{
		System.out.println("test finish");
	}
	
	
	
	
	
	
	
	
	
	
	
}
