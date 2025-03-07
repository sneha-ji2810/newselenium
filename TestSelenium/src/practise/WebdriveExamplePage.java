package practise;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriveExamplePage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testpages.eviltester.com/styled/tag/dynamic-table.html");
		/*Simple pgm*/
		/*String title=driver.getTitle();
		System.out.println("Title of page is:"+title);
		
		String heading =driver.findElement(By.cssSelector(".page-body h1")).getText();
		System.out.println("Heading is:"+heading);
		
		driver.findElement(By.cssSelector("#numentry")).sendKeys("123");
		driver.findElement(By.cssSelector("#submit-to-server")).click();
		
		String messg=driver.findElement(By.xpath("//div[@id=\"main-content\"]//div[@data-locator=\"message-area\"]//p")).getText();
		System.out.println("Message"+messg);
		*/
		/*
		
		//Alerts
		driver.findElement(By.cssSelector(".styled-click-button#alertexamples")).click();
		Alert alert=driver.switchTo().alert();
		
		Thread.sleep(2000);
		alert.accept();
		
		driver.findElement(By.cssSelector(".styled-click-button#confirmexample")).click();
		Thread.sleep(2000);
		alert.dismiss();
		
		driver.findElement(By.cssSelector(".styled-click-button#promptexample")).click();
		
		alert.sendKeys("Hi welcome");
		Thread.sleep(2000);
		alert.accept();
		*/
		
		//Table
		/*String dataT=driver.findElement(By.xpath("//table[@id=\"mytable\"]/tbody/tr[4]/td[1]")).getText();
		System.out.println("Data :"+dataT);
		*/
		String fPart="//table[@id=\"23\"]//tr[";
		String sPart="]/td[";
		String tPart="]";
		int j=2;
		List<WebElement> rowElemnts=driver.findElements(By.tagName("th"));
		System.out.println(rowElemnts.size());
		Thread.sleep(2000);
		
		for(int i=2;i<=rowElemnts.size();i++) {
			String fPath=fPart+i+sPart+j+tPart;
			System.out.println(driver.findElement(By.xpath(fPath)).getText());
			
		}
	}

}
