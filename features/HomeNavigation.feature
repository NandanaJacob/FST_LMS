@navigation
Feature:Verify the navigation elements on the Alchemy LMS WebSite

	Scenario:Navigating to the All courses page
		Given open the LMS WebSite
		When we click on the 'All Courses' link
		Then the title of the page should be 'All Courses – Alchemy LMS'

	Scenario:Navigating to the About page
		Given open the LMS WebSite
		When we click on the 'About' link
		Then the title of the page should be 'About – Alchemy LMS'

	Scenario:Navigating to the Contact page
		Given open the LMS WebSite
		When we click on the 'Contact' link
		Then the title of the page should be 'Contact – Alchemy LMS'

	Scenario:Navigating to the My Account page
		Given open the LMS WebSite
		When we click on the 'My Account' link
		Then the title of the page should be 'My Account – Alchemy LMS'