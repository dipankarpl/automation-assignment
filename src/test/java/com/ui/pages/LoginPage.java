package com.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utility.BrowserUtility;

public final class LoginPage extends BrowserUtility {

	private static final By EMAIL_LOGIN_LOCATOR = By.id("email");
	private static final By PASSWORD_LOGIN_LOCATOR = By.id("passwd");
	private static final By SIGN_IN_BUTTON_LOCATOR = By.id("SubmitLogin");

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public MyAccountPage doLoginWith(String email, String pwd) {
		enterText(EMAIL_LOGIN_LOCATOR, email);
		enterText(PASSWORD_LOGIN_LOCATOR, pwd);
		clickOn(SIGN_IN_BUTTON_LOCATOR);
		MyAccountPage myAccountPage=new MyAccountPage(getDriver());
		return myAccountPage;
	}
}
