package tests;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC003_DeleteLead extends BaseClass {
@Test
public void rundeletelead() {
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
	.clickfirstresultfordisplay()
	.clickDelete();

}
}
