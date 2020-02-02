package com.w2a.testcases;

import java.util.Hashtable;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.w2a.pages.HomePage;
import com.w2a.pages.LoginPage;
import com.w2a.pages.ZohoAppPage;

import com.w2a.utilites.Utilites;

public class LoginTest {
	
	@Test(dataProviderClass=Utilites.class,dataProvider="dp")
	
	public void loginTest(Hashtable<String,String> data) {
		
		HomePage home = new HomePage();
		LoginPage lp = home.goToLogin();
		
		//ZohoAppPage zp = lp.doLogin(data.get("username"), data.get("password"));
		lp.doLogin(data.get("username"), data.get("password"));
		try {
			Thread.sleep(25000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("login done successfully");
		Assert.fail("login failed");
	}

}
