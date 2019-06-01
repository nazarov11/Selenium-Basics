package com.class07;

import java.util.Iterator;

import java.util.Set;

import org.openqa.selenium.By;

import utils.CommonMethods;

public class HW extends CommonMethods {
	public static void main(String[] args) throws InterruptedException {
		CommonMethods.setUpDriver("chrome", "https://the-internet.herokuapp.com/");
		String parent = driver.getTitle();
		String parentId = driver.getWindowHandle();
		System.out.println(parent + " " + parentId);
		driver.findElement(By.linkText("Multiple Windows")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[@href = 'http://elementalselenium.com/']")).click();
		Set<String> newWin = driver.getWindowHandles();
		Iterator<String> it = newWin.iterator();
		parent = it.next();
		String child = it.next();
		Thread.sleep(2000);
		driver.switchTo().window(parent);
		Thread.sleep(2000);
		driver.switchTo().window(child);
		child = driver.getTitle();
		String childId = driver.getWindowHandle();
		System.out.println("title: " + child + " " + " ID: " + childId);
		Thread.sleep(2000);
		driver.close();

	}

}
