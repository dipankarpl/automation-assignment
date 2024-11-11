package com.ui.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class LoginTest {
	@Test
	public void login() {
		WebDriver driver = new EdgeDriver();
		driver.get("http://www.automationpractice.pl/index.php");
		driver.manage().window().maximize();
		WebElement ele=driver.findElement(By.xpath("//a[normalize-space()='Sign in']"));
		ele.click();
		//driver.quit();
	}
}
