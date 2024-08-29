package basics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleBrowser {

	//public static WebDriver driver;
	public static void main(String[] args) {
		
		String browserName="Chrome";
		WebDriver driver=null;
		if(browserName.equalsIgnoreCase("Chrome")) {
		 driver=new ChromeDriver();
			
		}
		else if(browserName.equalsIgnoreCase("Edge")) {
			 driver=new EdgeDriver();
		}
		else if (browserName.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
			
		}
		else {
			System.out.println("CHoose a browser");
		}
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		String tiltle=driver.getTitle();
	   System.out.println(tiltle);
	   driver.quit();
	
	}

}
