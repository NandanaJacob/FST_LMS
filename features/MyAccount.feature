@myAccount
Feature: Activity to test the My Account page

	Scenario: Navigate to My Account page
  		Given the user is on the LMS homepage
  		When user clicks on the My Account
  		Then Login Button is Visible
  		And  user clicks on Login Button
  		Then user is able to view the Login Form
  		
  	Scenario Outline: Unsuccessful login
    	Given user is able to view the Login Form
	    When they enter the incorrect "<username>" and "<password>"
    	And click the Login button
    	Then Failed-Login message is visible
    	
	Examples:
 		| username | password |
 		| 1R00T | Passwords |
 		| Root1 | password1 |
  		
    Scenario: Successful login
    	Given user is able to view the Login Form
    	When they enter the correct username and password
    	And click the Login button
    	Then they are able to see their enrolled courses