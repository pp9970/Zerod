package com.ZeroTestClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ZeroUtilityClasses.ScreenshotClass;
//@Listeners(com.ZeroUtilityClasses.Listener.class)

public class TC01VarifyLoginFunctionality extends ZeroTestBaseClass
{
	@Test
	public void loginfunctionality() throws InterruptedException, IOException
	{
		ScreenshotClass.takeScreenShot(driver);
		String ExpectedURL ="https://kite.zerodha.com/dashboard";
		String actualURL = driver.getCurrentUrl();
		System.out.println(actualURL);
		Thread.sleep(3000);
		
		String ExpTitle ="Dashboard / Kite";
		String ActTitle= driver.getTitle();
		log.info("Applying assertions");
		
		Assert.assertEquals(actualURL, ExpectedURL);
//		Assert.assertEquals(ActTitle, ExpTitle);
		log.info("Assertions completed");
		
//		SoftAssert soft = new SoftAssert();
//		soft.assertEquals(actualURL, ExpectedURL);
//		soft.assertEquals(ActTitle, ExpTitle);
	//	soft.assertAll();
		
	}

}
