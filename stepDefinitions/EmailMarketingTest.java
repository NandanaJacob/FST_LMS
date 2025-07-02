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

public class EmailMarketingTest extends BaseClass{
	
	@Given("user is logged in")
	public void login() {
		driver.get("https://alchemy.hguy.co/lms/my-account/");
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("user_login")).sendKeys("root");
		driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
		driver.findElement(By.id("wp-submit")).click();
	}
	
	@When("the user is on the All Courses page")
	public void openAllCoursesPage() {
		driver.get("https://alchemy.hguy.co/lms/all-courses/");
		//verify title
		System.out.println(driver.getTitle());
		Assertions.assertEquals(driver.getTitle(), "All Courses – Alchemy LMS");
	}
	
	@When("user clicks on \"See More\" button under Email Marketing Strategies")
	public void clickSeeMore() {
		driver.findElement(By.xpath("//h3[text()='Email Marketing Strategies']")).click();
	}
	
	@Then("course content is visible")
	public void courseContentVisible() {
		driver.get("https://alchemy.hguy.co/lms/courses/email-marketing-strategies/");
		//scroll till course content is visible
		//WebElement element = driver.findElement(By.xpath("//h2[contains(text(),'Course Content')]"));
		 WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(
			        By.xpath("//h2[contains(text(),'Course Content')]")));
		 
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Assertions.assertTrue(driver.findElement(By.linkText("Deliverability Of Your Emails")).isDisplayed());
	}
	
	@When("user clicks on first lesson")
	public void clickFirstLesson() {	    
		 // Wait for link to be clickable
	    WebElement lessonLink = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Deliverability Of Your Emails")));

	    // Scroll to link to avoid overlays
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", lessonLink);

	    lessonLink.click();
	}
	
	@Then("first lesson heading and content is visible")
	public void firstLessonContent() {
		//Find heading and verify that it's visible
		WebElement heading = driver.findElement(By.xpath("//h1[text()='Deliverability Of Your Emails']"));
		Assertions.assertTrue(heading.isDisplayed());
		//verify if youtube link at top of content is visible
		Assertions.assertTrue(driver.findElement(By.cssSelector("div.wp-block-embed__wrapper")).isDisplayed());
	}
	
	@And("\"Mark Complete\" button is visible")
	public void markCompleteVisible() {
		Assertions.assertTrue(driver.findElement(By.xpath("//input[@value='Mark Complete']")).isDisplayed());
	}
	
	@When("user clicks \"Mark Complete\"")
	public void clickMarkComplete() {
		driver.findElement(By.xpath("//input[@value='Mark Complete']")).click();
	}
	
	@Then("user is redirected to the next lesson")
	public void redirectedNextLesson() {
		Assertions.assertEquals(driver.getTitle(), "Improving & Designing Marketing Emails – Alchemy LMS");
	}
	
	@And("second lesson heading and content is visible")
	public void secondLessonContent() {
		Assertions.assertTrue(driver.findElement(By.xpath("//h1[text()='Improving & Designing Marketing Emails']")).isDisplayed());
		//System.out.println(driver.getTitle());
		Assertions.assertTrue(driver.findElement(By.xpath("//p[contains(text(),'Sed ut est leo.')]")).isDisplayed());
	}
	
	@Then("\"100% Complete\" is displayed")
	public void lessonComplete() {
		Assertions.assertEquals(driver.findElement(By.cssSelector("div.ld-progress-percentage")).getText(), "100% COMPLETE");
	}
}
