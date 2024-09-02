package com.testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel {

	WebDriver dr;

	@Test
	public void google() {
		dr = new ChromeDriver();
		dr.manage().window().maximize();

		dr.get("https://www.google.com");
		System.out.println(dr.getTitle());
	}

	@Test
	public void facebook() {
		dr = new ChromeDriver();
		dr.switchTo().newWindow(WindowType.TAB);
		dr.get("https://www.facebook.com");
		System.out.println(dr.getTitle());
	}

}
