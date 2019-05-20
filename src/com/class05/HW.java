package com.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nazarov\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		driver.findElement(By.name("firstname")).sendKeys("ALijon");
		Thread.sleep(2000);
		driver.findElement(By.name("lastname")).sendKeys("Nazarov");
		Thread.sleep(2000);

		boolean radioList = driver.findElement(By.id("sex-0")).isEnabled();
		System.out.println(radioList);
		boolean radioList1 = driver.findElement(By.id("sex-1")).isEnabled();
		System.out.println(radioList1);
		if (radioList)
			driver.findElement(By.id("sex-0")).click();

		List<WebElement> experience = driver.findElements(By.name("exp"));

		Thread.sleep(1000);

		for (WebElement exp : experience) {

			if (exp.isEnabled())
				exp.click();
			Thread.sleep(1000);

		}
		driver.findElement(By.id("datepicker")).sendKeys("5/19/2019");
		Thread.sleep(1000);
		List<WebElement> profession = driver.findElements(By.name("profession"));
		for (WebElement prof : profession) {
			if (prof.isEnabled())
				prof.click();
		}
		String toSelect = "Selenium Webdriver";
		List<WebElement> tools = driver.findElements(By.name("tool"));
		for (WebElement tool : tools) {
			if (tool.isEnabled())
				tool.click();
			if (tool.isSelected())
				tool.click();
			if (tool.getAttribute("value").equals(toSelect))
				tool.click();

		}
		driver.quit();

	}

}
