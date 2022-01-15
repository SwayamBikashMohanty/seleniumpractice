package actionclass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardactions {

	public static void main(String[] args) throws InterruptedException {
		// Declaration and instatiation of chromedriver
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\swaya\\eclipse-workspace\\NewWorkSpace\\webdriver_practice\\drivers\\chromedriver.exe");
		// Creating the object of webdriver for chromedriver
		WebDriver driver = new ChromeDriver();
		// maximize browser
		driver.manage().window().maximize();
		// URL
		driver.get("https://the-internet.herokuapp.com/key_presses");
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		// act.sendKeys(Keys.CONTROL+"a").build().perform();
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.CANCEL).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ESCAPE).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.BACK_SPACE).perform();

		driver.close();

	}

}
