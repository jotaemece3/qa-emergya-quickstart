package com.emergya.pageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.apache.log4j.Logger;
import org.openqa.selenium.interactions.Actions;

import com.emergya.selenium.drivers.EmergyaWebDriver;
import com.emergya.selenium.pageObject.BasePageObject;

public class AutomationDemoSiteResizablePage extends BasePageObject {
	/**
	 * Logger class initialization.
	 */
	static Logger log = Logger.getLogger(GoogleMainPage.class);

	/**
	 * Items keys selectors.
	 */
	private static final String IMG_LOGO_ADS = "logoADS";
	private static final String INTERACTION_BUTTON = "interactionButton";
	private static final String RESIZABLE_BUTTON = "resizableButton";

	/**
	 * Constructor method
	 * 
	 * @param driver
	 *            selenium webdriver
	 */
	public AutomationDemoSiteResizablePage(EmergyaWebDriver driver) {
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
	 * This method click on resizable button
	 * 
	 * @return
	 */
	public AutomationDemoSiteResizablePage clickOnADSResizableButton() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnADSResizableButton method");

		Actions actions = new Actions(driver);
		actions.moveToElement(this.getElementByXPath(INTERACTION_BUTTON))
				.moveToElement(this.getElementByXPath(RESIZABLE_BUTTON)).click().build().perform();

		/*
		 * if (this.isElementVisibleByXPath(SWITCH_TO_ALERTS_BUTTON)) {
		 * this.getElementByXPath(SWITCH_TO_ALERTS_BUTTON).click(); }
		 */
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnADSResizableButton method");
		return new AutomationDemoSiteResizablePage(driver);
	}

	/**
	 * This method run a robot that resize the window using move and click for mouse
	 * 
	 * @throws AWTException
	 * @throws InterruptedException
	 */
	public void moveMouseResizable() throws AWTException, InterruptedException {

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start moveMouseResizable method");

		Robot rb = new Robot();

		rb.mouseMove(2646, 294);
		rb.delay(250);
		rb.mousePress(InputEvent.BUTTON1_MASK);

		rb.delay(250);
		rb.mouseMove(2860, 435);
		rb.mouseRelease(InputEvent.BUTTON1_MASK);

		driver.sleep(4);

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End moveMouseResizable method");

	}

	/**
	 * This method check if Automation Demo Site Resizable logo is displayed
	 */
	public boolean isADSResizableLogoDisplayed() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start isADSResizableLogoDisplayed method");
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End isADSResizableLogoDisplayed method");

		return this.isElementVisibleByXPath(IMG_LOGO_ADS);
	}
}
