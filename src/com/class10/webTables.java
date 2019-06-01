package com.class10;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class webTables extends CommonMethods {
	public static void main(String[] args) {
		setUpDriver("chrome", "https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[text() = 'Sortable Data Tables']")).click();
		List<WebElement> cols = driver.findElements(By.xpath("//table[@id = 'table1']/thead/tr/th"));
		System.out.println("Number of columns " + cols.size());
		for (WebElement col : cols) {
			System.out.print(col.getText() + "\t");
		}
		System.out.println();
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id = 'table1']/tbody/tr"));
		System.out.println("Number of rows " + rows.size());
		Iterator<WebElement> it = rows.iterator();
		while (it.hasNext()) {
			WebElement text = it.next();
			System.out.println(text.getText());

		}
		for (int i = 1; i <= rows.size(); i++) {
			for (int j = 0; j <= cols.size(); j++) {
				String cellText = driver
						.findElement(By.xpath("//table[@id = 'table1']/tbody/tr[" + i + "]/td[" + j + " ]")).getText();
				System.out.println(cellText);
			}
		}
	}

}
