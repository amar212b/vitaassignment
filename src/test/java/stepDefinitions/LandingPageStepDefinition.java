package stepDefinitions;

import org.junit.Assert;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import pageObjects.PageObjectManager;
import utils.TestContextSetup;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class LandingPageStepDefinition {

	public WebDriver driver;
	private TestContextSetup tc;
	LandingPage landingPage;
	String title;

	public LandingPageStepDefinition(TestContextSetup tc) {
		this.tc = tc;
		this.landingPage = tc.pgm.getLandingPage();
	}

	@Given("^User is on .* Landing page$")
	public void user_is_on_demo_landing_page() {

		title = landingPage.getLandingPageText();
		String loginText = landingPage.getLoginButtonText();
		// System.out.println(title);
		Assert.assertEquals(title, "Our stores");
		Assert.assertEquals(loginText, "Login");

	}

	@When("user clicks on Login button")
	public void user_clicks_on_login_button() {

		landingPage.clickLoginButtonLink();
	}

	@Then("^\"([^\"]*)\" text should be displayed in the main page$")
	public void something_text_should_be_displayed_in_the_main_page(String strArg1) throws Throwable {

		Assert.assertEquals(title, "Our stores");
	}

	@And("^(.+) must be displayed$")
	public void must_be_displayed(String name) throws Throwable {
		String username = landingPage.getUsername();
		Assert.assertEquals(username, name);
	}
}
