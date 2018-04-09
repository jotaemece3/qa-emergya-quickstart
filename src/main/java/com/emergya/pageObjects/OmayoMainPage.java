package com.emergya.pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.emergya.selenium.drivers.EmergyaWebDriver;
import com.emergya.selenium.pageObject.BasePageObject;

public class OmayoMainPage extends BasePageObject {

	/**
	 * Logger class initialization.
	 */
	static Logger log = Logger.getLogger(GoogleMainPage.class);

	/**
	 * Items keys selectors.
	 */
	private static final String IMG_LOGO_OMAYO = "logoOmayo";
	private static final String CRUISES_BUTTON_IFRAME1 = "cruisesButtonIframe1";
	private static final String CHAPTER1_BUTTON_IFRAME2 = "chapter1ButtonIframe2";
	private static final String TEXTAREA_BUTTON_IFRAME2_CHAPTER1 = "textAreaButtonIframe2Chapter1";
	private static final String LOADTEXT_BUTTON_IFRAME2_CHAPTER1 = "loadTextButtonIframe2Chapter1";

	/**
	 * Constructor method
	 * 
	 * @param driver
	 *            selenium webdriver
	 */
	public OmayoMainPage(EmergyaWebDriver driver) {
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

		boolean status = this.isElementVisibleByXPath(IMG_LOGO_OMAYO);

		log.info("[log-PageObjects] " + this.getClass().getSimpleName() + " - End isReady method");

		return status;
	}

	/**
	 * This method write on 'textArea with field two' the text of textbox with
	 * preload text field
	 * 
	 * @param stringSearch
	 */
	public void writeOnOmayoTextAreaFieldTwo() {
		log.info("[log-" + this.getClass().getSimpleName() + "]- Start writeOnOmayoTextAreaFieldTwo -["
				+ this.getClass().getSimpleName() + "- method]");

		String stringSearch = driver.findElement(By.cssSelector("#textbox1")).getAttribute("value");
		log.info(stringSearch);

		driver.findElement(By.cssSelector("#HTML11 > div.widget-content > textarea")).clear();

		driver.findElement(By.cssSelector("#HTML11 > div.widget-content > textarea")).sendKeys(stringSearch);

		log.info("[log-" + this.getClass().getSimpleName() + "]- End writeOnOmayoTextAreaFieldTwo -["
				+ this.getClass().getSimpleName() + "- method]");
	}

	/**
	 * This method Click on 'Cruises' button of Iframe1
	 * 
	 * @return
	 */
	public OmayoMainPage clickOnCruisesButtonIframe1() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnCruisesButtonIframe1 method");

		if (this.isElementVisibleByXPath(CRUISES_BUTTON_IFRAME1)) {
			this.getElementByXPath(CRUISES_BUTTON_IFRAME1).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnCruisesButtonIframe1 method");
		return new OmayoMainPage(driver);
	}

	/**
	 * This method Click on 'Chapter1' button of Iframe2
	 * 
	 * @return
	 */
	public OmayoMainPage clickOnChapter1ButtonIframe2() {
		log.info(
				"[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnChapter1ButtonIframe2 method");

		if (this.isElementVisibleByXPath(CHAPTER1_BUTTON_IFRAME2)) {
			this.getElementByXPath(CHAPTER1_BUTTON_IFRAME2).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnChapter1ButtonIframe2 method");
		return new OmayoMainPage(driver);
	}

	/**
	 * This method clear and write on TextArea button of Iframe2 Chapter1
	 * 
	 * @return
	 */
	public OmayoMainPage clearAndWriteOnTextAreaButtonIframe2Chapter1() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName()
				+ "]- Start clearAndWriteOnTextAreaButtonIframe2Chapter1 method");

		if (this.isElementVisibleByXPath(TEXTAREA_BUTTON_IFRAME2_CHAPTER1)) {
			this.getElementByXPath(TEXTAREA_BUTTON_IFRAME2_CHAPTER1).clear();
		}

		if (this.isElementVisibleByXPath(LOADTEXT_BUTTON_IFRAME2_CHAPTER1)) {
			this.getElementByXPath(LOADTEXT_BUTTON_IFRAME2_CHAPTER1).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName()
				+ "]- End clearAndWriteOnTextAreaButtonIframe2Chapter1 method");
		return new OmayoMainPage(driver);
	}

	/**
	 * This method Scroll to Seattle element of Iframe1
	 * 
	 */
	public void scrollToElementSeattle() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start scrollToElementSeattle method");

		WebElement element = driver
				.findElement(By.cssSelector("body > div > table > tbody > tr > td:nth-child(2) > table > tbody"
						+ "> tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(2) "
						+ "> td > table > tbody > tr:nth-child(2) > th > table > tbody > tr:nth-child(11) > td:nth-child(2) > strong > font"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End scrollToElementSeattle method");
	}

	/**
	 * This method Scroll to TextAreaTwo element
	 * 
	 */
	public void scrollToElementTextAreaTwo() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start scrollToElementTextAreaTwo method");

		WebElement element = driver.findElement(By.cssSelector("#HTML11 > div.widget-content > textarea"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End scrollToElementTextAreaTwo method");
	}

	/**
	 * This method Scroll to Cruises button element
	 * 
	 */
	public void scrollToElementCruisesButton() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName()
				+ "]- Start scrollToElementCruisesButton method");

		WebElement element = driver.findElement(By.cssSelector("body > div > table > tbody > tr > td:nth-child(1)"
				+ " > table > tbody > tr > td > table > tbody > tr > td > table > tbody > tr:nth-child(5) > td:nth-child(2) > a"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);

		log.info(
				"[log-pageObjects]" + this.getClass().getSimpleName() + "]- End scrollToElementCruisesButton method");
	}

	/**
	 * This method Scroll to TextArea button of Iframe2 Chapter1 element
	 */
	public void scrollToElementTextAreaButtonIframe2Chapter1() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName()
				+ "]- Start scrollToElementTextAreaButtonIframe2Chapter1 method");

		WebElement element = driver.findElement(By.cssSelector("#html5div"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);

		log.info(
				"[log-pageObjects]" + this.getClass().getSimpleName() + "]- End scrollToElementTextAreaButtonIframe2Chapter1 method");
	}

	/**
	 * This method change to box frame1
	 * 
	 * @return
	 */
	public OmayoMainPage switchToBoxFrame1() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start switchToBoxFrame1 method");

		WebElement iframe = driver.findElement(By.cssSelector("#iframe1"));

		driver.switchTo().frame(iframe);

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End switchToBoxFrame1 method");
		return new OmayoMainPage(driver);
	}

	/**
	 * This method change to box frame2
	 * 
	 * @return
	 */
	public OmayoMainPage switchToBoxFrame2() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start switchToBoxFrame2 method");

		WebElement iframe = driver.findElement(By.cssSelector("#iframe2"));

		driver.switchTo().frame(iframe);

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End switchToBoxFrame2 method");
		return new OmayoMainPage(driver);
	}

	/**
	 * This method change to Default frame
	 * 
	 * @return
	 */
	public OmayoMainPage switchToDefault() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start switchToDefault method");

		driver.switchTo().defaultContent();

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End switchToDefault method");
		return new OmayoMainPage(driver);
	}

	/**
	 * This method do click on "Entendido" button of popup cookies.
	 */
	public void NewPopUpHandler() {

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start NewPopUpHandler method");
		
		driver.findElement(By.cssSelector("#HTML37 > div.widget-content > p > a")).click();
		driver.sleep(2);
		driver.close();
		
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End NewPopUpHandler method");
	}

	/**
	 * This method open a new tab, access to google.es and switch to tab in first
	 * position.
	 */
	public void openNewTab() {

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start openNewTab method");
		
		// Open a new tab and switch to it
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
		driver.get("www.google.es");

		driver.sleep(2);
		Actions action = new Actions(driver);
		// switch back to original, tab in position 1
		action.keyDown(Keys.ALT).sendKeys("1").perform();

		// Switch to left tab, for right tab we use CONTROL+TAB
		// action.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).sendKeys(Keys.TAB).build().perform();
		
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End openNewTab method");
	}

	/**
	 * This method write on 'textArea with field two' the text of textbox with
	 * preload text field after switch tabs
	 * 
	 * @param stringSearch
	 */
	public void writeOnOmayoTextAreaFieldTwo2() {
		log.info("[log-" + this.getClass().getSimpleName() + "]- Start writeOnOmayoTextAreaFieldTwo2 -["
				+ this.getClass().getSimpleName() + "- method]");

		// String stringSearch =
		// driver.findElement(By.cssSelector("#textbox1")).getAttribute("value");
		// log.info(stringSearch);

		driver.findElement(By.cssSelector("#HTML11 > div.widget-content > textarea")).clear();

		driver.findElement(By.cssSelector("#HTML11 > div.widget-content > textarea")).sendKeys("After xswitch tabs");

		log.info("[log-" + this.getClass().getSimpleName() + "]- End writeOnOmayoTextAreaFieldTwo2 -["
				+ this.getClass().getSimpleName() + "- method]");
	}

	/**
	 * This method Click on 'Chapter1' button of Iframe2
	 * 
	 * @return
	 */
	public OmayoMainPage acceptCookies() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start acceptCookies method");

		driver.findElement(By.cssSelector("#cookieChoiceDismiss")).click();

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End acceptCookies method");
		return new OmayoMainPage(driver);
	}

	/**
	 * This method check if Omayo logo is displayed
	 */
	public boolean isOmayoLogoDisplayed() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start isOmayoLogoDisplayed method");
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End isOmayoLogoDisplayed method");

		return this.isElementVisibleByXPath(IMG_LOGO_OMAYO);
	}
}
