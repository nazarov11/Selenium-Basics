package com.class06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownReview {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Nazarov\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		WebElement continents = driver.findElement(By.cssSelector("select#continents"));
		Select select = new Select(continents);

		select.selectByVisibleText("Africa");
		Thread.sleep(2000);
		select.selectByIndex(5);

		WebElement commandsDD = driver.findElement(By.id("selenium_commands"));
		Select select1 = new Select(commandsDD);
		if (select1.isMultiple()) {
			select1.selectByVisibleText("Navigation Commands");
			Thread.sleep(2000);
			select1.selectByIndex(4);
			Thread.sleep(2000);
			select1.deselectByIndex(4);
		}
		List<WebElement> list = select1.getOptions();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
		}
	}

}
