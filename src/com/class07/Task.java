package com.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class Task extends CommonMethods{
	public static void main(String[] args) throws InterruptedException {
		CommonMethods.setUpDriver("chrome", "https://www.toolsqa.com/iframe-practice-page/");
		driver.switchTo().frame("iframe1");
		driver.findElement(By.linkText("Blogs")).click();
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("iframe2");
		WebElement text = driver.findElement(By.xpath("//h3[@class = 'widget-title']"));
		System.out.println(text.getText());		
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		driver.close();
	}

}
