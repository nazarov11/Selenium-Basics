package com.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.CommonMethods;

public class seleniumWait extends CommonMethods{
	public static void main(String[] args) throws InterruptedException {
		setUpDriver("chrome", "https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[text() = 'Dynamic Loading']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text() = 'Example 1: Element on page that is hidden']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text() = 'Start']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text() = 'Hello World!']")));
		WebElement hello = driver.findElement(By.xpath("//h4[text() = 'Hello World!']"));
		if(hello.isDisplayed()) {
			String text = hello.getText();
			System.out.println(text);
		}
		driver.close();
		
	}

}
