package practise;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class newTabPractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		/*
		driver.findElement(By.id("opentab")).click();
		
		Set<String> windowList = driver.getWindowHandles();
		
		Iterator<String> i1 = windowList.iterator();
		String window1 = i1.next();
		String window2 = i1.next();
		
		driver.switchTo().window(window2);
		System.out.println(driver.getTitle());
		System.out.println(driver.findElement(By.xpath("(//*[contains(@class,'header-contact text')]/ul/li)[2]")).getText());
		
		driver.close();
		
		driver.switchTo().window(window1);
		System.out.println(driver.findElement(By.xpath("//*[@class='switch-tab']")).getText());
		driver.quit();
		*/
		
		//New Window
		
		driver.findElement(By.id("openwindow")).click();
		Set<String> newWindow = driver.getWindowHandles();
		
		Iterator<String> it2 = newWindow.iterator();
		String new1 = it2.next();
		String new2 = it2.next();
		
		driver.switchTo().window(new2);
		WebElement mail = driver.findElement(By.xpath("(//*[@class='cont']//span)[1]"));
		System.out.println(mail.getText());
		Thread.sleep(1000);
		driver.close();
		
		driver.switchTo().window(new1);
		WebElement title = driver.findElement(By.xpath("(//*[@class='left-align']/fieldset/legend)[2]"));
		System.out.println(title.getText());
		
		
		
		
		
	}

}
