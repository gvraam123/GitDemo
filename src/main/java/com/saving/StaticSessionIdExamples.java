package com.saving;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class StaticSessionIdExamples {
	public static void main(String[] args) {
		// Set the static session ID (replace "your_static_session_id" with the desired
		// session ID)
		String staticSessionId = "your_static_session_id";

		// Create ChromeOptions and set the session ID
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("debuggerAddress", staticSessionId);

		// Create a new ChromeDriver with the specified options
		WebDriver driver = new ChromeDriver(options);

		// Example: Navigate to a website
		driver.get("https://www.google.com");

		// Perform other actions as needed

		// Close the browser when done
		driver.quit();
	}

}
