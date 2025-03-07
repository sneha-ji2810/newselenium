package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class learnCSS {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		/**
		 * 1. tagname[attribute='value']  or [attribute='value']
		 * 2. If ID is present -> #id
		 * 3. If class is present -> .class
		 * 4. In case of multiple classes omit space and replace with dot .
		 * 5. .class tag:nth-child(index)
		 */
		
		driver.findElement(By.cssSelector("a[class='ico-login']")).click();
		driver.findElement(By.cssSelector("#Email")).sendKeys("obsqura24@gmail.com");
		driver.findElement(By.cssSelector(".password")).sendKeys("mypassword");
		driver.findElement(By.cssSelector(".button-1.login-button")).click();
		
		driver.findElement(By.cssSelector(".list li:nth-child(4) a")).click();
		

	}

}
