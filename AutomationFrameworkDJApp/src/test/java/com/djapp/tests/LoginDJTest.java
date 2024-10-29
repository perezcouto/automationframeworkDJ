package com.djapp.tests;

import org.testng.annotations.Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.Assert;

import com.djapp.pagesobjects.LoginPage;
import com.djapp.pagesobjects.WelcomePage;

public class LoginDJTest {
	@Test
	public void validateSuccessLoginDJApp() {
		LoginPage lg=new LoginPage();
		WelcomePage wp=new WelcomePage();
		
		lg.closeCookiesButton();
		lg.enterUsername("qa_testJS01@circaworks.com");
		lg.enterPwd("Iceman#12");
		lg.clickSubmit();
		
		//validating we are on the WelcomePage
		Assert.assertEquals(wp.isPresentTabGeneral(), true);	
		
		//Assert.assertEquals(wp.isPresentTabAfuera(), true);	
		lg.closeApp();
	}
	
	
	@Test
	public void validateEmptyCredencialsDJApp() {
		LoginPage lg=new LoginPage();
		WelcomePage wp=new WelcomePage();
		lg.closeCookiesButton();
		lg.enterUsername("");
		lg.enterPwd("");
		lg.clickSubmit();
		
		//validating we errors messages on Login Page with empty credencials
		Assert.assertEquals(lg.getErrorMsg(), "Incorrect email or password. Please verify them and try again");	
		lg.closeApp();
	}
	
	
}
