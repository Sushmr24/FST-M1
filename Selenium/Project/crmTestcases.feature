@CRM
Feature: Crm testcases

@test11
Scenario: Verify the website title
 Given open the browser
 When Navigate to "http://alchemy.hguy.co/crm"
 Then Get the title of the website
 And Make sure it matches "SuiteCRM" exactly
 Then close the browser

 @test2
Scenario: Get the url of the header image
 Given open the browser
 When Navigate to "http://alchemy.hguy.co/crm"
 Then Get the url of the header image
 And Print the url to the console
  Then close the browser

@test3
Scenario: Get the copyright text
 Given open the browser
 When Navigate to "http://alchemy.hguy.co/crm"
 Then Get the first copyright text in the footer
 And Print the text to the console
 Then close the browser

 @test4
 Scenario: Logging into the site
  Given open the browser
  When Navigate to "http://alchemy.hguy.co/crm"
  Then Find and select the username and password fields
  And Enter login credentials into the respective fields
  Then Click login
  And Verify that the homepage has opened
  Then close the browser

 @test5
 Scenario: Getting colors
  Given open the browser
  When Navigate to "http://alchemy.hguy.co/crm"
  Then Login with credentials
  And Get the color of the navigation menu and print it to the console
  Then close the browser

 @test6
 Scenario: Menu checking
  Given open the browser
  When Navigate to "http://alchemy.hguy.co/crm"
  Then Login with credentials
  And Locate the navigation menu and Ensure that the "Activities" menu item exists
  Then close the browser

 @test7
 Scenario: Reading additional information
  Given open the browser
  When Navigate to "http://alchemy.hguy.co/crm"
  Then Login with credentials
  And Navigate to Sales and Leads
  Then In the table find the Additional information icon at the end of the row of the lead information and Click it
  And Read the popup and print the phone number displayed in it
  Then close the browser

  @test8
  Scenario: Traversing tables
   Given open the browser
   When Navigate to "http://alchemy.hguy.co/crm"
   Then Login with credentials
   And Navigate to the Sales and Accounts page
   Then Find the table on the page and print the names of the first 5 odd-numbered rows of the table to the console
   Then close the browser

 @test9
 Scenario: Traversing tables 2
  Given open the browser
  When Navigate to "http://alchemy.hguy.co/crm"
  Then Login with credentials
  And Navigate to Sales and Leads
  Then Find the table on the page and print the first 10 values in the Name column and the User column of the table to the console
  Then close the browser

