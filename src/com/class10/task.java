package com.class10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class task extends CommonMethods {
	public static void main(String[] args) throws InterruptedException {

		setUpDriver("chrome", "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
		driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("Tester");
		driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("test");
		driver.findElement(By.xpath("//input[contains(@name,'login')]")).click();
		Thread.sleep(2000);
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class = 'SampleTable']/tbody/tr"));
		System.out.println(rows.size());
		List<WebElement> cols = driver.findElements(By.xpath("//table[@class = 'SampleTable']/tbody/tr/th"));
		System.out.println(cols.size());
		String text = "Mark Smith";

		for (int i = 1; i <= rows.size(); i++) {
			String rowText = driver.findElement(By.xpath("//table[@class = 'SampleTable']/tbody/tr[" + i + "]"))
					.getText();

			if (rowText.contains("Mark Smith")) {
				driver.findElement(By.xpath("//table[@class = 'SampleTable']/tbody/tr[" + i + "]/td[13]")).click();
				break;
			}
			
		}
		//driver.findElement(By.xpath("//input[contains(@id, 'txtName')]")).click();
		sendText(driver.findElement(By.xpath("//input[contains(@id, 'txtName')]")), "Ali Nazarov");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@value, 'Visa')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(@id, 'UpdateButton')]")).click();
		Thread.sleep(1000);
		driver.quit();
	}

}
