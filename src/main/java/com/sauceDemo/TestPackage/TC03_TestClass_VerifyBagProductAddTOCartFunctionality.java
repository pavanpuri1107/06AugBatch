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



public class TC03_TestClass_VerifyBagProductAddTOCartFunctionality extends TestBaseClass 
{
	@Test
	public void verifyBagProductAddTOCartFunctionality()
	{
		//bagProductClick
		HomePage_POMClass hp =new HomePage_POMClass(driver);
		
		hp.clickBagProductAddTOCart();
		System.out.println("Clicked on bag product");
		
		System.out.println("Apply the validation");
		String expectedCount = "1";	
		String actualCount = hp.getTextFromAddToCartBtn();
		
		Assert.assertEquals(actualCount, expectedCount);
	}
}
