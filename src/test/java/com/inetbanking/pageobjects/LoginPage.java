package com.inetbanking.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver){
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(name="uid")
	@CacheLookup
	WebElement txtusername;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement txtpassword;
	
	@FindBy(name="btnLogin")
	@CacheLookup
	WebElement loginbutton;
	
	public void setUsername(String uname){
		
		
		txtusername.sendKeys(uname);
	}
	
public void setPassword(String pwd){
		
		
	txtpassword.sendKeys(pwd);
	}
	
public void clickSubmit(){
	
	
	loginbutton.click();
}
	
	
	
	
	
	
	

}
