package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTest2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "\\Users\\Wilberth\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
		driver.findElement(By.id("customer.firstName")).sendKeys("bob");
		driver.findElement(By.id("customer.lastName")).sendKeys("franklin");
		driver.findElement(By.id("customer.address.street")).sendKeys("123 Grove St");
		driver.findElement(By.id("customer.address.city")).sendKeys("San Andreas");
		driver.findElement(By.id("customer.address.state")).sendKeys("California");
		driver.findElement(By.id("customer.address.zipCode")).sendKeys("55265");
		driver.findElement(By.id("customer.phoneNumber")).sendKeys("347-922-1620");
		driver.findElement(By.id("customer.ssn")).sendKeys("555-55-5555");
		driver.findElement(By.id("customer.username")).sendKeys("wspj");
		driver.findElement(By.id("customer.password")).sendKeys("password");
		driver.findElement(By.id("repeatedPassword")).sendKeys("password");
		driver.findElement(By.className("button")).click();
		
	}
}
