package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "\\Users\\Wilberth\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/index.php?stype=lo&lh=Ac-e66yX49B2k5y2");
		driver.findElement(By.id("email")).sendKeys("juniorspshop@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("malibu1");
		Thread.sleep(2000);
		driver.findElement(By.id("loginbutton")).click();
		
		
	
	
	}
}
