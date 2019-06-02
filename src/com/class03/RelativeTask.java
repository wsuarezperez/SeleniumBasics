package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeTask {
public static void main(String[] args) throws InterruptedException {
	

	System.setProperty("webdriver.chrome.driver", "\\Users\\Wilberth\\Selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.get("https://www.facebook.com/index.php?stype=lo&lh=Ac-e66yX49B2k5y2");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("juniorspshop@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@data-testid='royal_pass']")).sendKeys("malibu1");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	Thread.sleep(2000);
}	
}

//					RELATIVE X PATH ALWAYS BEGINS WITH //