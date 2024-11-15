package com.ui.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import static com.constants.Browser.*;
import com.ui.pages.HomePage;

public class LoginTest {
	@Test(description = "Verifies user able to login with valid credentials", groups = {"e2e", "sanity"})
	public void loginTest() {
		HomePage homePage = new HomePage(String.valueOf(EDGE));
		Assert.assertEquals(homePage.goToLoginPage().doLoginWith("abc.def@test.com", "password").getUserName(),
				"Abc def");
	}
}
