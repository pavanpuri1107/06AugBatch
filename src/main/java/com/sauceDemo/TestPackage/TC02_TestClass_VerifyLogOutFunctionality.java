package com.sauceDemo.TestPackage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sauceDemo.POMPackage.HomePage_POMClass;



public class TC02_TestClass_VerifyLogOutFunctionality extends TestBaseClass
{
	@Test
	public void verifyLogOutFunctionality()
	{
	    //click settingBtn and logOutBtn
	    HomePage_POMClass hp = new HomePage_POMClass(driver);
	    hp.clickSettingBtn();
	    System.out.println("Clicked on setting button");
	    
	    hp.clickLogOutBtn();
	    System.out.println("Clicked on logOut button");
	
	    System.out.println("Went on loginPage");
	
	    System.out.println("Apply the validation");
	    
	    String givenTitle = "Swag Labs";   //PO/BA/dev		
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(actualTitle, givenTitle);
	}
}
