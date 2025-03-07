package uicomponents;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class learnJavascriptExecutor {

	public static void main(String[] args) {
		
		/*JavaScriptExecutor is an interface that is used to execute JavaScriprt through selenium webdriver. 
		 * JavaScript is a programming language that interacts with HTML in a browser, and to use this function in 
		 * Selenium, JavascriptExecutor is required.
		 * . ExecuteScript

This method executes javaScript in the currently selected window or frame. 
		 * 
		 * Normally we use xpath,css etc to locate elemnts.In case these locators do not work we can go with
		 * javascriptExecutor.And we can perform desired operations on the webElemnt
		 * 
		 * JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript(script, argument);
		script:javascript to run
		argument:argument to the script	
		 */
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		WebElement txtBox= driver.findElement(By.xpath("//*[@id='single-input-field']"));
		js.executeScript("arguments[0].value='please enter text';", txtBox);
		
		WebElement btn = driver.findElement(By.id("button-one"));
		js.executeScript("arguments[0].click();", btn);
		
		driver.quit();
		
		
	}

}
