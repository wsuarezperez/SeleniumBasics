package com.class08;

import utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class rightClick extends CommonMethods {
	// Task for contextClick
//	 Navigate to https://www.saucedemo.com
//		 Right click on the password textbox 
//		 Close the browser 

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			setUpDriver("chrome","https://www.saucedemo.com" );
			WebElement rightClick= driver.findElement(By.cssSelector("input#user-name"));
			Actions action = new Actions(driver);
			action.contextClick(rightClick).perform();
			Thread.sleep(2000);
			//driver.close();
			
			
			driver.findElement(By.cssSelector("input[data-test='password']"));
			action.contextClick(rightClick).perform();

	}
}
