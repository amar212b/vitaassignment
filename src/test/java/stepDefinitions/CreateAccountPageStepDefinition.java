package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObjects.CreateAccountPage;
import utils.TestContextSetup;

public class CreateAccountPageStepDefinition {

	public WebDriver driver;
	private TestContextSetup tc;
	CreateAccountPage createAccountPage;

	public CreateAccountPageStepDefinition(TestContextSetup tc) {
		this.tc = tc;
		this.createAccountPage = tc.pgm.getCreateAccountPage();
	}
	
	@Then("Create Page screen should be displayed")
	public void login_screen_should_be_displayed() {

		String title = createAccountPage.getCreatepageText();
		Assert.assertEquals(title, "Create your account");

	}

	@And("^user enters the (.+) (.+) and (.+)$")
	public void user_enters_the_and(String name, String emailaddress, String password) throws Throwable {
		Thread.sleep(20);
		createAccountPage.enterName(name);
		createAccountPage.enterEmail(emailaddress);
		createAccountPage.enterPassword(password);
		Thread.sleep(20);
	}
	

    @And("^clicks on CreateAccount button$")
    public void clicks_on_createaccount_button() throws Throwable {
    	Thread.sleep(20);
    	createAccountPage.clickButton();
    	Thread.sleep(20);
    }

}
