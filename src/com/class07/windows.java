package com.class07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import utils.CommonMethods;

public class windows extends CommonMethods {
	public static void main(String[] args) {
		CommonMethods.setUpDriver("chrome","https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.findElement(By.xpath("//a[text()='Flights']")).click();
	
	    Set<String> ids = driver.getWindowHandles();
	    Iterator<String> iterator = ids.iterator();
	    String parentID = iterator.next();
	    System.out.println("Parent WIn id " + parentID);
	    String childID = iterator.next();
	    System.out.println("child win id " + childID);

	    //driver.switchTo().window(childID);
	}

}
