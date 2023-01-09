package com.sauceDemo.POMPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_POMClass 
{
	//webElements find
	//webelement +action
	//we will not run this class so no main method
	//this class purpose -to store the ele n their action
	
	//-----------------------------
	//1.WebDriver declare ->globally 	
	 private WebDriver driver;
	 private Actions act;
	 
	 //2.WebElement find
	 //now as a part of POM CLass
	 //we will not use findElement method
	 //we will use @FindBy annoation
	 
//	 WebElement username = driver.findElement(By.id("login-button"));
	
//	 @FindBy --> @ start --> annotations ->funtion
	 //works like method only
	 
	 @FindBy(xpath = "//input[@id='user-name']")
	 private WebElement username;
	 	 
	 @FindBy(xpath = "//input[@id='password']")
	 private WebElement password;
	 	 
	 @FindBy(xpath = "//input[@id='login-button']")
	 private WebElement loginBtn;
	 
	 //3.Element action perform
	 
	 public void sendUsername()
	 {
	   username.sendKeys("standard_user");
	 }
	 
	 public void sendPassword()
	 {
	  password.sendKeys("secret_sauce");
	 }
	 
	 //webelement method
//	 public void clickLoginBtn()
//	 {
//		 loginBtn.click();
//	 }
	 
	 //mouse action
	 public void clickLoginBtn()
	 {	 
		 act.click(loginBtn).perform();		 
	 }
	 
	 //4.Constructor Create
	 
	 public LoginPage_POMClass(WebDriver driver)
	 {
		 this.driver = driver;		 
		 PageFactory.initElements(driver, this);
		 
		 act = new Actions(driver);
	 }
	
	
	//1.WebDriver declare
	//2.WebElement find
	//3.WebElement action -> method maintain
	//4.Constructor create
	

}
