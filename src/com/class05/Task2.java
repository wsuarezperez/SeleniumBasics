package com.class05;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "\\Users\\Wilberth\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().fullscreen();
		
		driver.get("https://www.amazon.com/");
		Thread.sleep(1000);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("The total number of Links is: "+links.size());
		System.out.println("______________________________________________________________________________");
		
		int count=0;
		for (WebElement link: links) {
			String linkWithText=link.getText();
			if (!linkWithText.isEmpty()) {
				System.out.println(linkWithText);
				count++;
			}
		}
		System.out.println("_______________________________________________________________________________");
		
		System.out.println("The total number of Links with text is: "+count);
		driver.quit();
		
		
	}
}
