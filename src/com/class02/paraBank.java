package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class paraBank {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nazarov\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(
				"https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
		driver.findElement(By.id("customer.firstName")).sendKeys("Alijon");
		Thread.sleep(2000);
		driver.findElement(By.name("customer.lastName")).sendKeys("Nazarov");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.address.street")).sendKeys("2677 Avenir Place");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.address.city")).sendKeys("Vienna");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.address.state")).sendKeys("VA");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.address.zipCode")).sendKeys("22180");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.phoneNumber")).sendKeys("12345678");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.ssn")).sendKeys("123-45-345");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.username")).sendKeys("nazarov");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.password")).sendKeys("password");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='repeatedPassword']")).sendKeys("password");
		Thread.sleep(2000);
		driver.findElement(By.className("button")).click();

	}

}
