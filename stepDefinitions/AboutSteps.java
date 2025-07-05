package stepDefinitions;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AboutSteps extends BaseClass{
//	@When("user clicks on About")
//	public void clickOnAbout() {
//		WebElement about=wait.until(ExpectedConditions.elementToBeClickable(By.linkText("About")));
//		about.click();
//	}
	@Then("Our Story is visible")
	public void verifyOurStory() {
		WebElement story=driver.findElement(By.xpath("//h2[contains(text(),'Our Story')]"));
		Assertions.assertTrue(story.isDisplayed());
	}
	@And("the heading is 'Meet Our Lead Instructors'")
	public void verifyHeadingAboutLeaders() {
		WebElement heading=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(),'Meet Our Lead Instructors')]")));
		assertEquals("Meet Our Lead Instructors",heading.getText());
	}
	@And("the number of instructors is 4")
	public void verifyTestimonials() {
		List<WebElement> testimonials=driver.findElements(By.cssSelector("h3.uagb-ifb-title"));
		assertEquals(testimonials.size(),4);
	}
}
