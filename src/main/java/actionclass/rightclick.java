package actionclass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightclick {

	public static void main(String[] args) throws InterruptedException {

		// Declaration and instatiation of chromedriver
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\swaya\\eclipse-workspace\\NewWorkSpace\\webdriver_practice\\drivers\\chromedriver.exe");
		// Creating the object of webdriver for chromedriver
		WebDriver driver = new ChromeDriver();
		// maximize browser
		driver.manage().window().maximize();
		// URL
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        //Right click
		Actions act = new Actions(driver);
		WebElement button = driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		act.contextClick(button).build().perform();
		driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]")).click();
		Thread.sleep(2000);
		Alert alt=driver.switchTo().alert();
		String alttext=alt.getText();
		System.out.println(alttext);
		alt.accept();
        driver.close();
	}

}
