package com.TN.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductInfoPage {
public WebDriver driver;
	
	@FindBy(xpath = "//li[contains(text(), 'Product Code:Product 21')]")
	private WebElement ProductCodeInfo;
	
	
	
	@FindBy(id = "button-cart")
	private WebElement addToCartButtonInProductInfoPage;
	
	@FindBy(xpath = "//div[@id='product-search']//div[2]//div[1]//div[2]//div[2]//button[1]")
	private WebElement addToCartButtonInProduct2InfoPage;
	
	
	@FindBy(css = "button#button-cart")
	private WebElement finalAddCartButtonInProductInfoPage;
	
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement productAddToShoppingCartMessage;
	
	@FindBy(css = "#cart-total")
	private WebElement shoppingCart;
	
	@FindBy(xpath = "//strong[normalize-space()='Checkout']")
	private WebElement checkout;
	
	
	public ProductInfoPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnAddToCartButtonInProdInfo() {
		addToCartButtonInProductInfoPage.click();
	}

	
	public boolean validateDisplayStatusProdInfo() {
		boolean displayStatus = ProductCodeInfo.isDisplayed();
		return displayStatus;
	}
	public void finalClickOnAddToCartButtonInProdInfo() {
		finalAddCartButtonInProductInfoPage.click();
	}
	public void shoppingCartButton() {
		shoppingCart.click();
	}	
	public void checkOutButton() {
			checkout.click();
			
		}

	
public String retrieveProductAddToShoppingCartMessage() {
	String notificationMessage = productAddToShoppingCartMessage.getText();
	return notificationMessage;
	
}
}
