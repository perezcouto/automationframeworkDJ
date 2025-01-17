package com.djapp.tests;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.Assert;
import com.djapp.pagesobjects.LoginPage;
import com.djapp.pagesobjects.WelcomePage;

public class WelcomePageTest {

	
	

/*	@Test
	public void validateFindJobButtonDJApp() {
		LoginPage lg=new LoginPage();
		WelcomePage wp=new WelcomePage();
		
		lg.closeCookiesButton();
		lg.enterUsername("qa_testJS01@circaworks.com");
		lg.enterPwd("Iceman#12");
		lg.clickSubmit();
		
		//validating we are on the WelcomePage
		Assert.assertEquals(wp.isPresentFindJobsButton(),true);
		lg.closeApp();
	}*/
	
	@Test
	public void validateJobSearch() throws InterruptedException {
		LoginPage lg=new LoginPage();
		WelcomePage wp=new WelcomePage();
		
		lg.closeCookiesButton();
		lg.enterUsername("qa_testJS01@circaworks.com");
		lg.enterPwd("Iceman#12");
		lg.clickSubmit();
		Thread.sleep(1000);
		wp.clickJobSearch();
		Thread.sleep(5000);
		//validating we are on the WelcomePage
		//Assert.assertEquals(wp.isPresentFindJobsButton(),true);
		lg.closeApp();
	}
	
	
}
