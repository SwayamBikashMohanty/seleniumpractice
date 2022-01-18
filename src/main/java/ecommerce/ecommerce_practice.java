package ecommerce;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ecommerce_practice {

	public static void main(String[] args) {

		// Declaration and instatiation of chromedriver
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\swaya\\eclipse-workspace\\NewWorkSpace\\webdriver_practice\\drivers\\chromedriver.exe");
		// Creating the object of webdriver for chromedriver
		WebDriver driver = new ChromeDriver();
		// maximize browser
		driver.manage().window().maximize();
		// url
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		String[] productsstock = { "Brocolli", "Cauliflower", "Cucumber", "Beetroot" };

		List<WebElement> allproductsname = driver.findElements(By.xpath("//h4[@class='product-name']"));

		int count = 0;
		for (int i = 0; i < allproductsname.size(); i++) {
			// String individualproductname = allproductsname.get(i).getText();

			// Backened datas=Ex:Cauliflower - 1 Kg
			// we dont need -1kg so we are doing string spliting
			String[] splitedname = allproductsname.get(i).getText().split("-");
			String trimmedproductname = splitedname[0].trim();

			// convert array to arrylists because arraylists has contains method
			List al = Arrays.asList(productsstock);
			// here we comparing our stock product with trimmed product
			if (al.contains(trimmedproductname)) {
				System.out.println("product name:" + trimmedproductname + " " + count + " " + "clicked...");
				// Here clicking happens based on products position
				driver.findElements(By.xpath("//div[@class=\"product-action\"]/button")).get(i).click();
			}
			count++;
		}
		System.out.println("Total count:" + count);
	}

}
