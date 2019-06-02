package com.class09;

import org.openqa.selenium.By;

import utils.CommonMethods;

/*TC 1: Verify element is present
Open chrome browser
Go to “https://the-internet.herokuapp.com/”
Click on “Click on the “Dynamic Loading” link
Click on “Example 1...” and click on “Start”
Verify element with text “Hello World!” is displayed
Close the browser
*/

public class Task extends CommonMethods {
public static void main(String[] args) {
	setUpDriver("chrome" , "https://the-internet.herokuapp.com/");
	driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[14]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"content\"]/div/a[1]")).click();
	driver.findElement(By.xpath("//*[@id=\"start\"]/button")).click();
	
	
	
}	

}
