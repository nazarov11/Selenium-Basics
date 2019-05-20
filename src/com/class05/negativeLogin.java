package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class negativeLogin {
	public static String error = "Username and password do not match any user in this service";
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nazarov\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("Ali");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("Syntax");
		Thread.sleep(2000);
		driver.findElement(By.className("btn_action")).click();
		Thread.sleep(2000);
		WebElement fail = driver.findElement(By.xpath("//h3[@data-test = 'error']"));
		String failTxt = fail.getText();
		if(failTxt.contains(error))
			System.out.println("All good");
		else 
			System.out.println("No Match");
	}
}
