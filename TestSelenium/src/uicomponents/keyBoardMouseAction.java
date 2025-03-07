package uicomponents;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyBoardMouseAction {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		
		Actions act = new Actions(driver);
		
		//hover over an element
		WebElement option = driver.findElement(By.id("progress-bars"));
		act.moveToElement(option).perform();
		
		WebElement txtBox=driver.findElement(By.id("single-input-field"));
		act.moveToElement(txtBox).click().sendKeys("Hello").perform();
		txtBox.clear();
		
		//we can also press keyboard key and send text
		act.moveToElement(txtBox).click().keyDown(Keys.SHIFT).sendKeys("I am here").perform();
		
		//Button click using Action
		WebElement btn = driver.findElement(By.id("button-one"));
		/*act.moveToElement(btn).click().perform();
		*/
		
		//to double click on any webelement
		act.moveToElement(btn).doubleClick().perform();
				
		//right click on element
		act.moveToElement(txtBox).contextClick().perform();
		
		driver.quit();
		

	}

}
