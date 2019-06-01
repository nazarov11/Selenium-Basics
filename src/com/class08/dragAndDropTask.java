package com.class08;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class dragAndDropTask extends CommonMethods{
	public static void main(String[] args) throws InterruptedException {
		setUpDriver("chrome", "https://jqueryui.com/droppable/");
		WebElement frame = driver.findElement(By.xpath("//iframe[@class = 'demo-frame']"));
		driver.switchTo().frame(frame);
		Actions action = new Actions(driver);
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		Thread.sleep(2000);
		action.dragAndDrop(drag, drop).perform();
	}

}
