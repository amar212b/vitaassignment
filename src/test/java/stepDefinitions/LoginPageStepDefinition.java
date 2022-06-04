package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;
import utils.TestContextSetup;

public class LoginPageStepDefinition {

	public WebDriver driver;
	private TestContextSetup tc;
	LoginPage loginPage;

	public LoginPageStepDefinition(TestContextSetup tc) {
		this.tc = tc;
		this.loginPage = tc.pgm.getLoginPage();
	}

	@Then("Login screen should be displayed")
	public void login_screen_should_be_displayed() {

		String title = loginPage.getLoginpageText();
		Assert.assertEquals(title, "Login");

	}

	@When("^user clicks on CreateAccountPage button$")
	public void user_clicks_on_createaccountpage_button() throws Throwable {

		loginPage.clickCreateAccountButton();
	}
}
