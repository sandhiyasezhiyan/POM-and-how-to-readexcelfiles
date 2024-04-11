package Learnexceltestng;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass01 {
public ChromeDriver driver;

@BeforeMethod
public void precondition() {
	driver=new ChromeDriver();
	driver.get("https://www.w3schools.com/howto/tryit.asp?filename=tryhow_css_checkout_form");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

}

@AfterMethod

public void postcondition() {
	driver.close();

}
	

}
