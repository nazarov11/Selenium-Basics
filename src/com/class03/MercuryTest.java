package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MercuryTest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nazarov\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstName")).sendKeys("Ali");
		Thread.sleep(2000);
		driver.findElement(By.name("lastName")).sendKeys("Nazarov");
		Thread.sleep(2000);
		driver.findElement(By.name("phone")).sendKeys("1234567");
		Thread.sleep(2000);
		driver.findElement(By.id("userName")).sendKeys("ali@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("address1")).sendKeys("Avenir place");
		Thread.sleep(2000);
		driver.findElement(By.name("city")).sendKeys("Vienna");
		Thread.sleep(2000);
		driver.findElement(By.name("state")).sendKeys("VA");
		Thread.sleep(2000);
		driver.findElement(By.name("postalCode")).sendKeys("22180");
		Thread.sleep(2000);

		Select dropdown = new Select(driver.findElement(By.name("country")));
		dropdown.selectByVisibleText("TAJIKISTAN");

		driver.findElement(By.id("email")).sendKeys("nazarov");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("syntax");
		Thread.sleep(2000);
		driver.findElement(By.name("confirmPassword")).sendKeys("syntax");
		Thread.sleep(2000);
		driver.findElement(By.name("register")).click();
		Thread.sleep(2000);
		driver.close();

	}

}
