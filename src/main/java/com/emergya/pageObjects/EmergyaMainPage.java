package com.emergya.pageObjects;

import org.apache.log4j.Logger;

import com.emergya.selenium.drivers.EmergyaWebDriver;
import com.emergya.selenium.pageObject.BasePageObject;

/**
 * A Page Object (PO) contain the behavior of a specific page in the application
 * EmergyaMainPage: This PO contain the methods to interact with the emergya
 * main page
 * 
 * @author Ivan Bermudez <ibermudez@emergya.com>
 * @author Jose Antonio Sanchez <jasanchez@emergya.com>
 * @author Ivan Gomez <igomez@emergya.com>
 */
public class EmergyaMainPage extends BasePageObject {

	/**
	 * Logger class initialization.
	 */
	static Logger log = Logger.getLogger(GoogleMainPage.class);

	/**
	 * Items keys selectors.
	 */
	private static final String IMG_LOGO_EMERGYA = "imgLogoEmergya";
	private static final String CONTACTO_BUTTON = "contactoButton";
	private static final String TOP_RIGHT_BUTTON = "topRightButton";

	/**
	 * Constructor method
	 * 
	 * @param driver
	 *            selenium webdriver
	 */
	public EmergyaMainPage(EmergyaWebDriver driver) {
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
	 * This method click on Contacto Button
	 * 
	 * @return
	 */
	public EmergyaMainPage clickOnEmergyaContactoPage() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnEmergyaContactoPage method");

		if (this.isElementVisibleByXPath(CONTACTO_BUTTON)) {
			this.getElementByXPath(CONTACTO_BUTTON).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnEmergyaContactoPage method");
		return new EmergyaMainPage(driver);
	}

	/**
	 * This method click on top right button
	 * 
	 * @return
	 */
	public EmergyaMainPage clickOnEmergyaTopRightButton() {
		log.info(
				"[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnEmergyaTopRightButton method");

		if (this.isElementVisibleByXPath(TOP_RIGHT_BUTTON)) {
			this.getElementByXPath(TOP_RIGHT_BUTTON).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnEmergyaTopRightButton method");
		return new EmergyaMainPage(driver);
	}

	/**
	 * Check if emergya logo is displayed
	 * 
	 * @return
	 */
	public boolean isEmergyaLogoDisplayed() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start isEmergyaLogoDisplayed method");
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End isEmergyaLogoDisplayed method");

		return this.isElementVisibleById(IMG_LOGO_EMERGYA);
	}

}
