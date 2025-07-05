@courses
Feature: Testing each course

	@socialMedia
	Scenario: Completing a topic in Social Media Marketing course 
	  Given user is logged in
	  When the user clicks on the All Courses page
	  And user clicks on Social Media Marketing
	  Then social media course content is visible
	  When user clicks on 'Developing Strategy' lesson
	  Then 'Developing Strategy' heading and content is visible
	  When user clicks 'This is the first topic' in the navigation sidebar
	  Then 'Mark Complete' button is visible
	  When user clicks 'Mark Complete'
	  Then user is redirected to 'Monitoring and Advertising' topic
	  
	@emailMarketing
	Scenario: Completing a lesson in Email Marketing Strategies course
	  # Given user is logged in
	  Given the user is on the Homepage
	  When the user clicks on the All Courses page
	  And user clicks on Email Marketing Strategies
	  Then course content is visible
	  When user clicks on first lesson
	  Then first lesson heading and content is visible
	  And 'Mark Complete' button is visible
	  When user clicks 'Mark Complete'
	  Then user is redirected to the next lesson
	  And second lesson heading and content is visible

	@contentMarketing
	Scenario: Completing the Content Marketing course
	 # Given user is logged in
	  Given the user is on the Homepage
	  When the user clicks on the All Courses page
	  And user clicks on Content Marketing
	  Then Content Marketing course content is visible
	  When user clicks on 'Effective Writing & Promoting Your Content' lesson
	  Then Content Marketing first lesson heading and content is visible
	  And 'Mark Complete' button is visible
	  When user clicks 'Mark Complete'
	  Then user is redirected to the 'Analyze Content & Develop Writing Strategies' lesson
	  And Content Marketing topics are visible in navigation bar
	  When user clicks on Growth Hacking topic
	  Then Growth Hacking topic of second lesson content is visible
	  And 'Mark Complete' button is visible
	  When user clicks 'Mark Complete'
	  Then user is redirected to Power Of Effective Content topic of second lesson
	  And 'Mark Complete' button is visible
	  When user clicks 'Mark Complete'
	  And 'Mark Complete' button is visible
	  When user clicks 'Mark Complete'
	  Then 100% Complete is visible