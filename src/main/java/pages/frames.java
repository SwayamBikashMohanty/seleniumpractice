package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {

	/*
	 * driver.switchTo().frame(name)
     * driver.switchTo().frame(index)
     * driver.switchTo().frame(WebElement)
     * driver.switchTo().defaultContent();
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
				driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
				//Before click we have to switch to perticular frame
				driver.switchTo().frame("packageListFrame");
				//1st frame element
				driver.findElement(By.linkText("org.openqa.selenium")).click();
				//After performing action then we have to move out the frame
				driver.switchTo().defaultContent();
				
				//identify and switch to 2nd frame
				driver.switchTo().frame("packageFrame");
				//2nd frame element
				driver.findElement(By.linkText("WebDriver")).click();
				//After performing action then we have to move out the frame
				driver.switchTo().defaultContent();
				
				//identify and switch to 3rd frame
				driver.switchTo().frame("classFrame");
				//3rd frame element
				driver.findElement(By.xpath("/html/body/header/nav/div[1]/div[1]/ul/li[6]")).click();
				//After performing action then we have to move out the frame
				driver.switchTo().defaultContent();
				
				driver.close();
				

	}

}
