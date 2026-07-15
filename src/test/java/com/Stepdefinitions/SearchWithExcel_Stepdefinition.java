package com.Stepdefinitions;

import java.io.IOException;

import com.Baseclass.Library;
import com.Pages.SearchPage;
import com.Pages.Searchexcelpage;
import com.ReusableFunctions.SeleniumReusable;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchWithExcel_Stepdefinition extends Library{
	 Searchexcelpage sp;
	 //SeleniumReusable re;
	@Given("Enter Search Text In the Search Field")
	public void enter_search_text_in_the_search_field() throws IOException, InterruptedException {
	  sp=new Searchexcelpage(driver);
	  //re=new SeleniumReusable(driver);
	  sp.Searchwithexcel();
	  
	}

	@When("Click search Icon")
	public void click_search_icon() {
	    //re=new SeleniumReusable(driver);
	    //re.screenshot("src/test/resources/Screenshots/excelsearch.png");
	}

	@Then("It Should Display The Relevant Result")
	public void it_should_display_the_relevant_result() {
	     //re.getTitle();
	}

}
