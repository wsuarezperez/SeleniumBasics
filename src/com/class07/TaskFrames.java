package com.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class TaskFrames extends CommonMethods {
	public static void main(String[] args) {
		CommonMethods.setUpDriver("chrome", "https://www.toolsqa.com/iframe-practice-page/");
		/*
		 * TC 1: ToolsQA Frame verification Open chrome browser Go to
		 * “https://www.toolsqa.com/iframe-practice-page/” Click on “Blogs” link inside
		 * first frame Verify element “Interactions” is present in second frame Navigate
		 * to Home Page Quit browser
		 */

		//WebElement FirstF = driver.findElement(By.cssSelector("));
		driver.switchTo().frame("iframe.lazyloaded").findElement(By.xpath("//*[@id=\"primary-menu\"]/li[6]/a")).click();
		
		
		//driver.switchTo().frame(1);
		

	}

}
