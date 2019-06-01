package GroupHW;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class Task3 extends CommonMethods {
	public static void main(String[] args) throws InterruptedException {
		setUpDriver("chrome", "https://jqueryui.com/");
		justClick(driver.findElement(By.xpath("//a[text() = 'Datepicker']")));

		WebElement frame = driver.findElement(By.xpath("//iframe[@class = 'demo-frame']"));
		driver.switchTo().frame(frame);
		justClick(driver.findElement(By.id("datepicker")));

		String month = "August 2019";

		while (true) {
			String headerText = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			if (!headerText.equals(month)) {
				justClick(driver.findElement(By.xpath("//span[text()='Next']")));
				
			} else {
				break;
			}
		}

		selectCalendarDate(driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td")), "10");
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		quit();
	}

}
