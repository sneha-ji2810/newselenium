package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class praticeSelenium {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/radio-button-demo.php");
		
		//Radio button - Single- Demo
		WebElement gender=driver.findElement(By.xpath("//*[@id='inlineRadio2']"));
		Boolean checkOrNot = gender.isSelected();
		System.out.println("Gender button is seleted or not:"+checkOrNot);
		gender.click();
		System.out.println("Gender button is seleted or not:"+gender.isSelected());
		driver.findElement(By.xpath("//*[@id='button-one']")).click();
		
		//Group radio Button
		WebElement gpRadio1 = driver.findElement(By.xpath("//*[@id='inlineRadio11']"));
		gpRadio1.click();
		WebElement gpRadio2 = driver.findElement(By.id("inlineRadio23"));
		gpRadio2.click();
		
		driver.findElement(By.id("button-two")).click();
		
		driver.quit();
		
		
		

	}

}
