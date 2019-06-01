package GroupHW;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class Task1 extends CommonMethods {
	public static void main(String[] args) {
		setUpDriver("chrome", "http://uitestpractice.com");

		justClick(driver.findElement(By.xpath("//a[text() = 'Form']")));

		sendText(driver.findElement(By.id("firstname")), "Ali");
		sendText(driver.findElement(By.id("lastname")), "Nazarov");

		radioButtonClick(driver.findElements(By.className("radio-inline")), "Single");
		checkBoxClick(driver.findElements(By.className("checkbox-inline")), "Dancing");
		checkBoxClick(driver.findElements(By.className("checkbox-inline")), "Reading");

		selectValueFromDD(driver.findElement(By.id("sel1")), "Iceland");

		justClick(driver.findElement(By.id("datepicker")));
		selectValueFromDD(driver.findElement(By.className("ui-datepicker-month")), "Jul");
		selectValueFromDD(driver.findElement(By.className("ui-datepicker-year")), "1993");
		selectCalendarDate(driver.findElements(By.xpath("//table[@class = 'ui-datepicker-calendar']/tbody/tr/td")),
				"19");
		
		justClick(driver.findElement(By.id("phonenumber")));
		sendText(driver.findElement(By.id("phonenumber")), "1234567");
		sendText(driver.findElement(By.id("username")), "Testers Group");
		sendText(driver.findElement(By.id("email")), "testers@gmail.com");
		sendText(driver.findElement(By.id("comment")), "We are batch 4");
		sendText(driver.findElement(By.id("pwd")), "syntax");
		justClick(driver.findElement(By.xpath("//button[text() = 'Submit']")));
		
		quit();
		
	}
}
