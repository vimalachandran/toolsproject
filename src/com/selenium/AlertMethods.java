package com.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertMethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vimalachandran\\eclipse-workspace-11 AM\\Selenium_Concepts\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://letcode.in/alert");

		WebElement simple = driver.findElement(By.id("accept"));
		simple.click();
		driver.switchTo().alert().accept();

		// confirm
		WebElement confirm = driver.findElement(By.id("confirm"));
		confirm.click();
		driver.switchTo().alert().dismiss();

		// prompt
		WebElement prompt = driver.findElement(By.id("prompt"));
		prompt.click();

		Alert promptAlert = driver.switchTo().alert();
		promptAlert.sendKeys("selenium");
		promptAlert.accept();

	}

}
