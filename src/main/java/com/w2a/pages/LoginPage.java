package com.w2a.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w2a.base.Page;

public class LoginPage extends Page{
	
	
	public void doLogin(String username,String password) {
		
		type("email_CSS",username);
		click("next_CSS");
		type("password_CSS",password);
		System.out.println("clicking on form submit button");
		click("signbtn_CSS");
		System.out.println("clicked on form submit button");
		
		//return new ZohoAppPage();
	}
	

}
