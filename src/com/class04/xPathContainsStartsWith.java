package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xPathContainsStartsWith  {
	public static void main(String[] agrs) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nazarov\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[starts-with(@type,'pass')]")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[starts-with(@type,'sub')]")).click();
		Thread.sleep(2000);
		driver.close();
		
	}

}
