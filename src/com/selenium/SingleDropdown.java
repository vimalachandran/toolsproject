package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleDropdown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vimalachandran\\eclipse-workspace-11 AM\\Selenium_Concepts\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		WebElement create = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		create.click();
		Thread.sleep(2000);

		WebElement day = driver.findElement(By.id("day"));
		Select s = new Select(day);
		s.selectByValue("5");

		WebElement month = driver.findElement(By.id("month"));
		Select s1 = new Select(month);
		s1.selectByIndex(11);

		WebElement year = driver.findElement(By.id("year"));
		Select s2 = new Select(year);
		s2.selectByVisibleText("2018");

	}

}
