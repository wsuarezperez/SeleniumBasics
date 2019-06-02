package IndividualProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class myProject extends CommonMethods {

	public static void main(String[] args) {
		String url = "https://jqueryui.com/";
		CommonMethods.setUpDriver("chrome", url);

		CommonMethods.linkClick("xpath", "//*[@id=\"sidebar\"]/aside[2]/ul/li[6]/a");
		WebElement iframe = driver.findElement(By.cssSelector("iframe.demo-frame"));
//do(!iframe.isDisplayed())
		// clicking calendar
		driver.switchTo().frame(iframe);
		CommonMethods.linkClick("css", "input.hasDatepicker");

		// clicking next
		String expectedMonth = "August", expectedDay = "10";

		// looping through calendar
		//get month
		String month = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div")).getText();
		linkClick("xpath", "//a[@data-handler='next']");

		linkClick("xpath", "//a[@data-handler='next']");

		linkClick("xpath", "//a[@data-handler='next']");

		List<WebElement> table = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		for (WebElement day : table) {
			if (!month.equals(expectedMonth)) {
			}
			//get day
			String dayText = day.getText();
			if (dayText.equals(expectedDay)) {
				day.click();
			}
			
		}

	}

}