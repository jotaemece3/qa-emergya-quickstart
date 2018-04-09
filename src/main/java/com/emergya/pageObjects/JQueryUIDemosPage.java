package com.emergya.pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.emergya.selenium.drivers.EmergyaWebDriver;
import com.emergya.selenium.pageObject.BasePageObject;

public class JQueryUIDemosPage extends BasePageObject {

	/**
	 * Logger class initialization.
	 */
	static Logger log = Logger.getLogger(GoogleMainPage.class);

	/**
	 * Items keys selectors.
	 */
	private static final String IMG_LOGO_JUI = "logoJUI";
	private static final String EFFECT_BUTTON = "effectButton";
	private static final String DROPPABLE_DEMOS_BUTTON = "droppableButton";
	private static final String RESIZABLE_DEMOS_BUTTON = "resizableButton";
	private static final String EFFECT_SIZE_OPTION = "effectSizeOption";
	private static final String EFFECT_RUN_BUTTON = "effectRunButton";


	/**
	 * Constructor method
	 * 
	 * @param driver
	 *            selenium webdriver
	 */
	public JQueryUIDemosPage(EmergyaWebDriver driver) {
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
	 * This method click on JQuery UI Effect button
	 * 
	 * @return
	 */
	public JQueryUIDemosPage clickOnJUIEffectButton() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnJUIEffectButton method");

		if (this.isElementVisibleByXPath(EFFECT_BUTTON)) {
			this.getElementByXPath(EFFECT_BUTTON).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnJUIEffectButton method");
		return new JQueryUIDemosPage(driver);
	}

	/**
	 * This method click on JQuery UI Resizable button
	 * 
	 * @return
	 */
	public JQueryUIDemosPage clickOnJUIResizableButton() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnJUIResizableButton method");

		if (this.isElementVisibleByXPath(RESIZABLE_DEMOS_BUTTON)) {
			this.getElementByXPath(RESIZABLE_DEMOS_BUTTON).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnJUIResizableButton method");
		return new JQueryUIDemosPage(driver);
	}

	/**
	 * This method click on JQuery UI Droppable button
	 * 
	 * @return
	 */
	public JQueryUIDemosPage clickOnJUIDroppableButton() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnJUIDroppableButton method");

		if (this.isElementVisibleByXPath(DROPPABLE_DEMOS_BUTTON)) {
			this.getElementByXPath(DROPPABLE_DEMOS_BUTTON).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnJUIDroppableButton method");
		return new JQueryUIDemosPage(driver);
	}

	/**
	 * This method click on JQuery UI Effect option button
	 * 
	 * @return
	 */
	public JQueryUIDemosPage clickOnJUIEffectOptionButton() {
		log.info(
				"[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnJUIEffectOptionButton method");

		// if (this.isElementVisibleById(EFFECT_OPTION_BUTTON)) {
		// this.getElementByXPath(EFFECT_OPTION_BUTTON).click();
		// }

		if (driver.isElementDisplayed(By.cssSelector("#effectTypes"))) {
			driver.findElement(By.cssSelector("#effectTypes")).click();
		} else {
			log.error("No lo esta cogiendo");
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnJUIEffectOptionButton method");
		return new JQueryUIDemosPage(driver);
	}

	/**
	 * This method click on JQuery UI Effect Size option
	 * 
	 * @return
	 */
	public JQueryUIDemosPage clickOnJUIEffectSizeOption() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnJUIEffectSizeOption method");

		if (this.isElementVisibleByXPath(EFFECT_SIZE_OPTION)) {
			this.getElementByXPath(EFFECT_SIZE_OPTION).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnJUIEffectSizeOption method");
		return new JQueryUIDemosPage(driver);
	}

	/**
	 * This method click on JQuery UI Effect Run button
	 * 
	 * @return
	 */
	public JQueryUIDemosPage clickOnJUIEffectRunButton() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnJUIEffectRunButton method");

		// driver.findElementByXPath("//*[@id=\"my_horizontal\"]/option[3]").click();;

		if (this.isElementVisibleById(EFFECT_RUN_BUTTON)) {
			this.getElementById(EFFECT_RUN_BUTTON).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnJUIEffectRunButton method");
		return new JQueryUIDemosPage(driver);
	}

	/**
	 * This method change frame and drag and drop a box inside other box
	 * 
	 * @return
	 */
	public JQueryUIDemosPage dragAndDropBox() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start dragAndDropBox method");

		/*
		 * This method use By.className for first box.
		 * 
		 */
		Actions builder = new Actions(driver);
		builder.clickAndHold(driver.findElement(By.className("ui-widget-content")))
				.release(driver.findElement(By.className("ui-droppable"))).build().perform();
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End dragAndDropBox method");
		return new JQueryUIDemosPage(driver);
	}

	/**
	 * This method change to Box frame
	 * 
	 * @return
	 */
	public JQueryUIDemosPage switchToBoxFrame() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start switchToBoxFrame method");

		WebElement iframe = driver.findElement(By.cssSelector(".demo-frame"));

		driver.switchTo().frame(iframe);

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End switchToBoxFrame method");
		return new JQueryUIDemosPage(driver);
	}

	/**
	 * This method check if JQuery UI logo is displayed
	 */
	public boolean isJUILogoDisplayed() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start isJUILogoDisplayed method");
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End isJUILogoDisplayed method");

		return this.isElementVisibleByXPath(IMG_LOGO_JUI);
	}

}
