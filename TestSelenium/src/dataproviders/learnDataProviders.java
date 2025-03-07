package dataproviders;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class learnDataProviders {
	
	
	@Test(dataProvider="getData")
	public void mytest(String userName, String password) {
		System.out.println(userName + " "+password);
		
	}
	
	
	@DataProvider
	public String[][] getData() {
		String creds[][]= new String[2][2];
		
		//Ist row
		creds[0][0]="home@123";
		creds[0][1]="qwerty123";
		
		//2nd row
		creds[1][0]="user1";
		creds[1][1]="Kerela@";
		
		return creds;
		
	}
	
	

}
