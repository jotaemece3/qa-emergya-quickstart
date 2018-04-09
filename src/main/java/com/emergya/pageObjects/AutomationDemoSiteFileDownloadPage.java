package com.emergya.pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.interactions.Actions;

import com.emergya.selenium.drivers.EmergyaWebDriver;
import com.emergya.selenium.pageObject.BasePageObject;

public class AutomationDemoSiteFileDownloadPage extends BasePageObject {

	/**
	 * Logger class initialization.
	 */
	static Logger log = Logger.getLogger(GoogleMainPage.class);

	/**
	 * Items keys selectors.
	 */
	private static final String IMG_LOGO_ADS = "logoADS";
	private static final String MORE_BUTTON = "moreButton";
	private static final String FILE_DOWNLOAD_BUTTON = "fileDownloadButton";
	private static final String TEXTAREA_FIELD = "textAreaField";
	private static final String GENERATE_FILE_TXT_BUTTON = "generateFileTxtButton";
	private static final String DOWNLOAD_FILE_TXT_BUTTON = "downloadFileTxtButton";

	/**
	 * Constructor method
	 * 
	 * @param driver
	 *            selenium webdriver
	 */
	public AutomationDemoSiteFileDownloadPage(EmergyaWebDriver driver) {
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

		boolean status = this.isElementVisibleByXPath(IMG_LOGO_ADS);

		log.info("[log-PageObjects] " + this.getClass().getSimpleName() + " - End isReady method");

		return status;
	}

	/**
	 * This method click on FileDownload button
	 * 
	 * @return
	 */
	public AutomationDemoSiteRegisterPage clickOnADSFileDownloadButton() {
		log.info(
				"[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnADSFileDownloadButton method");

		Actions actions = new Actions(driver);
		actions.moveToElement(this.getElementByXPath(MORE_BUTTON))
				.moveToElement(this.getElementByXPath(FILE_DOWNLOAD_BUTTON)).click().build().perform();

		/*
		 * if (this.isElementVisibleByXPath(SWITCH_TO_ALERTS_BUTTON)) {
		 * this.getElementByXPath(SWITCH_TO_ALERTS_BUTTON).click(); }
		 */
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnADSFileDownloadButton method");
		return new AutomationDemoSiteRegisterPage(driver);
	}

	/**
	 * This method write on text area field
	 * 
	 * @param stringSearch
	 */
	public void bodyTxt(String stringSearch) {
		log.info("[log-" + this.getClass().getSimpleName() + "]- Start bodyTxt -[" + this.getClass().getSimpleName()
				+ "- method]");

		if (this.isElementVisibleByXPath(TEXTAREA_FIELD)) {
			this.getElementByXPath(TEXTAREA_FIELD).sendKeys(stringSearch);

		}

		log.info("[log-" + this.getClass().getSimpleName() + "]- End bodyTxt -[" + this.getClass().getSimpleName()
				+ "- method]");
	}

	/**
	 * This method click on generate file txt button
	 * 
	 * @return
	 */
	public AutomationDemoSiteFileDownloadPage clickOnADSCreateFileTxtButton() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName()
				+ "]- Start clickOnADSCreateFileTxtButton method");

		if (this.isElementVisibleByXPath(GENERATE_FILE_TXT_BUTTON)) {
			this.getElementByXPath(GENERATE_FILE_TXT_BUTTON).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnADSCreateFileTxtButton method");
		return new AutomationDemoSiteFileDownloadPage(driver);
	}

	/**
	 * This method click on download file txt button
	 * 
	 * @return
	 */
	public AutomationDemoSiteFileDownloadPage clickOnADSDownloadFileTxtButton() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName()
				+ "]- Start clickOnADSDownloadFileTxtButton method");

		if (this.isElementVisibleByXPath(DOWNLOAD_FILE_TXT_BUTTON)) {
			this.getElementByXPath(DOWNLOAD_FILE_TXT_BUTTON).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName()
				+ "]- End clickOnADSDownloadFileTxtButton method");
		return new AutomationDemoSiteFileDownloadPage(driver);
	}

	/**
	 * This method check if Automation Demo Site File Download logo is displayed
	 */
	public boolean isADSFileDownloadLogoDisplayed() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName()
				+ "]- Start isADSFileDownloadLogoDisplayed method");
		log.info(
				"[log-pageObjects]" + this.getClass().getSimpleName() + "]- End isADSFileDownloadLogoDisplayed method");

		return this.isElementVisibleByXPath(IMG_LOGO_ADS);
	}

}
