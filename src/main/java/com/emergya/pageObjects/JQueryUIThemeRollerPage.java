package com.emergya.pageObjects;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.emergya.selenium.drivers.EmergyaWebDriver;
import com.emergya.selenium.pageObject.BasePageObject;

public class JQueryUIThemeRollerPage extends BasePageObject {

	/**
	 * Logger class initialization.
	 */
	static Logger log = Logger.getLogger(GoogleMainPage.class);

	/**
	 * Items keys selectors.
	 */
	private static final String IMG_LOGO_JUI = "logoJUI";
	private static final String THEME_ROLLER_BUTTON = "themeRollerButton";
	private static final String THIRD_OPTION = "thirdOption";
	private static final String AUTOCOMPLETE_FIELD = "autocompleteField";
	private static final String JAVA_AUTOCOMPLETE_OPTION = "javaAutocompleteOption";
	private static final String CHOICE1_BUTTON = "choice1Button";
	private static final String STANDARD_BUTTON = "standardButton";
	private static final String INSURANCE_BUTTON = "insuranceButton";
	private static final String SECOND_TAB_OPTION = "secondTabOption";
	private static final String OPEN_DIALOG_BUTTON = "openDialogButton";
	private static final String OK_DIALOG_BUTTON = "okDialogButton";
	private static final String RIGHT_ARROW_CALENDAR_BUTTON = "rightArrowCalendarButton";
	// private static final String DAY_11_BUTTON = "day11Button";
	private static final String SELECT_MENU_DROPDOWN = "selectMenuDropdown";
	// private static final String FASTER_OPTION = "fasterOption";
	private static final String UP_BUTTON = "upButton";
	// private static final String ITEM3_OPTION = "item3Option";
	// private static final String ITEM3_4_OPTION = "item3_4Option";
	private static final String LEFT_SLIDER_BUTTON = "leftSliderButton";
	private static final String RIGHT_SLIDER_BUTTON = "rightSliderButton";

	/**
	 * Constructor method
	 * 
	 * @param driver
	 *            selenium webdriver
	 */
	public JQueryUIThemeRollerPage(EmergyaWebDriver driver) {
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
	 * This method click on 'Themes' button
	 * 
	 * @return
	 */
	public JQueryUIThemeRollerPage clickOnJUIThemeRollerButton() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName()
				+ "]- Start clickOnJUIThemeRollerButton method");

		if (this.isElementVisibleByXPath(THEME_ROLLER_BUTTON)) {
			this.getElementByXPath(THEME_ROLLER_BUTTON).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName()
				+ "]- End clickOnJUIThemeRollerButton method");
		return new JQueryUIThemeRollerPage(driver);
	}
	
	
	/**
	 * This method Click on 'Third' option
	 * 
	 * @return
	 */
	public JQueryUIThemeRollerPage clickOnJUIThirdOption() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName()
				+ "]- Start clickOnJUIThirdOption method");

		if (this.isElementVisibleByXPath(THIRD_OPTION)) {
			this.getElementByXPath(THIRD_OPTION).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName()
				+ "]- End clickOnJUIThirdOption method");
		return new JQueryUIThemeRollerPage(driver);
	}

	/**
	 * This method Click on 'Autocomplete' field
	 * 
	 * @return
	 */
	public JQueryUIThemeRollerPage clickOnJUIAutocompleteField() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName()
				+ "]- Start clickOnJUIAutocompleteField method");

		if (this.isElementVisibleByXPath(AUTOCOMPLETE_FIELD)) {
			this.getElementByXPath(AUTOCOMPLETE_FIELD).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName()
				+ "]- End clickOnJUIAutocompleteField method");
		return new JQueryUIThemeRollerPage(driver);
	}

	/**
	 * This method write on 'Autocomplete' field
	 * 
	 * @param stringSearch
	 */
	public void writeOnJUIAutocompleteField(String stringSearch) {
		log.info("[log-" + this.getClass().getSimpleName() + "]- Start writeOnJUIAutocompleteField -[" + this.getClass().getSimpleName()
				+ "- method]");

		if (this.isElementVisibleByXPath(AUTOCOMPLETE_FIELD)) {
			this.getElementByXPath(AUTOCOMPLETE_FIELD).sendKeys(stringSearch);

		}

		log.info("[log-" + this.getClass().getSimpleName() + "]- End writeOnJUIAutocompleteField -[" + this.getClass().getSimpleName()
				+ "- method]");
	}
	
	/**
	 * This method select 'java' option
	 * 
	 * @return
	 */
	public JQueryUIThemeRollerPage clickOnJUIJavaAutocompleteOption() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName()
				+ "]- Start clickOnJUIChoice1Option method");

		if (this.isElementVisibleByXPath(JAVA_AUTOCOMPLETE_OPTION)) {
			this.getElementByXPath(JAVA_AUTOCOMPLETE_OPTION).click();
		}
			
		log.info("[log-pageObjects]" + this.getClass().getSimpleName()
				+ "]- End clickOnJUIChoice1Option method");
		return new JQueryUIThemeRollerPage(driver);
	}

	/**
	 * This method click on 'Choice 1' option
	 * 
	 * @return
	 */
	public JQueryUIThemeRollerPage clickOnJUIChoice1Option() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName()
				+ "]- Start clickOnJUIChoice1Option method");

		if (this.isElementVisibleByXPath(CHOICE1_BUTTON)) {
			this.getElementByXPath(CHOICE1_BUTTON).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName()
				+ "]- End clickOnJUIChoice1Option method");
		return new JQueryUIThemeRollerPage(driver);
	}

	/**
	 * This method Click on Standard button
	 * 
	 * @return
	 */
	public JQueryUIThemeRollerPage clickOnJUIStandardButton() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName()
				+ "]- Start clickOnJUIStandardButton method");

		if (this.isElementVisibleByXPath(STANDARD_BUTTON)) {
			this.getElementByXPath(STANDARD_BUTTON).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName()
				+ "]- End clickOnJUIStandardButton method");
		return new JQueryUIThemeRollerPage(driver);
	}

	/**
	 * This method Click on Insurance button
	 * 
	 * @return
	 */
	public JQueryUIThemeRollerPage clickOnJUIInsuranceButton() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName()
				+ "]- Start clickOnJUIInsuranceButton method");

		if (this.isElementVisibleByXPath(INSURANCE_BUTTON)) {
			this.getElementByXPath(INSURANCE_BUTTON).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName()
				+ "]- End clickOnJUIInsuranceButton method");
		return new JQueryUIThemeRollerPage(driver);
	}

	/**
	 * This method click on 'Second' tab option
	 * 
	 * @return
	 */
	public JQueryUIThemeRollerPage clickOnJUISecondTabOption() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName()
				+ "]- Start clickOnJUISecondTabOption method");

		if (this.isElementVisibleByXPath(SECOND_TAB_OPTION)) {
			this.getElementByXPath(SECOND_TAB_OPTION).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName()
				+ "]- End clickOnJUISecondTabOption method");
		return new JQueryUIThemeRollerPage(driver);
	}

	/**
	 * Click on 'Open Dialog' button
	 * 
	 * @return
	 */
	public JQueryUIThemeRollerPage clickOnJUIOpenDialogButton() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName()
				+ "]- Start clickOnJUIOpenDialogButton method");

		if (this.isElementVisibleByXPath(OPEN_DIALOG_BUTTON)) {
			this.getElementByXPath(OPEN_DIALOG_BUTTON).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName()
				+ "]- End clickOnJUIOpenDialogButton method");
		return new JQueryUIThemeRollerPage(driver);
	}

	/**
	 * This method click on 'Ok' dialog button
	 * 
	 * @return
	 */
	public JQueryUIThemeRollerPage clickOnJUIOkDialogButton() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName()
				+ "]- Start clickOnJUIOkDialogButton method");

		if (this.isElementVisibleByXPath(OK_DIALOG_BUTTON)) {
			this.getElementByXPath(OK_DIALOG_BUTTON).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName()
				+ "]- End clickOnJUIOkDialogButton method");
		return new JQueryUIThemeRollerPage(driver);
	}

	/**
	 * This method click on 'Right arrow' Calendar button
	 * 
	 * @return
	 */
	public JQueryUIThemeRollerPage clickOnJUIRightArrowCalendarButton() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName()
				+ "]- Start clickOnJUIRightArrowCalendarButton method");

		if (this.isElementVisibleByXPath(RIGHT_ARROW_CALENDAR_BUTTON)) {
			this.getElementByXPath(RIGHT_ARROW_CALENDAR_BUTTON).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName()
				+ "]- End clickOnJUIRightArrowCalendarButton method");
		return new JQueryUIThemeRollerPage(driver);
	}

	/**
	 * This method select '11' day button
	 * 
	 * @return
	 */
	public JQueryUIThemeRollerPage clickOnJUIDay11Button() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName()
				+ "]- Start clickOnJUIDay11Button method");
		/*
		 * if (this.isElementVisibleByXPath(DAY_11_BUTTON)) {
		 * this.getElementByXPath(DAY_11_BUTTON).click(); }
		 */
		if (driver.isElementDisplayed(
				By.cssSelector("#datepicker > div > table > tbody > tr:nth-child(3) > td:nth-child(2) > a"))) {
			driver.findElement(
					By.cssSelector("#datepicker > div > table > tbody > tr:nth-child(3) > td:nth-child(2) > a"))
					.click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName()
				+ "]- End clickOnJUIDay11Button method");
		return new JQueryUIThemeRollerPage(driver);
	}

	/**
	 * This method click on 'Select Menu' dropdown
	 * 
	 * @return
	 */
	public JQueryUIThemeRollerPage clickOnJUISelectMenuDropdown() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName()
				+ "]- Start clickOnJUISelectMenuDropdown method");

		if (this.isElementVisibleByXPath(SELECT_MENU_DROPDOWN)) {
			this.getElementByXPath(SELECT_MENU_DROPDOWN).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName()
				+ "]- End clickOnJUISelectMenuDropdown method");
		return new JQueryUIThemeRollerPage(driver);
	}

	/**
	 * This method select 'Faster' option
	 * 
	 * @return
	 */
	public JQueryUIThemeRollerPage clickOnJUIFasterOption() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName()
				+ "]- Start clickOnJUIFasterOption method");

		if (driver.isElementDisplayed(By.cssSelector("#selectmenu-menu > li:nth-child(5)"))) {
			driver.findElement(By.cssSelector("#selectmenu-menu > li:nth-child(5)")).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName()
				+ "]- End clickOnJUIFasterOption method");
		return new JQueryUIThemeRollerPage(driver);
	}

	/**
	 * This method click on 'Up arrow' button
	 * 
	 * @return
	 */
	public JQueryUIThemeRollerPage clickOnJUIUpButton() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName()
				+ "]- Start clickOnJUIUpButton method");

		if (this.isElementVisibleByXPath(UP_BUTTON)) {
			this.getElementByXPath(UP_BUTTON).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName()
				+ "]- End clickOnJUIUpButton method");
		return new JQueryUIThemeRollerPage(driver);
	}

	/**
	 * This method click on 'Item 3' option
	 * 
	 * @return
	 */
	public JQueryUIThemeRollerPage clickOnJUIItem3Option() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnJUIItem3Option method");

		// Actions actions = new Actions(driver);
		// actions.moveToElement(this.getElementByXPath(ITEM3_OPTION)).moveToElement(this.getElementByXPath(ITEM3_4_OPTION))
		//.clickAndHold().build().perform();

		if (driver.isElementDisplayed(By.cssSelector("#ui-id-17"))) {
			driver.findElement(By.cssSelector("#ui-id-17")).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnJUIItem3Option method");
		return new JQueryUIThemeRollerPage(driver);
	}

	/**
	 * This method click on 'Item 3-4' option
	 * 
	 * @return
	 */
	public JQueryUIThemeRollerPage clickOnJUIItem3_4Option() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnJUIItem3_4Option method");

		if (driver.isElementDisplayed(By.cssSelector("#ui-id-21"))) {
			driver.findElement(By.cssSelector("#ui-id-21")).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnJUIItem3_4Option method");
		return new JQueryUIThemeRollerPage(driver);
	}

	/**
	 * This method move the slider
	 * 
	 * @return
	 */
	public JQueryUIDemosPage sliderButton() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start sliderButton method");

		Actions builder = new Actions(driver);

		builder.dragAndDropBy(this.getElementByXPath(RIGHT_SLIDER_BUTTON), 200, 902).build().perform();

		builder.dragAndDropBy(this.getElementByXPath(LEFT_SLIDER_BUTTON), 150, 902).build().perform();
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End sliderButton method");
		return new JQueryUIDemosPage(driver);
	}

	/**
	 * This method take a Screenshot and save it on files directory.
	 * 
	 * @param driver
	 * @param imageName
	 */
	public void takeScreenShotTest(WebDriver driver, String imageName) {
		
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start takeScreenShotTest method");
		
		// Directory where images will save
		File directory = new File("/home/jmcaceres/proyectos/qa-emergya-quickstart/src/main/resources/files");

		try {
			if (directory.isDirectory()) {

				// Take a screenshot
				File imagen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

				// Move the file to directory with absolute path
				FileUtils.copyFile(imagen, new File(directory.getAbsolutePath() + "/" + imageName + ".png"));
			} else {
				log.error("No se ha hecho la screenshot correctamente");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End takeScreenShotTest method");
	}

	/**
	 * This method check if JQuery UI ThemeRoller logo is displayed
	 */
	public boolean isJUIThemeRollerLogoDisplayed() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName()
				+ "]- Start isJUIThemeRollerLogoDisplayed method");
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End isJUIThemeRollerLogoDisplayed method");

		return this.isElementVisibleByXPath(IMG_LOGO_JUI);
	}

}
