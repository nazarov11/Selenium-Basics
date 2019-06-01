package com.class07;

import utils.CommonMethods;

public class testMethods extends CommonMethods{
	public static void main(String[] args) {
		
		CommonMethods.setUpDriver("firefox", "https://www.google.com");
		
		
		
		driver.close();
	}

}
