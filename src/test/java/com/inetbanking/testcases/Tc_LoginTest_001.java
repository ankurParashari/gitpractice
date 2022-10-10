package com.inetbanking.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageobjects.LoginPage;

public class Tc_LoginTest_001 extends BaseTest{
	
	
	@Test
	public void loginTest(){
		
		driver.get(url);
		LoginPage lp = new LoginPage(driver);
		
		lp.setUsername(username);
		lp.setPassword(passwrod);
		lp.clickSubmit();
		
		if(driver.getTitle().equals("my name")){
			
			Assert.assertTrue(true);
			
		}else {
			
			Assert.assertFalse(false);
		}
	}
	
	@Test
	public void anotherLoginTest(){
		
		driver.get(url);
		LoginPage lp = new LoginPage(driver);
		
		lp.setUsername(username);
		lp.setPassword(passwrod);
		lp.clickSubmit();
		
		if(driver.getTitle().equals("my name")){
			
			Assert.assertTrue(true);
			
		}else {
			
			Assert.assertFalse(false);
		}
	}
}
