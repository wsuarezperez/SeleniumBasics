package com.class08;

import utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class doubleClickTask extends CommonMethods {
	// Task for doubleClick
//	 Navigate to https://www.saucedemo.com
	// send keys to the password textbox
//		 double click on the password text
//		 Close the browser 

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		setUpDriver("chrome", "https://www.saucedemo.com");
		driver.findElement(By.cssSelector("input[data-test='password']")).sendKeys("double");
		Actions action = new Actions(driver);
		action.doubleClick(driver.findElement(By.cssSelector("input[data-test='password']"))).perform();
		Thread.sleep(5000);
		driver.close();
	}
}