package com.Pages;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Baseclass.Library;
import com.ReusableFunctions.SeleniumReusable;

public class uptoaddcart_page extends Library {
	SeleniumReusable se;
	public uptoaddcart_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
 
	@FindBy(linkText="Login")
	WebElement Loginlink;
	
	@FindBy(xpath="//div[normalize-space()='Flipkart Plus Zone']")
	WebElement Flipkartpluszone;
	
	@FindBy(xpath="(//span[@class='OqYNhN'])[6]")
	WebElement HomeandFurniture;
	
	@FindBy(xpath="//a[@title='Wall Lamp']")
	WebElement Walllamplink;
	
	@FindBy(xpath="//div[@data-id='WLMGD7JRYTTEBMHM']/div")
	WebElement clickonelamp;
	
	@FindBy(xpath="//div[contains(text(),'Select delivery location')]")
	WebElement Pincode;
	
	@FindBy(xpath="//div[contains(text(),'Use my current location')]")
	WebElement usemylocation;
	
	public void Moveloginlink()
	{
		se=new SeleniumReusable(driver);
	    se.mousehover(Loginlink);	
	    
	}
	public void Moveflipkartplus()
	{
		se.movelement(Flipkartpluszone);
	}
	public void movehomefurniture()
	{
		se.mousehover(HomeandFurniture);
	}
	public void clickwalllamp()
	{
		se.movelement(Walllamplink);
	}
	public void clickoneresult()
	{
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    wait.until(ExpectedConditions.visibilityOf(clickonelamp));

	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView(true);", clickonelamp);

	    wait.until(ExpectedConditions.elementToBeClickable(clickonelamp));

	    clickonelamp.click();
	}
	public void pincodesection()
	{
	    String parent = driver.getWindowHandle();

	    for(String win : driver.getWindowHandles())
	    {
	        if(!win.equals(parent))
	        {
	            driver.switchTo().window(win);
	            break;
	        }
	    }

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    wait.until(ExpectedConditions.visibilityOf(Pincode));

	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].click();", Pincode);
	}
	public void clicklocation()
	{
		se.click(usemylocation);
	}
}
