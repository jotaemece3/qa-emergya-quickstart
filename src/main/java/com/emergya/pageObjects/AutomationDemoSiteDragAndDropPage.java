package com.emergya.pageObjects;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;


import org.apache.log4j.Logger;
//import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import com.emergya.selenium.drivers.EmergyaWebDriver;
import com.emergya.selenium.pageObject.BasePageObject;

public class AutomationDemoSiteDragAndDropPage extends BasePageObject {

	/**
	 * Logger class initialization.
	 */
	static Logger log = Logger.getLogger(GoogleMainPage.class);

	/**
	 * Items keys selectors.
	 */
	private static final String IMG_LOGO_ADS = "logoADS";
	private static final String INTERACTION_BUTTON = "interactionButton";
	private static final String DRAG_AND_DROP_BUTTON = "dragAndDropButton";
	private static final String STATIC_BUTTON = "staticButton";
	//private static final String S_IMAGE = "sImage";
	private static final String DROP_AREA = "dropArea";
	private static final String CIRCLE_IMAGE = "circleImage";

	/**
	 * Constructor method
	 * 
	 * @param driver
	 *            selenium webdriver
	 */
	public AutomationDemoSiteDragAndDropPage(EmergyaWebDriver driver) {
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
	 * This method click on Drop and Drag buttom
	 * 
	 * @return
	 */
	public AutomationDemoSiteDragAndDropPage clickOnADSDropAndDragButton() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnADSDropAndDragButton method");

		Actions actions = new Actions(driver);
		actions.moveToElement(this.getElementByXPath(INTERACTION_BUTTON))
				.moveToElement(this.getElementByXPath(DRAG_AND_DROP_BUTTON))
				.moveToElement(this.getElementByXPath(STATIC_BUTTON)).click().build().perform();

		/*
		 * if (this.isElementVisibleByXPath(SWITCH_TO_ALERTS_BUTTON)) {
		 * this.getElementByXPath(SWITCH_TO_ALERTS_BUTTON).click(); }
		 */
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnADSDropAndDragButton method");
		return new AutomationDemoSiteDragAndDropPage(driver);
	}
	
	/**
	 * This method click on circle image and drag and drop to drop area
	 * 
	 * @throws Exception
	 */
	
	public AutomationDemoSiteDragAndDropPage clickOnADSDropAndDragCircleImgButton() throws InterruptedException {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnADSDropAndDragCircleImgButton method");
		
		Actions builder = new Actions(driver);

		builder.dragAndDrop(this.getElementByXPath(CIRCLE_IMAGE), this.getElementByXPath(DROP_AREA)).build().perform();
		
		driver.sleep(3);
		
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnADSDropAndDragCircleImgButton method");
		return new AutomationDemoSiteDragAndDropPage(driver);
	}
	

	
	
	
	
	/**
	 * This method is a robot that click and move the items to drop area
	 * 
	 * @throws Exception
	 */
	public void moveItemsDragAndDrop() throws Exception {
		
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start moveItemsDragAndDrop method");

		
		StringSelection ss = new StringSelection("Jose");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		Robot rb = new Robot();

		rb.mouseMove(2233, 265);
		rb.delay(500);
		rb.mousePress(InputEvent.BUTTON1_MASK);
		rb.delay(500);
		rb.mouseMove(2823, 258);
		rb.delay(500);
		rb.mouseRelease(InputEvent.BUTTON1_MASK);

		rb.mouseMove(2233, 430);
		rb.delay(500);
		rb.mousePress(InputEvent.BUTTON1_MASK);
		rb.delay(500);
		rb.mouseMove(3018, 218);
		rb.delay(500);
		rb.mouseRelease(InputEvent.BUTTON1_MASK);

		rb.mouseMove(2216, 576);
		rb.delay(500);
		rb.mousePress(InputEvent.BUTTON1_MASK);
		rb.delay(500);
		rb.mouseMove(3161, 242);
		rb.delay(500);
		rb.mouseRelease(InputEvent.BUTTON1_MASK);
		rb.delay(500);

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End moveItemsDragAndDrop method");
	}

	/**
	 * This method check if Automation Demo Site Drag and Drop logo is displayed
	 */
	public boolean isADSDragAndDropLogoDisplayed() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start isADSDragAndDropLogoDisplayed method");
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End isADSDragAndDropLogoDisplayed method");

		return this.isElementVisibleByXPath(IMG_LOGO_ADS);
	}
}
