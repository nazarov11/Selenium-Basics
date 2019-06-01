package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class task2 extends CommonMethods {
	public static void main(String[] args) {
		setUpDriver("chrome", "http://uitestpractice.com/Students/Index");
		driver.findElement(By.linkText("Actions")).click();
		Actions action = new Actions(driver);
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		action.clickAndHold(drag).perform();
		action.moveToElement(drop).perform();
		action.release().perform();
		driver.quit();
	}

}
