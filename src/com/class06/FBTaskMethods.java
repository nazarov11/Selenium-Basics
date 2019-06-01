package com.class06;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FBTaskMethods {
	
	public static void dd(WebElement element, String text, int num) {
		Select select = new Select(element);
		List<WebElement> ls = select.getOptions();
		select.selectByVisibleText(text);
		
		
		if(ls.size() == (num + 1)) {
			System.out.println("krasava");
		}
		
	}

}
