package com.Stepdefinitions;

import com.Baseclass.Library;
import com.Pages.Fashion_page;
import com.ReusableFunctions.SeleniumReusable;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Fashion_Stepdefinition extends Library {
	Fashion_page fp;
	SeleniumReusable se;
	@When("User to move the Women link")
	public void user_to_move_the_women_link() {
	   se=new SeleniumReusable(driver);
	   System.out.println("Before clicking women link");
	   se.getTitle();
	   fp=new Fashion_page(driver);
	   fp.movewomenlink();
	}

	@When("Cursor to move to the Palazzos and click")
	public void cursor_to_move_to_the_palazzos_and_click() {
	    fp.movepalazzolink();
	}

	@When("Click the price high to low link")
	public void click_the_price_high_to_low_link() {
	    fp.clickprice();
	}

	@Then("It should display the relevent details and get the title")
	public void it_should_display_the_relevent_details_and_get_the_title() {
	   System.out.println("After clicking womenlink");
	   se.getTitle();
	}
	
}
