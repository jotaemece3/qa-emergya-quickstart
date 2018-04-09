package com.emergya.pageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Set;
import java.awt.event.InputEvent;

import org.apache.log4j.Logger;

import org.openqa.selenium.NoAlertPresentException;

import com.emergya.selenium.drivers.EmergyaWebDriver;
import com.emergya.selenium.pageObject.BasePageObject;

public class DezLearnTestPage extends BasePageObject {
	/**
	 * Logger class initialization.
	 */
	static Logger log = Logger.getLogger(GoogleMainPage.class);

	/**
	 * Items keys selectors.
	 */
	private static final String IMG_LOGO_DEZLEARN = "logoDezLearn";
	private static final String POPUP_BUTTON = "popUpButton";
	private static final String ALERT_BUTTON = "alertButton";
	private static final String CONFIRM_SEAT_BUTTON = "confirmSeatButton";
	private static final String CAPTCHA_BUTTON = "captchaButton";

	/**
	 * Constructor method
	 * 
	 * @param driver
	 *            selenium webdriver
	 */
	public DezLearnTestPage(EmergyaWebDriver driver) {
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

		boolean status = this.isElementVisibleByXPath(IMG_LOGO_DEZLEARN);

		log.info("[log-PageObjects] " + this.getClass().getSimpleName() + " - End isReady method");

		return status;
	}

	/**
	 * This method click on Popup button
	 * 
	 * @return
	 */
	public DezLearnMainPage clickOnPopUpButton() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnPopUpButton method");

		if (this.isElementVisibleByXPath(POPUP_BUTTON)) {
			this.getElementByXPath(POPUP_BUTTON).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnPopUpButton method");
		return new DezLearnMainPage(driver);
	}

	/**
	 * This method click on alert button
	 * 
	 * @return
	 */
	public DezLearnMainPage clickOnAlertButton() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnADSMaleOption method");

		if (this.isElementVisibleByXPath(ALERT_BUTTON)) {
			this.getElementByXPath(ALERT_BUTTON).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnADSMaleOption method");
		return new DezLearnMainPage(driver);
	}

	/**
	 * This method click on confirm seat button
	 * 
	 * @return
	 */
	public DezLearnMainPage clickOnConfirmSeatButton() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnADSMaleOption method");

		if (this.isElementVisibleByXPath(CONFIRM_SEAT_BUTTON)) {
			this.getElementByXPath(CONFIRM_SEAT_BUTTON).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnADSMaleOption method");
		return new DezLearnMainPage(driver);
	}

	/**
	 * This method click on captcha button
	 * 
	 * @return
	 */
	public DezLearnMainPage clickOnCaptchaButton() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnCaptchaButton method");

		// this.scrollTo(driver.findElementByXPath(CAPTCHA_BUTTON));

		if (this.isElementVisibleById(CAPTCHA_BUTTON)) {
			this.getElementById(CAPTCHA_BUTTON).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnCaptchaButton method");
		return new DezLearnMainPage(driver);
	}

	/**
	 * This method change to new window and then close it and back to the main
	 * window
	 * 
	 */
	public void SwitchTabandClose() {
		Set<String> windows = driver.getWindowHandles();
		String mainwindow = driver.getWindowHandle();

		for (String handle : windows) {
			driver.switchTo().window(handle);
			// System.out.println("switched to "+driver.getTitle()+" Window");
			String pagetitle = driver.getTitle();
			if (pagetitle.equalsIgnoreCase("Google")) {
				driver.close();
				// System.out.println("Closed the '"+pagetitle+"' Tab now ...");
			}
		}

		driver.switchTo().window(mainwindow);
	}

	/**
	 * This method run a robot that do a scroll and click on captcha button
	 * 
	 * @throws Exception
	 */
	public void scrollToCaptcha() throws Exception {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start scrollToCaptcha method");

		Robot rb = new Robot();

		rb.mouseMove(3439, 832);
		driver.sleep(1);
		rb.mousePress(InputEvent.BUTTON1_MASK);

		rb.mouseMove(3436, 1046);
		rb.mouseRelease(InputEvent.BUTTON1_MASK);

		rb.mouseMove(2938, 854);
		driver.sleep(1);
		rb.mousePress(InputEvent.BUTTON1_MASK);
		rb.mouseRelease(InputEvent.BUTTON1_MASK);

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End scrollToCaptcha method");
	}

	/**
	 * This method check that alert is present
	 * 
	 * @return
	 */
	public boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}

	/**
	 * This method accept the alert
	 * 
	 * @throws AWTException
	 * @throws InterruptedException
	 */
	public void acceptAlertWindow() throws AWTException, InterruptedException {

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start acceptAlertWindow method");

		Robot rb = new Robot();

		rb.mouseMove(3021, 596);
		driver.sleep(1);
		rb.mousePress(InputEvent.BUTTON1_MASK);
		rb.mouseRelease(InputEvent.BUTTON1_MASK);

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End acceptAlertWindow method");
	}

	/**
	 * This method accept the alert from confirm seat
	 * 
	 * @throws AWTException
	 * @throws InterruptedException
	 */
	public void acceptConfirmSeatWindow() throws AWTException, InterruptedException {

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start acceptConfirmSeatWindow method");

		Robot rb = new Robot();

		rb.mouseMove(3061, 612);
		driver.sleep(1);
		rb.mousePress(InputEvent.BUTTON1_MASK);
		rb.mouseRelease(InputEvent.BUTTON1_MASK);

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End acceptConfirmSeatWindow method");
	}

	/**
	 * This method check if Dezlearn Test logo is displayed
	 */
	public boolean isDezLearnLogoDisplayed() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start isDezLearnLogoDisplayed method");
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End isDezLearnLogoDisplayed method");

		return this.isElementVisibleByXPath(IMG_LOGO_DEZLEARN);
	}
}
