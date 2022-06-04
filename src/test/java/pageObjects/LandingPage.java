package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;

	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}

	By heading = By.cssSelector("div h1");
	By loginButton = By.xpath("//a[@data-test=\"preorder.account.auth.login-link\"]");
	By loginButtonText = By.xpath("//a[contains(text(),\"Login\")]");
	By username = By.xpath("//a/span[2]");
	// By topDeals = By.linkText("Top Deals");

	public String getLandingPageText() {
		return driver.findElement(heading).getText();
	}

	public String getLoginButtonText() {
		return driver.findElement(loginButtonText).getText();
	}

	public void clickLoginButtonLink() {
		driver.findElement(loginButton).click();

	}

	public String getUsername() {
		return driver.findElement(username).getText();
	}
}
