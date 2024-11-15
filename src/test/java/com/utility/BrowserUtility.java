package com.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public abstract class BrowserUtility {
	private WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}

	public BrowserUtility(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public BrowserUtility(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else {
			System.err.println("Invalid browser selected!!select values between chrome, edge");
		}
	}

	public void goToWebsite(String url) {
		driver.get(url);
	}

	public void maximizeWindow() {
		driver.manage().window().maximize();
	}

	public void clickOn(By locator) {
		driver.findElement(locator).click();
	}

	public void enterText(By locator, String string) {
		driver.findElement(locator).sendKeys(string);
	}

	public String getVisibleText(By locator) {
		return driver.findElement(locator).getText();
	}
}
