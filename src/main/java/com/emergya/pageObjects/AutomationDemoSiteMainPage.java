package com.emergya.pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.emergya.selenium.drivers.EmergyaWebDriver;
import com.emergya.selenium.pageObject.BasePageObject;

public class AutomationDemoSiteMainPage extends BasePageObject{

	/**
     * Logger class initialization.
     */
    static Logger log = Logger.getLogger(GoogleMainPage.class);

    /**
     * Items keys selectors.
     */
    private static final String IMG_LOGO_ADS = "logoADS";
    private static final String ENTERIMG_BUTTON = "enterimg";
    private static final String EMAIL_FIELD = "emailField";
    
    /**
     * Constructor method
     * @param driver selenium webdriver
     */
    public AutomationDemoSiteMainPage(EmergyaWebDriver driver) {
        super(driver);
    }
    
    /**
     * Checks that the PO is ready
     * @param pageObject page object to be used
     */
    @Override
    public boolean isReady() {
        log.info("[log-PageObjects] " + this.getClass().getSimpleName()
                + " - Start isReady method");

        boolean status = this.isElementVisibleByXPath(IMG_LOGO_ADS);

        log.info("[log-PageObjects] " + this.getClass().getSimpleName()
                + " - End isReady method");

        return status;
    }
    
    /**
     * This method write on email field
     * 
     * @param stringSearch
     */
    public void emailMain(String stringSearch) {
		log.info("[log-" + this.getClass().getSimpleName() + "]- Start emailMain -[" + this.getClass().getSimpleName()
				+ "- method]");

		if (this.isElementVisibleById(EMAIL_FIELD)) {
			this.getElementById(EMAIL_FIELD).sendKeys(stringSearch);
			
		}

		log.info("[log-" + this.getClass().getSimpleName() + "]- End emailMain -[" + this.getClass().getSimpleName()
				+ "- method]");
    }
    
    /**
     * This method click on enterimg button
     * 
     * @return
     */
    public AutomationDemoSiteMainPage clickOnEnterimgButton() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnEnterimgButton method");


		if (this.isElementVisibleById(ENTERIMG_BUTTON)) {
			this.getElementById(ENTERIMG_BUTTON).click();
		}
		

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnEnterimgButton method");
		return new AutomationDemoSiteMainPage(driver);
	}
    
    /**
     * This method create a PopUp when login to register page
     * 
     * @return
     */
    public AutomationDemoSiteMainPage clickOnADSPopUp() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName()
				+ "]- Start clickOnJUIADSPopUp method");
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		WebElement button =driver.findElement(By.id("enterimg"));

		//Login to Register	
	    driver.findElement(By.id("email")).sendKeys("mngr34926");										
	    		
	    //Perform Click on Enterimg button using JavascriptExecutor		
	    jse.executeScript("arguments[0].click();", button);
	                            
	    //To generate Alert window using JavascriptExecutor. Display the alert message 			
	    jse.executeScript("alert('Ventana PopUp de prueba');");  
	    
	    driver.sleep(2);
	    
	    // Accept the alert
	 	Alert alert = driver.switchTo().alert();
	 	driver.sleep(2);
	 	alert.accept();
	    
		log.info("[log-pageObjects]" + this.getClass().getSimpleName()
				+ "]- End clickOnJUIADSPopUp method");
		return new AutomationDemoSiteMainPage(driver);
	}
    
   
    /**
     * This method check Automation Demo Site logo is displayed.
     * 
     * @return
     */
    public boolean isADSLogoDisplayed() {
        log.info("[log-pageObjects]" + this.getClass().getSimpleName()
                + "]- Start isADSMainLogoDisplayed method");
        log.info("[log-pageObjects]" + this.getClass().getSimpleName()
                + "]- End isADSMainLogoDisplayed method");

        return this.isElementVisibleByXPath(IMG_LOGO_ADS);
    }
}
