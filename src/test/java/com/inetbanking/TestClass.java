package com.inetbanking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestClass {

	public static void launchChrome() {


	}

	public static void launchFirefox() {

		// launch Firefox browser
		System.setProperty("webdriver.gecko.driver","C:\\Users\\ankurparashari\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://google.com");
	}

	public static void launchEdge() {

		// launch Edge browser
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\ankurparashari\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		driver.get("https://google.com");
	}

	public static void main(String[] args) {
		
		// launch Chrome  browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ankurparashari\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

	driver.get("https://demo.nopcommerce.com/register");
	/*	driver.getCurrentUrl();
		System.out.println(driver.getPageSource());
		
		WebElement maleField = driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement femaleField = driver.findElement(By.xpath("//input[@id='gender-female']"));
		
		System.out.println("display status of male button : "+maleField.isDisplayed());
		System.out.println("selected status of male field : "+maleField.isSelected());
		
		//maleField.click();
		
		System.out.println("selected status of male field-after makle.clickmethod : "+maleField.isSelected());*/
		
		/*driver.get("https://snapdeal.com");
		driver.get("https://amazon.com");
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		RemoteWebDriver something;
		ChromeDriver name;*/
		
		
		WebElement electronics = driver.findElement(By.xpath("//a[text()='Electronics']"));
		//WebElement electronics = driver.findElement(By.linkText("Electronics"));
		
		
		electronics.click();
		

	}

}
