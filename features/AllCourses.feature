@allCourses
Feature: Testing All Courses page
	
	Scenario: Verify Number of Courses
	  Given the user is on the Homepage
	  When user clicks on All Courses
	  Then Verify the number of courses visible
	  And Verify the heading 'What Our Students Have to Say'
	  And Verify number of testimonials
	  And 'Start Learning' button is clickable
	  
	
	# Verify number of testimonials
	# Verify Call to Action(CTA): verify with isEnabled