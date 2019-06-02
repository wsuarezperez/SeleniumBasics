package com.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*
 * TC 1: JavaScript alert text verification
Open chrome browser
Go to “https://www.seleniumeasy.com/test/javascript-alert-box-demo.html”
Verify
alert box with text “I am an alert box!” is present
confirm box with text “Press a button!” is present
prompt box with text “Please enter your name” is present
Quit browser
*/




 					FINISH THIS
 					
 					
 					
 					
 					
public class Task {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "\\Users\\Wilberth\\Selenium\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
    
    driver.findElement(By.linkText("button.btn")).click();
    
    Thread.sleep(1000);
}
}
