package com.emergya.pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.emergya.selenium.drivers.EmergyaWebDriver;
import com.emergya.selenium.pageObject.BasePageObject;

public class JQueryUIDatepickerPage extends BasePageObject {

	/**
	 * Logger class initialization.
	 */
	static Logger log = Logger.getLogger(GoogleMainPage.class);

	/**
	 * Items keys selectors.
	 */
	private static final String IMG_LOGO_JUI = "logoJUI";
	private static final String DATE_FIELD = "dateField";
	private static final String DATEPICKER_BUTTON = "datapickerButton";
	private static final String RIGHT_ARROW_CALENDAR_BUTTON = "rightArrowCalendarButton";
	private static final String DAY_11_BUTTON = "day11Button";

	/**
	 * Constructor method
	 * 
	 * @param driver
	 *            selenium webdriver
	 */
	public JQueryUIDatepickerPage(EmergyaWebDriver driver) {
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
	 * This method Click on Datepicker button
	 * 
	 * @return
	 */
	public JQueryUIDatepickerPage clickOnJUIDatepickerButton() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName()
				+ "]- Start clickOnJUIDatepickerButton method");

		if (this.isElementVisibleByXPath(DATEPICKER_BUTTON)) {
			this.getElementByXPath(DATEPICKER_BUTTON).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName()
				+ "]- End clickOnJUIDatepickerButton method");
		return new JQueryUIDatepickerPage(driver);
	}

	/**
	 * This method Click on 'Date' field
	 * 
	 * @return
	 */
	public JQueryUIDatepickerPage clickOnJUIDateField() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName()
				+ "]- Start clickOnJUIDateField method");

		if (this.isElementVisibleById(DATE_FIELD)) {
			this.getElementById(DATE_FIELD).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName()
				+ "]- End clickOnJUIDateField method");
		return new JQueryUIDatepickerPage(driver);
	}

	/**
	 * This method Click on 'Right arrow' calendar button
	 * 
	 * @return
	 */
	public JQueryUIDatepickerPage clickOnJUIRightArrowCalendarButton() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName()
				+ "]- Start clickOnJUIRightArrowCalendarButton method");

		if (this.isElementVisibleByXPath(RIGHT_ARROW_CALENDAR_BUTTON)) {
			this.getElementByXPath(RIGHT_ARROW_CALENDAR_BUTTON).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName()
				+ "]- End clickOnJUIRightArrowCalendarButton method");
		return new JQueryUIDatepickerPage(driver);
	}

	/**
	 * This method Select '11' day button
	 * 
	 * @return
	 */
	public JQueryUIDatepickerPage clickOnJUIDay11Button() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName()
				+ "]- Start clickOnJUIDay11Button method");

		if (this.isElementVisibleByXPath(DAY_11_BUTTON)) {
			this.getElementByXPath(DAY_11_BUTTON).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName()
				+ "]- End clickOnJUIDay11Button method");
		return new JQueryUIDatepickerPage(driver);
	}

	/**
	 * This method SwitchTo Box frame
	 * 
	 * @return
	 */
	public JQueryUIDatepickerPage switchToBoxFrame() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start switchToBoxFrame method");

		WebElement iframe = driver.findElement(By.cssSelector(".demo-frame"));

		driver.switchTo().frame(iframe);

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End switchToBoxFrame method");
		return new JQueryUIDatepickerPage(driver);
	}

	/**
	 * This method check if JQuery UI Datepicker logo is displayed
	 */
	public boolean isJUIDatepickerLogoDisplayed() {
		log.info(
				"[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start isJUIDatepickerLogoDisplayed method");
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End isJUIDatepickerLogoDisplayed method");

		return this.isElementVisibleByXPath(IMG_LOGO_JUI);
	}
}
