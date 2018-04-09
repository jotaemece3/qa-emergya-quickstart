package com.emergya.pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.emergya.selenium.drivers.EmergyaWebDriver;
import com.emergya.selenium.pageObject.BasePageObject;

public class JQueryUIResizableOptionPage extends BasePageObject {

	/**
	 * Logger class initialization.
	 */
	static Logger log = Logger.getLogger(GoogleMainPage.class);

	/**
	 * Items keys selectors.
	 */
	private static final String IMG_LOGO_JUI = "logoJUI";
	private static final String RESIZABLE_TO_MOVE_BUTTON = "resizableClickToMoveButton";
	private static final String DEMOS_BUTTON = "demosButton";

	/**
	 * Constructor method
	 * 
	 * @param driver
	 *            selenium webdriver
	 */
	public JQueryUIResizableOptionPage(EmergyaWebDriver driver) {
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
	 * This method click on right bottom corner and move it for resize the box
	 * 
	 * @return
	 */
	public JQueryUIDemosPage resizableOption() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start resizableOption method");

		Actions builder = new Actions(driver);
		// builder.clickAndHold(this.getElementByXPath(RESIZABLE_TO_MOVE_BUTTON))
		// .release(this.getElementByXPath(RESIZABLE_TO_STOP_BUTTON)).build().perform();

		builder.dragAndDropBy(this.getElementByXPath(RESIZABLE_TO_MOVE_BUTTON), 225, 200).build().perform();
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End resizableOption method");
		return new JQueryUIDemosPage(driver);
	}

	/**
	 * This method change to box frame
	 * 
	 * @return
	 */
	public JQueryUIResizableOptionPage switchToBoxFrame() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start switchToBoxFrame method");

		WebElement iframe = driver.findElement(By.cssSelector(".demo-frame"));

		driver.switchTo().frame(iframe);

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End switchToBoxFrame method");
		return new JQueryUIResizableOptionPage(driver);
	}

	/**
	 * This method click on JQuery UI Demos button
	 * 
	 * @return
	 */
	public JQueryUIResizableOptionPage clickOnJUIDemosButton() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnJUIDemosButton method");

		if (this.isElementVisibleByXPath(DEMOS_BUTTON)) {
			this.getElementByXPath(DEMOS_BUTTON).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnJUIDemosButton method");
		return new JQueryUIResizableOptionPage(driver);
	}

	/**
	 * This method switch to default "frame"
	 * 
	 * @return
	 */
	public JQueryUIDemosPage switchToDefault() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start switchToDefault method");

		driver.switchTo().defaultContent();

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End switchToDefault method");
		return new JQueryUIDemosPage(driver);
	}

	/**
	 * This method check if JQuery UI Resizable logo is displayed
	 */
	public boolean isJUIResizableLogoDisplayed() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start isJUIResizableLogoDisplayed method");
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End isJUIResizableLogoDisplayed method");

		return this.isElementVisibleByXPath(IMG_LOGO_JUI);
	}
}
