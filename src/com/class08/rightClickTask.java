package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class rightClickTask extends CommonMethods{
		public static void main(String[] args) {
			setUpDriver("chrome", "http://demo.guru99.com/test/simple_context_menu.html");
			WebElement frame = driver.findElement("//iframe[@style='display: none !important;']");
			driver.switchTo().frame(frame);
		WebElement rightClick = driver.findElement(By.cssSelector("//span[text()='right click me']"));
		Actions action = new Actions(driver);
		action.contextClick(rightClick).perform();
		
		
		}
}
