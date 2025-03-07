package uicomponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioBtnCheckBox {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/check-box-demo.php");
		WebElement checkBox=driver.findElement(By.xpath("//*[@id='gridCheck']"));
		
		//checks whether any checkbox/radio btn is checked or not
		boolean isChecked=checkBox.isSelected();
		System.out.println("Before checking checkBox : "+isChecked);
		
		checkBox.click();
		
		System.out.println("After checking CheckBox: "+checkBox.isSelected());
		
		checkBox.click();
		
		System.out.println("After unchecking the checkBox: "+checkBox.isSelected());
		
		
		//To check if an element is displayed on UI
		System.out.println("is checkbox displayed or not: "+checkBox.isDisplayed());
		
		//To check wheter checkbox is interactable or not
		System.out.println("is checkbox enabled or not: "+checkBox.isEnabled());
		
		
		driver.quit();
		

	}
	
}
