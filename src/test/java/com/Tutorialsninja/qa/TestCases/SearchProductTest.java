package com.Tutorialsninja.qa.TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.TN.Pages.HomePage;
import com.TN.Pages.SearchPage;
import com.tutorialsninjaninja.qa.TestBase.TestBase;

public class SearchProductTest extends TestBase {
	public SearchProductTest() throws Exception {
		super();

	}

	public WebDriver driver;
	public HomePage homepage;
	public SearchPage searchpage;

	@BeforeMethod
	public void setup() {
		driver = initializeBrowserAndOpenApplication(prop.getProperty("browser"));

	}

	@Test(priority = 1)
	public void verifySearchWithValidProduct() {
		homepage = new HomePage(driver);
		homepage.enterProductDetail(prop.getProperty("validProduct"));
		homepage.clickOnSearchIcone();
		searchpage = new SearchPage(driver);
		Assert.assertTrue(searchpage.verifyDisplayStatusOfValidProduct());
	

	}


	@AfterMethod
	public void teraDown() {
		driver.quit();

	}

}
