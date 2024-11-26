package org.letcode.test;

import org.Admin.pages.LoginPage;
import org.selenium.base.baseclass;
import org.testng.Assert;
import org.testng.annotations.Test;

import utils.dataProvider;

public class TC001Login extends baseclass{
	
	@Test(dataProvider = "login",dataProviderClass =dataProvider.class)
	public void loginTest(String email,String pass) {
		 
		LoginPage Ip=new LoginPage(driver);
		boolean emailLabel = Ip.getEmailLabel();
		Assert.assertEquals(emailLabel, true);
		
		boolean passwordLabel = Ip.getPasswordLabel();
		Assert.assertTrue(passwordLabel);
		
		
		
		new LoginPage(driver)
		.enterUserName(email)
		.enterPassword(pass)
		.clickLogin();
	}
	
}
