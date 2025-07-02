@homepage
Feature:Verify key elements on the Alchemy LMS HomePage
	Scenario:Verify WebSite title, heading
		Given open the LMS WebSite
		Then the WebSite title should be 'Alchemy LMS – An LMS Application'
		Then the WebSite heading should be 'Learn from Industry Experts'
		Then the first info box title should be 'Actionable Training'
		Then the second most popular course title should be 'Email Marketing Strategies'