package uicomponents;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaScriptAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/javascript-alert.php");
		
		driver.findElement(By.xpath("//*[@class='btn btn-success']")).click();
		Thread.sleep(1000);
		Alert alert=driver.switchTo().alert();
		//Accept the alert present on UI
		alert.accept();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@class='btn btn-warning']")).click();
		Thread.sleep(1000);
		//cancel the alert present on UI
		alert.dismiss();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@class='btn btn-danger']")).click();
		Thread.sleep(2000);
		//alert with text box
		alert.sendKeys("Hello");
		alert.accept();
		
		
		driver.quit();
		
		
		
		
	}

}
