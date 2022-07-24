package com.ZeroTestClasses;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

import com.ZeroPOMClasses.ZeroHomePagePOMClass;
import com.ZeroPOMClasses.ZeroLoginPagePOMClass;
import com.ZeroUtilityClasses.ReadConfig;
@Listeners(com.ZeroUtilityClasses.Listener.class)

public class ZeroTestBaseClass 
{
	ReadConfig readconfig= new ReadConfig();
	String uname = readconfig.getuname();
	String pass = readconfig.getpass();
	String pinno= readconfig.getpinno();
	
	WebDriver driver;
	Logger log;
	 @Parameters("Browser")
	
	@BeforeMethod
	public void setup(String Browser)
	{
		 if(Browser.equals("chrome"))
		 {
		   System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		   driver = new ChromeDriver();
		 }
		 else if(Browser.equals("edge"))
		 {
			 System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
				
			   driver = new EdgeDriver();
		 }
		driver.get("https://kite.zerodha.com");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		ZeroLoginPagePOMClass lp = new ZeroLoginPagePOMClass(driver);
		lp.Senduserid(uname);
		lp.Sendpassword(pass);
		lp.clickcontinuebutton();
		lp.sendpin(pinno);
		lp.clickcontinuebutton();
		
		log = Logger.getLogger("Zerod");
		PropertyConfigurator.configure("log4j.properties");
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException
	{
		ZeroHomePagePOMClass hp = new ZeroHomePagePOMClass(driver);
		hp.clickmenubutton();
		hp.clicklogoutbutton();
		
		Thread.sleep(2000);
		driver.close();
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
