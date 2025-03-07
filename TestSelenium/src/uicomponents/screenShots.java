package uicomponents;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenShots {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		
		//System.out.println(System.getProperty("user.dir"));
		
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
		//File destFile = new File(System.getProperty("user.dir")+"\\src\\uicomponents\\ScreenShot"+getCurrentDateTime()+".png");
		File destFile = new File("C:\\Users\\jijin\\git\\newselenium\\TestSelenium\\src\\uicomponents\\SampleScreen.png");
		FileUtils.moveFile(srcFile, destFile);
		
		
		driver.quit();

	}

	/*public static String getCurrentDateTime() {
		String date = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(Calendar.getInstance().getTime());  
		  return date.replaceAll("[^0-9]", "");
	    
	}*/
}
