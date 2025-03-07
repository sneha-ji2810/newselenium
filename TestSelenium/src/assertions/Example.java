package assertions;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Example {

	@Test
	public void test() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		boolean buttonDisplayed=driver.findElement(By.id("newsletter-subscribe-button")).isDisplayed();
		System.out.println(buttonDisplayed);
		Assert.assertTrue(buttonDisplayed, "Subscribe button is not displayed");
		
		String expectedText= "Welcome to our store";
		String actualText=driver.findElement(By.cssSelector(".topic-html-content-header")).getText();
		Assert.assertEquals(actualText, expectedText);
		
		driver.quit();
	}
}