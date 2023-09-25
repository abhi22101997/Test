package com.PipingMart.TestCase;

//import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.WebMath.Page.OpenBrowser;
import com.WebMath.Page.ReusableComponents;

public class PipingMartTestCase extends ReusableComponents {
	OpenBrowser lp;

	@BeforeMethod
	public void browsersetup() {
		lp = new OpenBrowser();
		lp.intialization();
	}

	@Test
	public void logintest() throws Exception{
		Thread.sleep(3000);
	loginbutton();
	EnterEmailInLoginForm("abhishek.gund@kdigitalcurry.com");
	EnterPasswordInLoginForm("123456");
	clickOnLoginButtonOnLoginPage();
	 Thread.sleep(3000);
	 verifyThatLoggedInSuccessfully("xyz");
	 Thread.sleep(5000);
	 Logout();
	 Thread.sleep(2000);
		
//		Signupbutton();		
//		EnterfullName("Neeta Thevar");

	 
	}
	@AfterMethod
	public void closebrowser() {
		lp.teardown();
		
	}

}
