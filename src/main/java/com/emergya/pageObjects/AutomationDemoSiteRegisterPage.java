package com.emergya.pageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import com.emergya.selenium.drivers.EmergyaWebDriver;
import com.emergya.selenium.pageObject.BasePageObject;

public class AutomationDemoSiteRegisterPage extends BasePageObject {

	/**
	 * Logger class initialization.
	 */
	static Logger log = Logger.getLogger(GoogleMainPage.class);

	/**
	 * Items keys selectors.
	 */
	private static final String IMG_LOGO_ADS = "logoADS";
	private static final String FIRST_NAME_FIELD = "firstNameField";
	private static final String LAST_NAME_FIELD = "lastNameField";
	private static final String ADDRESS_FIELD = "addressField";
	private static final String EMAIL_FIELD = "emailField";
	private static final String PHONE_FIELD = "phoneField";
	// private static final String MALE_BUTTON = "maleButton";
	private static final String FEMALE_BUTTON = "femaleButton";
	private static final String CRICKET_OPTION = "cricketOption";
	private static final String MOVIES_OPTION = "moviesOption";
	private static final String HOCKEY_OPTION = "hockeyOption";
	private static final String LANGUAGES_OPTION = "languagesField";
	private static final String SPANISH_LANGUAGE_OPTION = "languagesSpanishOption";
	private static final String ENGLISH_LANGUAGE_OPTION = "languajesEnglishOption";
	private static final String SKILLS_FIELD = "skillsField";
	private static final String JAVA_SKILLS_FIELD = "javaSkillOption";
	private static final String COUNTRIES_FIELD = "countriesField";
	private static final String SPAIN_COUNTRY_OPTION = "spainCountryOption";
	private static final String SELECT_COUNTRY_FIELD = "selectCountryField";
	private static final String EEUU_COUNTRY_OPTION = "eeuuCountryOption";
	private static final String YEAR_FIELD = "yearOfBirthDayField";
	private static final String YEAR_OPTION = "yearOption";
	private static final String MONTH_FIELD = "monthOfBirthDayField";
	private static final String MONTH_OPTION = "monthOption";
	private static final String DAY_FIELD = "dayOfBirthDay";
	private static final String DAY_OPTION = "dayOption";
	private static final String PASS_FIELD = "passField";
	private static final String PASS_CONFIRM_FIELD = "passConfirmField";
	private static final String UPDATE_FILE_BUTTON = "updateFileButton";
	private static final String SWITCH_TO_ALERTS_BUTTON = "switchToAlertsButton";
	private static final String SWITCH_TO_BUTTON = "switchToButton";
	private static final String SUBMIT_BUTTON = "submitButton";

	/**
	 * Constructor method
	 * 
	 * @param driver
	 *            selenium webdriver
	 */
	public AutomationDemoSiteRegisterPage(EmergyaWebDriver driver) {
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

	// Methods

	/**
	 * This method write on firstname field
	 * 
	 * @param stringSearch
	 */
	public void firstNameRegister(String stringSearch) {
		log.info("[log-" + this.getClass().getSimpleName() + "]- Start firstNameRegister -["
				+ this.getClass().getSimpleName() + "- method]");

		if (this.isElementVisibleByXPath(FIRST_NAME_FIELD)) {
			this.getElementByXPath(FIRST_NAME_FIELD).sendKeys(stringSearch);

		}

		log.info("[log-" + this.getClass().getSimpleName() + "]- End firstNameRegister -["
				+ this.getClass().getSimpleName() + "- method]");
	}

	/**
	 * 
	 * This method write on lastname field
	 * 
	 * @param stringSearch
	 */
	public void lastNameRegister(String stringSearch) {
		log.info("[log-" + this.getClass().getSimpleName() + "]- Start lastNameRegister -["
				+ this.getClass().getSimpleName() + "- method]");

		if (this.isElementVisibleByXPath(LAST_NAME_FIELD)) {
			this.getElementByXPath(LAST_NAME_FIELD).sendKeys(stringSearch);

		}

		log.info("[log-" + this.getClass().getSimpleName() + "]- End lastNameRegister -["
				+ this.getClass().getSimpleName() + "- method]");
	}

	/**
	 * This method write address on a text area
	 * 
	 * @param stringSearch
	 */
	public void addressRegister(String stringSearch) {
		log.info("[log-" + this.getClass().getSimpleName() + "]- Start addressRegister -["
				+ this.getClass().getSimpleName() + "- method]");

		if (this.isElementVisibleByXPath(ADDRESS_FIELD)) {
			this.getElementByXPath(ADDRESS_FIELD).sendKeys(stringSearch);

		}

		log.info("[log-" + this.getClass().getSimpleName() + "]- End addressRegister -["
				+ this.getClass().getSimpleName() + "- method]");
	}

	/**
	 * This method take the text of Submit button and write it on address field
	 * 
	 * @return
	 */
	public AutomationDemoSiteRegisterPage clickOnADSAddressSubmit() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnADSFemaleOption method");

		String str = this.getElementByXPath(SUBMIT_BUTTON).getText();

		if (this.isElementVisibleByXPath(ADDRESS_FIELD)) {
			this.getElementByXPath(ADDRESS_FIELD).sendKeys(str);
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnADSFemaleOption method");
		return new AutomationDemoSiteRegisterPage(driver);
	}

	/**
	 * This method write on email field
	 * 
	 * @param stringSearch
	 */
	public void emailRegister(String stringSearch) {
		log.info("[log-" + this.getClass().getSimpleName() + "]- Start emailRegister -["
				+ this.getClass().getSimpleName() + "- method]");

		if (this.isElementVisibleByXPath(EMAIL_FIELD)) {
			this.getElementByXPath(EMAIL_FIELD).sendKeys(stringSearch);

		}

		log.info("[log-" + this.getClass().getSimpleName() + "]- End emailRegister -[" + this.getClass().getSimpleName()
				+ "- method]");
	}

	/**
	 * This method take the text of "error" message of email field and write it on
	 * email field.
	 * 
	 */
	public void emailMessageRegister() {
		log.info("[log-" + this.getClass().getSimpleName() + "]- Start emailRegister -["
				+ this.getClass().getSimpleName() + "- method]");

		if (this.isElementVisibleByXPath(EMAIL_FIELD)) {
			this.getElementByXPath(EMAIL_FIELD).click();
		}

		String message = driver.findElement(
				By.cssSelector("#basicBootstrapForm > div:nth-child(3) > div.col-sm-4.col-xs-4.tooltptext > span"))
				.getText();

		if (this.isElementVisibleByXPath(EMAIL_FIELD)) {
			this.getElementByXPath(EMAIL_FIELD).sendKeys(message);
		}

		log.info("[log-" + this.getClass().getSimpleName() + "]- End emailRegister -[" + this.getClass().getSimpleName()
				+ "- method]");
	}

	/**
	 * This method write on phone field
	 * 
	 * @param stringSearch
	 */
	public void phoneRegister(String stringSearch) {
		log.info("[log-" + this.getClass().getSimpleName() + "]- Start phoneRegister -["
				+ this.getClass().getSimpleName() + "- method]");

		if (this.isElementVisibleByXPath(PHONE_FIELD)) {
			this.getElementByXPath(PHONE_FIELD).sendKeys(stringSearch);

		}

		log.info("[log-" + this.getClass().getSimpleName() + "]- End phoneRegister -[" + this.getClass().getSimpleName()
				+ "- method]");
	}

	/**
	 * This method click on Male option
	 * 
	 * @return
	 */
	public AutomationDemoSiteRegisterPage clickOnADSMaleOption() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnADSMaleOption method");

		/*
		 * if (this.isElementVisibleByXPath(MALE_BUTTON)) {
		 * this.getElementByXPath(MALE_BUTTON).click(); }
		 */

		/*
		 * 
		 * This method use By.tagName selector for Male button
		 * 
		 * if (driver.isElementDisplayed(By.tagName(this.getElementByXPath(MALE_BUTTON).
		 * getTagName()))) {
		 * driver.findElement(By.tagName(this.getElementByXPath(MALE_BUTTON).getTagName(
		 * ))).click(); }
		 */
		if (driver.isElementDisplayed(By.name("radiooptions"))) {
			driver.findElement(By.name("radiooptions")).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnADSMaleOption method");
		return new AutomationDemoSiteRegisterPage(driver);
	}

	/**
	 * This method click on Female option
	 * 
	 * @return
	 */
	public AutomationDemoSiteRegisterPage clickOnADSFemaleOption() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnADSFemaleOption method");

		if (this.isElementVisibleByXPath(FEMALE_BUTTON)) {
			this.getElementByXPath(FEMALE_BUTTON).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnADSFemaleOption method");
		return new AutomationDemoSiteRegisterPage(driver);
	}

	/**
	 * This method click on Cricket option
	 * 
	 * @return
	 */
	public AutomationDemoSiteRegisterPage clickOnADSCricketOption() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnADSCricketOption method");

		if (this.isElementVisibleByXPath(CRICKET_OPTION)) {
			this.getElementByXPath(CRICKET_OPTION).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnADSCricketOption method");
		return new AutomationDemoSiteRegisterPage(driver);
	}

	/**
	 * This method click on Movies option
	 * 
	 * @return
	 */
	public AutomationDemoSiteRegisterPage clickOnADSMoviesOption() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnADSMoviesOption method");

		if (this.isElementVisibleById(MOVIES_OPTION)) {
			this.getElementById(MOVIES_OPTION).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnADSMoviesOption method");
		return new AutomationDemoSiteRegisterPage(driver);
	}

	/**
	 * This method click on Hockey option
	 * 
	 * @return
	 */
	public AutomationDemoSiteRegisterPage clickOnADSHockeyOption() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnADSHockeyOption method");

		if (this.isElementVisibleById(HOCKEY_OPTION)) {
			this.getElementById(HOCKEY_OPTION).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnADSHockeyOption method");
		return new AutomationDemoSiteRegisterPage(driver);
	}

	/**
	 * This method click on Languages field
	 * 
	 * @return
	 */
	public AutomationDemoSiteRegisterPage clickOnADSLanguagesField() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnADSLanguagesField method");

		if (this.isElementVisibleByXPath(LANGUAGES_OPTION)) {
			this.getElementByXPath(LANGUAGES_OPTION).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnADSLanguagesField method");
		return new AutomationDemoSiteRegisterPage(driver);
	}

	/**
	 * This method click on Spanish Language option
	 * 
	 * @return
	 */
	public AutomationDemoSiteRegisterPage clickOnADSSpanishLanguageOption() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName()
				+ "]- Start clickOnADSSpanishLanguageOption method");

		if (this.isElementVisibleByXPath(SPANISH_LANGUAGE_OPTION)) {
			this.getElementByXPath(SPANISH_LANGUAGE_OPTION).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName()
				+ "]- End clickOnADSSpanishLanguageOption method");
		return new AutomationDemoSiteRegisterPage(driver);
	}
	
	/**
	 * This method click on English Language option
	 * 
	 * @return
	 */
	public AutomationDemoSiteRegisterPage clickOnADSEnglishLanguageOption() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName()
				+ "]- Start clickOnADSSpanishLanguageOption method");

		if (this.isElementVisibleByXPath(ENGLISH_LANGUAGE_OPTION)) {
			this.getElementByXPath(ENGLISH_LANGUAGE_OPTION).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName()
				+ "]- End clickOnADSSpanishLanguageOption method");
		return new AutomationDemoSiteRegisterPage(driver);
	}

	/**
	 * This method click on Skills field
	 * 
	 * @return
	 */
	public AutomationDemoSiteRegisterPage clickOnADSSkillsField() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnADSSkillsField method");

		if (this.isElementVisibleById(SKILLS_FIELD)) {
			this.getElementById(SKILLS_FIELD).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnADSSkillsField method");
		return new AutomationDemoSiteRegisterPage(driver);
	}

	/**
	 * This method click on Java skill option
	 * 
	 * @return
	 */
	public AutomationDemoSiteRegisterPage clickOnADSJavaSkillsOption() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnADSJavaSkillsOption method");

		if (this.isElementVisibleByXPath(JAVA_SKILLS_FIELD)) {
			this.getElementByXPath(JAVA_SKILLS_FIELD).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnADSJavaSkillsOption method");
		return new AutomationDemoSiteRegisterPage(driver);
	}

	/**
	 * This method click on country field
	 * 
	 * @return
	 */
	public AutomationDemoSiteRegisterPage clickOnADSCountryField() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnADSCountryField method");

		if (this.isElementVisibleByXPath(COUNTRIES_FIELD)) {
			this.getElementByXPath(COUNTRIES_FIELD).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnADSCountryField method");
		return new AutomationDemoSiteRegisterPage(driver);
	}

	/**
	 * This method click on Spain country option
	 * 
	 * @return
	 */
	public AutomationDemoSiteRegisterPage clickOnADSSpainCountryOption() {
		log.info(
				"[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnADSSpainCountryOption method");

		if (this.isElementVisibleByXPath(SPAIN_COUNTRY_OPTION)) {
			this.getElementByXPath(SPAIN_COUNTRY_OPTION).click();
		}
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnADSSpainCountryOption method");
		return new AutomationDemoSiteRegisterPage(driver);
	}

	/**
	 * This method click on select country field
	 * 
	 * @return
	 */
	public AutomationDemoSiteRegisterPage clickOnADSSelectCountryField() {
		log.info(
				"[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnADSSelectCountryField method");

		if (this.isElementVisibleById(SELECT_COUNTRY_FIELD)) {
			this.getElementById(SELECT_COUNTRY_FIELD).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnADSSelectCountryField method");
		return new AutomationDemoSiteRegisterPage(driver);
	}

	/**
	 * This method click on EEUU option
	 * 
	 * @return
	 */
	public AutomationDemoSiteRegisterPage clickOnADSSelectCountryOption() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName()
				+ "]- Start clickOnADSSelectCountryOption method");

		if (this.isElementVisibleByXPath(EEUU_COUNTRY_OPTION)) {
			this.getElementByXPath(EEUU_COUNTRY_OPTION).click();
		}

		/*
		 * if(driver.isElementDisplayed(By.cssSelector(".select2-results__option"))) {
		 * driver.findElement(By.cssSelector(".select2-results__option")).click(); }
		 */
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnADSSelectCountryOption method");
		return new AutomationDemoSiteRegisterPage(driver);
	}

	/**
	 * This method click on Year field
	 * 
	 * @return
	 */
	public AutomationDemoSiteRegisterPage clickOnADSYearField() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnADSYearField method");

		if (this.isElementVisibleById(YEAR_FIELD)) {
			this.getElementById(YEAR_FIELD).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnADSYearField method");
		return new AutomationDemoSiteRegisterPage(driver);
	}

	/**
	 * This method click on Year option
	 * 
	 * @return
	 */
	public AutomationDemoSiteRegisterPage clickOnADSYearOption() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnADSYearOption method");

		if (this.isElementVisibleByXPath(YEAR_OPTION)) {
			this.getElementByXPath(YEAR_OPTION).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnADSYearOption method");
		return new AutomationDemoSiteRegisterPage(driver);
	}

	/**
	 * This method click on Month field
	 * 
	 * @return
	 */
	public AutomationDemoSiteRegisterPage clickOnADSMonthField() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnADSMonthField method");

		if (this.isElementVisibleByXPath(MONTH_FIELD)) {
			this.getElementByXPath(MONTH_FIELD).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnADSMonthField method");
		return new AutomationDemoSiteRegisterPage(driver);
	}

	/**
	 * This method click on Month option
	 * 
	 * @return
	 */
	public AutomationDemoSiteRegisterPage clickOnADSMonthOption() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnADSMonthOption method");

		if (this.isElementVisibleByXPath(MONTH_OPTION)) {
			this.getElementByXPath(MONTH_OPTION).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnADSMonthOption method");
		return new AutomationDemoSiteRegisterPage(driver);
	}

	/**
	 * This method click on Day field
	 * 
	 * @return
	 */
	public AutomationDemoSiteRegisterPage clickOnADSDayField() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnADSDayField method");

		if (this.isElementVisibleById(DAY_FIELD)) {
			this.getElementById(DAY_FIELD).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnADSDayField method");
		return new AutomationDemoSiteRegisterPage(driver);
	}

	/**
	 * This method click on Day option
	 * 
	 * @return
	 */
	public AutomationDemoSiteRegisterPage clickOnADSDayOption() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnADSDayOption method");

		if (this.isElementVisibleByXPath(DAY_OPTION)) {
			this.getElementByXPath(DAY_OPTION).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnADSDayOption method");
		return new AutomationDemoSiteRegisterPage(driver);
	}

	/**
	 * This method write on pass field
	 * 
	 * @param stringSearch
	 */
	public void passRegister(String stringSearch) {
		log.info("[log-" + this.getClass().getSimpleName() + "]- Start passRegister -["
				+ this.getClass().getSimpleName() + "- method]");

		if (this.isElementVisibleByXPath(PASS_FIELD)) {
			this.getElementByXPath(PASS_FIELD).sendKeys(stringSearch);

		}

		log.info("[log-" + this.getClass().getSimpleName() + "]- End passRegister -[" + this.getClass().getSimpleName()
				+ "- method]");
	}

	/**
	 * This method write on confirm pass field
	 * 
	 * @param stringSearch
	 */
	public void passConfirmRegister(String stringSearch) {
		log.info("[log-" + this.getClass().getSimpleName() + "]- Start passConfirmRegister -["
				+ this.getClass().getSimpleName() + "- method]");

		if (this.isElementVisibleByXPath(PASS_CONFIRM_FIELD)) {
			this.getElementByXPath(PASS_CONFIRM_FIELD).sendKeys(stringSearch);

		}

		log.info("[log-" + this.getClass().getSimpleName() + "]- End passConfirmRegister -["
				+ this.getClass().getSimpleName() + "- method]");
	}

	/**
	 * This method click on update file button
	 * 
	 * @return
	 */
	public AutomationDemoSiteRegisterPage clickOnADSupdateFileButton() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnADSupdateFileButton method");

		if (this.isElementVisibleById(UPDATE_FILE_BUTTON)) {
			this.getElementById(UPDATE_FILE_BUTTON).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnADSupdateFileButton method");
		return new AutomationDemoSiteRegisterPage(driver);
	}

	/**
	 * This method click on WebTable button using By.linkText selector
	 * 
	 * @return
	 */
	public AutomationDemoSiteRegisterPage clickOnADSWebTableLinkButton() {
		log.info(
				"[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnADSWebTableLinkButton method");

		/*
		 * 
		 * This method use selector By.linkText for click on WebTable button
		 * 
		 */
		if (driver.isElementDisplayed(By.linkText("WebTable"))) {
			driver.findElement(By.linkText("WebTable")).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnADSWebTableLinkButton method");
		return new AutomationDemoSiteRegisterPage(driver);
	}

	/**
	 * This method click on WebTable button using By.partialLinkText selector
	 * 
	 * @return
	 */
	public AutomationDemoSiteRegisterPage clickOnADSWebTablePartialLinkButton() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName()
				+ "]- Start clickOnADSWebTablePartialLinkButton method");

		/*
		 * 
		 * This method use selector By.linkText for click on WebTable button
		 * 
		 */
		if (driver.isElementDisplayed(By.partialLinkText("WebTab"))) {
			driver.findElement(By.partialLinkText("WebTab")).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName()
				+ "]- End clickOnADSWebTablePartialLinkButton method");
		return new AutomationDemoSiteRegisterPage(driver);
	}

	/**
	 * This method run a robot that select a file
	 * 
	 * @throws AWTException
	 */
	public void selectFile() throws AWTException {

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start selectFile method");

		StringSelection ss = new StringSelection(
				"/home/jmcaceres/proyectos/qa-emergya-quickstart/src/main/resources/files/capt.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		Robot rb = new Robot();

		rb.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
		rb.keyPress(java.awt.event.KeyEvent.VK_L);
		rb.keyRelease(java.awt.event.KeyEvent.VK_L);
		rb.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);

		rb.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
		rb.keyPress(java.awt.event.KeyEvent.VK_V);
		rb.keyRelease(java.awt.event.KeyEvent.VK_V);
		rb.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);

		rb.keyPress(java.awt.event.KeyEvent.VK_ENTER);
		rb.delay(500);
		rb.keyRelease(java.awt.event.KeyEvent.VK_ENTER);

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End selectFile method");

	}

	/**
	 * This method click on switchto button
	 * 
	 * @return
	 */
	public AutomationDemoSiteRegisterPage clickOnADSSwitchToButton() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnADSSwitchToButton method");

		Actions actions = new Actions(driver);
		actions.moveToElement(this.getElementByXPath(SWITCH_TO_BUTTON))
				.moveToElement(this.getElementByXPath(SWITCH_TO_ALERTS_BUTTON)).click().build().perform();

		/*
		 * if (this.isElementVisibleByXPath(SWITCH_TO_ALERTS_BUTTON)) {
		 * this.getElementByXPath(SWITCH_TO_ALERTS_BUTTON).click(); }
		 */

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnADSSwitchToButton method");
		return new AutomationDemoSiteRegisterPage(driver);
	}

	/**
	 * This method check if Automation Demo Site Register logo is displayed
	 */
	public boolean isADSRegisterLogoDisplayed() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start isADSRegisterLogoDisplayed method");
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End isADSRegisterLogoDisplayed method");

		return this.isElementVisibleByXPath(IMG_LOGO_ADS);
	}
}
