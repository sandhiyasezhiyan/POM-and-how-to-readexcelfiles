package tests;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC002_EditLead extends BaseClass{
@Test
	public void runEditLead() {
	
	new LoginPage(driver)
	.enterusername()
	.enterpassword()
	.ClickLoginButton()
	.clickcrmsfalink()
	.clickleads()
	.FindLeads()
	.clickphonetab()
	.enterphonenumber()
	.clickfindleadbutton()
	.clickFirstResult()
	.clickEditTab()
	.editcompanyname()
	.clickupdatebutton()
	.clickDelete();
		

	}
	
	
}
