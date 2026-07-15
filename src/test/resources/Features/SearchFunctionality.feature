Feature: To validate the Flipkart Application

Background:

Given Launch the Flipkart Application
When Close the popup
Then It should Navigate to the Home page

@tc001 @Regression
Scenario: To validate the Search functionality

Given User enter the Text in the Search field
When Click the search button
Then It should navigate to the search result page and display the relevent details
And Select Minimum and Maximum Amount
And Select the Brand
And Select the Ram
And Select the Battery Capacity
Then It should display the Relevant result

@tc002 @Regression
Scenario: To validate the Fashion Functionality

Given User enter the Text in the Search field
When Click the search button
When User to move the Women link
When Cursor to move to the Palazzos and click
And Click the price high to low link
Then It should display the relevent details and get the title

@tc003 @Regression
Scenario Outline: To validate the search functionality with different values

Given Enter the "<searchtext>" in the search field
When click the search button
Then It should navigate to the next page and display the corresponding page

Examples:
|searchtext|
|Mobile|
|Tv|
|Speaker|
|Shirt|

@tc004 @Regression
Scenario: To validate upto addcart functionality

Given User can move to login link
When User can click the flipkart plus zone
And Mouse move to the Home&Furniture link
And Going to click the wall lamp
And Scroll down the page and click one particular result
And Enter delivery pincode and click the check link
Then Pincode should be checked and displayed and verify the titles

@tc005 @Regression
Scenario: To get the title and price from search result

Given Enter the search text in the search field
When click the search icon
Then It should display the search result and get the title and price

@tc006 @Regression
Scenario: To test the search functionality with excel sheet

Given Enter Search Text In the Search Field
When Click search Icon
Then It Should Display The Relevant Result