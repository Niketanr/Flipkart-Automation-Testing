package com.TestRunner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/Features/SearchFunctionality.feature",
    glue = {"com.Stepdefinitions","com.Hooks"},
    tags="@tc006",
    
    		plugin = {
    			    "pretty",
    			    "html:target/cucumber-reports/cucumber.html",
    			    "json:target/cucumber-reports/cucumber.json",
    			    "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
    			}
)
public class Runner extends AbstractTestNGCucumberTests {
	 
}