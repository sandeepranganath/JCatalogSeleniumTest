package com.rl.test.selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

import org.testng.annotations.Test;

public class JCatalogTest extends MainDriver{
	
	public static void openBrowser(){
		//File file = new File("src/IEDriverServer.exe");
		//System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
		//driver = new InternetExplorerDriver();
		//System.setProperty("webdriver.firefox.bin","/usr/bin/firefox");
		driver = new FirefoxDriver();
		// driver = new HtmlUnitDriver();
		// driver.setJavascriptEnabled(true);
		driver.get("http://192.168.103.30:8080/catalog/");		
	}
	public static void closeBrowser(){
		driver.close();
	}
	public static void login(){
		
		driver.findElement(By.linkText("login")).click();
		driver.findElement(By.xpath("//input[@id='loginForm:username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='loginForm:password']")).sendKeys("admin");
		//driver.findElement(By.xpath("//input[@name='loginForm:_id24")).click();
		driver.findElement(By.name("loginForm:_id24")).click();
		}
	 
	
	@Test(priority = 0)
	public void Testlogin(){
		
		openBrowser();
	//	login();
		}
	
	
	
	
/*	@Test(priority = 1)
	public void TestcategoryOne(){
		try{
		
		Category.categoryOne();
		}
		catch(Exception e){
			System.out.print(e.getMessage());
		}
	}
	
	@Test(priority = 2)
	public void Testcategorytwo(){
		
		Category.categoryTwo();
		}
	
	@Test(priority = 3)
	public void Testcategorythree(){
		
		Category.categoryThree();
		
	}
	
	@Test(priority = 4)
	public void Testcategoryfour(){
		
		Category.categoryFour();
		
		}
	
	@Test(priority = 5)
	public void TestproductList(){
		
		NewProduct.ProductList();
		
	}

	@Test(priority = 6)
	public void TestnewProduct(){
		try{
		
		
		NewProduct.newproduct();
		
		}
		catch(Exception e){
			System.out.print(e.getMessage());
		}
	}
	
	@Test(priority = 7)
	public void Testcontactus(){
		
		ContactUs.contactUs();
		
	}
	
	@Test(priority = 8)
	public void Testplaceorder(){
		
		PlaceOrder.placeOrder();
		
	}*/
	
	/*@Test(priority = 9)
	public void Testlogout(){
		Logout.logout();
		closeBrowser();
	}*/
	
   
}
