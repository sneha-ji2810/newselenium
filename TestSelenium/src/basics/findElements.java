package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElements {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.className("submit-button")).click();
		
		//findElements return list of webElement
		List<WebElement> addToCartBtn = driver.findElements(By.xpath("//*[@class='btn btn_primary btn_small btn_inventory ']"));
		
		/*for(int i =0;i<addToCartBtn.size();i++) {
			addToCartBtn.get(i).click();
		}*/

		for(WebElement element :addToCartBtn ) {
			element.click();
		}
		
		driver.quit();
	}

}