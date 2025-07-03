package stepDefinitions;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;

public class SocialMediaTest extends BaseClass{
//	@Given("the user is on the \"All Courses\" page")
//	public void social_openAllCoursesPage() {
//		driver.get("https://alchemy.hguy.co/lms/all-courses/");
//	}
	
	@And("user clicks on \"See More\" button under Social Media Marketing")
	public void clickSeeMoreSocial() {
		driver.findElement(By.linkText("See more...")).click();
	}
	
	@Then("social media course content is visible")
	public void social_verifyCourseContent() {
		Assertions.assertEquals(driver.findElement(By.tagName("h1")).getText(), "Social Media Marketing");
//		WebElement content = driver.findElement(By.id("learndash_post_83"));
//		Assertions.assertTrue(content.isDisplayed());
	}
	
	@When("user clicks on \"Developing Strategy\" lesson")
	public void clickDevelopingStrategy() {
		driver.findElement(By.partialLinkText("Developing Strategy")).click();
	}
	
	@Then("\"Developing Strategy\" heading and content is visible")
	public void devStratContent() {
		Assertions.assertTrue(driver.findElement(By.xpath("//h1[text()='Developing Strategy']")).isDisplayed());
		String message = driver.findElement(By.id("ld-tab-content-83")).getText();
		Assertions.assertTrue(message.contains("Risus vitae laoreet dictum"));
	}
	
	@When("user clicks \"This is the first topic\" in the navigation sidebar")
	public void devStrat_topic1() {
		driver.findElement(By.partialLinkText("This is the First Topic")).click();
	}
	
	@Then("\"Mark Complete\" button is displayed")
	public void social_markCompleteVisible() {
		Assertions.assertTrue(driver.findElement(By.xpath("//input[@value='Mark Complete']")).isDisplayed());
	}
	
	@Then("user is redirected to \"Monitoring and Advertising\" topic")
	public void devStrat_topic2() {
		Assertions.assertTrue(driver.findElement(By.xpath("//h1[text()='Monitoring & Advertising']")).isDisplayed());
	}
}
