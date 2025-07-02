@contentMarketing
Feature: Testing Content Marketing Course

	Scenario: Completing a course
	  Given user is logged in
	  And the user is on the All Courses page
	  When user clicks on See More button under Content Marketing
	  Then Content Marketing course content is visible
	  When user clicks on 'Effective Writing & Promoting Your Content' lesson
	  Then Content Marketing first lesson heading and content is visible
	  And Mark Complete is visible
	  When user clicks Mark Complete
	  Then user is redirected to the 'Analyze Content & Develop Writing Strategies' lesson
	  And Content Marketing topics are visible in navigation bar
	  When user clicks on Growth Hacking topic
	  Then Growth Hacking topic of second lesson content is visible
	  And Mark Complete is displayed
	  When user clicks Mark Complete
	  Then user is redirected to Power Of Effective Content topic of second lesson
	  And Mark Complete is visible
	  When user clicks Mark Complete
	  And Mark Complete is visible
	  When user clicks Mark Complete
	  Then 100% Complete is visible