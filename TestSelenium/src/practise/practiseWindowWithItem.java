package practise;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiseWindowWithItem {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/windows");
		
		WebElement newTabBtn = driver.findElement(By.xpath("//*[@class='example']/a"));
		newTabBtn.click();
		
	 	Set<String> window=driver.getWindowHandles();
	 	
	 	Iterator<String> it = window.iterator();
	 	while(it.hasNext()) {
	 		
	 		
	 	}

	}

}
