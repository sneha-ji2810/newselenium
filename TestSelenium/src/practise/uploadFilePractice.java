package practise;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class uploadFilePractice {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/upload-download");
		
		Thread.sleep(1000);
		Actions ac = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement up= driver.findElement(By.cssSelector("[class='form-file'] #uploadFile"));
		js.executeScript("arguments[0].scrollIntoView(true);", up);
		Thread.sleep(1000);
		up.click();
		
		String uploadFile = "C:\\Users\\jijin\\OneDrive\\Desktop\\sample.pdf";
		upload(uploadFile);
		
		//driver.quit();
					

	}
	
	public static void upload(String fileToUpload) throws AWTException, InterruptedException {
		Thread.sleep(2000);
		StringSelection ss = new StringSelection(fileToUpload);
	     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

	     //imitate mouse events like ENTER, CTRL+C, CTRL+V
	     Robot robot = new Robot();
	     robot.delay(250);
	     robot.keyPress(KeyEvent.VK_ENTER);
	     robot.keyRelease(KeyEvent.VK_ENTER);
	     robot.keyPress(KeyEvent.VK_CONTROL);
	     robot.keyPress(KeyEvent.VK_V);
	     robot.keyRelease(KeyEvent.VK_V);
	     robot.keyRelease(KeyEvent.VK_CONTROL);
	     robot.keyPress(KeyEvent.VK_ENTER);
	     robot.delay(90);
	     robot.keyRelease(KeyEvent.VK_ENTER);
	}


}
