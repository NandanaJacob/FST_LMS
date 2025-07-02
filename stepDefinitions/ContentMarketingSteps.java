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

public class ContentMarketingSteps extends BaseClass{
	@When("user clicks on See More button under Content Marketing")
	public void clickSeeMore() {
		driver.findElement(By.linkText("See more...")).click();
	}
	
	@Then("Content Marketing course content is visible")
	public void courseContentVisible() {
		driver.get("https://alchemy.hguy.co/lms/courses/how-to-play-the-piano/");
		//scroll till course content is visible
		//WebElement element = driver.findElement(By.xpath("//h2[contains(text(),'Course Content')]"));
		 WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(
			        By.xpath("//h2[contains(text(),'Course Content')]")));
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Assertions.assertTrue(driver.findElement(By.partialLinkText("Effective Writing & Promoting Your Content")).isDisplayed());
	}
	
	@When("user clicks on 'Effective Writing & Promoting Your Content' lesson")
	public void clickFirstLesson() {	  
		 // Wait for link to be clickable
	    WebElement lessonLink = wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Effective Writing & Promoting Your Content")));
	    // Scroll to link to avoid overlays
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", lessonLink);
	    lessonLink.click();
	}
	
	@Then("Content Marketing first lesson heading and content is visible")
	public void firstLessonContent() {
		//Find heading and verify that it's visible
		WebElement heading = driver.findElement(By.xpath("//h1[text()='Effective Writing & Promoting Your Content']"));
		Assertions.assertTrue(heading.isDisplayed());
		
	}
	
	@And("Mark Complete is visible")
	public void markCompleteVisible() {
		Assertions.assertTrue(driver.findElement(By.xpath("//input[@value='Mark Complete']")).isDisplayed());
	}
	
	@When("user clicks Mark Complete")
	public void clickMarkComplete() {
		driver.findElement(By.xpath("//input[@value='Mark Complete']")).click();
	}
	
	@Then("user is redirected to the 'Analyze Content & Develop Writing Strategies' lesson")
	public void redirectedNextLesson() {
		Assertions.assertEquals(driver.getTitle(), "Analyze Content & Develop Writing Strategies – Alchemy LMS");
	}
	
	@And("Content Marketing topics are visible in navigation bar")
	public void secondLessonContent() {
		Assertions.assertTrue(driver.findElement(By.xpath("//div[contains(text(),'Growth Hacking With Your Content')]")).isDisplayed());
		Assertions.assertTrue(driver.findElement(By.xpath("//div[contains(text(),'The Power Of Effective Content')]")).isDisplayed());
		
	}
	
	@And("user clicks on Growth Hacking topic")
	public void secondLessonFirstContent() {
		driver.findElement(By.xpath("//div[contains(text(),'Growth Hacking With Your Content')]")).click();		
	}
	
	@Then("Growth Hacking topic of second lesson content is visible")
	public void secondLessonFirstContentVisible() {
		//Find heading and verify that it's visible
		WebElement heading = driver.findElement(By.xpath("//h1[text()='Growth Hacking With Your Content']"));
		Assertions.assertTrue(heading.isDisplayed());	
	}
	
	@And("Mark Complete is displayed")
	public void markCompletedisplayed() {
		Assertions.assertTrue(driver.findElement(By.xpath("//input[@type='submit']")).isDisplayed());
	}
	
	@Then("user is redirected to Power Of Effective Content topic of second lesson")
	public void secondLessonSecondContentVisible() {
		//Find heading and verify that it's visible
		WebElement heading = driver.findElement(By.xpath("//h1[text()='The Power Of Effective Content']"));
		Assertions.assertTrue(heading.isDisplayed());	
	}
	
	@Then("100% Complete is visible")
	public void lessonComplete() {
		Assertions.assertEquals(driver.findElement(By.cssSelector("div.ld-progress-percentage")).getText(), "100% COMPLETE");
	}
}
