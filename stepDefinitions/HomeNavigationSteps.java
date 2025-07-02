package stepDefinitions;

import org.openqa.selenium.By;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeNavigationSteps extends BaseClass{
	@When("we click on the 'All Courses' link")
	public void clickAllCourses() {
		driver.findElement(By.linkText("All Courses")).click();
	}
	@When("we click on the 'About' link")
	public void clickAbout() {
		driver.findElement(By.linkText("About")).click();
	}
	@When("we click on the 'Contact' link")
	public void clickContact() {
		driver.findElement(By.linkText("Contact")).click();
	}
	@When("we click on the 'My Account' link")
	public void clickMyAccount() {
		driver.findElement(By.linkText("My Account")).click();
	}
	@Then("the title of the page should be 'All Courses – Alchemy LMS'")
	public void verifyAllCoursesTitle() {
		assertEquals("All Courses – Alchemy LMS",driver.getTitle());
	}
	@Then("the title of the page should be 'About – Alchemy LMS'")
	public void verifyAboutTitle() {
		assertEquals("About – Alchemy LMS",driver.getTitle());
	}
	@Then("the title of the page should be 'Contact – Alchemy LMS'")
	public void verifyContactTitle() {
		assertEquals("Contact – Alchemy LMS",driver.getTitle());
	}
	@Then("the title of the page should be 'My Account – Alchemy LMS'")
	public void verifyMyAccountTitle() {
		assertEquals("My Account – Alchemy LMS",driver.getTitle());
	}
}
