package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitwait {

	/*
	 * explicit wait works based upon the condition not time.
	 * it will wait till the condition is true.
	 * once element is located then it will work
	 * when we use explicitwait then findelement doesnot use.
	 * when we declare explicit wait we have to mentioned thresold time or cut off time,
	 * suppose element is not found within thresold time/cutoff time
	 * then there might be chance of performance issues or application issues.
	 * NP:- which ever element is taking sometime to load then we have to apply explicit wait not all elements.
	 */
	public static void main(String[] args) {
		
		// Declaration and instatiation of chromedriver
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\swaya\\eclipse-workspace\\NewWorkSpace\\webdriver_practice\\drivers\\chromedriver.exe");
		// Creating the object of webdriver for chromedriver
		WebDriver driver = new ChromeDriver();
		//maximize browser
		driver.manage().window().maximize();
		
		//explicit wait
				WebDriverWait mywait=new WebDriverWait(driver,10000);//thresold time or cut off time
		//url
		driver.get("https://demo.guru99.com/test/newtours/");
		
		WebElement username=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("userName")));
		username.sendKeys("Test");
		WebElement password=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		password.sendKeys("Test");
	}

}
