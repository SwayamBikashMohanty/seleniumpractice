package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getCommands {
	/*
	 * URL:-https://goo.gl/RVdKM9
	 * get() --> opens the URL on the browsers 
	 * getTitle() --> returns the page tile
	 * getCurrentURL() -->returns the URL of the page 
	 * getPageSource() --> returns HTML code for page
	 * 
	 */

	public static void main(String[] args) {

		// Declaration and instatiation of chromedriver
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\swaya\\eclipse-workspace\\NewWorkSpace\\webdriver_practice\\drivers\\chromedriver.exe");
		// Creating the object of webdriver for chromedriver
		WebDriver driver = new ChromeDriver();
		// maximize browser
		driver.manage().window().maximize();

		driver.get("https://goo.gl/RVdKM9");
		System.out.println("URL is opened");
		
		String actualtitle=driver.getTitle();
		System.out.println("Title of page:"+actualtitle);
		
		String url=driver.getCurrentUrl();
		System.out.println("current URL is:"+url);
		
		String resource=driver.getPageSource();
		System.out.println("Current page resource:"+resource);
		
		driver.close();
	}

}
