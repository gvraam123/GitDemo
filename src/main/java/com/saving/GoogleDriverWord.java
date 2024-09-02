package com.saving;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GoogleDriverWord {
	public static void main(String[] args) {

//		WebDriver dr = new ChromeDriver();
//		dr.manage().window().maximize();
//		dr.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
//		SessionId sessionId = ((RemoteWebDriver) dr).set
//		System.out.println(sessionId);
//
//		dr.get("https://www.google.com");
//		dr.quit();
		
		String staticSessionId = "1c727e93df64207505a533aa72dfa2d8";

        // Create ChromeOptions and set the remote debugging port
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-debugging-port=" + staticSessionId);

        // Create a new ChromeDriver with the specified options
        WebDriver driver = new ChromeDriver(options);

        // Example: Navigate to a website
        driver.get("https://www.google.com");

        // Perform other actions as needed

        // Close the browser when done
        driver.quit();
	}

}
