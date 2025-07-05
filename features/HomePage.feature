@homepage
Feature:Verify key elements on the Alchemy LMS HomePage
	Scenario:Verify WebSite title, heading
		Given the user is on the Homepage
		Then the page title should be "<pageTitle>"
		Then the WebSite heading should be 'Learn from Industry Experts'
		Then the first info box title should be 'Actionable Training'
		Then the second most popular course title should be 'Email Marketing Strategies'
		
		Examples:
		| pageTitle |
		| Alchemy LMS – An LMS Application |