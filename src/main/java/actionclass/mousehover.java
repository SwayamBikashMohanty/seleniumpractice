package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehover {

	public static void main(String[] args) {
		// Declaration and instatiation of chromedriver
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\swaya\\eclipse-workspace\\NewWorkSpace\\webdriver_practice\\drivers\\chromedriver.exe");
		// Creating the object of webdriver for chromedriver
		WebDriver driver = new ChromeDriver();
		// maximize browser
		driver.manage().window().maximize();
		// URL
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
		// username
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		// password
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		// login button
		driver.findElement(By.id("btnLogin")).click();
		// click on Admin
		WebElement admin = driver.findElement(By.linkText("Admin"));
		// click on usermanagement
		WebElement usermanagement = driver.findElement(By.id("menu_admin_UserManagement"));
		// click on users
		WebElement users = driver.findElement(By.id("menu_admin_viewSystemUsers"));

		// perform mouse hover action
		Actions act = new Actions(driver);
		act.moveToElement(admin).moveToElement(usermanagement).moveToElement(users).click().build().perform();

		driver.close();
	}

}
