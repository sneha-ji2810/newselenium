package practise;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class practiseNewPage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		/*driver.switchTo().frame("iframe1");
		String txt=driver.findElement(By.linkText("What is Selenium?")).getText();
		System.out.println(txt);
		Thread.sleep(1000);
		
		driver.switchTo().defaultContent();
		System.out.println(driver.findElement(By.linkText("Page One")).getText());
		
		
		//txtBox
		driver.findElement(By.cssSelector("#ta1")).sendKeys("Testing started");
		WebElement txtBox2 = driver.findElement(By.xpath("(//textarea[@rows='10'])[1]"));
		txtBox2.clear();
		txtBox2.sendKeys("Cleared and started");
		Thread.sleep(1000);
		
		
		//alert
		driver.findElement(By.id("alert1")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		
		//checkBox
		WebElement checkB1 = driver.findElement(By.xpath("//*[@id='checkbox1']"));
		WebElement checkB2 = driver.findElement(By.xpath("//*[@id='checkbox2']"));
		Boolean b = checkB1.isSelected();
		System.out.println("Before checking first option:"+b);
		
		checkB1.click();
		System.out.println("After checking first option:"+checkB1.isSelected());
		
		System.out.println("Before checking Second option:"+checkB2.isSelected());
		checkB2.isSelected();
		
		
		
		//select multi-option
		JavascriptExecutor js =(JavascriptExecutor)driver;
		WebElement ele = driver.findElement(By.xpath("//*[@value='Bike']"));
		js.executeAsyncScript("arguments[0].scrollIntoView(0);", ele);
		ele.click();
		
		
		driver.findElement(By.linkText("Open a popup window")).click();
		Set<String> window = driver.getWindowHandles();
		
		Iterator<String> i1=window.iterator();
		
		String window1=i1.next();
		String window2=i1.next();
		driver.switchTo().window(window2);
		System.out.println(driver.getTitle());
		driver.switchTo().window(window1);*/
		
		//hover-ele
		Actions ac = new Actions(driver);
		WebElement hov = driver.findElement(By.xpath("//*[@id='blogsmenu']"));
		ac.moveToElement(hov).perform();
		driver.findElement(By.xpath("//*[@class='has-sub']//ul/li[1]")).click();
		
		driver.quit();
	}

}
