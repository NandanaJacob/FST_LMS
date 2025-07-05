package stepDefinitions;

import org.openqa.selenium.By;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeNavigationSteps extends BaseClass{
	@When("the user clicks on {string}")
	public void clickAllCourses(String pageLink) {
		driver.findElement(By.linkText(pageLink)).click();
	}
	

	@Then("the title of the page should be {string}")
	public void verifyAllCoursesTitle(String pageTitle) {
		assertEquals(pageTitle,driver.getTitle());
	}
	
}
