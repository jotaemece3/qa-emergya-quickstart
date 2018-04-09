package com.emergya.pageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

import org.apache.log4j.Logger;
import org.openqa.selenium.interactions.Actions;

import com.emergya.selenium.drivers.EmergyaWebDriver;
import com.emergya.selenium.pageObject.BasePageObject;

public class AutomationDemoSiteFileUploadPage extends BasePageObject{

	/**
     * Logger class initialization.
     */
    static Logger log = Logger.getLogger(GoogleMainPage.class);

    /**
     * Items keys selectors.
     */
    private static final String IMG_LOGO_ADS = "logoADS";
    private static final String MORE_BUTTON = "moreButton";
    private static final String FILE_UPLOAD_BUTTON = "fileUploadButton";
    private static final String BROWSER_BUTTON = "browserButton";
    private static final String REMOVE_FILE_BUTTON = "removeFileButton";
   
    
    /**
     * Constructor method
     * @param driver selenium webdriver
     */
    public AutomationDemoSiteFileUploadPage(EmergyaWebDriver driver) {
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
     * This method click on file upload button
     * 
     * @return
     */
    public AutomationDemoSiteFileUploadPage clickOnADSFileUploadButton() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnADSFileUploadButton method");

		
		Actions actions = new Actions(driver);
		actions.moveToElement(this.getElementByXPath(MORE_BUTTON)).moveToElement(this.getElementByXPath(FILE_UPLOAD_BUTTON)).click().build().perform();
		
/*
		if (this.isElementVisibleByXPath(SWITCH_TO_ALERTS_BUTTON)) {
			this.getElementByXPath(SWITCH_TO_ALERTS_BUTTON).click();
		}
*/
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnADSFileUploadButton method");
		return new AutomationDemoSiteFileUploadPage(driver);
	}
    
    /**
     * This method click on browser button
     * 
     * @return
     */
    public AutomationDemoSiteFileUploadPage clickOnBrowserButton() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnBrowserButton method");


		
			this.getElementByXPath(BROWSER_BUTTON).click();
		
			

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnBrowserButton method");
		return new AutomationDemoSiteFileUploadPage(driver);
	}
    
    /**
     * This method run a robot that select a file
     * 
     * @throws AWTException
     */
    public void selectFile() throws AWTException {
    	
    	log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start selectFile method");
    	
    	StringSelection ss = new StringSelection("/home/jmcaceres/proyectos/qa-emergya-quickstart/src/main/resources/files/capt.png");
    	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
    	Robot rb = new Robot();
    	
    	rb.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
    	rb.keyPress(java.awt.event.KeyEvent.VK_L);
    	rb.keyRelease(java.awt.event.KeyEvent.VK_L);
    	rb.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
    	
    	rb.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
    	rb.keyPress(java.awt.event.KeyEvent.VK_V);
    	rb.keyRelease(java.awt.event.KeyEvent.VK_V);
    	rb.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
    	
    	rb.keyPress(java.awt.event.KeyEvent.VK_ENTER);
    	rb.delay(500);
    	rb.keyRelease(java.awt.event.KeyEvent.VK_ENTER);
    	
    	log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End selectFile method");
    	
    }
    
    /**
     * This method click on remove file button
     * 
     * @return
     */
    public AutomationDemoSiteFileUploadPage clickOnRemoveFileButton() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnRemoveFileButton method");


		if (this.isElementVisibleByXPath(REMOVE_FILE_BUTTON)) {
			this.getElementByXPath(REMOVE_FILE_BUTTON).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnRemoveFileButton method");
		return new AutomationDemoSiteFileUploadPage(driver);
	}
    
    
    /**
	 * This method check if Automation Demo Site File Upload logo is displayed
	 */
    public boolean isADSFileUploadLogoDisplayed() {
        log.info("[log-pageObjects]" + this.getClass().getSimpleName()
                + "]- Start isADSFileUploadLogoDisplayed method");
        log.info("[log-pageObjects]" + this.getClass().getSimpleName()
                + "]- End isADSFileUploadLogoDisplayed method");

        return this.isElementVisibleByXPath(IMG_LOGO_ADS);
    }
    
}
