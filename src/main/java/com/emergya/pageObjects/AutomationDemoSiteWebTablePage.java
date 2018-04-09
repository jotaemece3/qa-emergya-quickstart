package com.emergya.pageObjects;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import com.emergya.selenium.drivers.EmergyaWebDriver;
import com.emergya.selenium.pageObject.BasePageObject;

public class AutomationDemoSiteWebTablePage extends BasePageObject {
	/**
	 * Logger class initialization.
	 */
	static Logger log = Logger.getLogger(GoogleMainPage.class);

	/**
	 * Items keys selectors.
	 */
	private static final String IMG_LOGO_ADS = "logoADS";
	private static final String WEBTABLE_BUTTON = "webTableButton";
	private static final String DELETE_BUTTON = "deleteButton";

	/**
	 * Constructor method
	 * 
	 * @param driver
	 *            selenium webdriver
	 */
	public AutomationDemoSiteWebTablePage(EmergyaWebDriver driver) {
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
	 * This method click on WebTable button
	 * 
	 * @return
	 */
	public AutomationDemoSiteRegisterPage clickOnADSWebTableButton() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnADSWebTableButton method");

		if (this.isElementVisibleByXPath(WEBTABLE_BUTTON)) {
			this.getElementByXPath(WEBTABLE_BUTTON).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnADSWebTableButton method");
		return new AutomationDemoSiteRegisterPage(driver);
	}

	/**
	 * This method click on WebTable write button
	 * 
	 * @return
	 */
	public AutomationDemoSiteRegisterPage clickOnADSWebTableWriteButton() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName()
				+ "]- Start clickOnADSWebTableWriteButton method");

		Actions actions = new Actions(driver);
		actions.moveToElement(this.getElementByXPath(DELETE_BUTTON)).click().build().perform();

		/*
		 * if (this.isElementVisibleByXPath(WRITE_BUTTON)) {
		 * this.getElementByXPath(WRITE_BUTTON).click(); }
		 */
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnADSWebTableWriteButton method");
		return new AutomationDemoSiteRegisterPage(driver);
	}

	/**
	 * This method click on WebTable delete button
	 * 
	 * @return
	 */
	public AutomationDemoSiteRegisterPage clickOnADSWebTableDeleteButton() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName()
				+ "]- Start clickOnADSWebTableDeleteButton method");

		if (driver.isElementDisplayed(By.cssSelector(".btn btn-danger btn-xs"))) {
			driver.findElement(By.cssSelector(".btn btn-danger btn-xs")).click();
		}
		/*
		 * if (this.isElementVisibleByXPath(DELETE_BUTTON)) {
		 * this.getElementByXPath(DELETE_BUTTON).click(); }
		 */
		log.info(
				"[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnADSWebTableDeleteButton method");
		return new AutomationDemoSiteRegisterPage(driver);
	}

	/**
	 * This method run a robot that delete data from WebTable
	 * 
	 * @throws Exception
	 */
	public void deleteData() throws Exception {

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start deleteData method");

		StringSelection ss = new StringSelection(
				"/home/jmcaceres/proyectos/qa-emergya-quickstart/src/main/resources/files/capt.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		Robot rb = new Robot();

		rb.mouseMove(3328, 333);

		driver.sleep(3);

		rb.mousePress(InputEvent.BUTTON3_MASK);
		rb.mouseRelease(InputEvent.BUTTON3_MASK);

		rb.keyPress(java.awt.event.KeyEvent.VK_TAB);
		rb.keyRelease(java.awt.event.KeyEvent.VK_TAB);

		driver.sleep(2);

		rb.keyPress(java.awt.event.KeyEvent.VK_ENTER);
		rb.delay(500);
		rb.keyRelease(java.awt.event.KeyEvent.VK_ENTER);

		// Accept the alert
		Alert alert = driver.switchTo().alert();
		driver.sleep(2);
		alert.accept();

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End deleteData method");

	}

	/**
	 * This method run a robot that modify data from Webtable
	 * 
	 * @throws Exception
	 */
	public void modifyNameData() throws Exception {

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start modifyData method");

		StringSelection ss = new StringSelection("maria2@gmail.com");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		Robot rb = new Robot();

		rb.mouseMove(3289, 307);
		rb.delay(500);

		rb.mousePress(InputEvent.BUTTON1_MASK);
		rb.mouseRelease(InputEvent.BUTTON1_MASK);
		rb.mousePress(InputEvent.BUTTON1_MASK);
		rb.mouseRelease(InputEvent.BUTTON1_MASK);

		rb.delay(500);
		rb.mouseMove(2449, 298);
		rb.delay(500);
		rb.mousePress(InputEvent.BUTTON1_MASK);
		rb.mouseRelease(InputEvent.BUTTON1_MASK);
		rb.mousePress(InputEvent.BUTTON1_MASK);
		rb.mouseRelease(InputEvent.BUTTON1_MASK);

		rb.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
		rb.keyPress(java.awt.event.KeyEvent.VK_A);
		rb.keyRelease(java.awt.event.KeyEvent.VK_A);
		rb.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);

		rb.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
		rb.keyPress(java.awt.event.KeyEvent.VK_V);
		rb.keyRelease(java.awt.event.KeyEvent.VK_V);
		rb.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End modifyData method");

	}

	/**
	 * This method run a robot that modify data from Webtable
	 * 
	 * @throws Exception
	 */
	public void modifyPhoneData() throws Exception {

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start modifyData method");

		StringSelection s1 = new StringSelection("0000000003");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s1, null);
		Robot rb = new Robot();

		driver.sleep(2);

		rb.delay(500);
		rb.mouseMove(3123, 313);
		rb.delay(500);
		rb.mousePress(InputEvent.BUTTON1_MASK);
		rb.mouseRelease(InputEvent.BUTTON1_MASK);
		rb.mousePress(InputEvent.BUTTON1_MASK);
		rb.mouseRelease(InputEvent.BUTTON1_MASK);

		rb.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
		rb.keyPress(java.awt.event.KeyEvent.VK_A);
		rb.keyRelease(java.awt.event.KeyEvent.VK_A);
		rb.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);

		rb.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
		rb.keyPress(java.awt.event.KeyEvent.VK_V);
		rb.keyRelease(java.awt.event.KeyEvent.VK_V);
		rb.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);

		rb.delay(500);
		rb.mouseMove(3293, 301);
		rb.delay(500);
		rb.mousePress(InputEvent.BUTTON1_MASK);
		rb.mouseRelease(InputEvent.BUTTON1_MASK);

		rb.delay(500);
		rb.mouseMove(3373, 299);
		rb.delay(500);
		rb.mousePress(InputEvent.BUTTON1_MASK);
		rb.mouseRelease(InputEvent.BUTTON1_MASK);

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End modifyData method");

	}

	/**
	 * This method check if Automation Demo Site Web Table logo is displayed
	 */
	public boolean isADSWebTableLogoDisplayed() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start isADSwebTableLogoDisplayed method");
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End isADSwebTableLogoDisplayed method");

		return this.isElementVisibleByXPath(IMG_LOGO_ADS);
	}

}
