package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	/*
	 * Findout all the links which are present in a webpage?
	 * NP:Every links starting with anchor tag i.e common for all links
	 * case1: locator matches multiple elements, findElement() ----> this can be located single element
     * case2: locator mathces multiple elements, findElements() --> this can be located multiple elements
	 */
	public static void main(String[] args) {
		
		// Declaration and instatiation of chromedriver
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\swaya\\eclipse-workspace\\NewWorkSpace\\webdriver_practice\\drivers\\chromedriver.exe");
				// Creating the object of webdriver for chromedriver
				WebDriver driver = new ChromeDriver();
				//maximize browser
				driver.manage().window().maximize();
				//URL
				driver.get("https://demo.guru99.com/test/newtours/");
			    //identify the anchor tag
			List<WebElement> links=driver.findElements(By.tagName("a"));
			System.out.println(links.size());
			//reading all the links from webpage and display
			for(WebElement e:links) {
				System.out.println(e.getText());
			}
				
		driver.close();	

	}
}
