package com.ZeroTestClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ZeroPOMClasses.ZeroHomePagePOMClass;
import com.ZeroUtilityClasses.ScreenshotClass;

public class TC02VarifyWatchlistSearchBoxISEnabled extends ZeroTestBaseClass
{
	
	@Test
	public void WatchListSearchBoxChecking() throws IOException
	{
		ZeroHomePagePOMClass hp = new ZeroHomePagePOMClass(driver);
		ScreenshotClass.takeScreenShot(driver);
		boolean Expected = true;
		boolean Actual = hp.clickWatchlistSearchBox();
		
		Assert.assertEquals(Actual, Expected);
	}
	

}
