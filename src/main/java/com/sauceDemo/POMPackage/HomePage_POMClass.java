package com.sauceDemo.POMPackage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage_POMClass 
{
	//1.WebDriver declare
	private WebDriver driver;
	private Select s;
	
	//2.WebElement find
	//3.WebElement action -> method maintain
	
	@FindBy(xpath = "//button[@id='react-burger-menu-btn']")
	private WebElement settingBtn;
	
	public void clickSettingBtn()
	{
		settingBtn.click();
	}
		 
	@FindBy(xpath = "//a[@id='logout_sidebar_link']")
	private WebElement logOutBtn;
	
	public void clickLogOutBtn()
	{
		logOutBtn.click();
	}
	
	//bag products elements
	
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
	private WebElement bagProductaddToCartBtn;
	
	public void clickBagProductAddTOCart()
	{
		bagProductaddToCartBtn.click();
	}
	
	@FindBy(xpath = "//a[@class='shopping_cart_link']")
	private WebElement addToCartBtn;
	
	public String getTextFromAddToCartBtn()
	{
		String productCount= addToCartBtn.getText();
		return productCount;
	}
	
	
	//all products
	@FindBy(xpath = "//button[text()='Add to cart']")
	private List<WebElement> allProducts;
	
	public void clickAllProductsAddToCart()
	{
//		allProducts.get(0).click();
//		allProducts.get(1).click();
		//or
		//Assignment -> use for each loop
		
		for(int i=0; i<allProducts.size();i++)
		{
			allProducts.get(i).click();
		}
	}
	
	//Assignment
	//dropdown handle scenario
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
	private WebElement dropDownEle;
	
	public void clickDropDown()
	{
		dropDownEle.click();
		s.selectByValue("Value of element");
	}
		
	 	
	//4.Constructor create
	
	public HomePage_POMClass(WebDriver driver)
	{
		this.driver = driver;		 
		PageFactory.initElements(driver, this);
		
//		s = new Select(dropDownEle);
	}
	

}
