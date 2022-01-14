package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitwait {

	/*wherever synchronization problem occured implicit wait takes care.
	 * it will declare one time and applicable for all elements.
	 * suppose we given wait time 10 seconds,
	 * if element is ready within 5 seconds then it doesnot wait for remaining time and 
	 * immediately goes to next step.
	 * implicit wait declare at begining of script before URL hit.
	 * As comparision with Thread.sleep(),implicit wait is a good solution.
	 * Disadvantage:-If element will take beyond 10 seconds then it will cause synchronozation issues.
	 */
	public static void main(String[] args) {
		// Declaration and instatiation of chromedriver
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\swaya\\eclipse-workspace\\NewWorkSpace\\webdriver_practice\\drivers\\chromedriver.exe");
				// Creating the object of webdriver for chromedriver
				WebDriver driver = new ChromeDriver();
				//maximize browser
				driver.manage().window().maximize();
				
				//declare implicit wait
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 
				
				//url
				driver.get("https://demo.guru99.com/test/newtours/");
				
				driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("Test");

				
				driver.close();
		
	}
}
