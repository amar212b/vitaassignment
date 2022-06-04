package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccountPage {
	public WebDriver driver;

	public CreateAccountPage(WebDriver driver)
	{
		this.driver = driver;
		
	}
	private By name = By.cssSelector("input#firstName");
	private By email = By.cssSelector("input#email");
	private By password=By.cssSelector("input#password");
	private By pageHeaderText= By.xpath("//form/h2");
	
	private By createButton=By.xpath("//button[@data-test='auth-button']");
	//By.xpath("//table/descendant::td[1]")
	
	
	public String getCreatepageText()
	{
		return driver.findElement(pageHeaderText).getText();
	}
	
	public void enterName(String username)
	{
		driver.findElement(name).sendKeys(username);
	}
	
	public void enterEmail(String emailid)
	{
		driver.findElement(email).sendKeys(emailid);
	}
	
	public void enterPassword(String password1)
	{
		driver.findElement(password).sendKeys(password1);
	}
	
	public void clickButton()
	{
		driver.findElement(createButton).click();
	}
	
	
}
