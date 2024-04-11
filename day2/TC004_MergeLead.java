package tests;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC004_MergeLead extends BaseClass {
@Test
public void runmergelead() throws InterruptedException {
	new LoginPage(driver)
	.enterusername()
	.enterpassword()
	.ClickLoginButton()
	.clickcrmsfalink()
	.clickleads()
	.clickMergeLead()
	.clickLookUpLeads1()
	.enterFirstNameInLookUpWindowPage()
	.clickFindLeadInLookUpWindow()
	.clickNameInLookUpWindow()
	.backToMergeLeadWindow()
	.clickLookUpLeads2()
	.moveTolookUpLeadsWindow()
	.enterSecondNameInLookUpWindow()
	.clickFindLeadInLookUpWindow()
	.clickNameInLookUpWindow()
	.backToMergeLeadWindow()
	.clickMergeButton()
	.acceptAlert()
	.viewLead();
	


}

}

