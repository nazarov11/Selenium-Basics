package com.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBTask {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nazarov\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement day = driver.findElement(By.id("day"));
		FBTaskMethods.dd(day, "19", 31);
		
		WebElement month = driver.findElement(By.id("month"));
		FBTaskMethods.dd(month, "Jul", 12);
		
		WebElement year = driver.findElement(By.id("year"));
		FBTaskMethods.dd(year, "1993", 115);
	}

}
