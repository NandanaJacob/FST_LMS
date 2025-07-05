package stepDefinitions;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactSteps extends BaseClass{
	@Given("user is on the Contact page")
	public void openContactPage() {
		driver.get("https://alchemy.hguy.co/lms/contact/");
	}
	
	
	@Then("'Send us a message' is visible")
	public void verifyHeadingVisible() {
		WebElement heading = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(),'Send us a message')]")));
		Assertions.assertTrue(heading.isDisplayed());
		System.out.println("Heading is visible: " + heading.getText());
	}
	@When("they enter the user information")
	public void fillBasicContactInfo() {
		WebElement name = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("wpforms-8-field_0")));
		WebElement email = driver.findElement(By.id("wpforms-8-field_1"));
		WebElement subject = driver.findElement(By.id("wpforms-8-field_3"));
		name.sendKeys("Test User");
		email.sendKeys("testuser@example.com");
		subject.sendKeys("Test Subject");
	}
	@And("they enter a message")
	public void enterMessage() {
		WebElement message = driver.findElement(By.id("wpforms-8-field_2"));
		message.sendKeys("This is a test message from Cucumber.");
	}
	@And("click the 'Send Message' button")
	public void clickSendMessage() {
		WebElement sendButton = driver.findElement(By.id("wpforms-submit-8"));
		sendButton.click();
	}
	
	@Then("'Thanks for contacting us' message is visible")
	public void verifyThankYouMessage() {
		WebElement confirmation = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.id("wpforms-confirmation-8")));
		Assertions.assertTrue(confirmation.isDisplayed());
		String message = driver.findElement(By.id("wpforms-confirmation-8")).getText();
		Assertions.assertTrue(message.contains("Thanks for contacting us"));
		System.out.println("Confirmation: " + confirmation.getText());
	}
}
