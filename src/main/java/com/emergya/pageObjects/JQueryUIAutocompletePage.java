package com.emergya.pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.emergya.selenium.drivers.EmergyaWebDriver;
import com.emergya.selenium.pageObject.BasePageObject;

public class JQueryUIAutocompletePage extends BasePageObject{

	/**
	 * Logger class initialization.
	 */
	static Logger log = Logger.getLogger(GoogleMainPage.class);

	/**
	 * Items keys selectors.
	 */
	private static final String IMG_LOGO_JUI = "logoJUI";
	private static final String TAG_FIELD = "tagField";
	private static final String AUTOCOMPLETE_BUTTON = "autocompleteButton";
	private static final String JAVA_OPTION = "javaOption";

	/**
	 * Constructor method
	 * 
	 * @param driver
	 *            selenium webdriver
	 */
	public JQueryUIAutocompletePage(EmergyaWebDriver driver) {
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
	 * This method Click on Autocomplete button
	 * 
	 * @return
	 */
	public JQueryUIResizableOptionPage clickOnJUIAutocompleteButton() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnJUIAutocompleteButton method");

		if (this.isElementVisibleByXPath(AUTOCOMPLETE_BUTTON)) {
			this.getElementByXPath(AUTOCOMPLETE_BUTTON).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnJUIAutocompleteButton method");
		return new JQueryUIResizableOptionPage(driver);
	}
	
	/**
	 * This method click on 'Java' option
	 * 
	 * @return
	 */
	public JQueryUIResizableOptionPage clickOnJUIJavaOption() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnJUIJavaOption method");

		if (this.isElementVisibleByXPath(JAVA_OPTION)) {
			this.getElementByXPath(JAVA_OPTION).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnJUIJavaOption method");
		return new JQueryUIResizableOptionPage(driver);
	}
	
	/**
	 * This method write on tag field
	 * 
	 * @param stringSearch
	 */
	public void writeOnJUITagField(String stringSearch) {
		log.info("[log-" + this.getClass().getSimpleName() + "]- Start writeOnJUITagField -[" + this.getClass().getSimpleName()
				+ "- method]");

		if (this.isElementVisibleByXPath(TAG_FIELD)) {
			this.getElementByXPath(TAG_FIELD).sendKeys(stringSearch);
			
		}

		log.info("[log-" + this.getClass().getSimpleName() + "]- End writeOnJUITagField -[" + this.getClass().getSimpleName()
				+ "- method]");
    }
	
	/**
	 * This method SwitchTo Box frame 
	 * 
	 * @return
	 */
	public JQueryUIAutocompletePage switchToBoxFrame() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start switchToBoxFrame method");

		WebElement iframe = driver.findElement(By.cssSelector(".demo-frame"));

		driver.switchTo().frame(iframe);

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End switchToBoxFrame method");
		return new JQueryUIAutocompletePage(driver);
	}
	
	/**
	 * This method check if JQuery UI Autocomplete logo is displayed
	 */
	public boolean isJUIAutocompleteLogoDisplayed() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start isJUIAutocompleteLogoDisplayed method");
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End isJUIAutocompleteLogoDisplayed method");

		return this.isElementVisibleByXPath(IMG_LOGO_JUI);
	}
}
