package com.class04;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class StartsWith {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "\\Users\\Wilberth\\Selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[starts-with(@data-test,'user')]")).sendKeys("standard_user");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[contains(@placeholder,'Pass')]")).sendKeys("secret_sauce");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[contains(@type,'sub')]")).click();
	Thread.sleep(3000);
	driver.close();
	
	}

}
