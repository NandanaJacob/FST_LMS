@socialMedia
Feature: Testing Social Media Marketing Course

	Scenario: Completing a topic
	  Given user is logged in
	  And the user is on the All Courses page
	  When user clicks on "See More" button under Social Media Marketing
	  Then social media course content is visible
	  When user clicks on "Developing Strategy" lesson
	  Then "Developing Strategy" heading and content is visible
	  When user clicks "This is the first topic" in the navigation sidebar
	  Then "Mark Complete" button is displayed
	  When user clicks "Mark Complete"
	  Then user is redirected to "Monitoring and Advertising" topic
	  