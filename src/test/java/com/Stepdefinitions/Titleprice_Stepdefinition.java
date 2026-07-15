package com.Stepdefinitions;

import org.openqa.selenium.By;

import com.Baseclass.Library;
import com.Pages.Titleprice_page;
import com.ReusableFunctions.SeleniumReusable;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Titleprice_Stepdefinition extends Library{
	Titleprice_page tp;
	SeleniumReusable re;
	@Given("Enter the search text in the search field")
	public void enter_the_search_text_in_the_search_field() {
	     tp=new Titleprice_page(driver);
	     tp.entersearch("Shirts");
	}

	@When("click the search icon")
	public void click_the_search_icon() {
	    tp.clicksearchicon();
	   
	}

	@Then("It should display the search result and get the title and price")
	public void it_should_display_the_search_result_and_get_the_title_and_price() {
	    re=new SeleniumReusable(driver);
	    re.MultipleGettext(driver.findElements(By.xpath("//div[@class='p0C73x']")));
	}

}
