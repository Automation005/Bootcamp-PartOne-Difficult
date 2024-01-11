package com.Tutorialsninja.qa.TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.TN.Pages.AccountPage;
import com.TN.Pages.HomePage;
import com.TN.Pages.LoginPage;
import com.tutorialsninjaninja.qa.TestBase.TestBase;

public class LoginTest extends TestBase {
	public LoginTest() throws Exception {
		super();
	}
	public WebDriver driver;
	public HomePage homepage;
	public LoginPage loginpage;

	@BeforeMethod
	public void setup() {	
		
		driver = initializeBrowserAndOpenApplication(prop.getProperty("browser"));
		HomePage homepage = new HomePage(driver);
		homepage.ckickOnMyAccountDropDownMenu();
		homepage.selectLoginOption();
	}

	@Test
	public void verifyLoginWithInvalidEmailValidPassword() {
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterEmailAddress(prop.getProperty("validEmail"));
		loginpage.enterPassword(prop.getProperty("validPassword"));
		loginpage.clickOnLoginButton();
		AccountPage accountpage = new AccountPage(driver);
		Assert.assertTrue(accountpage.getDisplayedStatusOfChangePassword());
		

	}	

	@AfterMethod
	public void teardown() {
		driver.quit();

}
}