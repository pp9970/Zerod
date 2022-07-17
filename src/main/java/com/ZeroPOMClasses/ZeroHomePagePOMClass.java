package com.ZeroPOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZeroHomePagePOMClass 
{
	private WebDriver driver;
	
	@FindBy(xpath="//span[@class='user-id']")
	private WebElement menubutton;
	
	public void clickmenubutton()
	{
		menubutton.click();
	}
	
	@FindBy(xpath="//a[@target='_self']")
	private WebElement logoutbutton;
	
	public void clicklogoutbutton()
	{
		logoutbutton.click();
	}
	
	public ZeroHomePagePOMClass(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement WatchlistSearchBox;
	
	public boolean clickWatchlistSearchBox()
	{
		return WatchlistSearchBox.isEnabled();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


}
