package com.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baseclass.Library;
import com.ReusableFunctions.SeleniumReusable;

public class Filter_page extends Library{
	 SeleniumReusable se;
	public Filter_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//div[@class='FrhiFV']//select[@class='hbnjE2']")
	WebElement MinimumAmount;
	
	@FindBy(xpath="//div[@class='WoGl7t']//select[@class='hbnjE2']")
	WebElement MaximumAmount;
	
	@FindBy(xpath="//div[@title='OPPO']//div[@class='ybaCDx']")
	WebElement Brand;
	
	@FindBy(xpath="//div[@title='8 GB and Above']//div[@class='ybaCDx']")
	WebElement Ram;
	
	@FindBy(xpath="//div[contains(text(),'Battery Capacity')]")
	WebElement Batteryarrow;
	
	@FindBy(xpath="//div[@title='4000 - 4999 mAh']")
	WebElement BatteryCapacity;
	
	public void Min()
	{
		se=new SeleniumReusable(driver);
		se.dropdown(MinimumAmount, "10000");
	}
	
	public void max()
	{
		se.dropdown(MaximumAmount, "30000");
	}
	
	public void brand()
	{
		se.click(Brand);
	}
	
	public void ram()
	{
		se.Scrolldown(Ram);
		se.click(Ram);
	}
	
	public void clickbattery() throws InterruptedException
	{
	    se.Scrolldown(Batteryarrow);

	    Thread.sleep(2000);   // Wait for filter section to expand

	    se.click(Batteryarrow);

	    Thread.sleep(2000);   // Wait for battery options to load

	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].click();", BatteryCapacity);
	}
	

}
