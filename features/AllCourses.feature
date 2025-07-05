@allCourses
Feature: Testing All Courses page
	
	Scenario: Verify All Courses sections
	  Given the user is on the Homepage
	  When the user clicks on "<LinkText>"
	  Then Verify the number of courses visible
	  And Verify the heading 'What Our Students Have to Say'
	  And Verify number of testimonials
	  And 'Start Learning' button is clickable
	  
	  Examples:
		| LinkText |
		| All Courses |