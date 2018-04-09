package com.emergya.pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.emergya.selenium.drivers.EmergyaWebDriver;
import com.emergya.selenium.pageObject.BasePageObject;

public class JQueryUIEffectOptionPage extends BasePageObject {

	/**
	 * Logger class initialization.
	 */
	static Logger log = Logger.getLogger(GoogleMainPage.class);

	/**
	 * Items keys selectors.
	 */
	private static final String IMG_LOGO_JUI = "logoJUI";
	private static final String EFFECT_SIZE_OPTION = "effectSizeOption";
	private static final String EFFECT_RUN_BUTTON = "effectRunButton";
	// private static final String EFFECT_OPTION_BUTTON = "effectOptionButton";

	/**
	 * Constructor method
	 * 
	 * @param driver
	 *            selenium webdriver
	 */
	public JQueryUIEffectOptionPage(EmergyaWebDriver driver) {
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

		boolean status = this.isElementVisibleByXPath(IMG_LOGO_JUI);

		log.info("[log-PageObjects] " + this.getClass().getSimpleName() + " - End isReady method");

		return status;
	}

	/**
	 * This method click on JQuery UI Effect option button
	 * 
	 * @return
	 */
	public JQueryUIEffectOptionPage clickOnJUIEffectOptionButton() {
		log.info(
				"[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnJUIEffectOptionButton method");
		/*
		 * if (this.isElementVisibleByXPath(EFFECT_OPTION_BUTTON)) {
		 * this.getElementByXPath(EFFECT_OPTION_BUTTON).click(); }
		 */

		/*
		 * 
		 * This method use a By.name selector for dropdown Effect option
		 */
		if (driver.isElementDisplayed(By.name("effects"))) {
			driver.findElement(By.name("effects")).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnJUIEffectOptionButton method");
		return new JQueryUIEffectOptionPage(driver);
	}

	/**
	 * This method click on JQuery UI Effect Size option
	 * 
	 * @return
	 */
	public JQueryUIEffectOptionPage clickOnJUIEffectSizeOption() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnJUIEffectSizeOption method");

		if (this.isElementVisibleByXPath(EFFECT_SIZE_OPTION)) {
			this.getElementByXPath(EFFECT_SIZE_OPTION).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnJUIEffectSizeOption method");
		return new JQueryUIEffectOptionPage(driver);
	}

	/**
	 * This method click on JQuery UI Effect Run button
	 * 
	 * @return
	 */
	public JQueryUIEffectOptionPage clickOnJUIEffectRunButton() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnJUIEffectRunButton method");

		if (this.isElementVisibleById(EFFECT_RUN_BUTTON)) {
			this.getElementById(EFFECT_RUN_BUTTON).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnJUIEffectRunButton method");
		return new JQueryUIEffectOptionPage(driver);
	}

	/**
	 * This method change to Box frame
	 * 
	 * @return
	 */
	public JQueryUIDemosPage switchToBoxFrame() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start switchToBoxFrame method");

		WebElement iframe = driver.findElement(By.cssSelector(".demo-frame"));

		driver.switchTo().frame(iframe);

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End switchToBoxFrame method");
		return new JQueryUIDemosPage(driver);
	}

	/**
	 * This method check if JQuery UI Effect logo is displayed
	 */
	public boolean isJUIEffectLogoDisplayed() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start isJUIEffectLogoDisplayed method");
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End isJUIEffectLogoDisplayed method");

		return this.isElementVisibleByXPath(IMG_LOGO_JUI);
	}
}
