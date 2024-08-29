package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocators {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		//LOcators
		/*
		 * 1.id
		 * 2.Name
		 * 3.ClassName
		 * 4.LinkText
		 * 5.PartialLinkText
		 * 
		 * */
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.className("submit-button")).click();
		driver.findElement(By.id("react-burger-menu-btn")).click();
		
		Thread.sleep(10000);
		driver.findElement(By.linkText("About")).click();
		
		driver.navigate().back();
		Thread.sleep(10000);
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(10000);
		
		driver.findElement(By.partialLinkText("Log")).click();
		
		driver.quit();
		
		
		
		
		

	}

}
