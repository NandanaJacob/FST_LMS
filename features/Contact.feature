@contact
Feature: Activity to test the Contact feature

  	Scenario: Verifying contact elements
    	Given user is on the Contact page
    	# When they scroll down
    	Then "Send us a message" is visible
    	
  	Scenario: Successful message sent
    	Given user is on the Contact page
    	When they enter the user information
    	And they enter a message
    	And click the "Send Message" button
    	Then "Thanks for contacting us" message is visible