package practise;

import java.time.Duration;
import java.util.List;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class TableContentCheck {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");
		driver.manage().window().maximize();
		
		List<WebElement> li = driver.findElements(By.xpath("//td[contains(text(),'Kierra')]//following-sibling::td[6]/a[2]"));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(8));
		for(WebElement ele:li) {
			wait.until(ExpectedConditions.elementToBeClickable(ele));
			ele.click();
			
		}

		WebElement mail=driver.findElement(By.xpath("//td[contains(text(),'Cierra')]//following-sibling::td[3]"));
		System.out.println("Mail is:"+mail.getText());
		
	}

}
