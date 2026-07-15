package com.ReusableFunctions;

import java.io.File;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.Baseclass.Library;

import io.cucumber.java.Scenario;

public class SeleniumReusable extends Library {
    Actions act;
	public SeleniumReusable(WebDriver driver)
	{
		this.driver=driver;
		
	}
	//Enter text of element
	public void EnterValue(WebElement element,String Text)
	{
		try
		{
			element.sendKeys(Text);
			logger.info("*********Entered Value************");
			
		}
		catch(Exception e)
		{
			System.out.println("No such element Exception");
		}
	}
	//Click the element
	public void click(WebElement element)
	{
		try
		{
			element.click();
			logger.info("*********Clicked Button************");
		}
		
		catch(Exception e)
		{
			System.out.println("Nosuchelement Exception");
		}
	}
	//Get the title of the page
	public void getTitle()
	{
		try
		{
			System.out.println(driver.getTitle());
		}
		catch(Exception e)
		{
			System.out.println("Couldnt get the Title");
		}
	}
	//Takes the screenshot of the page
	public void screenshot(String path)
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		
		try
		{
			FileUtils.copyFile(source, new File(path));
		}
		catch(Exception e)
		{
			System.out.println("Screenshot not found");
		}
	}
	
	public void MultipleGettext(List<WebElement> list) {
		List<WebElement>text=(List<org.openqa.selenium.WebElement>) list;
		System.out.println(text.size());
		
		for(WebElement textcount:text)
		{
			String Totallist=textcount.getText();
			System.out.println("***********************************************");
			System.out.println(Totallist);
		}
		
	}
	
	public void GetValue(WebElement element)
	{
		String Text=element.getText();
		System.out.println(Text);
	}
	
	public void dropdown(WebElement element, String Text) {
		
		Select drp=new Select(element);
		drp.selectByValue(Text);
		
	}
	
	public void Scrolldown(WebElement element)
	{
	    JavascriptExecutor js = (JavascriptExecutor) driver;

	    js.executeScript(
	        "arguments[0].scrollIntoView({block:'center'});",
	        element
	    );
	}
	
	public void waits() throws InterruptedException {
		{
			Thread.sleep(2000);
		}
		
	}
	
	public void mousehover(WebElement element)
	{
		act=new Actions(driver);
		act.moveToElement(element).build().perform();
		
	}
	
	public void movelement(WebElement element)
	{
		act.moveToElement(element).click().build().perform();
	}
	
	public void Screenshot(String path) {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		
		try
		{
			FileUtils.copyFile(source,new File(path));
		}
		catch(Exception e)
		{
			System.out.println("Coudn't take screenshot");
		}
	}
	
	public void windowhandling(WebElement element) {
		String parentwindow=driver.getWindowHandle();
		element.click();
		System.out.println(parentwindow);
		
		Set<String>allwindow=driver.getWindowHandles();
		System.out.println(allwindow.size());
		for(String childwindow:allwindow)
		{
			driver.switchTo().window(childwindow);
			System.out.println(childwindow);
		}
		
	}
	
	public void attachscreenshot(Scenario CucumberScenario) {
		
		final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		CucumberScenario.attach(screenshot,"image/png","FlipkartAutomation");
	}
	public void closeapp() {
		driver.close();
		System.out.println("Browser closed");
	}
	public void navigateback()
	{
		driver.navigate().back();	}
	
}
