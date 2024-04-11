package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class EditLeadPage extends BaseClass {
	
	public EditLeadPage(ChromeDriver driver) {
		this.driver=driver;
	}
public EditLeadPage clickEditTab() {
	driver.findElement(By.linkText("Edit")).click();
	return this;

}

public EditLeadPage editcompanyname() {
	WebElement companyName = driver.findElement(By.id("updateLeadForm_companyName"));
	companyName.clear();
	companyName.sendKeys("Accenture");
	return this;

}

public ViewLeadsPage clickupdatebutton() {
	driver.findElement(By.name("submitButton")).click();
	return new ViewLeadsPage(driver);

}
}
