package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangeHRMWebTable {
/*
 * print number of enabled and disabled username inside a table
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
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
		
		//username
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		//password
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		//login button
		driver.findElement(By.id("btnLogin")).click();
		//click on Admin
		driver.findElement(By.linkText("Admin")).click();
		//click on usermanagement
		driver.findElement(By.id("menu_admin_UserManagement")).click();
		//click on users
		driver.findElement(By.id("menu_admin_viewSystemUsers")).click();
		//identify table
		WebElement table=driver.findElement(By.id("resultTable"));
		//identify row
		int rows=table.findElements(By.tagName("tr")).size();
		System.out.println("No of rows present:"+rows);
		//identify column
		int column=table.findElements(By.tagName("td")).size();
		System.out.println("No of columns present:"+column);
		
		int counter=0;
		
		for(int r=1;r<rows;r++) {
			String text=driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr["+r+"]/td[5]")).getText();
			if(text.equalsIgnoreCase("enabled")) {
				counter++;
			}
		}
		System.out.println("enabled:"+counter);
		System.out.println("disabled:"+(rows-counter));
		
	}

}
