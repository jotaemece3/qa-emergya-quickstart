package com.emergya.pageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;

import com.emergya.selenium.drivers.EmergyaWebDriver;
import com.emergya.selenium.pageObject.BasePageObject;

public class AutomationDemoSiteSwitchToAlertPage extends BasePageObject {

	/**
	 * Logger class initialization.
	 */
	static Logger log = Logger.getLogger(GoogleMainPage.class);

	/**
	 * Items keys selectors.
	 */
	private static final String IMG_LOGO_ADS = "logoADS";
	private static final String OK_BUTTON = "okButton";
	private static final String OK_CANCEL_OPTION_BUTTON = "okCancelOptionButton";
	private static final String OK_CANCEL_BUTTON = "okCancelButton";
	private static final String TEXTBOX_OPTION_BUTTON = "textBoxOptionButton";
	private static final String TEXTBOX_BUTTON = "textBoxButton";

	/**
	 * Constructor method
	 * 
	 * @param driver
	 *            selenium webdriver
	 */
	public AutomationDemoSiteSwitchToAlertPage(EmergyaWebDriver driver) {
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

		boolean status = this.isElementVisibleByXPath(IMG_LOGO_ADS);

		log.info("[log-PageObjects] " + this.getClass().getSimpleName() + " - End isReady method");

		return status;
	}

	/**
	 * This method click on OK Alert
	 * 
	 * @return
	 */
	public AutomationDemoSiteSwitchToAlertPage clickOnADSOKAlert() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnADSOKAlert method");

		if (this.isElementVisibleByXPath(OK_BUTTON)) {
			this.getElementByXPath(OK_BUTTON).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnADSOKAlert method");
		return new AutomationDemoSiteSwitchToAlertPage(driver);
	}

	/**
	 * This method click on OKCancel option button
	 * 
	 * @return
	 */
	public AutomationDemoSiteRegisterPage clickOnADSOKCancelOptionButton() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName()
				+ "]- Start clickOnADSOKCancelOptionButton method");

		if (this.isElementVisibleByXPath(OK_CANCEL_OPTION_BUTTON)) {
			this.getElementByXPath(OK_CANCEL_OPTION_BUTTON).click();
		}

		log.info(
				"[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnADSOKCancelOptionButton method");
		return new AutomationDemoSiteRegisterPage(driver);
	}

	/**
	 * This method click on OKCancel Alert
	 * 
	 * @return
	 */
	public AutomationDemoSiteRegisterPage clickOnADSOKCancelalert() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnADSOKCancelalert method");

		if (this.isElementVisibleByXPath(OK_CANCEL_BUTTON)) {
			this.getElementByXPath(OK_CANCEL_BUTTON).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnADSOKCancelalert method");
		return new AutomationDemoSiteRegisterPage(driver);
	}

	/**
	 * This method click on TextBox option button
	 * 
	 * @return
	 */
	public AutomationDemoSiteRegisterPage clickOnADSTextBoxOptionButton() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName()
				+ "]- Start clickOnADSTextBoxOptionButton method");

		if (this.isElementVisibleByXPath(TEXTBOX_OPTION_BUTTON)) {
			this.getElementByXPath(TEXTBOX_OPTION_BUTTON).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnADSTextBoxOptionButton method");
		return new AutomationDemoSiteRegisterPage(driver);
	}

	/**
	 * This method click on TextBox Alert
	 * 
	 * @return
	 */
	public AutomationDemoSiteRegisterPage clickOnADSTextBoxAlert() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnADSTextBoxAlert method");

		if (this.isElementVisibleByXPath(TEXTBOX_BUTTON)) {
			this.getElementByXPath(TEXTBOX_BUTTON).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnADSTextBoxAlert method");
		return new AutomationDemoSiteRegisterPage(driver);
	}

	/**
	 * This method run a robot that click on buttons and accept the alerts.
	 * 
	 * @throws AWTException
	 * @throws InterruptedException
	 */
	public void enterRobotOK() throws AWTException, InterruptedException {

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start enterRobotOK method");

		Robot rb = new Robot();

		rb.mouseMove(2408, 242);
		rb.mousePress(InputEvent.BUTTON1_MASK);
		rb.mouseRelease(InputEvent.BUTTON1_MASK);

		driver.sleep(5);

		Alert alert = driver.switchTo().alert();

		driver.sleep(1);
		alert.accept();

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End enterRobotOK method");
	}

	/**
	 * This method run a robot that click on buttons and accept the alerts.
	 * 
	 * @throws AWTException
	 * @throws Exception
	 */
	public void enterRobotOKCancel() throws AWTException, Exception {

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start enterRobotOKCancel method");


		Robot rb = new Robot();

		rb.delay(250);
		driver.sleep(1);
		rb.mouseMove(2416, 236);
		rb.mousePress(InputEvent.BUTTON1_MASK);
		rb.mouseRelease(InputEvent.BUTTON1_MASK);
		driver.sleep(1);

		rb.mouseMove(2879, 204);
		rb.mousePress(InputEvent.BUTTON1_MASK);
		rb.mouseRelease(InputEvent.BUTTON1_MASK);

		rb.delay(250);

		driver.sleep(1);
		
		Alert alert = driver.switchTo().alert();

		driver.sleep(1);
		alert.accept();

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End enterRobotOKCancel method");

	}

	/**
	 * This method run a robot that click on buttons and accept the alerts.
	 * 
	 * @throws AWTException
	 * @throws Exception
	 */
	public void textBoxRobot() throws AWTException, Exception {

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start textBoxRobot method");

		StringSelection ss = new StringSelection("José Manuel");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		Robot rb = new Robot();
		
		rb.mouseMove(2409, 282);
		rb.mousePress(InputEvent.BUTTON1_MASK);
		rb.mouseRelease(InputEvent.BUTTON1_MASK);
		rb.delay(250);

		rb.delay(250);
		rb.mouseMove(2857, 205);
		rb.mousePress(InputEvent.BUTTON1_MASK);
		rb.mouseRelease(InputEvent.BUTTON1_MASK);
		rb.delay(250);

		Alert alert = driver.switchTo().alert();

		alert.sendKeys("Jose Manuel");
		driver.sleep(1);
		alert.accept();

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End textBoxRobot method");

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
	 * This method check if Automation Demo Site SwitchTo Alert logo is displayed
	 */
	public boolean isADSSwitchToAlertLogoDisplayed() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName()
				+ "]- Start isADSSwitchToAlertLogoDisplayed method");
		log.info("[log-pageObjects]" + this.getClass().getSimpleName()
				+ "]- End isADSSwitchToAlertLogoDisplayed method");

		return this.isElementVisibleByXPath(IMG_LOGO_ADS);
	}
}
