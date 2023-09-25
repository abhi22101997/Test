package com.WebMath.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ObjectRepo {
    private WebDriver driver;

    public ObjectRepo(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement fullName() {
        return driver.findElement(By.xpath("//input[@placeholder=\"* Full Name\"]")); 
    }

    public WebElement companyName() {
        return driver.findElement(By.xpath("//input[@placeholder=\"* Company Name\"]"));  
    }

    public WebElement address() {
        return driver.findElement(By.xpath("//textarea[@placeholder=\"* Address\"]"));  
    }

    public WebElement country() {
        return driver.findElement(By.xpath("//input[@class=\"ng-pristine ng-valid ng-touched\"]"));  
    }
    
    public WebElement state() {
        return driver.findElement(By.xpath("//input[@placeholder=\"* Select State.\"]"));  
    }
    
    public WebElement city() {
        return driver.findElement(By.xpath("//input[@placeholder=\"* Select City.\"]"));
    }
    
    public WebElement pincode() {
        return driver.findElement(By.xpath("//input[@id=\"formBasicEmail\"]"));  
    }
    
    public WebElement mobileno() {
        return driver.findElement(By.xpath("//input[@class=\"mobile-form-control m-0 ng-untouched ng-pristine ng-invalid\"]"));  
    }
    
    public WebElement email() {
        return driver.findElement(By.xpath("//input[@placeholder=\"* Email\"]"));  
    }
    
    public WebElement webaddress() {
        return driver.findElement(By.xpath("//input[@placeholder=\"* Website Address\"]"));  
    }
    
    public WebElement password() {
        return driver.findElement(By.xpath("//input[@placeholder=\"* Password\"]"));  
    }
}