package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class ViewLeadsPage extends BaseClass {
public ViewLeadsPage(ChromeDriver driver) {
	this.driver=driver;
}


public ViewLeadsPage viewLead() {
	String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
	System.out.println("companyname:"+text);
	return this;

}

public MyLeadsPage clickDelete() {
	driver.findElement(By.linkText("Delete")).click();
	System.out.println("Lead Deleted successfully");
	return new MyLeadsPage(driver);
}


}
