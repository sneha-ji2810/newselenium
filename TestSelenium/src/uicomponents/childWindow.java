package uicomponents;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childWindow {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/windows");
		
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//*[@class='example']/a")).click();
		
		//grab all window handles opened in browser
		
		Set<String> windows = driver.getWindowHandles();
		
		//to iterate through window handles
		Iterator<String> it1=windows.iterator();
		String parentWin=it1.next();
		String childWin=it1.next();
		
		//switching to desired window handle
		driver.switchTo().window(childWin);
		System.out.println(driver.getTitle());
		
		//close the current opend window
		driver.close();
		
		//switch back to parent window
		driver.switchTo().window(parentWin);
		System.out.println(driver.getTitle());
		
		driver.quit();
		

	}

}
