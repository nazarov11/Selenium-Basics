package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class close {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nazarov\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://amazon.com");
		//driver.close();
		//driver.quit();
		
		
	}

}
