package uicomponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragDropTest {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://demoqa.com/droppable");
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement destin= driver.findElement(By.id("droppable"));
		
		Actions ac = new Actions(driver);
		
		ac.dragAndDrop(source, destin).perform();
		
		driver.quit();
		
	}

}
