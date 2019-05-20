package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookXPath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nazarov\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("nazarovaly@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[starts-with(@id,'pa')]")).sendKeys("leomessi9080104");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[starts-with(@id,'u_0')]")).click();
		
	}

}
