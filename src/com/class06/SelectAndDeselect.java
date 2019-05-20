package com.class06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAndDeselect {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nazarov\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://uitestpractice.com/");
		driver.findElement(By.linkText("Select")).click();
		WebElement countries = driver.findElement(By.id("countriesSingle"));
		Select select = new Select(countries);
		List<WebElement> l = select.getOptions();
		Thread.sleep(2000);
		for (WebElement list : l) {
			System.out.println(list.getText());
		}
		select.selectByVisibleText("United states of America");

		WebElement multiple = driver.findElement(By.id("countriesMultiple"));
		Select select1 = new Select(multiple);
		List<WebElement> l1 = select1.getOptions();
		for (WebElement multipleList : l1) {
			System.out.println(multipleList.getText());
		}
		if(select1.isMultiple())
		for(int i = 0; i < l1.size(); i++) {
			select1.selectByIndex(i);
			Thread.sleep(1000);
		}
		
		Thread.sleep(1000);
		driver.quit();
			
			

	}

}
