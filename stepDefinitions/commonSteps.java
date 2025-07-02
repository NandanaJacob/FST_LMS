package stepDefinitions;

import io.cucumber.java.en.Given;

public class commonSteps extends BaseClass{
	@Given("open the LMS WebSite")
	public void openHomepage() {
		//open the home page
		driver.get("https://alchemy.hguy.co/lms/");
	}
}
