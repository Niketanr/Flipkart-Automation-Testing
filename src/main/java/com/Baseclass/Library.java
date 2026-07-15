package com.Baseclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Library {
    
	public static WebDriver driver;
	public static Properties prop;
	protected static Logger logger =
	        Logger.getLogger(Library.class);
	public void launchapplication() throws IOException {
		FileInputStream input=new FileInputStream("src/test/resources/Properties/Config.Properties");
		prop=new Properties();
		prop.load(input);
		logger = Logger.getLogger(Library.class);
		PropertyConfigurator.configure("src/test/resources/Properties/log4j.properties");
		
		try {
			if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
			{
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				logger.info("*********Chrome Browser Launched************");
			}
			else if(prop.getProperty("browser").equalsIgnoreCase("firefox"))
			{
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
				logger.info("*********Firefox Browser Launched************");
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get(prop.getProperty("url"));
			logger.info("*********Application Launched************");
		}
		catch(Exception e)
		{
			System.out.println("Browser didnt launch");
		}
	}
	
	public void teardown()
	{
		driver.close();
	}
}
