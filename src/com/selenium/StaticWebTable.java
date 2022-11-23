package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vimalachandran\\eclipse-workspace-11 AM\\Selenium_Concepts\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://testautomationpractice.blogspot.com/");

		System.out.println("--------All Data-----------");

		List<WebElement> allData = driver.findElements(By.xpath("//table/tbody/tr/td"));
		for (WebElement all : allData) {
			System.out.println(all.getText());
		}

		System.out.println();

		System.out.println("--------Row Data-----------");

		List<WebElement> RowData = driver.findElements(By.xpath("//table/tbody/tr[4]/td"));
		for (WebElement row : RowData) {
			System.out.println(row.getText());
		}

		System.out.println();

		System.out.println("---------Column Data-------");

		List<WebElement> ColumnData = driver.findElements(By.tagName("td"));
		for (WebElement column : ColumnData) {
			System.out.println(column.getText());
		}

	}
}
