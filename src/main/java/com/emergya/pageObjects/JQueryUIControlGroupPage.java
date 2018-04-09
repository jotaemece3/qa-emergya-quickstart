package com.emergya.pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.emergya.selenium.drivers.EmergyaWebDriver;
import com.emergya.selenium.pageObject.BasePageObject;

public class JQueryUIControlGroupPage extends BasePageObject {

	/**
	 * Logger class initialization.
	 */
	static Logger log = Logger.getLogger(GoogleMainPage.class);

	/**
	 * Items keys selectors.
	 */
	private static final String IMG_LOGO_JUI = "logoJUI";
	// private static final String CONTROLGROUP_BUTTON = "controlGroupButton";
	private static final String COMPACT_CAR_FIRST_BOX_DROPDOWN = "compactCarFirstBox";
	private static final String MID_SIZE_OPTION = "midSizeOption";
	private static final String STANDARD_OPTION = "standardOption";
	private static final String INSURANCE_OPTION = "insuranceOption";
	private static final String UP_BUTTON = "upButton";
	private static final String COMPACT_CAR_SECOND_BOX_DROPDOWN = "compactCarSecondBox";
	private static final String FULL_SIZE_OPTION = "fullSizeOption";
	private static final String AUTOMATIC_OPTION = "automaticOption";
	private static final String UP_SECOND_BOX_BUTTON = "upSecondBoxButton";
	private static final String SEARCH_FIELD = "searchField";

	/**
	 * Constructor method
	 * 
	 * @param driver
	 *            selenium webdriver
	 */
	public JQueryUIControlGroupPage(EmergyaWebDriver driver) {
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
	 * This method Click on Controlgroup button
	 * 
	 * @return
	 */
	public JQueryUIControlGroupPage clickOnJUIControlGroupButton() {
		log.info(
				"[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnJUIControlGroupButton method");
		/*
		 * if (this.isElementVisibleByXPath(CONTROLGROUP_BUTTON)) {
		 * this.getElementByXPath(CONTROLGROUP_BUTTON).click(); }
		 */

		if (driver.isElementDisplayed(By.cssSelector("#sidebar > aside:nth-child(2) > ul > li:nth-child(5) > a"))) {
			driver.findElement(By.cssSelector("#sidebar > aside:nth-child(2) > ul > li:nth-child(5) > a")).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnJUIControlGroupButton method");
		return new JQueryUIControlGroupPage(driver);
	}

	/**
	 * This method Click on 'Compact Car' first box dropdown and deploy some options
	 * 
	 * @return
	 */
	public JQueryUIControlGroupPage clickOnJUICompactCarFirstBoxDropdown() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName()
				+ "]- Start clickOnJUICompactCarFirstBoxDropdown method");

		if (this.isElementVisibleByXPath(COMPACT_CAR_FIRST_BOX_DROPDOWN)) {
			this.getElementByXPath(COMPACT_CAR_FIRST_BOX_DROPDOWN).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName()
				+ "]- End clickOnJUICompactCarFirstBoxDropdown method");
		return new JQueryUIControlGroupPage(driver);
	}

	/**
	 * This method Select 'Mid Size' option
	 * 
	 * @return
	 */
	public JQueryUIControlGroupPage clickOnJUIMidSizeOption() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnJUIMidSizeOption method");

		if (this.isElementVisibleByXPath(MID_SIZE_OPTION)) {
			this.getElementByXPath(MID_SIZE_OPTION).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnJUIMidSizeOption method");
		return new JQueryUIControlGroupPage(driver);
	}

	/**
	 * This method Click on 'Standard' option
	 * 
	 * @return
	 */
	public JQueryUIControlGroupPage clickOnJUIStandardOption() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnJUIStandardOption method");

		if (this.isElementVisibleByXPath(STANDARD_OPTION)) {
			this.getElementByXPath(STANDARD_OPTION).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnJUIStandardOption method");
		return new JQueryUIControlGroupPage(driver);
	}

	/**
	 * This method Click on 'Insurance' option
	 * 
	 * @return
	 */
	public JQueryUIControlGroupPage clickOnJUIInsuranceOption() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnJUIInsuranceOption method");

		if (this.isElementVisibleByXPath(INSURANCE_OPTION)) {
			this.getElementByXPath(INSURANCE_OPTION).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnJUIInsuranceOption method");
		return new JQueryUIControlGroupPage(driver);
	}

	/**
	 * This method click on 'Up arrow' button
	 * 
	 * @return
	 */
	public JQueryUIControlGroupPage clickOnJUIUpButton() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnJUIUpButton method");

		if (this.isElementVisibleByXPath(UP_BUTTON)) {
			this.getElementByXPath(UP_BUTTON).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnJUIUpButton method");
		return new JQueryUIControlGroupPage(driver);
	}

	/**
	 * This method Click on 'Compact Car' second box dropdown
	 * 
	 * @return
	 */
	public JQueryUIControlGroupPage clickOnJUICompactCarSecondBox() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName()
				+ "]- Start clickOnJUICompactCarSecondBox method");

		if (this.isElementVisibleByXPath(COMPACT_CAR_SECOND_BOX_DROPDOWN)) {
			this.getElementByXPath(COMPACT_CAR_SECOND_BOX_DROPDOWN).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnJUICompactCarSecondBox method");
		return new JQueryUIControlGroupPage(driver);
	}

	/**
	 * This method Click on 'Full Size' option
	 * 
	 * @return
	 */
	public JQueryUIControlGroupPage clickOnJUIFullSizeOption() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnJUIFullSizeOption method");

		if (this.isElementVisibleByXPath(FULL_SIZE_OPTION)) {
			this.getElementByXPath(FULL_SIZE_OPTION).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnJUIFullSizeOption method");
		return new JQueryUIControlGroupPage(driver);
	}

	/**
	 * this method Click on 'Automatic' option
	 * 
	 * @return
	 */
	public JQueryUIControlGroupPage clickOnJUIAutomaticOption() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnJUIAutomaticOption method");

		if (this.isElementVisibleByXPath(AUTOMATIC_OPTION)) {
			this.getElementByXPath(AUTOMATIC_OPTION).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnJUIAutomaticOption method");
		return new JQueryUIControlGroupPage(driver);
	}

	/**
	 * This method SwitchTo Box frame
	 * 
	 * @return
	 */
	public JQueryUIControlGroupPage switchToBoxFrame() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start switchToBoxFrame method");

		WebElement iframe = driver.findElement(By.cssSelector(".demo-frame"));

		driver.switchTo().frame(iframe);

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End switchToBoxFrame method");
		return new JQueryUIControlGroupPage(driver);
	}

	/**
	 * This method Click on 'Up arrow' second box button
	 * 
	 * @return
	 */
	public JQueryUIControlGroupPage clickOnJUIUpSecondBoxButton() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnJUIUpSecondBoxButton method");

		if (this.isElementVisibleByXPath(UP_SECOND_BOX_BUTTON)) {
			this.getElementByXPath(UP_SECOND_BOX_BUTTON).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnJUIUpSecondBoxButton method");
		return new JQueryUIControlGroupPage(driver);
	}

	/**
	 * This method Click on Search field
	 * 
	 * @return
	 */
	public JQueryUIControlGroupPage clickOnJUISearchField() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnJUISearchField method");

		if (this.isElementVisibleByXPath(SEARCH_FIELD)) {
			this.getElementByXPath(SEARCH_FIELD).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnJUISearchField method");
		return new JQueryUIControlGroupPage(driver);
	}

	/**
	 * This method SwitchTo Default "frame"
	 * 
	 * @return
	 */
	public JQueryUIControlGroupPage switchToDefault() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start switchToDefault method");

		driver.switchTo().defaultContent();

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End switchToDefault method");
		return new JQueryUIControlGroupPage(driver);
	}

	/**
	 * This method check if JQuery UI Controlgroup logo is displayed
	 */
	public boolean isJUIControlGroupLogoDisplayed() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start isJUIControlGroupLogoDisplayed method");
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End isJUIControlGroupLogoDisplayed method");

		return this.isElementVisibleByXPath(IMG_LOGO_JUI);
	}
}
