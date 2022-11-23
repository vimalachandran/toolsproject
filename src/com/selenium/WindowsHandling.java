package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowsHandling {

	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vimalachandran\\eclipse-workspace-11 AM\\Selenium_Concepts\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");

		Actions ac = new Actions(driver);

		Robot rb = new Robot();

		WebElement mobiles = driver.findElement(By.linkText("Mobiles"));

		ac.contextClick(mobiles).perform();

		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		WebElement books = driver.findElement(By.linkText("Books"));

		ac.contextClick(books).perform();

		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);

		for (String id : windowHandles) {
			String title = driver.switchTo().window(id).getTitle();
			System.out.println(title);

		}
		
		
		String myString="Book Store Online : Buy Books Online at Best Prices in India | Books Shopping @ Amazon.in";
		
		for (String id : windowHandles) {
			if (driver.switchTo().window(id).getTitle().equalsIgnoreCase(myString)) {
				break;
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
