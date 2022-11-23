package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vimalachandran\\eclipse-workspace-11 AM\\Selenium_Concepts\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		WebElement email = driver.findElement(By.id("email"));

		System.out.println(email.isDisplayed());

		System.out.println(email.isEnabled());

		email.sendKeys("vimala@gmail.com");

		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("Data@123#");
		
		password.clear();

		WebElement login = driver.findElement(By.name("login"));
		login.click();
		
		

	}

}
