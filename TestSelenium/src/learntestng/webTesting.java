package learntestng;

import org.testng.annotations.Test;

import org.testng.annotations.Parameters;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;


public class webTesting {


	/**
	 * 1. Any method annotated with @Test only is considered test case
	 * 2. Execution of test case will follow alphabetical sequence of test case name
	 * 3. Execution of test cases can be prioritized based on priority. Lower the priority execution will happen first
	 *    eg. Priority={0,1,2}
	 * 4. If any test case is not given priority , it would be treated as zero priority  
	 * 5. If two test cases have same priority, alphabetical order will take precedence
	 * 6. BeforeTest will execute once only before all the test cases present inside class
	 * 7. AfterTest will execute once only after all the test cases present inside class
	 * 8. Before Class will execute after BeforeTest in a class
	 */
	
	@Test
	@Parameters({"userName", "password"})
	public void parameterTest(@Optional String username, @Optional String password) {
		System.out.println(username + " "+ password);
	}
	
	
	@Test(priority=2,groups="Smoke")
	public void firstTestCase() {
		
		System.out.println("Here I am first Test case");	
	}
	
	@Test(priority=1,groups="Regression")
	public void secondTestCase() {
		System.out.println("Here I am Second TestCase");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("I am in Before TestCase");
		
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I am in Before WebMethod");
	}
	
	@AfterTest
	public void afterTestCase() {
		
		System.out.println("I am in After TestCase");
	}
	
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("I am in After WebMethod");
	}
	
	/*@Test
	public void aMethodToTest() {
		System.out.println("Here I am Third TestCase");
	}
	
	@Test
	public void bMethodToTest() {
		System.out.println("Here I am 4th testCase");
	}
	*/

}
