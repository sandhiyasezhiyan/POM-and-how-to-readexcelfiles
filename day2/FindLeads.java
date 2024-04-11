package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class FindLeads extends BaseClass {
public FindLeads(ChromeDriver driver) {
	this.driver=driver;
}

public FindLeads clickphonetab() {
	driver.findElement(By.xpath("//span[text()='Phone']")).click();
	return this;


}

public FindLeads enterphonenumber() {
	driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
	return this;

}
public FindLeads clickfindleadbutton() {
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	return this;

}

public EditLeadPage clickFirstResult() {
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	return new EditLeadPage(driver);
	
	
}

public ViewLeadsPage clickfirstresultfordisplay() {
	String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
	System.out.println("LeadID: " + leadID);
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	return new ViewLeadsPage(driver);
}

}


