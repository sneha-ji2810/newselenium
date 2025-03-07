package uicomponents;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiseDemo1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");

		driver.findElement(By.xpath("//*[@class='search-box-text ui-autocomplete-input']")).sendKeys("phone");
		Thread.sleep(2000);
		List<WebElement> search = driver.findElements(By.xpath("//*[@id='ui-id-1']/li"));
		
		for(WebElement se:search) {
			
			if(se.getText().equalsIgnoreCase("phone cover")) {
				
				se.click();
				break;
			}
			
		}
		
		driver.quit();
		
	}

	
	
}
