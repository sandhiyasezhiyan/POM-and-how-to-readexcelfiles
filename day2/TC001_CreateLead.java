package tests;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC001_CreateLead extends BaseClass {
@Test
	public void runcreatelead() {
		new LoginPage(driver)
		.enterusername()
		.enterpassword()
		.ClickLoginButton()
		.clickcrmsfalink()
		.clickleads()
		.CreateLead()
		.entercompanyname()
		.enterlastname()
		.enterphonenumber()
		.clicksubmitbutton()
		.viewLead();
		
		

	}
}
