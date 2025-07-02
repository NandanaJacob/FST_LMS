package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AllCoursesSteps extends BaseClass{
	@Given("the user is on the Homepage")
	public void homePage() {
		driver.get("https://alchemy.hguy.co/lms/");
//		assertEquals("All Courses – Alchemy LMS",driver.getTitle());
	}
	@When("user clicks on All Courses")
	public void clickOnAllCourses() {
		WebElement allCourses=wait.until(ExpectedConditions.elementToBeClickable(By.linkText("All Courses")));
		allCourses.click();
	}
	@Then("Verify the number of courses visible")
	public void verifyNoOfCourses() {
		List<WebElement> courseList=driver.findElements(By.className("caption"));
		assertEquals(courseList.size(),3);
	}
	@And("Verify the heading 'What Our Students Have to Say'")
	public void verifyHeading() {
		WebElement heading=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(),'What Our Students Have to Say')]")));
		assertEquals("What Our Students Have to Say",heading.getText());
	}
	@And("Verify number of testimonials")
	public void verifyNoOfTestimonials() {
		List<WebElement> testimonials=driver.findElements(By.className("uagb-tm__overlay"));
		assertEquals(testimonials.size(),4);
	}
	@And("'Start Learning' button is clickable")
	public void verifyButton() {
		WebElement startButton=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Start  Learning')]")));
		//String linkRef = startButton.getDomAttribute("href");
		Assertions.assertTrue(startButton.isEnabled());
	}
}
