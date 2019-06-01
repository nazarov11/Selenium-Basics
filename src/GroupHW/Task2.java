package GroupHW;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class Task2 extends CommonMethods {
	public static void main(String[] args) throws InterruptedException {
		setUpDriver("chrome", "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
		sendText(driver.findElement(By.xpath("//input[contains(@id,'username')]")), "Tester");
		sendText(driver.findElement(By.xpath("//input[contains(@id,'password')]")), "test");
		justClick(driver.findElement(By.xpath("//input[contains(@id,'login')]")));

		justClick(driver.findElement(By.xpath("//a[text() = 'Order']")));
		selectValueFromDD(driver.findElement(By.xpath("//select[contains(@id,'ddl')]")), "FamilyAlbum");

		Thread.sleep(2000);

		sendText(driver.findElement(By.xpath("//input[contains(@id,'txtQuantity')]")), "15");
		sendText(driver.findElement(By.xpath("//input[contains(@id,'txtDiscount')]")), "15");
		sendText(driver.findElement(By.cssSelector("input#ctl00_MainContent_fmwOrder_txtName")), "Alijon");
		sendText(driver.findElement(By.cssSelector("input[id$='TextBox2']")), "NewBrook Dr");
		sendText(driver.findElement(By.cssSelector("input[id$='TextBox3']")), "Chantilly");
		sendText(driver.findElement(By.cssSelector("input[id$='TextBox4']")), "VA");
		sendText(driver.findElement(By.cssSelector("input[id$='TextBox5']")), "22180");
		radioButtonClick(driver.findElements(By.xpath("//table[contains(@id,'cardList')]/tbody/tr/td")), "MasterCard");
		sendText(driver.findElement(By.cssSelector("input[id$='TextBox6']")), "12345678912");
		sendText(driver.findElement(By.cssSelector("input[id$='TextBox1']")), "05/30");
		justClick(driver.findElement(By.cssSelector("a[id$='InsertButton']")));
		Thread.sleep(2000);
		justClick(driver.findElement(By.xpath("//a[text()='View all orders']")));
		String myName = "Alijon";
		String address = "Chantilly";
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr"));
		Thread.sleep(2000);
		for (int i = 1; i <= rows.size(); i++) {
			String rowText = driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr[" + i + "]"))
					.getText();

			if (rowText.contains(myName) && rowText.contains(address)) {
				System.out.println(rowText);
				driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr[" + i + "]/td[13]")).click();
				break;
			}
		}
		sendText(driver.findElement(By.cssSelector("input[id$='TextBox2']")), "Washington Plaza");
		sendText(driver.findElement(By.cssSelector("input[id$='TextBox3']")), "Fairfax");
		Thread.sleep(2000);
		justClick(driver.findElement(By.cssSelector("a[id$='UpdateButton']")));
		
		String changedAddress = "Fairfax";
		for (int i = 1; i <= rows.size(); i++) {
			String rowText = driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr[" + i + "]"))
					.getText();
			if (rowText.contains(myName) && rowText.contains(changedAddress)) {
				System.out.println(rowText);
			}
		}
		Thread.sleep(3000);
		driver.quit();

	}

}
