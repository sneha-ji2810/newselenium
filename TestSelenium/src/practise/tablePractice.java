package practise;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tablePractice {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		//Table Heading
		//List<WebElement> head = driver.findElements(By.xpath("//table[@id='product'][1]/tbody/tr/th"));
		List<WebElement> head = driver.findElements(By.cssSelector("table[id='product'] tbody tr th"));
		for(WebElement h:head) {
			
			System.out.println(h.getText());
			
		}
		//List<WebElement> data = driver.findElements(By.xpath("//table[@name='courses'][1]/tbody/tr[5]/td"));
		List<WebElement> data = driver.findElements(By.cssSelector("table[name='courses'] tbody tr:nth-child(5) td"));
		for(WebElement d:data) {
			
			System.out.println(d.getText());
			
		}
		
		
driver.quit();
	}

	
}
