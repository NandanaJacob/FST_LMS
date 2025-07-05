package stepDefinitions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.Then;

public class HomeElements extends BaseClass{
	@Then("the page title should be {string}")
	public void verifyWebsiteTitle(String pageTitle) {
		assertEquals(pageTitle, driver.getTitle());
	}
	@Then("the WebSite heading should be 'Learn from Industry Experts'")
	public void verifyWebsiteHeading() {
		WebElement heading=driver.findElement(By.cssSelector("h1.uagb-ifb-title"));
		assertEquals("Learn from Industry Experts",heading.getText());
	}
	@Then("the first info box title should be 'Actionable Training'")
	public void verifyFirstBoxTitle() {
		WebElement heading=driver.findElement(By.cssSelector("h3.uagb-ifb-title"));
		assertEquals("Actionable Training",heading.getText());
	}
	@Then("the second most popular course title should be 'Email Marketing Strategies'")
	public void verifySecondCourseTitle() {
		//WebElement heading=driver.findElement(By.cssSelector("h3.entry-title"));
		List<WebElement> courses = driver.findElements(By.cssSelector("h3.entry-title"));
		WebElement course = courses.get(1);
		assertEquals("Email Marketing Strategies",course.getText());
	}
}
