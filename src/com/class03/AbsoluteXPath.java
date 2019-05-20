package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXPath {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nazarov\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

//		driver.navigate().to("https://www.toolsqa.com/automation-practice-form/");
//		driver.findElement(By.xpath(
//				"html/body/div/div[5]/div/div/div/div/div/div/div/div[2]/div/form/fieldset/div[8]/input[@name='firstname']"))
//				.sendKeys("Denis");
//		;
		 driver.get("https:www.saucedemo.com");
	        driver.findElement(By.xpath("//input[@data-test='username']")).sendKeys("standard_user");
	        driver.findElement(By.xpath("//input[@data-test='password']")).sendKeys("secret_sauce");
	        driver.findElement(By.xpath("//input[@type='submit']")).click();

	}

}
