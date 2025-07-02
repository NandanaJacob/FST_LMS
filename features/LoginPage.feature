@profilePage
Feature: Activity to test the My Account page

	Scenario: Navigate to My Account page
  		Given the user is on the LMS homepage
  		When user clicks on the My Account
  		Then Login Button is Visible
  		And  user clicks on Login Button
  		
    Scenario: Successful login
    	Given user is able to view the Login Form
    	When they enter the correct username and password
    	And click the Login button
    	Then they are able to see their enrolled courses