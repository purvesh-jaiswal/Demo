package com.selenium.example;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoTest {
	
	

private WebDriver driver;
	
	@BeforeTest
	public void setup(){
		 System.setProperty("webdriver.chrome.driver","chromedriver");
		driver = new ChromeDriver();
		
	}
	
	@AfterTest
	public void trminate(){
		
		driver.quit();
		
	}
	
	@Test
	public void StartTest(){
		
		driver.navigate().to("https://www.youtube.com/");
		
	}
	
	
}
