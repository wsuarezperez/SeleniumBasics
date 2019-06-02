package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

/*task
Ahead to https://jqueryui.com/droppable/
handle the frame
drag and drop
close browser
*/
public class dragAndDropTask extends CommonMethods {
	public static void main(String[] args) {
		setUpDriver("chrome", "https://jqueryui.com/droppable/");
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions action = new Actions(driver);
		action.dragAndDrop(drag, drop).perform();
	}

}
