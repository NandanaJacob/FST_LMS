@about
Feature: Testing About page
	Scenario: Verify different sections of the page
	Given the user is on the Homepage
	When the user clicks on "<LinkText>"
	Then Our Story is visible
	And the heading is 'Meet Our Lead Instructors'
	And the number of instructors is 4
	And Verify the heading 'What Our Students Have to Say'
	And Verify number of testimonials
	And 'Start Learning' button is clickable
	
	Examples:
		| LinkText |
		| About | 