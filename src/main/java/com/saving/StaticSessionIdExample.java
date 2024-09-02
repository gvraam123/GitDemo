package com.saving;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class StaticSessionIdExample {

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
		driver.get("https://www.example.com");

		// Perform other actions as needed

		// Close the browser when done
		driver.quit();
	}

	/*
	 * // Your existing code to open a browser session WebDriver driver = new
	 * ChromeDriver(); driver.get("https://www.google.com"); // Get the current
	 * session ID String sessionId = ((RemoteWebDriver)
	 * driver).getSessionId().toString();
	 * 
	 * // Close the existing browser session driver.quit();
	 * 
	 * // Create a new browser session with the same session ID WebDriver newDriver
	 * = new ChromeDriver(); ((RemoteWebDriver)
	 * newDriver).setSessionId(sessionId).toString();
	 * 
	 * // Now newDriver is associated with the previous browser session // You can
	 * use newDriver to interact with the existing session
	 * 
	 * // Example: Navigate to a website newDriver.get("https://www.google.com");
	 * 
	 * // Perform other actions as needed
	 * 
	 * // Close the browser when done newDriver.quit(); }
	 */

}