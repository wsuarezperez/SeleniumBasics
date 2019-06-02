package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","\\Users\\Wilberth\\Selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	System.out.println(driver.getTitle());
	
	String title = driver.getTitle();
	if (title.equalsIgnoreCase("Facebook - Log In or Sign Up"))
	{ System.out.println("This is the right title");
	} 
	 else
	{
	
		System.out.println("This is the wrong title");
	}



}
}