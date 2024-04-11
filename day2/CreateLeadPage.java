package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class CreateLeadPage extends BaseClass{
	
	public CreateLeadPage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public CreateLeadPage entercompanyname() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		return this;

	}
	public CreateLeadPage enterfirstname() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Subraja");
		return this;

	}
	
	public CreateLeadPage enterlastname() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Subi");
		return this;

	}
	
	public CreateLeadPage enterphonenumber() {
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
		return this;

	}
	
	public ViewLeadsPage clicksubmitbutton() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadsPage(driver);

	}
}
