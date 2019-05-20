package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MercuryXPath {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nazarov\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.xpath("//a[text() = 'REGISTER']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name = 'firstName']")).sendKeys("Alijon");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name = 'lastName']")).sendKeys("Nazarov");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name = 'phone']")).sendKeys("1234567");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id = 'userName']")).sendKeys("ali@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name = 'address1']")).sendKeys("2677 Avenir place");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name = 'city']")).sendKeys("Vienna");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name = 'state']")).sendKeys("VA");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name = 'postalCode']")).sendKeys("22180");
		Thread.sleep(2000);
		
		Select dropdown = new Select(driver.findElement(By.xpath("//select[@name = 'country']")));
		dropdown.selectByVisibleText("TAJIKISTAN");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("ali@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys("syntax");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name = 'confirmPassword']")).sendKeys("syntax");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name = 'register']")).click();
		
		
	}

}
