package com.ZeroTestClasses;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ZeroUtilityClasses.XLUtilities;

public class TC_01_LogIn_DDTtest 
{
	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver  = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(16,TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}
	
	@Test(dataProvider="logindata")
	public void loginTest(String user,String Pass,String res)
	{		
	
		WebElement usermail = driver.findElement(By.xpath("//input[@id='userid']"));
		usermail.clear();
		usermail.sendKeys(user);
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.clear();
		password.sendKeys(Pass);
		
		WebElement login = driver.findElement(By.xpath("//button[@class='button-orange wide']"));
		login.click();
		
		WebElement pin = driver.findElement(By.xpath("//input[@id='pin']"));
		pin.sendKeys(res);
		
		driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
		
	}
	
	@DataProvider(name="logindata")
	public String[][] getdata() throws IOException
	{
		String path = "./data/SauceDemoTestData.xlsx";
		XLUtilities x = new XLUtilities(path);
		
		int totalrow = x.getRowcount("Sheet1");
		int totalcell = x.getCellcount("Sheet1",1);
		
		String logindata[][] = new String[totalrow][totalcell];
		
		for(int i=0;i<totalrow;i++)
		{
			for(int j=0;j<totalcell;j++)
			{
				 logindata[i-1][j] = x.getCellvalue("Sheet1", i, j);
			}
		}
		
		return logindata;
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}

}
