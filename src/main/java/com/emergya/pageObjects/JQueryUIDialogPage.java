package com.emergya.pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.emergya.selenium.drivers.EmergyaWebDriver;
import com.emergya.selenium.pageObject.BasePageObject;

public class JQueryUIDialogPage extends BasePageObject {

	/**
	 * Logger class initialization.
	 */
	static Logger log = Logger.getLogger(GoogleMainPage.class);

	/**
	 * Items keys selectors.
	 */
	private static final String IMG_LOGO_JUI = "logoJUI";
	private static final String CREATE_USER_BUTTON = "createUserButton";
	private static final String NAME_FIELD = "nameField";
	private static final String EMAIL_FIELD = "emailField";
	private static final String PASS_FIELD = "password";
	private static final String CREATE_ACC_BUTTON = "createAcc";

	/**
	 * Constructor method
	 * 
	 * @param driver
	 *            selenium webdriver
	 */
	public JQueryUIDialogPage(EmergyaWebDriver driver) {
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
	 * This method Click on Dialog button
	 * 
	 * @return
	 */
	public JQueryUIDialogPage clickOnJUIDialogButton() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnJUIDemosButton method");

		driver.findElement(By.cssSelector("#sidebar > aside:nth-child(2) > ul > li:nth-child(7) > a")).click();

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnJUIDemosButton method");
		return new JQueryUIDialogPage(driver);
	}

	/**
	 * This method Click on Modal form button
	 * 
	 * @return
	 */
	public JQueryUIDialogPage clickOnJUIModalDialogButton() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnJUIDemosButton method");

		driver.findElement(By.cssSelector("#content > div.demo-list > ul > li:nth-child(4) > a")).click();

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnJUIDemosButton method");
		return new JQueryUIDialogPage(driver);
	}

	/**
	 * This method Click on Create User Button
	 * 
	 * @return
	 */
	public JQueryUIDialogPage clickOnJUICreateUserButton() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnJUIDemosButton method");

		if (this.isElementVisibleByXPath(CREATE_USER_BUTTON)) {
			this.getElementByXPath(CREATE_USER_BUTTON).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnJUIDemosButton method");
		return new JQueryUIDialogPage(driver);
	}

	/**
	 * This method write on name field.
	 * 
	 * @param stringSearch
	 */
	public void nameField(String stringSearch) {
		log.info("[log-" + this.getClass().getSimpleName() + "]- Start lastNameRegister -["
				+ this.getClass().getSimpleName() + "- method]");

		this.getElementByXPath(NAME_FIELD).clear();

		if (this.isElementVisibleByXPath(NAME_FIELD)) {
			this.getElementByXPath(NAME_FIELD).sendKeys(stringSearch);

		}

		log.info("[log-" + this.getClass().getSimpleName() + "]- End lastNameRegister -["
				+ this.getClass().getSimpleName() + "- method]");
	}

	/**
	 * This method write on email field.
	 * 
	 * @param stringSearch
	 */
	public void emailField(String stringSearch) {
		log.info("[log-" + this.getClass().getSimpleName() + "]- Start lastNameRegister -["
				+ this.getClass().getSimpleName() + "- method]");

		this.getElementByXPath(EMAIL_FIELD).clear();

		if (this.isElementVisibleByXPath(EMAIL_FIELD)) {
			this.getElementByXPath(EMAIL_FIELD).sendKeys(stringSearch);

		}

		log.info("[log-" + this.getClass().getSimpleName() + "]- End lastNameRegister -["
				+ this.getClass().getSimpleName() + "- method]");
	}

	/**
	 * This method write on password field.
	 * 
	 * @param stringSearch
	 */
	public void passField(String stringSearch) {
		log.info("[log-" + this.getClass().getSimpleName() + "]- Start lastNameRegister -["
				+ this.getClass().getSimpleName() + "- method]");

		this.getElementByXPath(PASS_FIELD).clear();

		if (this.isElementVisibleByXPath(PASS_FIELD)) {
			this.getElementByXPath(PASS_FIELD).sendKeys(stringSearch);

		}

		log.info("[log-" + this.getClass().getSimpleName() + "]- End lastNameRegister -["
				+ this.getClass().getSimpleName() + "- method]");
	}

	/**
	 * This method Click on Create New User button
	 * 
	 * @return
	 */
	public JQueryUIDialogPage clickOnJUICreateAccButton() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnJUIDemosButton method");

		if (this.isElementVisibleByXPath(CREATE_ACC_BUTTON)) {
			this.getElementByXPath(CREATE_ACC_BUTTON).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnJUIDemosButton method");
		return new JQueryUIDialogPage(driver);
	}

	/**
	 * This method switch to box frame
	 * 
	 * @return
	 */
	public JQueryUIDialogPage switchToBoxFrame() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start switchToBoxFrame method");

		WebElement iframe = driver.findElement(By.cssSelector(".demo-frame"));

		driver.switchTo().frame(iframe);

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End switchToBoxFrame method");
		return new JQueryUIDialogPage(driver);
	}

	/**
	 * This method check if JQuery UI Dialog logo is displayed
	 */
	public boolean isJUIDialogLogoDisplayed() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start isJUIResizableLogoDisplayed method");
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End isJUIResizableLogoDisplayed method");

		return this.isElementVisibleByXPath(IMG_LOGO_JUI);
	}
}
