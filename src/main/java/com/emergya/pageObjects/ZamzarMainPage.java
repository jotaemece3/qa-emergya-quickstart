package com.emergya.pageObjects;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;


import org.apache.log4j.Logger;

import com.emergya.selenium.drivers.EmergyaWebDriver;
import com.emergya.selenium.pageObject.BasePageObject;

public class ZamzarMainPage extends BasePageObject{

	/**
     * Logger class initialization.
     */
    static Logger log = Logger.getLogger(GoogleMainPage.class);

    /**
     * Items keys selectors.
     */
    private static final String IMG_LOGO_ZAMZAR = "logoZamzar";
    private static final String CHOOSE_FILE_BUTTON = "chooseFileButton";
    private static final String CHOOSE_FILE_BUTTON2 = "chooseFileButton2";
    private static final String SEARCH_FIELD = "searchField";
    private static final String CONVERT_FIELD = "convertField";
    private static final String CONVERT_TO_JPG_FIELD = "convertToJPG";
    private static final String REMOVE_FIELD = "removeFile";
    
    /**
     * Constructor method
     * @param driver selenium webdriver
     */
    public ZamzarMainPage(EmergyaWebDriver driver) {
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

        boolean status = this.isElementVisibleByXPath(IMG_LOGO_ZAMZAR);

        log.info("[log-PageObjects] " + this.getClass().getSimpleName()
                + " - End isReady method");

        return status;
    }
    
    /**
     * This method click on choose file button by id
     * 
     * @return
     */
    public ZamzarMainPage clickOnZamzarChooseFileButton() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnZamzarChooseFileButton method");


		if (this.isElementVisibleById(CHOOSE_FILE_BUTTON)) {
			this.getElementById(CHOOSE_FILE_BUTTON).click();
		}
		

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnZamzarChooseFileButton method");
		return new ZamzarMainPage(driver);
	}
    
    /**
     * This method click ok choose file button by xpath
     * 
     * @return
     */
    public ZamzarMainPage clickOnZamzarChooseFileButton2() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnZamzarChooseFileButton2 method");


		if (this.isElementVisibleByXPath(CHOOSE_FILE_BUTTON2)) {
			this.getElementByXPath(CHOOSE_FILE_BUTTON2).click();
		}
		

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnZamzarChooseFileButton2 method");
		return new ZamzarMainPage(driver);
	}
    
    /**
     * This method enter a image using a robot.
     * 
     * @throws Exception
     */
    public void enterImg() throws Exception {
    	
    	log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start enterImg method");
    	
     
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
       
        log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End enterImg method");
        
    }
    
    /**
     * This method run a robot for find a string
     * 
     * @throws Exception
     */
    public void findRobot() throws Exception {
    	
    	log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start findRobot method");
    	    
    	StringSelection ss = new StringSelection("Formats");
    	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
    	Robot rb = new Robot();
    	
    	rb.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
    	rb.keyPress(java.awt.event.KeyEvent.VK_F);
    	rb.keyRelease(java.awt.event.KeyEvent.VK_F);
    	rb.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
    	
    	rb.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
        rb.keyPress(java.awt.event.KeyEvent.VK_V);
        rb.keyRelease(java.awt.event.KeyEvent.VK_V);
        rb.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
        driver.sleep(2);
        rb.keyPress(java.awt.event.KeyEvent.VK_TAB);
        rb.keyRelease(java.awt.event.KeyEvent.VK_TAB);
        
        rb.keyPress(java.awt.event.KeyEvent.VK_TAB);
        rb.keyRelease(java.awt.event.KeyEvent.VK_TAB);
        driver.sleep(2);
        rb.keyPress(java.awt.event.KeyEvent.VK_ENTER);
        rb.keyRelease(java.awt.event.KeyEvent.VK_ENTER);
        driver.sleep(2);
        rb.keyPress(java.awt.event.KeyEvent.VK_ENTER);
        rb.delay(500);
        rb.keyRelease(java.awt.event.KeyEvent.VK_ENTER); 
        
        log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End findRobot method");
        
    }
    
    /**
     * This method write a string into search field.
     * 
     * @param stringSearch
     */
    public void doPrueba(String stringSearch) {
		log.info("[log-" + this.getClass().getSimpleName() + "]- Start doPrueba -[" + this.getClass().getSimpleName()
				+ "- method]");

		if (this.isElementVisibleById(SEARCH_FIELD)) {
			this.getElementById(SEARCH_FIELD).sendKeys(stringSearch);


		}

		log.info("[log-" + this.getClass().getSimpleName() + "]- End doPrueba -[" + this.getClass().getSimpleName()
				+ "- method]");
	}
    
    /**
     * This method click on a dropdown
     * 
     * @return
     */
    public ZamzarMainPage clickOnZamzarDropdown() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnZamzarDropdown method");


		if (this.isElementVisibleByXPath(CONVERT_FIELD)) {
			this.getElementByXPath(CONVERT_FIELD).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnZamzarDropdown method");
		return new ZamzarMainPage(driver);
	}

	/**
	 * This method select "JPG" option from the dropdown
	 * 
	 * @return
	 */
	public ZamzarMainPage clickOnZamzarDropdownOption() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnZamzarDropdownOption method");


		if (this.isElementVisibleByXPath(CONVERT_TO_JPG_FIELD)) {
			this.getElementByXPath(CONVERT_TO_JPG_FIELD).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnZamzarDropdownOption method");
		return new ZamzarMainPage(driver);
	}
	
	/**
	 * This method click on remove file button
	 * 
	 * @return
	 */
	 public EmergyaMainPage clickOnZamzarRemoveFileButton() {
			log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnZamzarRemoveFileButton method");


			if (this.isElementVisibleByXPath(REMOVE_FIELD)) {
				this.getElementByXPath(REMOVE_FIELD).click();
			}
			

			log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnZamzarRemoveFileButton method");
			return new EmergyaMainPage(driver);
		}
	    
    
    /**
     * This method check Zamzar logo is displayed
     * 
     * @return
     */
    public boolean isZamzarLogoDisplayed() {
        log.info("[log-pageObjects]" + this.getClass().getSimpleName()
                + "]- Start isZamzarLogoDisplayed method");
        log.info("[log-pageObjects]" + this.getClass().getSimpleName()
                + "]- End isZamzarLogoDisplayed method");

        return this.isElementVisibleByXPath(IMG_LOGO_ZAMZAR);
    }
}
