package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
	public static void main(String[] args) {
		// which driver //location
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vimalachandran\\eclipse-workspace-11 AM\\Selenium_Concepts\\driver\\chromedriver.exe");

		// browser launch
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.myntra.com/");

		String title = driver.getTitle();
		System.out.println(title);

		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

		// navigate
		driver.navigate().to("https://www.facebook.com/");

		driver.close();

	}

}
