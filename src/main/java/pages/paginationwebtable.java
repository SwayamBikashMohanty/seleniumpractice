package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class paginationwebtable {

	public static void main(String[] args) {
		// Declaration and instatiation of chromedriver
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\swaya\\eclipse-workspace\\NewWorkSpace\\webdriver_practice\\drivers\\chromedriver.exe");
				// Creating the object of webdriver for chromedriver
				WebDriver driver = new ChromeDriver();
				//maximize browser
				driver.manage().window().maximize();
				//URL
				driver.get("https://mdbootstrap.com/docs/b4/jquery/tables/pagination/");
				//identify table
				WebElement table=driver.findElement(By.id("dtBasicExample"));
				//identify rows
				List<WebElement> row=table.findElements(By.tagName("tr"));
				//identigy row size
				int row_size=row.size();
				System.out.println(row_size);
				//identify no of cell size inside row
				int cell_size=driver.findElements(By.xpath("//*[@id=\"dtBasicExample\"]/tbody/tr[1]/td")).size();
				System.out.println(cell_size);
				
				  int paginationsize=driver.findElements(By.
				  xpath("//div[@class='dataTables_paginate paging_simple_numbers']/ul/li")).
				  size(); 
				System.out.println(paginationsize); 
				
				int clickcounter=0; 
				for(int p=1;p<paginationsize;p++) {
				  
				  for(int r=1;r<row_size-1;r++) {
					  for(int c=1;c<=cell_size;c++) {
						  String datas=driver.findElement(By.xpath("//*[@id=\"dtBasicExample\"]/tbody/tr["+r+"]/td["+c+"]")).getText();
						  System.out.print(datas); 
					  }  
					  System.out.println(" ");
					} 
				  //identify next bbutton
				  driver.findElement(By.linkText("Next")).click(); 
				  clickcounter++;
				  System.out.println("clicked..."+clickcounter);
				  
				  }
				 
	}

}
