package com.inetbanking.testcases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	
	public String url = "https://demo.guru99.com/v4/index.php";
	public String username = "mngr446214";
	public String passwrod = "jagegAs";
	public static WebDriver driver;
	
	@BeforeClass
	public void Setup(){
		
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
	driver= new ChromeDriver();
		
	}
	
	@AfterClass
	public void tearDown(){
		
		driver.quit();
	}

}
