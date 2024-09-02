package com.saving;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;

public class sessionId {
	public static void main(String[] args) {
		DesiredCapabilities dc = new DesiredCapabilities();

		RemoteWebDriver dr = new ChromeDriver();

		// implicit wait

		dr.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));

		dr.get("https://www.saucedemo.com");

		dr.findElement(By.id("user-name")).sendKeys("standard_user");

		dr.findElement(By.id("password")).sendKeys("secret_sauce");

		dr.findElement(By.id("login-button")).click();

		// get webdriver session id

		SessionId s1 = dr.getSessionId();

		System.out.println("Session Id is: " + s1);

		
		
		
		
		dr.manage().deleteAllCookies();

		dr.switchTo().newWindow(WindowType.TAB).get("https://www.saucedemo.com");

		dr.findElement(By.id("user-name")).sendKeys("problem_user");

		dr.findElement(By.id("password")).sendKeys("secret_sauce");

		dr.findElement(By.id("login-button")).click();

		SessionId s2 = dr.getSessionId();

		System.out.println("Session Id is: " + s2);

		// browser close

		dr.quit();
	}

}
