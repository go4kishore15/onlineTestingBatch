package com.SelTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class SelTest {
	WebDriver driver;
	@BeforeAll
	public static void Init()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Drivers\\chromedriver.exe");
	}
	
	@BeforeEach
	public void initForAll()
	{
		driver = new ChromeDriver();
		String baseUrl = "http://127.0.0.1:5500/sample-page.html";
		driver.get(baseUrl);
	}
	
	@Test
	public void test() {

		System.out.println("Testing  started");
		String actualTitle = driver.getTitle();
		assertEquals("index",actualTitle);

	}
	
	@Test
	public void test2()
	{
		String tagName = driver.findElement(By.id("my-Address")).getText();
		assertEquals("I live in Duckburg",tagName);
	}

	@AfterEach
	public void closeTestForEach()
	{
		driver.close();
	}
	
//	@AfterAll
//	public void closeTest()
//	{
//		
//	}
}
