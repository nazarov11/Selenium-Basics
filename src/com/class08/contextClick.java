package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class contextClick extends CommonMethods {
	public static void main(String[] args) throws InterruptedException {
		setUpDriver("chrome", "https://www.saucedemo.com");
		WebElement rightClick = driver.findElement(By.id("password"));
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.contextClick(rightClick).perform();
		driver.findElement(By.id("user-name")).sendKeys("Alijon");
		Thread.sleep(2000);
		action.doubleClick(driver.findElement(By.id("user-name"))).perform();
		Thread.sleep(2000);
		driver.quit();

	}

}
