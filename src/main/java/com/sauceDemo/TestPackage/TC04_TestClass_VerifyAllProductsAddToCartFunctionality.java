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

public class TC04_TestClass_VerifyAllProductsAddToCartFunctionality extends TestBaseClass 
{
	@Test
	public void verifyAllProductsAddToCartFunctionality()
	{
		HomePage_POMClass hp = new HomePage_POMClass(driver);
		hp.clickAllProductsAddToCart();
		System.out.println("Clicked on all products");
		
		System.out.println("Apply the validation");
		
		String expectedCount = "6";
		String actualCount = hp.getTextFromAddToCartBtn();
		
		Assert.assertEquals(actualCount, expectedCount);
	}	

}
