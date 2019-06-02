package com.class03;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class AbsoluteTask {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "\\Users\\Wilberth\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/index.php?stype=lo&lh=Ac-e66yX49B2k5y2");
		driver.findElement(By.xpath("html/body/div/div/div/div/div/div/div/form//input[@data-testid='royal_email']")).sendKeys("juniorspshop@gmail.com");
		//driver.findElement(By.xpath(xpathExpression));
	}

}
