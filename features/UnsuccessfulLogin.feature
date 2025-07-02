@UnsuccessfulLogin
Feature: Unsuccessful Login

	Scenario: Navigate to My Account page
  		Given the user is on the LMS homepage
  		When user clicks on the My Account
  		Then Login Button is Visible
  		And  user clicks on Login Button
  		
	Scenario: Unsuccessful login
    	Given user is able to view the Login Form
	    When they enter the incorrect "<username>" and "<password>"
    	And click the Login button
    	Then Failed-Login message is visible
    	
Examples:
 | 1R00T | Passwords |
 | Root1 | password1 |