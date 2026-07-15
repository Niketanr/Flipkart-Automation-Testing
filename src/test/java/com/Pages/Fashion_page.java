package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baseclass.Library;
import com.ReusableFunctions.SeleniumReusable;

public class Fashion_page extends Library {
	SeleniumReusable se;
	
	public Fashion_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//span[normalize-space()='Women']")
	WebElement womenlink;
	
	@FindBy(xpath="//a[@title='Palazzos']")
	WebElement palazzolink;
	
	@FindBy(xpath="//div[normalize-space()='Price -- High to Low']")
	WebElement Pricehightolow;
	
	public void movewomenlink()
	{
		se=new SeleniumReusable(driver);
		se.mousehover(womenlink);
	}
	
	public void movepalazzolink()
	{
		se.mousehover(palazzolink);
		se.click(palazzolink);
	}
	
	public void clickprice()
	{
		se.click(Pricehightolow);
	}
	

}
