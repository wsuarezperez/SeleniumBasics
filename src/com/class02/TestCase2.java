package com.class02;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "\\Users\\Wilberth\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://syntaxtechs.com/");
		Thread.sleep(3000);
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		
		String title = driver.getTitle();
		
		if ( title.contains("Syntax")) {
			System.out.println("The title contains the word SYNTAX");
		} else {
			System.out.println("The WRONG title is entered");
		}
		driver.close();
	}

}
