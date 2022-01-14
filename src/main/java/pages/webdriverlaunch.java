package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriverlaunch {
	/*
	 * 1st-> download and insert selenium dependency into POM.XML. 
	 * 2nd->Make a
	 * driver folder and download browser driver to see your running browser version
	 * and paste it into driver folder.
	 * 3rd->Note:CTRL+SHIFT+f for alignment of Editor
	 *
	 */
	public static void main(String[] args) {
		// Declaration and instatiation of chromedriver
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\swaya\\eclipse-workspace\\NewWorkSpace\\webdriver_practice\\drivers\\chromedriver.exe");
		// Creating the object of webdriver for chromedriver
		WebDriver driver = new ChromeDriver();
		//maximize browser
		driver.manage().window().maximize();
		// Declaring variable for baseURL and Title that needs to be verified
		String baseURL = "https://rahulshettyacademy.com/blog/index.php/selenium-tutorial/";
		String expectedTitle = "Selenium - Rahul Shetty Academy Blog";
		String actualTile = "";
		// Code to open chrome driver and open Base URL
		driver.get(baseURL);
	
		//get actual value using getTitle() method
		actualTile=driver.getTitle();
		//compare actual and expected title and print them
		if(actualTile.equalsIgnoreCase(expectedTitle)) {
			System.out.println("Test Passed");
		}else {
			System.out.println("Test failed");
		}
		
		//close chrome driver
		driver.close();

	}

}
