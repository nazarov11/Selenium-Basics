package com.class06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonDep {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nazarov\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		WebElement depList = driver.findElement(By.name("url"));
		Select select = new Select(depList);
		List<WebElement> list = select.getOptions();
		System.out.println(list.size());
		for(WebElement l: list) {
			System.out.println(l.getText());
			
		}
		select.selectByVisibleText("Computers");
		Thread.sleep(2000);
		driver.quit();
		
	}

}
