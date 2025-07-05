@navigation
Feature:Verify the navigation elements on the Alchemy LMS WebSite

	Scenario Outline: Navigating to each element
		Given the user is on the Homepage
		When the user clicks on "<LinkText>"
		Then the title of the page should be "<PageTitle>"

		
	Examples:
		| LinkText | PageTitle |
		| All Courses | All Courses – Alchemy LMS |
		| About | About – Alchemy LMS |
		| Contact | Contact – Alchemy LMS |
		| My Account | My Account – Alchemy LMS |