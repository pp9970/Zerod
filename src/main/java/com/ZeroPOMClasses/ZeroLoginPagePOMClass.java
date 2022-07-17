package com.ZeroPOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZeroLoginPagePOMClass 
{
	private WebDriver driver;
	
	@FindBy(xpath="//input[@id='userid']")
	private WebElement userid;
	
	public void Senduserid(String uname)
	{
		userid.sendKeys(uname);
	}
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	
	public void Sendpassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	@FindBy(xpath="//button[@class='button-orange wide']")
	private WebElement loginbutton;
	
	public void clickloginbutton()
	{
		loginbutton.click();
	}

	@FindBy(xpath="//input[@id='pin']")
	private WebElement pin;
	
	public void sendpin(String pinno)
	{
		pin.sendKeys(pinno);
	}

	@FindBy(xpath="//button[@class='button-orange wide']")
	private WebElement continuebutton;
	
	public void clickcontinuebutton()
	{
		continuebutton.click();
	}

	public ZeroLoginPagePOMClass(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
	
	
}
