package com.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HW2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nazarov\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement month = driver.findElement(By.id("month"));
		Select months = new Select(month);
		months.selectByIndex(7);
		List<WebElement> m = months.getOptions();
		if(m.size() == 13)
			System.out.println("good");
		
		WebElement day = driver.findElement(By.id("day"));
		Select days = new Select(day);
		days.selectByIndex(19);
		List<WebElement> d = days.getOptions();
		if(d.size() == 32)
			System.out.println("good");
		
		WebElement year = driver.findElement(By.id("year"));
		Select years = new Select(year);
		years.selectByVisibleText("1993");
		List<WebElement> y = years.getOptions();
		if(y.size() == 116)
			System.out.println("good");
		
	}

}
