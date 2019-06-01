package com.class08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class task3 extends CommonMethods {
	public static void main(String[] args) throws InterruptedException {
		setUpDriver("chrome", "http://uitestpractice.com/Students/Index");
		driver.findElement(By.linkText("Actions")).click();
		Actions action = new Actions(driver);
//		WebElement one = driver.findElement(By.name("one"));
//		WebElement two = driver.findElement(By.name("two"));
//		WebElement three = driver.findElement(By.name("three"));
//		WebElement four = driver.findElement(By.name("four"));
		List<WebElement> list = driver.findElements(By.cssSelector("li[class = 'ui-state-default ui-selectee']"));
		for (int j = 0; j < 1; j++) {
			for (int i = 0; i < list.size() - 1; i++) {
				action.clickAndHold(list.get(i)).perform();
				Thread.sleep(1000);
				if (i == 3)
					break;
			}
			action.release().perform();
		}
		// list.get(4).click();
//		action.clickAndHold(one).perform();
//		action.clickAndHold(two).perform();
//		action.clickAndHold(three).perform();
//		action.clickAndHold(four).perform();
//		action.release().perform();
	}

}
