package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssert {

	@Test
	public void softAssertTest() {
		/**
		 * whenever soft assertion fails it will not stop the program, abruptly.
		 * 
		 * softAssert.assertAll(); store all failures and will throw at end of program
		 */
		SoftAssert softAssert= new SoftAssert();
		String actualName= "Sneha";
		String expectedName= "Sneha Joseph";
		
		softAssert.assertEquals(actualName, expectedName, "Name is not matching");
		
		System.out.println("statement 1");
		//will accept true only
		softAssert.assertTrue(false);
		
		//will except false only
		softAssert.assertFalse(true);
		System.out.println("statement 2");
		
		softAssert.assertAll();
		
		
	
		
	}
}