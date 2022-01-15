package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class resizingslider {

	public static void main(String[] args) {
		// Declaration and instatiation of chromedriver
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\swaya\\eclipse-workspace\\NewWorkSpace\\webdriver_practice\\drivers\\chromedriver.exe");
		// Creating the object of webdriver for chromedriver
		WebDriver driver = new ChromeDriver();
		// maximize browser
		driver.manage().window().maximize();
		// URL
		driver.get("https://testautomationpractice.blogspot.com/");

		Actions act = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		//resize
		act.moveToElement(ele).dragAndDropBy(ele,400,0).build().perform();
		
		driver.close();

	}

}
