package com.org.learningMaven.myMavenProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class HelloWorldTest {

	WebDriver driver;

	@Test
	public void loginTest() {
		System.out.println("Logging into application");
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium Jars\\geckodriver-v0.13.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String str = driver.getTitle();
		org.testng.Assert.assertEquals("Google", str);
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
