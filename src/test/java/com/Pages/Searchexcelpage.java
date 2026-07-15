package com.Pages;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baseclass.Library;
import com.ReusableFunctions.SeleniumReusable;
import com.Utilities.ExcelUtility;

public class Searchexcelpage  extends Library{
	ExcelUtility excel;
	SeleniumReusable se;
	public Searchexcelpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//input[@name='q']")
    WebElement Searchtext;
	
	@FindBy(xpath="//span[normalize-space()='Men']")
	WebElement homepage;
	
	
	public void Searchwithexcel() throws IOException, InterruptedException
	   {
	   	 excel=new ExcelUtility();
	   	 se=new SeleniumReusable(driver);
	   	 
	   	 for(int i=0;i<=6;i++)
	   	 {
	   		 se.EnterValue(Searchtext, excel.excelread("Testdata", i, 0));
	   		 Searchtext.sendKeys(Keys.ENTER);
	   		 se.waits();
	   		 if(homepage.isDisplayed())
	   		 {
	   			 excel.excelwrite("Testdata", i, 1,"pass");
	   		 }
	   		 else
	   		 {
	   			 excel.excelwrite("Testdata", i, 1, "fail");
	   		 }
	   		 se.navigateback();
	   	 }
	   }

}
