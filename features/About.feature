@about
Feature:Testing About page
	Scenario:Verify Our Story
	Given the user is on the Homepage
	When user clicks on About
	Then Our Story is visible
	And the heading is 'Meet Our Lead Instructors'
	And the number of instructors is 4
	And Verify the heading 'What Our Students Have to Say'
	And Verify number of testimonials
	And 'Start Learning' button is clickable