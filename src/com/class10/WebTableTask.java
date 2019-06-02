package com.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.List;
import utils.CommonMethods;

/*
 * TC 1: Table headers and rows verification

Open chrome browser
Go to “https://the-internet.herokuapp.com/”
Click on “Click on the “Sortable Data Tables” link
Verify tables consist of 4 rows and 6 columns
Print name of all column headers
Print data of all rows
*/
public class WebTableTask extends CommonMethods {
	public static void main(String[] args) {
		setUpDriver("chrome", "https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[40]/a")).click();
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
		System.out.println("Rows number: " + rows.size());
		Iterator<WebElement> it = rows.iterator();
		while (it.hasNext()) {
			String rowsText = it.next().getText();
			System.out.println("The text in rows is:");
			System.out.println(rowsText);
		}
		System.out.println("_____________________________________________");
			List<WebElement> colm = driver.findElements(By.xpath("//table[@id='table1']/thead/tr/th"));
			System.out.println("Number of Columns is: " + colm.size());
Iterator<WebElement> itr= colm.iterator();
while (itr.hasNext() ) {
	String colmText = itr.next().getText();
	System.out.println("columns number:");
	System.out.println(colmText);
}
		
		driver.close();
	}
}
