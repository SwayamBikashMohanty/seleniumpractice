package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class staticwebtable {

	public static void main(String[] args) {

		// Declaration and instatiation of chromedriver
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\swaya\\eclipse-workspace\\NewWorkSpace\\webdriver_practice\\drivers\\chromedriver.exe");
		// Creating the object of webdriver for chromedriver
		WebDriver driver = new ChromeDriver();
		//maximize browser
		driver.manage().window().maximize();
		//URL
		driver.get("https://chercher.tech/practice/table");
		
		//first identify the table
		WebElement table=driver.findElement(By.id("webtable"));
		//identify no.of rows.
		int rows=driver.findElements(By.tagName("tr")).size();
		System.out.println("Noof rows:"+rows);
		//identify the no of columns
		int columns=driver.findElements(By.tagName("th")).size();
		System.out.println("Noof columns:"+columns);
		//print the header name
		System.out.print(driver.findElement(By.xpath("//*[@id=\"webtable\"]/tbody/tr[1]/th[1]")).getText()+" ");
		System.out.print(driver.findElement(By.xpath("//*[@id=\"webtable\"]/tbody/tr[1]/th[2]")).getText()+" ");
		System.out.print(driver.findElement(By.xpath("//*[@id=\"webtable\"]/tbody/tr[1]/th[3]")).getText()+" "+"\n");
		//print all datas
		for(int r=2;r<=rows;r++) {
			for(int c=1;c<=columns;c++ ) {
				//identifies cell pathe
				String datas=driver.findElement(By.xpath("//*[@id=\"webtable\"]/tbody/tr["+r+"]/td["+c+"]")).getText();
				System.out.print(datas+" ");
			}
			System.out.println("");
		}
	}

}
