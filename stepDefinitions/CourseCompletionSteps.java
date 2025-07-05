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

public class CourseCompletionSteps extends BaseClass{
	//Social Media Marketing
	
	
	@And("user clicks on Social Media Marketing")
	public void clickSeeMoreSocial() {
		driver.findElement(By.linkText("See more...")).click();
	}
	
	@Then("social media course content is visible")
	public void social_verifyCourseContent() {
		Assertions.assertEquals(driver.findElement(By.tagName("h1")).getText(), "Social Media Marketing");
	}
	
	@When("user clicks on 'Developing Strategy' lesson")
	public void clickDevelopingStrategy() {
		driver.findElement(By.partialLinkText("Developing Strategy")).click();
	}
	
	@Then("'Developing Strategy' heading and content is visible")
	public void devStratContent() {
		Assertions.assertTrue(driver.findElement(By.xpath("//h1[text()='Developing Strategy']")).isDisplayed());
		String message = driver.findElement(By.id("ld-tab-content-83")).getText();
		Assertions.assertTrue(message.contains("Risus vitae laoreet dictum"));
	}
	
	@When("user clicks 'This is the first topic' in the navigation sidebar")
	public void devStrat_topic1() {
		driver.findElement(By.partialLinkText("This is the First Topic")).click();
	}

	
	@Then("user is redirected to 'Monitoring and Advertising' topic")
	public void devStrat_topic2() {
		Assertions.assertTrue(driver.findElement(By.xpath("//h1[text()='Monitoring & Advertising']")).isDisplayed());
	}
	
	//email marketing strategies
	
	@Given("user is logged in")
	public void login() {
		driver.get("https://alchemy.hguy.co/lms/my-account/");
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("user_login")).sendKeys("root");
		driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
		driver.findElement(By.id("wp-submit")).click();
	}
	
	@When("the user clicks on the All Courses page")
	public void openAllCoursesPage() {
		driver.findElement(By.linkText("All Courses")).click();
		//verify title
		System.out.println(driver.getTitle());
		Assertions.assertEquals(driver.getTitle(), "All Courses – Alchemy LMS");
	}
	
	@And("user clicks on Email Marketing Strategies")
	public void email_clickSeeMore() {
		driver.findElement(By.xpath("//h3[text()='Email Marketing Strategies']")).click();
	}
	
	@Then("course content is visible")
	public void email_courseContentVisible() {
		driver.get("https://alchemy.hguy.co/lms/courses/email-marketing-strategies/");
		 WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(
			        By.xpath("//h2[contains(text(),'Course Content')]")));
		 
		Assertions.assertTrue(driver.findElement(By.linkText("Deliverability Of Your Emails")).isDisplayed());
	}
	
	@When("user clicks on first lesson")
	public void email_clickFirstLesson() {	    
		 // Wait for link to be clickable
	    WebElement lessonLink = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Deliverability Of Your Emails")));

	    lessonLink.click();
	}
	
	@Then("first lesson heading and content is visible")
	public void email_firstLessonContent() {
		//Find heading and verify that it's visible
		WebElement heading = driver.findElement(By.xpath("//h1[text()='Deliverability Of Your Emails']"));
		Assertions.assertTrue(heading.isDisplayed());
		//verify if youtube link at top of content is visible
		Assertions.assertTrue(driver.findElement(By.cssSelector("div.wp-block-embed__wrapper")).isDisplayed());
	}
	
	@And("'Mark Complete' button is visible")
	public void email_markCompleteVisible() {
		Assertions.assertTrue(driver.findElement(By.xpath("//input[@value='Mark Complete']")).isDisplayed());
	}
	
	@When("user clicks 'Mark Complete'")
	public void email_clickMarkComplete() {
		driver.findElement(By.xpath("//input[@value='Mark Complete']")).click();
	}
	
	@Then("user is redirected to the next lesson")
	public void email_redirectedNextLesson() {
		Assertions.assertEquals(driver.getTitle(), "Improving & Designing Marketing Emails – Alchemy LMS");
	}
	
	@And("second lesson heading and content is visible")
	public void email_secondLessonContent() {
		Assertions.assertTrue(driver.findElement(By.xpath("//h1[text()='Improving & Designing Marketing Emails']")).isDisplayed());
		//System.out.println(driver.getTitle());
		Assertions.assertTrue(driver.findElement(By.xpath("//p[contains(text(),'Sed ut est leo.')]")).isDisplayed());
	}
	
	
	//content marketing steps
	
	@And("user clicks on Content Marketing")
	public void clickSeeMore() {
		driver.findElement(By.linkText("See more...")).click();
	}
	
	@Then("Content Marketing course content is visible")
	public void courseContentVisible() {
		driver.get("https://alchemy.hguy.co/lms/courses/how-to-play-the-piano/");
		 WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(
			        By.xpath("//h2[contains(text(),'Course Content')]")));
		
		Assertions.assertTrue(driver.findElement(By.partialLinkText("Effective Writing & Promoting Your Content")).isDisplayed());
	}
	
	@When("user clicks on 'Effective Writing & Promoting Your Content' lesson")
	public void clickFirstLesson() {	  
		 // Wait for link to be clickable
	    WebElement lessonLink = wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Effective Writing & Promoting Your Content")));
	    lessonLink.click();
	}
	
	@Then("Content Marketing first lesson heading and content is visible")
	public void firstLessonContent() {
		//Find heading and verify that it's visible
		WebElement heading = driver.findElement(By.xpath("//h1[text()='Effective Writing & Promoting Your Content']"));
		Assertions.assertTrue(heading.isDisplayed());
		
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
