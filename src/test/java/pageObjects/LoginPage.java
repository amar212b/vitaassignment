package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	public WebDriver driver;

	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		
	}
	private By pageHeaderText = By.xpath("//form/h2");
	private By createAccountButton=By.cssSelector("li[data-test='auth-tab-register']");
	
	public String getLoginpageText()
	{
		return driver.findElement(pageHeaderText).getText();
	}
	
	public void clickCreateAccountButton()
	{
		driver.findElement(createAccountButton).click();
	}
}
