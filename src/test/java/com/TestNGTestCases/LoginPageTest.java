package com.TestNGTestCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.LoginRgistrationPageTestCase.LoginPagee;
import com.saif.Base.TestBase;

import org.testng.annotations.Test;

 

public class LoginPageTest extends TestBase {
	
	LoginPagee obj;
	
	
  public LoginPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
  
  @BeforeMethod
  public void setup() throws IOException{
	 
	   initialization();
	   obj=new LoginPagee();
  }  
  

  @Test(enabled=false)
  
  public void first() throws InterruptedException {
	
	obj.verifyforgotpasswordlink();
	
	



  }
  
  @Test(enabled=true)
  public void forgotpassword() throws InterruptedException{
	  
	  obj.verifyforgotpasswordfunctionality();
  }
 
 @AfterMethod
public void clean(){
	
	//driver.close();
}
	
	
	
}
