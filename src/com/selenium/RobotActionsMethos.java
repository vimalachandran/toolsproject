package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotActionsMethos {

	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vimalachandran\\eclipse-workspace-11 AM\\Selenium_Concepts\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://testautomationpractice.blogspot.com/");

		Actions ac = new Actions(driver);

		Robot rb = new Robot();

		WebElement src = driver.findElement(By.id("draggable"));

		WebElement des = driver.findElement(By.id("droppable"));

		// drag and drop
		ac.dragAndDrop(src, des).build().perform();

		driver.navigate().to("https://www.amazon.in/");

		// moveToElement
		WebElement prime = driver.findElement(By.id("nav-link-amazonprime"));
		ac.moveToElement(prime).perform();

		// contextClick
		WebElement mobiles = driver.findElement(By.linkText("Mobiles"));

		ac.contextClick(mobiles).perform();

		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
}

}
