package basics;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoSetupTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		
		//Heading
		WebElement heading = driver.findElement(By.xpath("//*[contains(text(),'Single Input Field')]"));
		String cssVal=heading.getCssValue("background-color");
		System.out.println(cssVal);
		
		//Enter message
		driver.findElement(By.xpath("//input[@id='single-input-field']")).sendKeys("Test content");
		driver.findElement(By.xpath("//button[@id='button-one']")).click();
		String msg = driver.findElement(By.xpath("//div[@id='message-one']")).getText();
		System.out.println(msg);
		//String msg = driver.findElement(By.xpath("//div[@id='message-one']")).getText();
		
		//Sum calculation
		
		driver.findElement(By.xpath("//*[@id='value-a']")).sendKeys("2");
		driver.findElement(By.xpath("//*[@id='value-b']")).sendKeys("3");
		driver.findElement(By.xpath("//button[@id='button-two']")).click();
		String sumTotal = driver.findElement(By.xpath("//div[contains(text(),'Total A + B')]")).getText();
		System.out.println(sumTotal);
		
		//CheckBox Demo
		
		WebElement checkBox=driver.findElement(By.xpath("//ul[@class='list-group list-group-flush']//li[2]/a"));
		checkBox.click();
		
		driver.findElement(By.xpath("//input[@id='gridCheck']")).click();
		Thread.sleep(3000);
		
		//MultipleCheck Box
		/*List<WebElement> multiBox = driver.findElements(By.xpath("//input[@class='check-box-list']"));
		
		for(WebElement ele: multiBox) {
			
			ele.click();
		}
		Thread.sleep(3000);
		*/
		
		driver.findElement(By.xpath("//input[@value='Select All']")).click();
		
		
		
		driver.quit();

	}

}
