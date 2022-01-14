package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practice_signupform {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Declaration and instatiation of chromedriver
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\swaya\\eclipse-workspace\\NewWorkSpace\\webdriver_practice\\drivers\\chromedriver.exe");
				// Creating the object of webdriver for chromedriver
				WebDriver driver = new ChromeDriver();
				// maximize browser
				driver.manage().window().maximize();
				
				driver.get("https://goo.gl/RVdKM9");
				System.out.println("URL is opened");
				
				//first name
				driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-1\"]")).sendKeys("Test");
                //last name
				driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-2\"]")).sendKeys("Test");
				//phone
				driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-3\"]")).sendKeys("98765674678");
				//country
				driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-4\"]")).sendKeys("India");
				//city
				driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-5\"]")).sendKeys("Test");
				//email
				driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-6\"]")).sendKeys("test@gmail.com");
				//gender
				WebElement male=driver.findElement(By.xpath("//*[@id=\"q26\"]/table/tbody/tr[1]/td/label"));
				System.out.println(male.isDisplayed());
				System.out.println(male.isEnabled());
				System.out.println(male.isSelected());
				male.click();
				System.out.println(male.isSelected());
				System.out.println(male.isEnabled());
		
				WebElement female=driver.findElement(By.xpath("//*[@id=\"q26\"]/table/tbody/tr[2]/td/label"));
				System.out.println(female.isDisplayed());
				System.out.println(female.isEnabled());
				System.out.println(female.isSelected());
				female.click();
				System.out.println(male.isSelected());
				System.out.println(male.isEnabled());
			//checkbox
				WebElement sunday=driver.findElement(By.xpath("//*[@id=\"q15\"]/table/tbody/tr[1]/td/label"));
				sunday.click();
				WebElement tuesday=driver.findElement(By.xpath("//*[@id=\"q15\"]/table/tbody/tr[3]/td/label"));
				tuesday.click();
			//dropdown
				WebElement dropdown=driver.findElement(By.xpath("//*[@id=\"RESULT_RadioButton-9\"]"));
				Select sct= new Select(dropdown);
			      sct.selectByVisibleText("Afternoon");
			      sct.selectByValue("Radio-2");
			      sct.selectByIndex(2);
			   //or,
				List<WebElement> options=sct.getOptions();
				for(WebElement e:options) {
					String text=e.getText();
					if(text.equals("Morning")) {
						e.click();
					}
				}
				//link text
				driver.findElement(By.linkText("Software Testing Tutorials")).click();
				//back
				driver.navigate().back();
				//partial link text
				driver.findElement(By.partialLinkText("Tools Training")).click();
				//back
				driver.navigate().back();
				System.out.println(driver.getTitle());
				Thread.sleep(3000);
				//forward
				driver.navigate().forward();
				System.out.println(driver.getTitle());
				//refresh
				driver.navigate().refresh();
				Thread.sleep(2000);
				//back
				driver.navigate().back();
					
				
				
	}

}
