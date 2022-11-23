package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vimalachandran\\eclipse-workspace-11 AM\\Selenium_Concepts\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demo.automationtesting.in/Frames.html");

		// main page----> to----->frame
		WebDriver frame = driver.switchTo().frame("singleframe");

		WebElement textbox = driver.findElement(By.xpath("//input[@type='text']"));

		textbox.sendKeys("selenium");

		// frame---->to---->main page

		driver.switchTo().defaultContent();

		// multiple frame
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();

		// main page--->outer frame
		WebElement outer = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));

		driver.switchTo().frame(outer);

		WebElement inner = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));

		driver.switchTo().frame(inner);

		WebElement textbox2 = driver.findElement(By.xpath("//input[@type='text']"));

		textbox2.sendKeys("selenium Testing");

		// inner frame--->outer
		driver.switchTo().parentFrame();

		// outer frame--->main page
		driver.switchTo().defaultContent();

	}

}
