package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTest {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nazarov\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
//		driver.findElement(By.id("email")).sendKeys("nazarovaly@gmail.com");
//		Thread.sleep(2000);
//		driver.findElement(By.id("pass")).sendKeys("leomessi9080104");
//		Thread.sleep(2000);
//		driver.findElement(By.id("loginbutton")).click();
		driver.manage().window().fullscreen();
		driver.findElement(By.xpath("//input[@type = 'email']")).sendKeys("nazarovaly@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type = 'password']")).sendKeys("leomessi9080104");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type = 'submit']")).click();
		Thread.sleep(2000);
		
		
		
		
	}

}