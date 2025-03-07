package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frameLearn {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		//Mouse hover
		Actions ac = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		/*WebElement ele = driver.findElement(By.xpath("//*[@class='mouse-hover']//button"));
		//System.out.println(ele.getAttribute("id"));
		
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
		Thread.sleep(1000);
		WebElement mh = driver.findElement(By.id("mousehover"));
		ac.moveToElement(mh).perform();
		WebElement top = driver.findElement(By.xpath("(//*[@class='mouse-hover-content']/a)[1]"));
		top.click();
		*/
		
		driver.switchTo().frame("iframe-name");
		Thread.sleep(1000);
		
		//InFrame - btn click
		/*driver.findElement(By.xpath("//*[@class='login-btn']/a/span[@class='icon fa fa-user']")).click();
		String txt = driver.findElement(By.xpath("//*[@class='col-md-6 text-left']/h2")).getText();
		System.out.println(txt);
		*/
		
		//DropDown list
		WebElement more =driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[1]"));
		js.executeScript("arguments[0].scrollIntoView(true)", more);
		ac.moveToElement(more).perform();
		driver.findElement(By.xpath("(//*[@class='dropdown-menu']/li)[1]")).click();
		
		
		driver.switchTo().defaultContent();
		String heading = driver.findElement(By.xpath("(//*[@class='btn btn-primary'])[2]")).getText();
		System.out.println(heading);
		
		driver.quit();
		
	}

}
