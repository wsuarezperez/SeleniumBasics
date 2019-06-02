package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mercury {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "\\Users\\Wilberth\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		/*
		 * TC 2: Mercury Tours Registration: Open chrome browser Go to
		 * “http://newtours.demoaut.com/” Click on Register Link Fill out all required
		 * info Click Submit User successfully registered (Create 2 scripts using
		 * different locators)
		 */
		driver.get("https://www.google.com/");
		driver.get("http://newtours.demoaut.com/");

		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("Wil");
		driver.findElement(By.name("lastName")).sendKeys("Perez");
		driver.findElement(By.name("phone")).sendKeys("3479221616");
		driver.findElement(By.name("userName")).sendKeys("juniorspshop@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("951 Alley Ave");
		driver.findElement(By.name("city")).sendKeys("Waldorf");
		driver.findElement(By.name("state")).sendKeys("Maryland");
		driver.findElement(By.name("postalCode")).sendKeys("20626");
		driver.findElement(By.name("email")).sendKeys("wspj1234");
		driver.findElement(By.name("password")).sendKeys("password");
		driver.findElement(By.name("confirmPassword")).sendKeys("password");
		driver.findElement(By.name("register")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
