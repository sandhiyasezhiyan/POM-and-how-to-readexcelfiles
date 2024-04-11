package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class MergeLeadPage extends BaseClass {
	Set<String> allWindows;
	List<String> allhandles = new ArrayList<String>();
	
	public MergeLeadPage(ChromeDriver driver) {
		this.driver = driver;
	}
		
	public MergeLeadPage clickLookUpLeads1() {
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		return this;
	}
	
	public MergeLeadPage enterFirstNameInLookUpWindowPage() {
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Hari");
		return this;
	}
	
	public MergeLeadPage enterSecondNameInLookUpWindow() {
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Ajith");
		return this;
	}
 
	
	public MergeLeadPage clickFindLeadInLookUpWindow() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
		return this;
	}
	
	public MergeLeadPage clickNameInLookUpWindow()  {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.switchTo().window(allhandles.get(0));
		return this;
	}
	
	public MergeLeadPage moveTolookUpLeadsWindow() {
		Set<String> allWindows = driver.getWindowHandles();
		allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
		return this;
	}
	
	public MergeLeadPage backToMergeLeadWindow() {
		driver.switchTo().window(allhandles.get(0));
		return this;
	}
	
	public MergeLeadPage clickLookUpLeads2() {
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		return this;
	}
	
	public MergeLeadPage clickMergeButton() {
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		return this;

	}
	public ViewLeadsPage acceptAlert() {
		driver.switchTo().alert().accept();
		return new ViewLeadsPage(driver);
	}
	

}
