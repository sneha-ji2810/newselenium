package uicomponents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class learnWaits {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get("https://selenium.qabible.in/dynamic-load.php");
		
		//implicit wait - global wait -> applied to each element - >if any element is not appearing in 4 seconds then it will fail
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		                                                              
		driver.get("https://selenium.qabible.in/dynamic-load.php");
		driver.findElement(By.id("save")).click();

		String email=driver.findElement(By.cssSelector(".card-body p")).getText();
		System.out.println(email);
	
		driver.findElement(By.cssSelector("#progress-bars")).click();
		driver.findElement(By.cssSelector("#downloadButton")).click();
	    
		
		//Explicit wait - explicit wait-- conditional wait.
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));   
		wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.cssSelector(".progress-label")), "Complete!"));
		String text=driver.findElement(By.cssSelector(".progress-label")).getText();
		System.out.println(text);
		
		driver.quit();
		
		

	}

}
