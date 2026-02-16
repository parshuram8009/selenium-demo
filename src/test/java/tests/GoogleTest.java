package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.GooglePage;

public class GoogleTest extends BaseTest {

	@Test
	public void searchTest() {
		
				
		 driver.get("https://www.google.com/");
		 
		 GooglePage google = new GooglePage(driver);
		 google.search("Selenium TestNG");
		 
		 System.out.println("Title is: " + driver.getTitle());

		
	}

}

