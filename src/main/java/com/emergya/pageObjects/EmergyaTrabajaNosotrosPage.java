package com.emergya.pageObjects;

import org.apache.log4j.Logger;

import com.emergya.selenium.drivers.EmergyaWebDriver;
import com.emergya.selenium.pageObject.BasePageObject;

public class EmergyaTrabajaNosotrosPage extends BasePageObject {

	/**
	 * Logger class initialization.
	 */
	static Logger log = Logger.getLogger(GoogleMainPage.class);

	/**
	 * Items keys selectors.
	 */
	private static final String IMG_LOGO_EMERGYA = "imgLogoEmergya";
	private static final String TITLE = "trabajanosotrosTitle";
	private static final String FIRST_OPTION = "firstOption";

	/**
	 * Constructor method
	 * 
	 * @param driver
	 *            selenium webdriver
	 */
	public EmergyaTrabajaNosotrosPage(EmergyaWebDriver driver) {
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
	 * This method select the first option(Experto en Javascript) and click it
	 * 
	 * @return
	 */
	public EmergyaContactPage clickOnEmergyaFirstOption() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnEmergyaFirstOption method");

		if (this.isElementVisibleByXPath(FIRST_OPTION)) {
			this.getElementByXPath(FIRST_OPTION).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnEmergyaFirstOption method");
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
	 * This method check if Emergya Title is displayed
	 */
	public boolean isEmergyaTitleDisplayed() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start isEmergyaTitleDisplayed method");
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End isEmergyaTitleDisplayed method");

		return this.isElementVisibleByXPath(TITLE);
	}
}
