package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baseclass.Library;
import com.ReusableFunctions.SeleniumReusable;

public class Titleprice_page extends Library {
	SeleniumReusable se;
	public Titleprice_page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//form[@class='lilxh_ header-form-search']//input[@placeholder='Search for Products, Brands and More']")
	WebElement searchbox;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement searchicon;
	
	public void entersearch(String Text)
	{
		se=new SeleniumReusable(driver);
	   se.EnterValue(searchbox,Text);
    }
	
	public void clicksearchicon()
	{
		se.click(searchicon);
	}
	
}
