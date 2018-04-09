package com.emergya.pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.emergya.selenium.drivers.EmergyaWebDriver;
import com.emergya.selenium.pageObject.BasePageObject;

public class JQueryUISpinnerMapPage extends BasePageObject {

	/**
	 * Logger class initialization.
	 */
	static Logger log = Logger.getLogger(GoogleMainPage.class);

	/**
	 * Items keys selectors.
	 */
	private static final String IMG_LOGO_JUI = "logoJUI";
	private static final String LATITUDE_FIELD = "latitudeField";
	private static final String LONGITUDE_FIELD = "longitudeField";


	/**
	 * Constructor method
	 * 
	 * @param driver
	 *            selenium webdriver
	 */
	public JQueryUISpinnerMapPage(EmergyaWebDriver driver) {
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
	 * This method click on Spinner button
	 * 
	 * @return
	 */
	public JQueryUISpinnerMapPage clickOnJUISpinnerButton() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnJUIDemosButton method");

		driver.findElement(By.cssSelector("#sidebar > aside:nth-child(2) > ul > li:nth-child(12) > a")).click();

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnJUIDemosButton method");
		return new JQueryUISpinnerMapPage(driver);
	}

	/**
	 * This method click on "Map" button
	 * 
	 * @return
	 */
	public JQueryUISpinnerMapPage clickOnJUISpinnerMapButton() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnJUIDemosButton method");

		driver.findElement(By.cssSelector("#content > div.demo-list > ul > li:nth-child(4) > a")).click();

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnJUIDemosButton method");
		return new JQueryUISpinnerMapPage(driver);
	}

	/**
	 * This method write on latitude field.
	 * 
	 * @param stringSearch
	 */
	public void latitudeField(String stringSearch) {
		log.info("[log-" + this.getClass().getSimpleName() + "]- Start lastNameRegister -["
				+ this.getClass().getSimpleName() + "- method]");

		this.getElementByXPath(LATITUDE_FIELD).clear();

		if (this.isElementVisibleByXPath(LATITUDE_FIELD)) {
			this.getElementByXPath(LATITUDE_FIELD).sendKeys(stringSearch);

		}

		log.info("[log-" + this.getClass().getSimpleName() + "]- End lastNameRegister -["
				+ this.getClass().getSimpleName() + "- method]");
	}

	/**
	 * This method write on longitude field.
	 * 
	 * @param stringSearch
	 */
	public void longitudeField(String stringSearch) {
		log.info("[log-" + this.getClass().getSimpleName() + "]- Start lastNameRegister -["
				+ this.getClass().getSimpleName() + "- method]");

		this.getElementByXPath(LONGITUDE_FIELD).clear();

		if (this.isElementVisibleByXPath(LONGITUDE_FIELD)) {
			this.getElementByXPath(LONGITUDE_FIELD).sendKeys(stringSearch);

		}

		log.info("[log-" + this.getClass().getSimpleName() + "]- End lastNameRegister -["
				+ this.getClass().getSimpleName() + "- method]");
	}

	/**
	 * This method change to box frame
	 * 
	 * @return
	 */
	public JQueryUISpinnerMapPage switchToBoxFrame() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start switchToBoxFrame method");

		WebElement iframe = driver.findElement(By.cssSelector(".demo-frame"));

		driver.switchTo().frame(iframe);

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End switchToBoxFrame method");
		return new JQueryUISpinnerMapPage(driver);
	}

	/**
	 * This method check if JQuery UI Spinner Map logo is displayed
	 */
	public boolean isJUISpinnerMapLogoDisplayed() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start isJUIResizableLogoDisplayed method");
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End isJUIResizableLogoDisplayed method");

		return this.isElementVisibleByXPath(IMG_LOGO_JUI);
	}
}
