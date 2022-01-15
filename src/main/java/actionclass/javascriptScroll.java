package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptScroll {

	public static void main(String[] args) {
		// Declaration and instatiation of chromedriver
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\swaya\\eclipse-workspace\\NewWorkSpace\\webdriver_practice\\drivers\\chromedriver.exe");
		// Creating the object of webdriver for chromedriver
		WebDriver driver = new ChromeDriver();
		// maximize browser
		driver.manage().window().maximize();
		// URL
		driver.get("https://www.worldometers.info/geography/flags-of-the-world/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		//Approach 1-number of pixels
		js.executeScript("window.scrollBy(0,2000)\",\"\"");
		//OR
		//Approach 2-till we found certain element
		WebElement flag=driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/div/div/div/div[79]/div/a/img"));
		js.executeScript("arguments[0].scrollIntoView();",flag);
		//OR
        //Approach 3-till end of page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		driver.close();
	}

}
