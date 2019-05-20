package com.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertTask {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nazarov\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		driver.findElement(By.xpath("//button[@class = 'btn btn-default']")).click();
		Thread.sleep(1000);
		
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		System.out.println(alertText);
		alert.accept();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[@class = 'btn btn-default btn-lg']")).click();
		Alert alert2 = driver.switchTo().alert();
		String alertText2 = alert2.getText();
		System.out.println(alertText2);
		Thread.sleep(1000);
		alert2.dismiss();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[@onclick = 'myPromptFunction()']")).click();
		Thread.sleep(1000);
		Alert alert3 = driver.switchTo().alert();
		String alertText3 = alert3.getText();
		System.out.println(alertText3);
		alert3.sendKeys("ALijon");
		Thread.sleep(1000);
		alert3.accept();
	}

}
