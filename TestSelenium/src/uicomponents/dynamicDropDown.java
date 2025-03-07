package uicomponents;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/jquery-select.php");
		Thread.sleep(5000);
		
		/*
		//dropDown with search box
		driver.findElement(By.xpath("//*[@class='selection']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains(@class,'-search--dropdown')]//*[@class='select2-search__field']")).sendKeys("new");
		
		List<WebElement> state2 = driver.findElements(By.xpath("//*[contains(@class,'select2-results__options')]//li"));		

		for(WebElement st: state2) {
			
			if(st.getText().equalsIgnoreCase("new york")) {
				
				st.click();
				break;
			}
		}
		
		
		//Dunamic drop with multiselection
		driver.findElement(By.xpath("//*[contains(@class,'-selection--multiple')]")).sendKeys("new");
		List<WebElement> state = driver.findElements(By.xpath("//*[contains(@class,'select2-results__options')]/li"));		

		for(WebElement st: state) {
			
			if(st.getText().equalsIgnoreCase("new york")) {
				
				st.click();
				break;
			}
		}*/
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@aria-label='Search']")).sendKeys("al");
		//Thread.sleep(3000);
		List<WebElement> state1 = driver.findElements(By.xpath("//*[@class='select2-results__options']/li"));
		for(WebElement st1: state1) {
			
			if(st1.getText().equalsIgnoreCase("alaska")) {
				
				st1.click();
				break;
			}
		}
		
		/*
		//drop-Down with category
		WebElement statesBtn= driver.findElement(By.xpath("(//*[contains(text(),'Alaska')])[5]"));
		statesBtn.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(@class,'select2-dropdown')]//*[@class='select2-search__field']")).sendKeys("new");
		
		List<WebElement> category = driver.findElements(By.xpath("//*[contains(@class,'select2-results__options select2-results')]//li"));
		
		
		for(WebElement cat:category) {
			
			if(cat.getText().equalsIgnoreCase("new york")) {
				cat.click();
				break;
			}
		}
		*/
		driver.quit();
		
	}

}
