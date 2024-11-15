package com.ui.pages;

import org.openqa.selenium.By;

import com.utility.BrowserUtility;

public final class HomePage extends BrowserUtility {

	private static final By SIGN_IN_LINK_LOCATOR = By.xpath("//a[normalize-space()='Sign in']");

	public HomePage(String browser) {
		super(browser);
		goToWebsite("http://www.automationpractice.pl/index.php");
	}

	public LoginPage goToLoginPage() {
		clickOn(SIGN_IN_LINK_LOCATOR);
		maximizeWindow();
		LoginPage loginPage=new LoginPage(getDriver());
		return loginPage;
	}

}
