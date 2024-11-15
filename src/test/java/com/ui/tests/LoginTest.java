package com.ui.tests;

import static com.constants.Browser.*;

import static org.testng.Assert.*;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ui.pages.HomePage;

public class LoginTest {
	HomePage homePage;

	@BeforeTest(description = "Load the homepage of the website")
	public void setup() {
		homePage = new HomePage(String.valueOf(EDGE));
	}

	@Test(description = "Verifies user able to login with valid credentials", groups = { "e2e", "sanity" })
	public void loginTest() {

		assertEquals(homePage.goToLoginPage().doLoginWith("abc.def@test.com", "password").getUserName(), "Abc def");
	}
}
