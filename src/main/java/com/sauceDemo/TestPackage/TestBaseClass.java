package com.sauceDemo.TestPackage;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.sauceDemo.POMPackage.LoginPage_POMClass;
import com.sauceDemo.UtilityPackage.UtilityClass;

public class TestBaseClass 
{  
	
      WebDriver driver;
      
    Logger log = Logger.getLogger("SauceDemo06AugBatch");
	
    @Parameters("browserName")
	@BeforeMethod
	public void setUp(String browserName) throws IOException
	{
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", 
					"./DriverFolder/chromedriver.exe");	
			
			driver = new ChromeDriver();
		}
		else
		{
			System.setProperty("webdriver.gecko.driver", 
					"./DriverFolder/geckodriver.exe");	
			
			driver = new FirefoxDriver();
		}
		
		PropertyConfigurator.configure("log4j.properties");
		
		log.info("browser is opened");
				
		driver.manage().window().maximize();	
		log.info("browser is maximized");
				
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://www.saucedemo.com/");
		log.info("url is opened");
		
		//screenshot
		UtilityClass.screenShotMethod(driver,"loginPagePankaj");
	
		LoginPage_POMClass lp = new LoginPage_POMClass(driver);
	    lp.sendUsername();
	    log.info("Username is entered");
	    
	    lp.sendPassword();
	    log.info("Password is entered");
	    
	    lp.clickLoginBtn();
	    log.info("Clicked on login Button");
	    
	    //--homePage
	    log.info("Went on homePage");	    
	    UtilityClass.screenShotMethod(driver,"homePagePankaj");	
	}
	
	@AfterMethod
	public void tearDown()
	{	
		driver.quit();
		log.info("browser is closed");
		
		log.info("End of Program");
	}

}
