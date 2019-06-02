package com.class04;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ContainsTask {
/*TC 1: Facebook login:
Open chrome browser
Go to “https://www.facebook.com/”
Enter valid username and valid password and click login
User successfully logged in
*/
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "\\Users\\Wilberth\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/index.php?stype=lo&lh=Ac-e66yX49B2k5y2");
		driver.findElement(By.xpath("//input[starts-with(@id,'email')]")).sendKeys("juniorspshop@gmail.com");
		driver.findElement(By.xpath("//input[contains(@class,'inputtext')]")).sendKeys("malibu1");
		driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
		Thread.sleep(2000);
		
		driver.close();
		
		
		
		//	ALSO TRY THE TEXT WAY WITH A TAG
		//	//a[starts-with(text(),’TEXT’)]
	}
}
