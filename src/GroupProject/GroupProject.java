package GroupProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.CommonMethods;

/*TC 1: Users Application Form Fill
 * 1.Open chrome browser
 * 2.Go to “http://uitestpractice.com/”
 * 3.Click on “Forms” link
 * 4.Fill out the entire form
 * 5.Close the browser
 */
public class GroupProject extends CommonMethods {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		setUpDriver("chrome", "http://uitestpractice.com/");

		driver.findElement(By.xpath("//a[starts-with(@href,'/Students/F')] ")).click();
		sendText(driver.findElement(By.cssSelector("input#firstname")), "Al");
		sendText(driver.findElement(By.cssSelector("input#lastname")), "Ventura");
		checkBox(driver, driver.findElement(By.xpath("//html/body/div[2]/div[1]/div/form/div[3]/label[2]/input")));
		checkBox(driver, driver.findElement(By.xpath("//html/body/div[2]/div[1]/div/form/div[4]/label[3]/input")));
		WebElement contries = driver.findElement(By.cssSelector("select#sel1"));
		Select select = new Select(contries);
		select.selectByVisibleText("Algeria");

		driver.findElement(By.cssSelector("input#datepicker")).click();

		WebElement month = driver.findElement(By.cssSelector("select.ui-datepicker-month"));
		Select selectMonth = new Select(month);
		selectMonth.selectByVisibleText("Jun");

		WebElement year = driver.findElement(By.xpath("//select[@data-handler='selectYear']"));
		Select selectYear = new Select(year);
		selectYear.selectByVisibleText("2010");

//                        List<WebElement> rows = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/thead/tr/td"));
//                        List<WebElement> cols = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr"));

		String expectedValue = "20";

		List<WebElement> days = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		for (WebElement day : days) {
			// get text of each cell
			String dayText = day.getText();
			if (dayText.equals(expectedValue)) {
				day.click();

				sendText1("css", "input#phonenumber", "5555555");
				// driver.findElement(By.cssSelector("input#phonenumber")).sendKeys("5555555555");
				driver.findElement(By.cssSelector("input#username")).sendKeys("JavaJets");
				driver.findElement(By.cssSelector("input#email")).sendKeys("javajets@4lyf3.com");
				driver.findElement(By.cssSelector("textarea#comment")).sendKeys("WE ARE THE JAVA-JETS");
				driver.findElement(By.cssSelector("input#pwd")).sendKeys("password");
				Thread.sleep(5000);
				driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/form/div[12]/div/button")).click();

			}

		}

	}
}