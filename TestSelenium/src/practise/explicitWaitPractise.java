package practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class explicitWaitPractise {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get("https://the-internet.herokuapp.com/dynamic_controls");
		
		driver.findElement(By.cssSelector("#input-example button[onclick=\"swapInput()\"]")).click();
		

	}

}
