package pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandles {

	public static void main(String[] args) {
	
		// Declaration and instatiation of chromedriver
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\swaya\\eclipse-workspace\\NewWorkSpace\\webdriver_practice\\drivers\\chromedriver.exe");
		// Creating the object of webdriver for chromedriver
		WebDriver driver = new ChromeDriver();
		//maximize browser
		driver.manage().window().maximize();
		//URL
		driver.get("http://demo.automationtesting.in/Windows.html");
		
		//identify the parent window
		String parent=driver.getWindowHandle();
		//print the parent window id
		System.out.println(parent);
		//print the title of parent window
		String parentTitle=driver.getTitle();
		System.out.println(parentTitle);
		//click on button to open child window
		driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();
		//call getwindow handles method to handle parent and child window
		Set<String> allwindows=driver.getWindowHandles();
		for(String e:allwindows) {
			System.out.println(e);
			String title=driver.switchTo().window(e).getTitle();
			if(title.equalsIgnoreCase("Selenium")) {
				driver.findElement(By.linkText("Downloads")).click();
				driver.close();//child window
			}
		}
		driver.close();//parent window
      /*
       * driver.quit();//to close all opened windows i.e parent and child
       */
	}

}
