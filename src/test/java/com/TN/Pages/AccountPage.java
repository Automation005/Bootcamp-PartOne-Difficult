package com.TN.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {
	public WebDriver driver;

	@FindBy(linkText = "Change your password")
	private WebElement changeYourPassword;

	public AccountPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		

	}
	public boolean getDisplayedStatusOfChangePassword() {
		boolean displayStatus = changeYourPassword.isDisplayed();
		return displayStatus;
		
	
		
		
		
	}

}
