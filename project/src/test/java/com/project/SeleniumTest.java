package com.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumTest {
	WebDriver driver;
	
	@BeforeTest
	public void before() {
		driver = new ChromeDriver();
		
		driver.get("https://testpages.eviltester.com/styled/validation/input-validation.html");
		
	}
	
	@Test
	public void test() throws InterruptedException {
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement firstNameBox = driver.findElement(By.xpath("//*[@id=\"firstname\"]"));
		
		firstNameBox.sendKeys("TestFirstName");
		
		WebElement lastNameBox = driver.findElement(By.xpath("//*[@id=\"surname\"]"));
		
		lastNameBox.sendKeys("TestLastName");
		
		WebElement ageBox = driver.findElement(By.xpath("//*[@id=\"age\"]"));
		
		ageBox.sendKeys("20");
		
		WebElement countryDropDown = driver.findElement(By.xpath("//*[@id=\"country\"]"));
		
		countryDropDown.sendKeys("India");
		
		WebElement notesTestArea = driver.findElement(By.xpath("//*[@id=\"notes\"]"));
		
		notesTestArea.sendKeys("This is sample text");
		
		Thread.sleep(4000);
		
		WebElement submitButton = driver.findElement(By.xpath("/html/body/div/div[3]/form/input[4]"));
		
		submitButton.click();

		
		Thread.sleep(10000);
		
	}
	
	@AfterTest
	public void after() {
		driver.quit();
	}
	
}
