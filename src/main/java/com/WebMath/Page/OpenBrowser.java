package com.WebMath.Page;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenBrowser {
	public static WebDriver driver;

	public void intialization() {
		    driver = new EdgeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://pipingmart.co.in/supplier-registration");
			driver.manage().window().maximize();
		}

	
	public void teardown() {
		driver.close();
	}
}
