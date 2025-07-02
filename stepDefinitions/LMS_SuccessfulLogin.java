package stepDefinitions;

import org.junit.jupiter.api.Assertions;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LMS_SuccessfulLogin extends BaseClass{
	WebElement loginButton;
	WebElement usernameField;
	WebElement passwordField;
	
//	@Given("user is able to view the Login Form")
//    public void userViewsLoginForm() {
//        usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user_login")));
//        passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user_pass")));
//        Assertions.assertTrue(usernameField.isDisplayed(), "Username field is not visible.");
//        Assertions.assertTrue(passwordField.isDisplayed(), "Password field is not visible.");
//    }
    @When("they enter the correct username and password")
    public void enterCorrectCredentials() {
    	usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user_login")));
        passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user_pass")));
        usernameField.clear();
        passwordField.clear();
        usernameField.sendKeys("root");
        passwordField.sendKeys("pa$$w0rd");
    }
//    @And("click the Login button")
//    public void clickLoginSubmit() {
//        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("wp-submit")));
//        submitButton.click();
//    }
    @Then("they are able to see their enrolled courses")
    public void verifyEnrolledCourses() {
        // Add a short wait for the page to load and for the heading to appear
        WebElement enrolledCourses = wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//h1[contains(text(),'My Account')]")));
        Assertions.assertTrue(enrolledCourses.isDisplayed(), "Enrolled courses are not visible.");
    }
}
