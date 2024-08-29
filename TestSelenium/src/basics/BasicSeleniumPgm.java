package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicSeleniumPgm {

	public static void main(String[] args) {
		//Bringing driver
		WebDriver driver=new ChromeDriver();
		
		//Maximize the browser window
		driver.manage().window().maximize();
		
		//Open the browser
		driver.get("https://www.facebook.com");
		
		//Get the title of the page
		String tiltle=driver.getTitle();
		System.out.println(tiltle);
		
		//get the current opened URL
		String URL=driver.getCurrentUrl();
		System.out.println(URL);
		
		//Closing the current window of the browser
		//driver.close();
		
		//Close the entire browser
		driver.quit();

	}

}
