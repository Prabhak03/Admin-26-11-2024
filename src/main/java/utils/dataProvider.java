package utils;

import org.testng.annotations.DataProvider;

public class dataProvider {
	
	@DataProvider(name="login")
	public String[][] data(){
		
		String[][] data=new String[1][2];
		
		data[0][0]="admin@yourstore.com";
		data[0][1]="admin";
		
		
		
		return data;
		
	}
	

}
