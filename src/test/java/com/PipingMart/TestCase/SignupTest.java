package com.PipingMart.TestCase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.WebMath.Page.OpenBrowser;
import com.WebMath.Page.ReusableComponents;

public class SignupTest extends ReusableComponents {
	OpenBrowser lp;

	@BeforeMethod
	public void browsersetup() {
		lp = new OpenBrowser();
		lp.intialization();
	}
	
		
	@Test
    public void testsignup() throws InterruptedException {
		
		Thread.sleep(3000);
		
		Signupbutton();		
		EnterfullName("Neeta Thevar");
	}
	
}


