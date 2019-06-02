package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task {

	public static String Products;

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "\\Users\\Wilberth\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// maximize window
		driver.manage().window().fullscreen();
		driver.get("https://www.saucedemo.com/");
		// storing userName text box inside variable
		driver.findElement(By.xpath("//input[starts-with(@class,'form_input')]")).sendKeys("standard_user");
		Thread.sleep(1000);
	
		driver.findElement(By.xpath("//input[contains(@placeholder,'Pass')]")).sendKeys("secret_sauce");
		// click on the Login btn
		driver.findElement(By.xpath("//input[contains(@type,'sub')]")).click();
		// verify logo is displayed
		boolean isDisplayed = driver.findElement(By.xpath("//div[contains(@class,'peek')]")).isDisplayed();

		if (isDisplayed) {
			System.out.println("Robot logo is displayed");
		} else {
			System.out.println("Robot logo is NOT displayed");
		}
		
		WebElement products = driver.findElement(By.xpath("//div[contains(@class,'product_label')]"));
		String value = products.getText();

		if (value.contains("Products")) {
			System.out.println(value + " is the Header name. Test case PASS");
		} else {
			System.out.println(value + " is not the Header name");
		}
		Thread.sleep(3000);
		driver.quit();

	}
}