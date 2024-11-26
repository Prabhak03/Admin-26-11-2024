package org.Admin.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.selenium.base.baseclass;


public class LoginPage extends baseclass{
	
	public LoginPage(RemoteWebDriver driver) {
		
		this.driver= driver;
	}

  //  RemoteWebDriver driver = null;
    
    // locators
     
    public boolean getEmailLabel() {
    	
    	return driver.findElement(By.xpath("//label[text()='Email:']")).isDisplayed();
    }
    
   public boolean  getPasswordLabel(){
	   
	   return driver.findElement(By.xpath("//label[text()='Password:']")).isDisplayed();		
    }
    
   public boolean loginLabel(){
	   
	   return driver.findElement(By.xpath("//button[text()='Log in']")).isDisplayed();   	
    }
    
    
    
    
    
    // Action
   
   
    public LoginPage enterUserName(String username)  {
    	
    	driver.findElement(By.xpath("//input[@class='email']")).clear();
    	driver.findElement(By.xpath("//input[@class='password']")).clear();
    	
    	
    	
    	driver.findElement(By.xpath("//input[@class='email']"));
    	return this;
        
    }

    public LoginPage enterPassword(String password) {
        
    	driver.findElement(By.xpath("//input[@class='password']"));
    	return this;
    	
    }

    public Dashboard clickLogin() {
       
    	driver.findElement(By.xpath("//button[@class='button-1 login-button']")).click();
    	return new Dashboard();
    }
    
    public void login(String username, String password) {
    	enterUserName(username);
    	enterPassword(password);
    	clickLogin();
    	
    }
    
}
