package com.emergya.pageObjects;

import org.apache.log4j.Logger;

import com.emergya.selenium.drivers.EmergyaWebDriver;
import com.emergya.selenium.pageObject.BasePageObject;

public class EmergyaContactPage extends BasePageObject {

	/**
	 * Logger class initialization.
	 */
	static Logger log = Logger.getLogger(GoogleMainPage.class);

	/**
	 * Items keys selectors.
	 */
	private static final String IMG_LOGO_EMERGYA = "imgLogoEmergya";
	private static final String SEVILLA_ADDRESS = "sevillaAddress";
	private static final String TOP_RIGHT_BUTTON = "topRightButton";
	private static final String TRABAJA_NOSOTROS_BUTTON = "trabajaNosotros";

	/**
	 * Constructor method
	 * 
	 * @param driver
	 *            selenium webdriver
	 */
	public EmergyaContactPage(EmergyaWebDriver driver) {
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

		boolean status = this.isElementVisibleById(IMG_LOGO_EMERGYA);

		log.info("[log-PageObjects] " + this.getClass().getSimpleName() + " - End isReady method");

		return status;
	}

	/**
	 * This method click on Top right button
	 * 
	 * 
	 * @return
	 */
	public EmergyaContactPage clickOnEmergyaTopRightButton() {
		log.info(
				"[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnEmergyaTopRightButton method");

		if (this.isElementVisibleByXPath(TOP_RIGHT_BUTTON)) {
			this.getElementByXPath(TOP_RIGHT_BUTTON).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnEmergyaTopRightButton method");
		return new EmergyaContactPage(driver);
	}

	/**
	 * This method click on Trabaja con nosotros button
	 * 
	 * @return
	 */
	public EmergyaContactPage clickOnEmergyaTrabajaNosotrosButton() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName()
				+ "]- Start clickOnEmergyaTrabajaNosotrosButton method");

		if (this.isElementVisibleByXPath(TRABAJA_NOSOTROS_BUTTON)) {
			this.getElementByXPath(TRABAJA_NOSOTROS_BUTTON).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName()
				+ "]- End clickOnEmergyaTrabajaNosotrosButton method");
		return new EmergyaContactPage(driver);
	}

	/**
	 * This method check if Emergya logo is displayed
	 */
	public boolean isEmergyaLogoDisplayed() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start isEmergyaLogoDisplayed method");
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End isEmergyaLogoDisplayed method");

		return this.isElementVisibleById(IMG_LOGO_EMERGYA);
	}

	/**
	 * This method check if Emergya Sevilla Address logo is displayed
	 */
	public boolean isEmergyaSevillaAddressDisplayed() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName()
				+ "]- Start isEmergyaSevillaAddressDisplayed method");
		log.info("[log-pageObjects]" + this.getClass().getSimpleName()
				+ "]- End isEmergyaSevillaAddressDisplayed method");

		return this.isElementVisibleByXPath(SEVILLA_ADDRESS);
	}
}
