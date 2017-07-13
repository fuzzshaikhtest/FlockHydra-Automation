package SignIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseTestSuite;
import resources.DefaultStrings;
import utilities.GenericMethods;

public class FlockSignInQuick extends BaseTestSuite {
	private GenericMethods gm;

	public WebDriver getDriver(){
		return driver;
	}
	
	@BeforeMethod
	public void beforeMethod() {		
		gm = new GenericMethods(driver);
		System.out.println("BaseTestSuite -> Before Method");
	}
	
	@Test(priority =1)
	public void SignIn(){
		gm.implicitWait(40);
		gm.SwitchToiFrameNo(0);
		gm.SendKey(By.xpath("//input[@class='input']"), 1, DefaultStrings.DIRECTI_TESTER_002_Email);
		gm.click(By.xpath("//a[@class='btn btn--action btn--block']"), 1);
		gm.click(By.xpath("//a[@data-dojo-attach-event='onclick: _skipOAuth']"), 2);
		gm.SendKey(By.xpath("//input[@class='input']"), 1, DefaultStrings.OTP);
		gm.click(By.xpath("//a[@class='btn btn--action btn--block']"), 1);
	}
	
	@AfterMethod
	public void afterMethod() {		
		System.out.println("BaseTestSuite -> After Method");
	}
}