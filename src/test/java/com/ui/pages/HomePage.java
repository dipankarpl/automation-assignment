package com.ui.pages;

import static com.constants.Env.QA;
import static com.utility.PropertiesUtility.readProperty;

import org.openqa.selenium.By;

import com.constants.Browser;
import com.utility.BrowserUtility;

public final class HomePage extends BrowserUtility {

	private static final By SIGN_IN_LINK_LOCATOR = By.xpath("//a[normalize-space()='Sign in']");

	public HomePage(Browser browser) {
		super(browser);
		goToWebsite(readProperty(QA, "URL"));
	}

	public LoginPage goToLoginPage() {
		clickOn(SIGN_IN_LINK_LOCATOR);
		maximizeWindow();
		LoginPage loginPage = new LoginPage(getDriver());
		return loginPage;
	}

}
