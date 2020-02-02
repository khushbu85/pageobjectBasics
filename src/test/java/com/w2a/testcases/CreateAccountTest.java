package com.w2a.testcases;

import java.util.Hashtable;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.w2a.base.Page;
import com.w2a.pages.ZohoAppPage;
import com.w2a.pages.crm.accounts.AccountsPage;
import com.w2a.pages.crm.accounts.CreateAccountPage;
import com.w2a.utilites.Utilites;

public class CreateAccountTest {
	
	@Test(dataProviderClass=Utilites.class,dataProvider="dp")
	public void createAccountTest(Hashtable<String,String> data) throws Exception {
		System.out.println("entered in CreateAccountTest successfully");
	ZohoAppPage zp  = new ZohoAppPage();
	System.out.println("zp object created");
       zp.gotoCRM();
       System.out.println("entered in CRM Page");
		
		AccountsPage account  = Page.menu.gotoAccounts();
		CreateAccountPage cap = account.gotoCreateAccounts();
		cap.createAccount(data.get("accountName"));
		Assert.fail("craete account failed");
	}

}
