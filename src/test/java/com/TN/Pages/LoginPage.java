package com.TN.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;

	@FindBy(id = "input-email")
	private WebElement emailAddressField;

	@FindBy(id = "input-password")
	private WebElement passwordFieled;

	@FindBy(css = "input.btn.btn-primary")
	private WebElement loginButton;

	@FindBy(css = "div[class='alert alert-danger alert-dismissible']")
	private WebElement emailPasswordNoMatchWarning;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void enterEmailAddress(String emailText) {
		emailAddressField.sendKeys(emailText);
	}

	public void enterPassword(String passWordText) {
		passwordFieled.sendKeys(passWordText);
	}

	public void clickOnLoginButton() {
		loginButton.click();	
			
	}

	public String retrieveEmailPasswordNoMatchWarningText() {
		String WarningText = emailPasswordNoMatchWarning.getText();
		return WarningText;

	}
}
