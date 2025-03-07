package practise;

import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class basicComponents {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		//Static drop-Down
		//WebElement opt = driver.findElement(By.id("dropdown-class-example"));
		WebElement opt =driver.findElement(By.cssSelector("#dropdown-class-example"));
		Select se = new Select(opt);
		se.selectByIndex(1);
		Thread.sleep(1000);
		
		se.selectByValue("option2");
		Thread.sleep(1000);
		
		se.selectByVisibleText("Option3");
		Thread.sleep(1000);
		
		
		//Dynamic dropDown
		driver.findElement(By.xpath("//*[@id='autocomplete']")).sendKeys("new");
		Thread.sleep(1000);
		//List<WebElement> list = driver.findElements(By.xpath("//*[@id='ui-id-1']/li"));
		List<WebElement> list = driver.findElements(By.cssSelector("#ui-id-1 li"));
		for(WebElement li:list) {
			
			if(li.getText().equalsIgnoreCase("New Zealand")) {
				li.click();
			}
		}
		
		
		
	}

}
