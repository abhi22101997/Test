package com.WebMath.Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class ReusableComponents extends OpenBrowser {

	public void logInfo(String message) {
		System.out.println("INFO: " + message);
	}
	public void loginbutton() {
		logInfo("loginbutton" + " execuation started");
		try {
			driver.findElement(ObjectRepository.loginbutton).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void Signupbutton() {
		logInfo("Signupbutton" + " execuation started");
		try {
			driver.findElement(ObjectRepository.Signupbutton).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void EnterEmailInLoginForm(String value) {
		try {
			logInfo("EnterEmailInLoginForm" + " execuation started");
			WebElement inputField = driver.findElement(ObjectRepository.email);
			Actions act = new Actions(driver);
			act.click(inputField);
			act.sendKeys(inputField, value).build().perform();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
	public void EnterPasswordInLoginForm(String value) {
		try {
			logInfo("EnterPasswordInLoginForm" + " execuation started");
			WebElement inputField = driver.findElement(ObjectRepository.password);
			Actions act = new Actions(driver);
			act.click(inputField);
			act.sendKeys(inputField, value).build().perform();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
}
	public void clickOnLoginButtonOnLoginPage() {
		logInfo("clickOnLoginButtonOnLoginPage" + " execution started");
		try {
			driver.findElement(ObjectRepository.LoginButtonFromLoginPage).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void verifyThatLoggedInSuccessfully(String expectedCompanyName) {
		logInfo("verifyThatLoggedInSuccessfully" + " execution started");
		try {
			Thread.sleep(3000);
			String actualCompanyName=driver.findElement(ObjectRepository.verifyLoggedInSuccessfully).getText();
			logInfo(actualCompanyName);
			Assert.assertEquals(actualCompanyName, expectedCompanyName);
			
				
				
				
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void Logout() {
		try {
			logInfo("Logout" + " execuation started");
			driver.findElement(ObjectRepository.Logoutbutton).click();
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void EnterfullName(String value) {
		try {
			logInfo("Enterfullname" + " execuation started");
			WebElement inputField = driver.findElement(ObjectRepository.fullname);
			Actions act = new Actions(driver);
			act.click(inputField);
			act.sendKeys(inputField,value).build().perform();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
	


	





	
