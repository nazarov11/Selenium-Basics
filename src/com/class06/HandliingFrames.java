package com.class06;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandliingFrames {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nazarov\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://uitestpractice.com/Students/Switchto");
		driver.manage().window().maximize();
//		WebElement frame = driver.findElement(By.name("iframe_a"));
//		driver.switchTo().frame(frame);
		
		//driver.switchTo().frame("iframe_a");
		driver.switchTo().frame(0);
		driver.findElement(By.id("name")).sendKeys("Alijon");
		
		driver.switchTo().defaultContent();
//		Thread.sleep(1000);
//		driver.findElement(By.linkText("Select")).click();
		
		
		
	}

}
