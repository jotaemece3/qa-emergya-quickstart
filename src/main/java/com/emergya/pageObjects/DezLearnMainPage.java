package com.emergya.pageObjects;



import org.apache.log4j.Logger;

import com.emergya.selenium.drivers.EmergyaWebDriver;
import com.emergya.selenium.pageObject.BasePageObject;

public class DezLearnMainPage extends BasePageObject {

	/**
	 * Logger class initialization.
	 */
	static Logger log = Logger.getLogger(GoogleMainPage.class);

	/**
	 * Items keys selectors.
	 */
	private static final String IMG_LOGO_DEZLEARN = "logoDezLearn";
	private static final String TEST_BUTTON = "testingButton";

	/**
	 * Constructor method
	 * 
	 * @param driver
	 *            selenium webdriver
	 */
	public DezLearnMainPage(EmergyaWebDriver driver) {
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

		boolean status = this.isElementVisibleByXPath(IMG_LOGO_DEZLEARN);

		log.info("[log-PageObjects] " + this.getClass().getSimpleName() + " - End isReady method");

		return status;
	}

	/**
	 * This method click on Test button
	 * 
	 * @return
	 */
	public DezLearnMainPage clickOnTestButton() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnTestButton method");

		if (this.isElementVisibleByXPath(TEST_BUTTON)) {
			this.getElementByXPath(TEST_BUTTON).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnTestButton method");
		return new DezLearnMainPage(driver);
	}

	/**
	 * This method check if Dezlearn logo is displayed
	 */
	public boolean isDezLearnLogoDisplayed() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start isDezLearnLogoDisplayed method");
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End isDezLearnLogoDisplayed method");

		return this.isElementVisibleByXPath(IMG_LOGO_DEZLEARN);
	}

}
