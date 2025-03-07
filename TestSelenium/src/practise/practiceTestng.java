package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class practiceTestng {
	 WebDriver driver;
	
	@BeforeTest
	
	public  void beforeTestStart() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(1000);		
		dropdownSelect();
	}
	
	@Test
	public  void dropdownSelect() throws InterruptedException {
		
		//Static drop-Down
				WebElement opt = driver.findElement(By.id("dropdown-class-example"));
				Select se = new Select(opt);
				se.selectByIndex(1);
				Thread.sleep(1000);
		
	}
	
	@Test
	public void mySecondTest() {
	driver.get("https://www.flipkart.com/");
	
		
	}
	
	
	
/*	
public static void dropdownSelect(WebDriver driver) throws InterruptedException {
		
		//Static drop-Down
				WebElement opt = driver.findElement(By.id("dropdown-class-example"));
				Select se = new Select(opt);
				se.selectByValue("");
				Thread.sleep(1000);
		
	}
	*/

}
