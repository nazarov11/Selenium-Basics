package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webDriverCommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nazarov\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.get("http://google.com");
//		System.out.println(driver.getTitle());
//		String title = driver.getTitle();
//		if(title.equalsIgnoreCase("google")) {
//			System.out.println("this is the right title");
//		}
//		else {
//			System.out.println("sorry this is not the right title");
//		}
		driver.get("http://facebook.com");
		System.out.println(driver.getTitle());
		String title = driver.getTitle();
		if(title.equalsIgnoreCase("Facebook - Log In or Sign Up")) {
			System.out.println("right title");
		}
		else {
			System.out.println("not right title");
		}

	}

}
