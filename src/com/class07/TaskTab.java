package com.class07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import utils.CommonMethods;

public class TaskTab extends CommonMethods{
public static void main(String[] args) throws InterruptedException {
	CommonMethods.setUpDriver("chrome", "https://www.toolsqa.com/");
	String parent = driver.getTitle();
	System.out.println("Parent title is: "+parent);

	String parentId = driver.getWindowHandle();
	System.out.println("Parent ID is: "+parentId);

	driver.findElement(By.xpath("//*[@id=\"page\"]/div[1]/div[1]/div[3]/div[1]/a[1]")).click();	
	Set<String> getAllWindows = driver.getWindowHandles();
	Iterator<String> it =getAllWindows.iterator();
	parent = it.next();
	String child=it.next();
	driver.switchTo().window(child);
	
	child = driver.getTitle();
	String childId = driver.getWindowHandle();
	System.out.println("child title is: "+child);
	
	System.out.println("child ID is: " +childId);
	
	//Thread.sleep(2000);
	driver.quit();
	
	
}
}
