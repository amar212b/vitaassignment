package pageObjects;

import org.openqa.selenium.WebDriver;

//class responsible to create objects - factory design pattern
public class PageObjectManager {
	
	public WebDriver driver;
	public LandingPage landingPage;
	public CreateAccountPage createAccountPage;
	public LoginPage loginPage;
	
	

	public PageObjectManager(WebDriver driver) {
		this.driver=driver;
	}


	public LandingPage getLandingPage() {
		landingPage=new LandingPage(driver);
		return landingPage;
	}


	public void setLandingPage(LandingPage landingPage) {
		this.landingPage = landingPage;
	}


	public LoginPage getLoginPage() {
		loginPage=new LoginPage(driver);
		return loginPage;
	}


	public void setLoginPage(LoginPage loginPage) {
		this.loginPage = loginPage;
	}
	
	public CreateAccountPage getCreateAccountPage() {
		createAccountPage=new CreateAccountPage(driver);
		return createAccountPage;
	}


	public void setCreateAccountPage(CreateAccountPage createAccountPage) {
		this.createAccountPage = createAccountPage;
	}



	

}
