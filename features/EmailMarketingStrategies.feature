@emailMarketing
Feature: Testing Email Marketing Strategies Course

	Scenario: Completing a lesson
	  Given user is logged in
	  When the user clicks on the All Courses page
	  And user clicks on "See More" button under Email Marketing Strategies
	  Then course content is visible
	  When user clicks on first lesson
	  Then first lesson heading and content is visible
	  And "Mark Complete" button is visible
	  When user clicks "Mark Complete"
	  Then user is redirected to the next lesson
	  And second lesson heading and content is visible
	  # And "Mark Complete" button is visible
	  # When user clicks "Mark Complete"
	  # Then "100% Complete" is displayed