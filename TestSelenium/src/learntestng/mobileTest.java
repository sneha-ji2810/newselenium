package learntestng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class mobileTest {
	
@BeforeMethod
public void myfirstMethod() {
	System.out.println("I am in Before Method");
}
	@Test(groups="Smoke")
	public void myfirstMobileTest() {
		System.out.println("I am in first Mobile Test");
	}
	
	@Test(groups="Regression")
	public void mysecondMobileTest() {
		System.out.println("I am in second mobile test");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("I am in before suite");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("I am in after suite");
	}
	
	
	
	  @BeforeTest public void beforeTest() {
	  System.out.println("I am in before All mobile test"); }
	 
	  @BeforeClass public void beforeClass() {
	  System.out.println("I am in before All mobile  class "); }
	  
	  @AfterClass public void afterClass() {
	  System.out.println("I am in after all mobile class"); }
	 
	
	
	  @AfterTest public void afterTest() {
	  System.out.println("I am in after All mobile test"); }
	 
	
	
	//
	
	/**
	 * Suite
	 * Test
	 * class
	 * 
	 */
	

}
