package com.ui.pages;

import org.openqa.selenium.By;

import static com.constants.Env.*;
import com.utility.BrowserUtility;
import static com.utility.PropertiesUtility.*;

public final class HomePage extends BrowserUtility {

	private static final By SIGN_IN_LINK_LOCATOR = By.xpath("//a[normalize-space()='Sign in']");

	public HomePage(String browser) {
		super(browser);
		goToWebsite(readProperty(String.valueOf(QA), "URL"));
	}

	public LoginPage goToLoginPage() {
		clickOn(SIGN_IN_LINK_LOCATOR);
		maximizeWindow();
		LoginPage loginPage = new LoginPage(getDriver());
		return loginPage;
	}

}
