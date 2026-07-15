package com.Pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baseclass.Library;
import com.ReusableFunctions.SeleniumReusable;
import com.Utilities.ExcelUtility;

public class SearchPage extends Library {

    SeleniumReusable se;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        se = new SeleniumReusable(driver);
    }

    @FindBy(xpath = "//input[@name='q']")
    WebElement Searchtext;

    @FindBy(xpath = "//html[@lang='en-IN']")
    WebElement Homepage;

    @FindBy(xpath = "//html[@lang='en']")
    WebElement Searchresult;

    @FindBy(xpath = "//span[@role='button']")
    WebElement Popup;
    
    @FindBy(xpath="//div[@data-id]//div[contains(@class,'col col-7-12')]")
    List<WebElement> Entireresult;
    
    @FindBy(xpath="//div[@data-id='MOBHMGHHXHYZEAVB']//div[@class='col col-7-12']")
    WebElement ThirdResult;

    public void handlepopup() {
        se.click(Popup);
    }

    public void Search(String text) {
        se.EnterValue(Searchtext, text);
    }

    public void Clicksearch() {
        Searchtext.sendKeys(Keys.ENTER);
    }

    public void homescreen() {
        System.out.println("Home Page Displayed: " + Homepage.isDisplayed());
    }

    public void Result() {
        System.out.println("Search Result Displayed: " + Searchresult.isDisplayed());
        System.out.println("Page Title: " + driver.getTitle());
    }
    
    public void printentireresult() {
    	
    	se.MultipleGettext(Entireresult);
    }
   public void printthirdresult() {
    	 {
    	    	se.GetValue(ThirdResult);
    	  }
    
    }
   public void Searchwithexcel() throws IOException, InterruptedException
   {
   	 ExcelUtility excel=new ExcelUtility();
   	 
   	 for(int i=0;i<=6;i++)
   	 {
   		 se.EnterValue(Searchtext, excel.excelread("Testdata", i, 0));
   		 Searchtext.sendKeys(Keys.ENTER);
   		 se.waits();
   		 se.navigateback();
   	 }
   }
}