package com.ZeroTestClasses;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ZeroPOMClasses.ZeroPageOf7Watchlist;
import com.ZeroUtilityClasses.ScreenshotClass;

public class TC03VarifyNewStockAddToWatchlist extends ZeroTestBaseClass
{
	@Test
	public void stockAddtoWatchlist() throws IOException, InterruptedException
	{
		log.info("adding stock to new watchlist");
		ZeroPageOf7Watchlist list = new ZeroPageOf7Watchlist(driver);
		list.clickON7Watchlist();
		list.clickSearchBar();
		
		Thread.sleep(2000);
		ScreenshotClass.takeScreenShot(driver);
		
		WebElement ele = driver.findElement(By.xpath("//span[@class='nice-name']"));
		boolean res = ele.isDisplayed();
		
		Assert.assertEquals(res, true);
		log.info("Stock added to watchlist sucessfully");

	}

}
