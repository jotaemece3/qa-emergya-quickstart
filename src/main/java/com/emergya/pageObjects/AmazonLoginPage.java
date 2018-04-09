package com.emergya.pageObjects;

import org.apache.log4j.Logger;

import com.emergya.selenium.drivers.EmergyaWebDriver;
import com.emergya.selenium.pageObject.BasePageObject;

public class AmazonLoginPage extends BasePageObject {

	/**
	 * Logger class initialization.
	 */
	static Logger log = Logger.getLogger(GoogleMainPage.class);

	private static final String IMG_LOGO_AMAZON = "imgLogoAmazon";
	private static final String EMAIL_FIELD = "emailField";
	private static final String LOGIN_BUTTON = "loginButton";
	// private static final String IMG_LOGO_AMAZON2 = "imgLogoAmazon2";

	public AmazonLoginPage(EmergyaWebDriver driver) {
		super(driver);
	}

	@Override
	public boolean isReady() {
		log.info("[log-PageObjects] " + this.getClass().getSimpleName() + " - Start isReady method");

		// boolean status = this.isElementVisibleById(IMG_LOGO_AMAZON);

		boolean status = this.isElementVisibleById(IMG_LOGO_AMAZON);

		log.info("[log-PageObjects] " + this.getClass().getSimpleName() + " - End isReady method");

		return status;
	}

	/**
	 * This method write a String in Email_Field
	 * 
	 * @param stringSearch
	 */
	public void doLogin(String stringSearch) {
		log.info("[log-" + this.getClass().getSimpleName() + "]- Start doLogin -[" + this.getClass().getSimpleName()
				+ "- method]");

		if (this.isElementVisibleById(EMAIL_FIELD)) {
			this.getElementById(EMAIL_FIELD).sendKeys(stringSearch);
		}

		log.info("[log-" + this.getClass().getSimpleName() + "]- End doLogin -[" + this.getClass().getSimpleName()
				+ "- method]");
	}

	
	/**
	 * This method do click on LogIn button
	 * 
	 * @return
	 */
	public AmazonLoginPage logIn() {
		log.info("[log-" + this.getClass().getSimpleName() + "]- Start logIn -[" + this.getClass().getSimpleName()
				+ "- method]");

		this.getElementById(LOGIN_BUTTON).click();

		log.info("[log-" + this.getClass().getSimpleName() + "]- End logIn -[" + this.getClass().getSimpleName()
				+ "- method]");
		return new AmazonLoginPage(driver);
	}

	/**
	 * This method go back to the previous page
	 */
	public void doBack() {
		driver.navigate().back();
	}

	/**
	 * This method check Amazon Logo Login is Displayed
	 * 
	 * @return
	 */
	public boolean isAmazonLogoLoginDisplayed() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start isAmazonLogoLoginDisplayed method");
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End isAmazonLogoLoginDisplayed method");

		return this.isElementVisibleById(IMG_LOGO_AMAZON);
	}

}
