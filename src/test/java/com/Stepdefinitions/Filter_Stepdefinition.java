package com.Stepdefinitions;

import org.openqa.selenium.By;

import com.Baseclass.Library;
import com.Pages.Filter_page;
import com.ReusableFunctions.SeleniumReusable;

import io.cucumber.java.en.Then;

public class Filter_Stepdefinition extends Library{
	 Filter_page fp;
	 SeleniumReusable se;
	@Then("Select Minimum and Maximum Amount")
	public void select_minimum_and_maximum_amount() throws InterruptedException {
	    fp=new Filter_page(driver);
	    se=new SeleniumReusable(driver);
	    String BeforeFilter=driver.findElement(By.xpath("//body/div[@id='container']/div/div[@class='LwDgZ8 eq0K9s tBcEQe']/div[@class='QSCKDh eRsYMo']/div[@class='QSCKDh dLgFEE']/div[2]/div[1]/div[1]/div[1]/a[1]/div[2]/div[1]")).getText();
	    System.out.println("BEFORE FILTER:"+BeforeFilter);
	    fp.Min();
	    se=new SeleniumReusable(driver);
	    se.waits();
	    fp.max();
	    se.waits();
	}

	@Then("Select the Brand")
	public void select_the_brand() throws InterruptedException {
	    fp.brand();
	    se.waits();
	}

	@Then("Select the Ram")
	public void select_the_ram() throws InterruptedException {
	    fp.ram();
	    se.waits();
	}

	@Then("Select the Battery Capacity")
	public void select_the_battery_capacity() throws InterruptedException {
	    fp.clickbattery();
	    se.waits();
	}

	@Then("It should display the Relevant result")
	public void it_should_display_the_relevant_result() {
		System.out.println("********************************");
		 String AfterFilter=driver.findElement(By.xpath("//div[@data-id='MOBHKQYYTYEXAVMG']//div[@class='col col-7-12']")).getText();
		 System.out.println("AFTER FILTER:"+AfterFilter);
	}

}
