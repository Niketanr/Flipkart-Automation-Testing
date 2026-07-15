package com.Stepdefinitions;

import com.Baseclass.Library;
import com.Pages.uptoaddcart_page;
import com.ReusableFunctions.SeleniumReusable;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class uptoaddcart_Stepdefinition extends Library {
	uptoaddcart_page up;
	SeleniumReusable re;
	@Given("User can move to login link")
	public void user_can_move_to_login_link() {
	   up=new uptoaddcart_page(driver);
	   up.Moveloginlink();
	   re=new SeleniumReusable(driver);
	   System.out.println("Parentwindow Title");
	   re.getTitle();
	}

	@When("User can click the flipkart plus zone")
	public void user_can_click_the_flipkart_plus_zone() {
	    up.Moveflipkartplus();
	}

	@When("Mouse move to the Home&Furniture link")
	public void mouse_move_to_the_home_furniture_link() {
	    up.movehomefurniture();
	}

	@When("Going to click the wall lamp")
	public void going_to_click_the_wall_lamp() {
	    up.clickwalllamp();
	}

	@When("Scroll down the page and click one particular result")
	public void scroll_down_the_page_and_click_one_particular_result() {
	    up.clickoneresult();
	}

	@When("Enter delivery pincode and click the check link")
	public void enter_delivery_pincode_and_click_the_check_link() {
	   up.pincodesection();
	}

	@Then("Pincode should be checked and displayed and verify the titles")
	public void pincode_should_be_checked_and_displayed_and_verify_the_titles() {
	   up.clicklocation();
	   System.out.println("Childwindow title");
	   
	   re.getTitle();
	   re.screenshot("src/test/resources/Screenshots/uptoaddcart.png");
	}

}
