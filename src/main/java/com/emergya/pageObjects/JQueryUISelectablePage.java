package com.emergya.pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.emergya.selenium.drivers.EmergyaWebDriver;
import com.emergya.selenium.pageObject.BasePageObject;

public class JQueryUISelectablePage extends BasePageObject {

	/**
	 * Logger class initialization.
	 */
	static Logger log = Logger.getLogger(GoogleMainPage.class);

	/**
	 * Items keys selectors.
	 */
	private static final String IMG_LOGO_JUI = "logoJUI";
	private static final String SELECTABLE_BUTTON = "selectableButton";
	private static final String ITEM1_OPTION = "item1";
	private static final String ITEM2_OPTION = "item2";
	private static final String ITEM3_OPTION = "item3";
	private static final String ITEM4_OPTION = "item4";
	private static final String ITEM5_OPTION = "item5";
	private static final String ITEM6_OPTION = "item6";
	private static final String ITEM7_OPTION = "item7";

	/**
	 * Constructor method
	 * 
	 * @param driver
	 *            selenium webdriver
	 */
	public JQueryUISelectablePage(EmergyaWebDriver driver) {
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
	 * This method click on Selectable button
	 * 
	 * @return
	 */
	public JQueryUISelectablePage ClickOnSelectableButton() {
		log.info("[log-PageObjects] " + this.getClass().getSimpleName() + " - Start ClickOnSelectableButton method");

		if (this.isElementVisibleByXPath(SELECTABLE_BUTTON)) {
			this.getElementByXPath(SELECTABLE_BUTTON).click();
		}

		log.info("[log-PageObjects] " + this.getClass().getSimpleName() + " - End ClickOnSelectableButton method");
		return new JQueryUISelectablePage(driver);
	}

	/**
	 * This method click on 'Item1' option
	 * 
	 * @return
	 */
	public JQueryUISelectablePage clickOnItem1Option() {
		log.info("[log-PageObjects] " + this.getClass().getSimpleName() + " - Start ClickOnItem1Option method");

		if (this.isElementVisibleByXPath(ITEM1_OPTION)) {
			this.getElementByXPath(ITEM1_OPTION).click();
		}

		log.info("[log-PageObjects] " + this.getClass().getSimpleName() + " - End ClickOnItem1Option method");
		return new JQueryUISelectablePage(driver);
	}

	/**
	 * This method click on 'Item2' option
	 * 
	 * @return
	 */
	public JQueryUISelectablePage clickOnItem2Option() {
		log.info("[log-PageObjects] " + this.getClass().getSimpleName() + " - Start ClickOnItem2Option method");

		if (this.isElementVisibleByXPath(ITEM2_OPTION)) {
			this.getElementByXPath(ITEM2_OPTION).click();
		}

		log.info("[log-PageObjects] " + this.getClass().getSimpleName() + " - End ClickOnItem2Option method");
		return new JQueryUISelectablePage(driver);
	}

	/**
	 * This method click on 'Item3' option
	 * 
	 * @return
	 */
	public JQueryUISelectablePage clickOnItem3Option() {
		log.info("[log-PageObjects] " + this.getClass().getSimpleName() + " - Start ClickOnItem3Option method");

		if (this.isElementVisibleByXPath(ITEM3_OPTION)) {
			this.getElementByXPath(ITEM3_OPTION).click();
		}

		log.info("[log-PageObjects] " + this.getClass().getSimpleName() + " - End ClickOnItem3Option method");
		return new JQueryUISelectablePage(driver);
	}

	/**
	 * This method click on 'Item4' option
	 * 
	 * @return
	 */
	public JQueryUISelectablePage clickOnItem4Option() {
		log.info("[log-PageObjects] " + this.getClass().getSimpleName() + " - Start ClickOnItem4Option method");

		if (this.isElementVisibleByXPath(ITEM4_OPTION)) {
			this.getElementByXPath(ITEM4_OPTION).click();
		}

		log.info("[log-PageObjects] " + this.getClass().getSimpleName() + " - End ClickOnItem4Option method");
		return new JQueryUISelectablePage(driver);
	}

	/**
	 * This method click on 'Item5' option
	 * 
	 * @return
	 */
	public JQueryUISelectablePage clickOnItem5Option() {
		log.info("[log-PageObjects] " + this.getClass().getSimpleName() + " - Start ClickOnItem5Option method");

		if (this.isElementVisibleByXPath(ITEM5_OPTION)) {
			this.getElementByXPath(ITEM5_OPTION).click();
		}

		log.info("[log-PageObjects] " + this.getClass().getSimpleName() + " - End ClickOnItem5Option method");
		return new JQueryUISelectablePage(driver);
	}

	/**
	 * This method click on 'Item6' option
	 * 
	 * @return
	 */
	public JQueryUISelectablePage clickOnItem6Option() {
		log.info("[log-PageObjects] " + this.getClass().getSimpleName() + " - Start ClickOnItem6Option method");

		if (this.isElementVisibleByXPath(ITEM6_OPTION)) {
			this.getElementByXPath(ITEM6_OPTION).click();
		}

		log.info("[log-PageObjects] " + this.getClass().getSimpleName() + " - End ClickOnItem6Option method");
		return new JQueryUISelectablePage(driver);
	}

	/**
	 * This method click on 'Item7' option
	 * 
	 * @return
	 */
	public JQueryUISelectablePage clickOnItem7Option() {
		log.info("[log-PageObjects] " + this.getClass().getSimpleName() + " - Start ClickOnItem7Option method");

		if (this.isElementVisibleByXPath(ITEM7_OPTION)) {
			this.getElementByXPath(ITEM7_OPTION).click();
		}

		log.info("[log-PageObjects] " + this.getClass().getSimpleName() + " - End ClickOnItem7Option method");
		return new JQueryUISelectablePage(driver);
	}

	/**
	 * This method change to box frame
	 * 
	 * @return
	 */
	public JQueryUISelectablePage switchToBoxFrame() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start switchToBoxFrame method");

		WebElement iframe = driver.findElement(By.cssSelector(".demo-frame"));

		driver.switchTo().frame(iframe);

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End switchToBoxFrame method");
		return new JQueryUISelectablePage(driver);
	}

	/**
	 * This method check if JQuery UI Selectable logo is displayed
	 */
	public boolean isJUISelectableLogoDisplayed() {
		log.info(
				"[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start isJUISelectableLogoDisplayed method");
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End isJUISelectableLogoDisplayed method");

		return this.isElementVisibleByXPath(IMG_LOGO_JUI);
	}
}
