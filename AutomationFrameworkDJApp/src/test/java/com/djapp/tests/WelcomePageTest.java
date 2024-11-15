package com.djapp.tests;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.Assert;

import com.djapp.pagesobjects.JobSearchPage;
import com.djapp.pagesobjects.LoginPage;
import com.djapp.pagesobjects.SavedJobsPage;
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
		JobSearchPage jp=new JobSearchPage();
		lg.closeCookiesButton();
		lg.enterUsername("qa_testJS01@circaworks.com");
		lg.enterPwd("Iceman#12");
		lg.clickSubmit();
		Thread.sleep(1000);
		wp.clickJobSearch();
		Thread.sleep(5000);
		//validating we are on the WelcomePage
		Assert.assertEquals(jp.isPresentFeaturedJobsTitle(),true);
		lg.closeApp();
		
	}
	
	@Test
	public void validateSavedJobs() throws InterruptedException {
		LoginPage lg=new LoginPage();
		SavedJobsPage sjp=new SavedJobsPage();
		lg.closeCookiesButton();
		lg.enterUsername("qa_testJS01@circaworks.com");
		lg.enterPwd("Iceman#12");
		lg.clickSubmit();
		Thread.sleep(1000);
		sjp.clickSavedJobs();
		Thread.sleep(5000);
		//validating we are on the WelcomePage
		Assert.assertEquals(sjp.isPresentSavedJobsTitle(),true);
		lg.closeApp();
		
	}
	
	
}
