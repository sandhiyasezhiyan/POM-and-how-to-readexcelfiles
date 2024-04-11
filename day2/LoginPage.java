package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class LoginPage extends BaseClass {
public LoginPage(ChromeDriver driver) {
	this.driver=driver;
}

public LoginPage enterusername() {
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	return this;
	}
public LoginPage enterpassword() {
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	return this;
	}

public WelcomePage ClickLoginButton() {
	driver.findElement(By.className("decorativeSubmit")).click();
	return new WelcomePage(driver);

}
}
