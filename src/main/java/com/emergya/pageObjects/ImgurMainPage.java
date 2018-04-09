package com.emergya.pageObjects;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import com.emergya.selenium.drivers.EmergyaWebDriver;
import com.emergya.selenium.pageObject.BasePageObject;

public class ImgurMainPage extends BasePageObject {

	/**
	 * Logger class initialization.
	 */
	static Logger log = Logger.getLogger(GoogleMainPage.class);

	/**
	 * Items keys selectors.
	 */
	private static final String IMG_LOGO_IMGUR = "logoImgur";
	// private static final String NEW_POST_BUTTON = "newPostButton";
	private static final String CHOOSE_FILE_BUTTON = "chooseFileButton";

	/**
	 * Constructor method
	 * 
	 * @param driver
	 *            selenium webdriver
	 */
	public ImgurMainPage(EmergyaWebDriver driver) {
		super(driver);
	}

	/**
	 * Checks that the PO is ready
	 * 
	 * @param pageObject
	 *            page object to be used
	 */
	@Override
	public boolean isReady() {
		log.info("[log-PageObjects] " + this.getClass().getSimpleName() + " - Start isReady method");

		boolean status = this.isElementVisibleByXPath(IMG_LOGO_IMGUR);

		log.info("[log-PageObjects] " + this.getClass().getSimpleName() + " - End isReady method");

		return status;
	}

	/**
	 * This method click on NewPost Button and i used cssSelector for this method.
	 * 
	 * @return
	 */
	public ImgurMainPage clickOnNewPostButton() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnNewPostButton method");

		String css = ".upload-btn-text";
		/*
		 * if (this.isElementVisibleByXPath(NEW_POST_BUTTON)) {
		 * this.getElementByXPath(NEW_POST_BUTTON).click(); }
		 */
		if (driver.isElementDisplayed(By.cssSelector(css))) {
			driver.findElement(By.cssSelector(css)).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnNewPostButton method");
		return new ImgurMainPage(driver);
	}

	/**
	 * This method click on choose file button
	 * 
	 * @return
	 */
	public ImgurMainPage clickOnChooseFileButton() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnChooseFileButton method");

		if (this.isElementVisibleByXPath(CHOOSE_FILE_BUTTON)) {
			this.getElementByXPath(CHOOSE_FILE_BUTTON).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnChooseFileButton method");
		return new ImgurMainPage(driver);
	}

	/**
	 * This method run a Robot for select an image.
	 * 
	 * @throws Exception
	 */
	public void enterImg() throws Exception {

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start enterImg method");

		StringSelection ss = new StringSelection(
				"/home/jmcaceres/proyectos/qa-emergya-quickstart/src/main/resources/files/capt.png");
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
	 * This method check Imbur logo is displayed.
	 * 
	 * @return
	 */
	public boolean isImgurLogoDisplayed() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start isImgurLogoDisplayed method");
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End isImgurLogoDisplayed method");

		return this.isElementVisibleByXPath(IMG_LOGO_IMGUR);
	}

}
