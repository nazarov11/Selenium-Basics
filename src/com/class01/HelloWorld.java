package com.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelloWorld {
	public static void main(String[] args) {
		
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nazarov\\Selenium\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://google.com/");
//		driver.get("http://facebook.com");
//		
//		driver.get("http://amazon.com");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Nazarov\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		
//		WebElement textBox = driver.findElement(By.name("q"));
//		textBox.sendKeys("Facebook");
//		textBox.submit();
		
//		WebElement login = driver.findElement(By.id("u_0_2"));
//		login.click();
//		driver.navigate().back();
//		driver.findElement(By.id("s")).click();
//		driver.close();
	}

}
