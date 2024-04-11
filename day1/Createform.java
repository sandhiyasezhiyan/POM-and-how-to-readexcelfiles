package Learnexceltestng;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Createform extends BaseClass01{
	
@DataProvider(name="fetchData")
public String[][] sendData() throws IOException {
	return ReadData.readData();
	
}
@Test(dataProvider="fetchData")
public void runcreateform(String fname,String email,String Address,String city,String state,String zip,
		String expyear,String cvv,String expmonth,String creditcardnum,String cardname) {
	
	driver.switchTo().frame("iframeResult");
	driver.findElement(By.id("fname")).sendKeys(fname);
	driver.findElement(By.id("email")).sendKeys(email);
	driver.findElement(By.id("adr")).sendKeys(Address);
	driver.findElement(By.id("city")).sendKeys(city);
	driver.findElement(By.id("state")).sendKeys(state);
	driver.findElement(By.id("zip")).sendKeys(zip);
	driver.findElement(By.id("expyear")).sendKeys(expyear);
	driver.findElement(By.id("cvv")).sendKeys(cvv);
	driver.findElement(By.id("expmonth")).sendKeys(expmonth);
	driver.findElement(By.id("ccnum")).sendKeys(creditcardnum);
	driver.findElement(By.id("cname")).sendKeys(cardname);
	
	
	driver.findElement(By.name("sameadr")).click();
	driver.findElement(By.className("btn")).click();
	
}

}
