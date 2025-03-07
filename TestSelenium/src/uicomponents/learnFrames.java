package uicomponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class learnFrames {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		/**
		 * In order to handle elements inside iframe, we need to switch into iframe first
		 * 1.By name or id
		 * 2. By webelement
		 * 3.By index
		 */
		
		/*
		// switching through id or name
		driver.switchTo().frame("singleframe");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@class='row']//input")).sendKeys("Hello");
		*/
		
		// switching through webelement
		 
		WebElement frameWebElement = driver.findElement(By.xpath("//*[@name='SingleFrame']"));
		driver.switchTo().frame(frameWebElement);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@class='row']//input")).sendKeys("Hello");
		
		
		
		/**
		 * switch through index
		 */
		/*driver.switchTo().frame(0);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@class='row']//input")).sendKeys("Hello");
		*/
		
		//it will shift out of frame
		driver.switchTo().defaultContent();
				
		String heading =driver.findElement(By.xpath("//h1")).getText();
		
		
		System.out.println(heading);
		
		driver.quit();
		
		
		

	}

}
