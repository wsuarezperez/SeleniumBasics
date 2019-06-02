package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "\\Users\\Wilberth\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.com/");

		System.out.println(driver.getTitle());

		String title = driver.getTitle();
		if (title.equalsIgnoreCase(
				"Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more")) {
			System.out.println("This is the CORRECT title:");
		} else {
			System.out.println("This is the WRONG title");
		}

		driver.close();

	}

}
