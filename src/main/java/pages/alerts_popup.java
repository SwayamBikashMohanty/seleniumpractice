package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts_popup {

	public static void main(String[] args) throws InterruptedException {
		// Declaration and instatiation of chromedriver
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\swaya\\eclipse-workspace\\NewWorkSpace\\webdriver_practice\\drivers\\chromedriver.exe");
		// Creating the object of webdriver for chromedriver
		WebDriver driver = new ChromeDriver();
		//maximize browser
		driver.manage().window().maximize();
		//URL
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//identify alert element
		driver.findElement(By.xpath("//*[@id=\"HTML9\"]/div[1]/button")).click();
		Thread.sleep(5000);
		//closes the popup by using ok button
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//*[@id=\"HTML9\"]/div[1]/button")).click();
		Thread.sleep(5000);
		//closes the popup by using cancel button
		driver.switchTo().alert().dismiss();
		
		driver.close();

	}

}
