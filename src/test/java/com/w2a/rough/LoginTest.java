package com.w2a.rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.w2a.base.Page;
import com.w2a.crm.pages.CRMHomePage;
import com.w2a.pages.HomePage;
import com.w2a.pages.LoginPage;
import com.w2a.pages.ZohoAppPage;
import com.w2a.pages.crm.accounts.AccountsPage;
import com.w2a.pages.crm.accounts.CreateAccountPage;

public class LoginTest {

	public static void main(String[] args) throws Exception {
		
		
	
		/*
		 * HomePage home = new HomePage(); home.goToLogin();
		 * 
		 * LoginPage login = new LoginPage(); login.doLogin("khushbu.daga19@gmail.com",
		 * "Test1@123"); System.out.println("login done successfully");
		 * 
		 * ZohoAppPage zp = new ZohoAppPage(); zp.gotoCRM();
		 * 
		 * Page.menu.gotoAccounts();
		 * 
		 * AccountsPage account = new AccountsPage(); account.gotoCreateAccounts();
		 * 
		 * CreateAccountPage cap = new CreateAccountPage(); cap.createAccount("Raman");
		 */
		
		
		HomePage home = new HomePage();
		LoginPage lp = home.goToLogin();
		
		lp.doLogin("khushbu.daga19@gmail.com", "Test1@123");
		System.out.println("login done successfully");
		ZohoAppPage zp = new ZohoAppPage();
		zp.gotoCRM();
		
		AccountsPage account  = Page.menu.gotoAccounts();
		CreateAccountPage cap = account.gotoCreateAccounts();
		cap.createAccount("Raman");

	}

}
