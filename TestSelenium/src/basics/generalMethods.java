package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class generalMethods {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.yatra.com/");
		String strHeading=driver.findElement(By.xpath("//a[@class='text-underline-none header-nav css-1nob2mz']")).getAttribute("title");
		System.out.println(strHeading);
		
		//To grab the text of weblement
		WebElement head=driver.findElement(By.xpath("//h1[@class='main-heading']"));
		String txt= head.getText();
		System.out.println(txt);
		
		//to grab the attribute value
		String title=driver.findElement(By.xpath("//a[@title='Round Trip']")).getAttribute("title");
		System.out.println(title);
		
		//toolTip is nothing but value of title attribute
		String toolTip=driver.findElement(By.xpath("//ul[@class='selc-flight-options']/li[3]/a")).getAttribute("title");
		System.out.println(toolTip);
		String cssValue=head.getCssValue("display");
		
		System.out.println(cssValue);
		
		driver.quit();
		

	}

}
