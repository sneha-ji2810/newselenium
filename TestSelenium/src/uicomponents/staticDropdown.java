package uicomponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class staticDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/check-box-demo.php");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@class='list-group list-group-flush']//li[4]/a")).click();
		
		//dropDown selection
		WebElement dropDownOpt=driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select selectOpt = new Select(dropDownOpt);
		
		selectOpt.selectByValue("Yellow");
		Thread.sleep(1000);
		
		selectOpt.selectByVisibleText("Green");
		Thread.sleep(1000);
		
		selectOpt.selectByIndex(1);
		Thread.sleep(1000);
		
		driver.quit();

	}

}
