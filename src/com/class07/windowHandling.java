package com.class07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import utils.CommonMethods;

public class windowHandling extends CommonMethods {
	public static void main(String[] args) throws InterruptedException {
		CommonMethods.setUpDriver("firefox", "http://uitestpractice.com/Students/Switchto");
		String parent = driver.getTitle();
		String parentId = driver.getWindowHandle();
		System.out.println("title: " + parent + " " + " ID: " + parentId);
		driver.findElement(By.xpath("//a[text()='Opens in a new window']")).click();
		Set<String> allWindows = driver.getWindowHandles();
		Iterator<String> it = allWindows.iterator();
		parentId = it.next();
		String childId = it.next();
		
		
		childId = driver.getWindowHandle();
		if (!childId.equalsIgnoreCase(parentId))
			driver.switchTo().window(childId);
		System.out.println(" ID: " + childId);
		Thread.sleep(2000);
		driver.switchTo().window(parentId);
		
	

	}

}
