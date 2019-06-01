package com.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.CommonMethods;

public class task2 extends CommonMethods{
	public static void main(String[] args) {
		setUpDriver("chrome", "https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[text() = 'Dynamic Controls']")).click();
		driver.findElement(By.xpath("//input[@type = 'checkbox']")).click();
		WebElement remove = driver.findElement(By.xpath("//button[text() = 'Remove']"));
		remove.click();
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text() = 'Add']")));
		driver.findElement(By.xpath("//button[text() = 'Add']")).click();
		
		wait.until(ExpectedConditions.visibilityOf(remove));
		WebDriverWait wait1 = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
		WebElement text = driver.findElement(By.id("message"));
		wait1.until(ExpectedConditions.visibilityOf(text));
		
		if(text.isDisplayed())
			System.out.println(text.isDisplayed());
		
		
	}

}
