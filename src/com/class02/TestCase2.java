package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nazarov\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.navigate().to("http://syntaxtechs.com");
		driver.navigate().to("http://google.com");
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().refresh();
		String title = driver.getTitle();
		if (title.contains("Syntax")) {
			System.out.println("right");
		}
		else {
			System.out.println("wrong");
		}
	}

}
