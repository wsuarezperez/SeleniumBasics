package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
public static void main(String[] args) {
//	System.setProperty("webdriver.chrome.driver","\\Users\\Wilberth\\Selenium\\chromedriver.exe");
	//WebDriver driver = new ChromeDriver();
	//driver.get("http://google.com");
	
//	driver.get("https://www.facebook.com/");
	//driver.get("https://www.amazon.com/");

	//driver.close();
	System.setProperty("webdriver.gecko.driver","\\Users\\Wilberth\\Selenium\\chromedriver.exe");
	WebDriver driver = new FirefoxDriver();
	
	driver.get("https://www.facebook.com/");
	
	
	driver.get("https://www.planetfitness.com/gyms/?msclkid=97e980a536ca157e1531dc7186d60cd9&utm_source=bing&utm_medium=cpc&utm_campaign=PF_National_Evergreen_Brand&utm_term=planet%20fitness&utm_content=PF_General_Exact&gclid=CImY8OHFj-ICFYmnswodizsGSA&gclsrc=ds");
	
driver.close();
}
}
