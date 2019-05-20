package com.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class toolsqa {
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nazarov\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.toolsqa.com/automation-practice-form/");
		List<WebElement> experience = driver.findElements(By.name("exp"));
		int count = 0;
		for (WebElement exp : experience) {
			if (exp.isEnabled())
				exp.click();
			Thread.sleep(2000);
		}
		
		
		List<WebElement> tools = driver.findElements(By.name("tool"));
		String toSelect = "Selenium Webdriver";
		Thread.sleep(2000);
		int countTool = 0;
		for (WebElement tool : tools) {

			if (tool.isEnabled())
				tool.click();
				Thread.sleep(2000);
			if (tool.getAttribute("value").equals(toSelect))
				tool.click();
				

		}

	}

}
