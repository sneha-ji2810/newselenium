package assertions;

import org.testng.annotations.Test;

import org.testng.Assert;

public class hardAssertion {
	
	@Test
	public void hardassertTest() {
		
		/**
		 * whenever assertion fails it will stop the program, abruptly and will not move execution ahead
		 */
		String actualTxt="Hi welcome U All";
		String expectedTxt="Hi welcome U All";
		
		Assert.assertEquals(actualTxt, expectedTxt,"Name is not matching");
		System.out.println("statement 1");
		//will accept true only
		Assert.assertTrue(false);
		
		//will except false only
		Assert.assertFalse(false);
		System.out.println("statement 2");
		
		
		
		
	}

}
