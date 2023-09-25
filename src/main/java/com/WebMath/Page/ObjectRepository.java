package com.WebMath.Page;
import org.openqa.selenium.By;



public class ObjectRepository {
	
	public static final By loginbutton = By.xpath("(//button[@class=\"btn login-signup-btn\"])");
	public static final By Signupbutton = By.xpath("(//button[@onclick='window.location.href=\"https://pipingmart.co.in/supplier-registration\"])");
	public static final By email = By.xpath("//input[@formcontrolname='email']");
	public static final By password = By.xpath("//input[@formcontrolname='password']");
    public static final By LoginButtonFromLoginPage = By.xpath("//button[@class='submit-btn btn btn-primary']");
    public static final By verifyLoggedInSuccessfully = By.xpath("//div[@class='text-wrapper']/span");
    public static final By Logoutbutton = By.linkText("Logout");
    public static final By clickOnBuyersDropDown= By.xpath("//a[@id='buyer']");
    public static final By postYourRequirement = By.xpath("//a[@class='dropdown-item']");
    public static final By ProductNameTextBox= By.xpath("//input[@id='productName']");
    public static final By nameTextBox = By.xpath("//input[@id='uName']");
    public static final By companyNametextBox = By.xpath("//input[@id='cName']");
    public static final By countryTextBox = By.xpath("//input[@id='country']");
    public static final By emailIdTextBox = By.xpath("//input[@id='email']");
    public static final By mobileNumberTextBox = By.xpath("//input[@id='email']");
    public static final By typeYourRequirementTextBox = By.xpath("//textarea[@id='requirement']");
    public static final By getCaptchaCheckBox = By.xpath("//div[@class='recaptcha-checkbox-border']");
    public static final By getQuoteButton = By.xpath("//button[@id='submitBtn']");
    public static final By clickOnWhoWeAre = By.xpath("(//a[normalize-space()='Who we are'])[1]");
    public static final By clickOnContactUs = By.xpath("(//a[@class='nav-link pt-0'][normalize-space()='Contact Us'])[1]");
    public static final By customersDropDown = By.xpath("//span[text()='Categories']");
    public static final By customerFromDropDown =By.xpath("//li[@data-value='product']");
    public static final By suppliersFromDropDown = By.xpath("//li[@data-value='company']");
    public static final By searchTextBoxForCategories = By.xpath("//input[@id='product']");
    public static final By searchTextBoxForSupplier = By.xpath("//input[@id='supplier']");
    public static final By primeCompanies = By.xpath("//p[@class='pt-2 primeCompany']");
    public static final By postEnquiryButton = By.xpath("//button[@data-id='190']");
    public static final By leftCarsoulFromProductList = By.xpath("//i[@id='left-button']");
    public static final By RightCarsouldFromProductList = By.xpath("//i[@id='right-button']");
    public static final By pipesInProductList = By.xpath("(//img[@alt='Pipes'])[1]");
    public static final By tubingInProductList = By.xpath("//img[@alt='Tubing']");
    public static final By pipeFittingsInProductList = By.xpath("//img[@alt='Pipe Fittings']");
    public static final By forgedFittingsInProductList = By.xpath("//img[@alt='Forged Fittings']");
    public static final By flangesInProductList = By.xpath("//img[@alt='Flanges']");
    public static final By barsInProductList = By.xpath("//img[@alt='Bars']");
    public static final By fastenersInProductList = By.xpath("//img[@alt='Fasteners']");
    public static final By electrodesInProductList = By.xpath("//img[@alt='Electrodes']");
    public static final By gasketsInProductList = By.xpath("//img[@alt='Gaskets']");
    public static final By sheetsAndPlatesInProductList = By.xpath("//img[@alt='Sheet and Plates']");
    public static final By valvesInProductList = By.xpath("//img[@alt='Valves']");
    public static final By instrumentationFittingsInProductList = By.xpath("//img[@alt='Instrumentation Fittings']");
    public static final By boltsInProductList = By.xpath("//img[@alt='Bolts']");
    public static final By nutsInProductList = By.xpath("//img[@alt='Nuts']");
    public static final By studBoltsInProductList = By.xpath("//img[@alt='Stud Bolts']");
    public static final By washerInProductList = By.xpath("//img[@alt='Washer']");
    public static final By channelsInProductList = By.xpath("//img[@alt='Channels']");
    public static final By screwInProductList = By.xpath("//img[@alt='Screw']");
    public static final By electropolishedPipe = By.xpath("//img[@alt='Electropolished  Pipe']");
    public static final By pTFELinePiped = By.xpath("//img[@alt='PTFE Lined Pipe']");
    public static final By pTFELinePipeFittings = By.xpath("//img[@alt='PTFE Lined Pipe Fittings']");
    public static final By pTFELinedFlanges = By.xpath("//img[@alt='PTFE Lined Flanges']");
    public static final By pTFELinedValves = By.xpath("//img[@alt='PTFE Lined Valves']");
    public static final By pTFEStrainer = By.xpath("//img[@alt='PTFE Strainer']");
    public static final By pTFELinedSightGlass = By.xpath("//img[@alt='PTFE Lined Sight Glass']");
    public static final By fillerWire = By.xpath("//img[@alt='Filler Wire']");
    public static final By siphonTubes = By.xpath("//img[@alt='Siphon Tubes']");
    public static final By stainlessSteelPipes = By.xpath("//a[text()='Stainless Steel Pipes']");
    public static final By stainlessSteel1InchPipes = By.xpath("//a[text()='Stainless Steel 1 inch Pipes']");
    public static final By stainlessSteel2InchPipes = By.xpath("//a[text()='Stainless Steel 2 inch Pipes']");
    public static final By stainlessSteel201Pipes = By.xpath("//a[text()='Stainless Steel 201 Pipes']");
    public static final By stainlessSteel202Pipes = By.xpath("//a[text()='Stainless Steel 202 Pipes']");
    public static final By stainlessSteel205Pipes = By.xpath("//a[text()='Stainless Steel 205 Pipes']");
    public static final By stainlessSteel3InchPipes = By.xpath("//a[text()='Stainless Steel 3 inch Pipes']");
    public static final By stainlessSteel301Pipes = By.xpath("//a[text()='Stainless Steel 301 Pipes']");
    public static final By stainlessSteel301LPipes = By.xpath("//a[text()='Stainless Steel 301L Pipes']");
    public static final By stainlessSteel301NPipes = By.xpath("//a[text()='Stainless Steel 301LN Pipes']");
    public static final By stainlessSteel302Pipes = By.xpath("//a[text()='Stainless Steel 302 Pipes']");
    public static final By stainlessSteel303Pipes =By.xpath("/a[text()='Stainless Steel 303 Pipes']");
    public static final By stainlessSteel304Pipes = By.xpath("//a[text()='Stainless Steel 304 Pipes']");
    public static final By stainlessSteel304HPipes = By.xpath("//a[text()='Stainless Steel 304H Pipes']");
    public static final By stainlessSteel304LNPipes = By.xpath("//a[text()='Stainless Steel 304LN Pipes']");
    public static final By stainlessSteel304NPipes = By.xpath("//a[text()='Stainless Steel 304N Pipes']");
    public static final By stainlessSteel305Pipes = By.xpath("//a[text()='Stainless Steel 305 Pipes']");
    public static final By stainlessSteel308Pipes = By.xpath("//a[text()='Stainless Steel 308 Pipes']");
    public static final By stainlessSteel309Pipes = By.xpath("//a[text()='Stainless Steel 309 Pipes']");
    public static final By stainlessSteel309HPipes= By.xpath("//a[text()='Stainless Steel 309H Pipes']");
    public static final By stainlessSteel309SPipes= By.xpath("//a[text()='Stainless Steel 309S Pipes']");
    public static final By stainlessSteel310MlnPipes = By.xpath("//a[text()='Stainless Steel 310 MoLN Pipes']");
    public static final By stainlessSteel310Pipes = By.xpath("//a[text()='Stainless Steel 310 Pipes']");
    public static final By fullname = By.xpath("//input[@placeholder=\"* Full Name\"]");
    public static final By companyname = By.xpath("//input[@placeholder=\"* Company Name\"]");
    public static final By address = By.xpath("//textarea[@placeholder=\"* Address\"]"); 
    public static final By country = By.xpath("//input[@class=\"ng-pristine ng-valid ng-touched\"]");
    public static final By state = By.xpath("//input[@placeholder=\"* Select State.\"]");
    public static final By City = By.xpath("//input[@placeholder=\"* Select City.\"]");
    public static final By pincode = By.xpath("//input[@id=\"formBasicEmail\"]");
    public static final By mobileno = By.xpath("//input[@class=\"mobile-form-control m-0 ng-untouched ng-pristine ng-invalid\"]");
    public static final By websiteaddress = By.xpath("//input[@placeholder=\"* Website Address\"]");
    public static final By passwordsignup = By.xpath("//input[@placeholder=\"* Password\"]");
    public static final By agreetnc = By.xpath("//input[@id=\"accept\"]");  
    public static final By submitsignup = By.xpath("//button[@class=\"submit-btn btn btn-primary\"]");
    
    
    

    
    
    

    
    		
    		
    		
    
    
    
    
    
}
