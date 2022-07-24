package com.ZeroPOMClasses;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZeroPageOf7Watchlist 
{
	private WebDriver driver;
	public ZeroPageOf7Watchlist(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="(//li[@class='item'])[6]")
	private WebElement WatchlistNO7;
	
	public void clickON7Watchlist()
	{
		WatchlistNO7.click();
	}
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement SearchBar;
	
	public void clickSearchBar()
	{
		SearchBar.click();
		Actions act = new Actions(driver);
		act.sendKeys("SBIN").perform();
		act.sendKeys(Keys.ENTER).perform();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
