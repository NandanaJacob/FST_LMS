package stepDefinitions;

import java.time.Duration;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LMS_LoginUnsuccessful extends BaseClass{
	WebElement loginButton;
	// Navigate to My Account Page
	@Given("the user is on the LMS homepage")
	public void openHomePage() {
		// open the LMS homepage
		driver.get("https://alchemy.hguy.co/lms");
	}
	@When("user clicks on the My Account")
	public void clickMyAccountLink() {
		driver.findElement(By.linkText("My Account")).click();
	}
	@Then("Login Button is Visible")
	public void loginButtonIsVisible() {
		loginButton = driver.findElement(By.xpath("//a[contains(@class, 'login')]")); // Use actual class or ID
		Assertions.assertTrue(loginButton.isDisplayed(), "Login button is not visible.");
	}
	@And("user clicks on Login Button")
	public void clickLogin() {
		// find login button and click
		driver.findElement(By.linkText("Login")).click();
	}
	// Scenario: Unsuccessful login
	@Given("user is able to view the Login Form")
	public void ViewLoginPage() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user_login")));
		Assertions.assertTrue(username.isDisplayed(), "Username field is not visible.");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user_login")));
		WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user_pass")));
		Assertions.assertTrue(password.isDisplayed(), "password field is not visible.");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user_pass")));
	}
	@When("they enter the incorrect {string} and {string}")
	public void enterInvalidCredentials(String username, String password) {
		driver.findElement(By.id("user_login")).clear();
		driver.findElement(By.id("user_login")).sendKeys(username);
		driver.findElement(By.id("user_pass")).clear();
		driver.findElement(By.id("user_pass")).sendKeys(password);
	}
	@And("click the Login button")
	public void clickLoginSubmit() {
		// find login button in Login Form and click
		driver.findElement(By.id("wp-submit")).click();
	}
	@Then("Failed-Login message is visible")
	public void verifyLoginFailure() {
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.ld-alert-content")));
		String message = driver.findElement(By.cssSelector("div.ld-alert-content")).getText();
		System.out.println(message);
		// Assert the confirmation message
		Assertions.assertEquals("Incorrect username or password. Please try again", message);
	}
}
