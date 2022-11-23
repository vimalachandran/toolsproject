package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropdown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vimalachandran\\eclipse-workspace-11 AM\\Selenium_Concepts\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://letcode.in/dropdowns");

		WebElement multipleSelect = driver.findElement(By.id("superheros"));
		Select s = new Select(multipleSelect);
		System.out.println(s.isMultiple());

		s.selectByValue("am");
		s.selectByVisibleText("Aquaman");
		s.selectByValue("ta");

		s.deselectByValue("am");

		// getOptions
		List<WebElement> options = s.getOptions();
		for (WebElement all : options) {
			System.out.println(all.getText());
		}

		System.out.println();

		System.out.println("------------Selected Options--------------");

		// getAllSelectedOptions
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement selected : allSelectedOptions) {
			System.out.println(selected.getText());
		}

		System.out.println("--------First selected Option---------");

		// getFirstSelectedOption
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());

		// deselectAll
		s.deselectAll();

	}

}
