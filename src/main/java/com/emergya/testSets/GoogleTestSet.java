package com.emergya.testSets;

import static org.testng.AssertJUnit.assertTrue;

import java.awt.AWTException;
import java.lang.reflect.Method;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.emergya.pageObjects.AmazonLoginPage;
import com.emergya.pageObjects.AmazonMainPage;
import com.emergya.pageObjects.AutomationDemoSiteDragAndDropPage;
import com.emergya.pageObjects.AutomationDemoSiteFileDownloadPage;
import com.emergya.pageObjects.AutomationDemoSiteFileUploadPage;
import com.emergya.pageObjects.AutomationDemoSiteMainPage;
import com.emergya.pageObjects.AutomationDemoSiteRegisterPage;
import com.emergya.pageObjects.AutomationDemoSiteResizablePage;
import com.emergya.pageObjects.AutomationDemoSiteSwitchToAlertPage;
import com.emergya.pageObjects.AutomationDemoSiteWebTablePage;
import com.emergya.pageObjects.DezLearnMainPage;
import com.emergya.pageObjects.DezLearnTestPage;
import com.emergya.pageObjects.EmergyaContactPage;
import com.emergya.pageObjects.EmergyaMainPage;
import com.emergya.pageObjects.EmergyaTrabajaNosotrosPage;
import com.emergya.pageObjects.GoogleMainPage;
import com.emergya.pageObjects.ImgurMainPage;
import com.emergya.pageObjects.ImgurNewPostPage;
import com.emergya.pageObjects.JQueryUIAutocompletePage;
import com.emergya.pageObjects.JQueryUIControlGroupPage;
import com.emergya.pageObjects.JQueryUIDatepickerPage;
import com.emergya.pageObjects.JQueryUIDemosPage;
import com.emergya.pageObjects.JQueryUIDialogPage;
import com.emergya.pageObjects.JQueryUIEffectOptionPage;
import com.emergya.pageObjects.JQueryUIResizableOptionPage;
import com.emergya.pageObjects.JQueryUISelectablePage;
import com.emergya.pageObjects.JQueryUISortablePage;
import com.emergya.pageObjects.JQueryUISpinnerMapPage;
import com.emergya.pageObjects.JQueryUIThemeRollerPage;
import com.emergya.pageObjects.OmayoMainPage;
import com.emergya.pageObjects.ZamzarMainPage;
import com.emergya.utils.BasicTestSet;

/**
 * A test class contain the tests of a specific page in the application
 * 
 * @author Jose Antonio Sanchez <jasanchez@emergya.com>
 * @author Ivan Bermudez <ibermudez@emergya.com>
 * @author Ivan Gomez <igomez@emergya.com>
 */
public class GoogleTestSet extends BasicTestSet {

	static Logger log = Logger.getLogger(GoogleTestSet.class);

	public GoogleTestSet() {
		super();
	}

	@BeforeMethod(description = "startTest")
	public void before() {
		super.before();
	}

	@AfterMethod(description = "endTest")
	public void afterAllIsSaidAndDone() {
		super.afterAllIsSaidAndDone();
	}

	// **************** TESTS ****************
	// ------ EMERGYA QA SAMPLE TEST ------ //
	// ------ US00001 - Check google main page and do a search ------ //
	/**
	 * Description: Check the main page elements and do a search on google
	 * 
	 * Pre steps: - Open the browser
	 * 
	 * Steps: - Go to www.google.es - Check that the google logo is displayed -
	 * Check that the 'Buscar con Google' button is displayed - Check that the 'Voy
	 * a tener suerte' button is displayed - Check that the search field is
	 * displayed - Do this search 'Hello world!' - Check that several results are
	 * displayed
	 * 
	 * Post steps: - Close the browser
	 * 
	 */
	@Test(description = "googleMainPageSearch")
	public void googleMainPageSearch(Method method) {
		log.info("[log-TestSet] " + this.getClass().getName() + " - Start test method: " + method.getName());

		// Variable declaration and definition
		isReady(googleMainPage = new GoogleMainPage(driver));

		// Steps to build the stage (Pre steps)

		try {
			// Go to www.google.es
			// Check that the google logo is displayed
			isLogoDisplayed();

			// Check that the 'Buscar con Google' button is displayed
			isSearchButtonDisplayed();

			// Check that the 'Voy a tener suerte' button is displayed
			isLuckButtonDisplayed();

			// Check that the search field is displayed
			isSearchFieldDisplayed();

			// Do this search 'Hello world!'
			googleMainPage.doSearch("Hello world");

			// Check that several results are displayed
			areSeveralResults();

		} finally {
			// Steps to clear the stage (Post steps)
		}

		log.info("[log-TestSet] " + this.getClass().getName() + " - End test method: " + method.getName());
	}

	/**
	 * Description: Do a search in Google and access to a page
	 * 
	 * Pre steps: - Open the browser
	 * 
	 * Steps: - Go to www.google.es - Do this search 'www.emergya.es' - Access to
	 * 'www.emergya.es' - Check that the logo is displayed - Access to the
	 * 'Contacto' page - Check that the address is displayed - Access to the
	 * 'Trabaja con nosotros' page - Check '¿QUÉ OFRECEMOS?' section is displayed
	 * 
	 * Post steps: - Close the browser
	 * 
	 */
	@Test(description = "googleDoSearchAndAccessToEmergya")
	public void googleDoSearchAndAccessToEmergya(Method method) {
		log.info("[log-TestSet] " + this.getClass().getName() + " - Start test method: " + method.getName());

		// Variable declaration and definition
		isReady(googleMainPage = new GoogleMainPage(driver));

		// Steps to build the stage (Pre steps)

		try {
			// Go to www.google.es
			// Do this search 'www.emergya.es'
			googleMainPage.doSearch("www.emergya.es");

			// Access to 'www.emergya.es'
			emergyaMainPage = googleMainPage.clickOnEmergyaPage();

			// Check that the logo is displayed
			isEmergyaLogoDisplayed();

			// TODO: Remove the following line when you complete the test
			// assertTrue("Developing test", false);

			// Access to the 'Contacto' page
			emergyaMainPage.clickOnEmergyaContactoPage();

			driver.sleep(2);

			// Check that Sevilla address is displayed
			isEmergyaSevillaAddressDisplayed();

			// Click on top right slide menu
			emergyaContactPage.clickOnEmergyaTopRightButton();

			driver.sleep(2);

			// Access to 'Trabaja con nosotros' page
			emergyaContactPage.clickOnEmergyaTrabajaNosotrosButton();

			driver.sleep(2);

			// Check 'Ofertas de trabajo' title
			isEmergyaTitleDisplayed();

			// Select 1st option
			emergyaTrabajaNosotrosPage.clickOnEmergyaFirstOption();

		} finally {
			// Steps to clear the stage (Post steps)
		}

		log.info("[log-TestSet] " + this.getClass().getName() + " - End test method: " + method.getName());
	}

	/**
	 * Description: Do a search in Google and access to a page
	 * 
	 * Pre steps: - Open the browser
	 * 
	 * Steps: - Go to www.google.es - Do this search 'amazon'
	 * 
	 * Post steps: - Close the browser
	 * 
	 */
	@Test(description = "googleMainPageSearchAmazon")
	public void googleMainPageSearchAmazon(Method method) {
		log.info("[log-TestSet] " + this.getClass().getName() + " - Start test method: " + method.getName());

		// Variable declaration and definition
		isReady(googleMainPage = new GoogleMainPage(driver));

		// Steps to build the stage (Pre steps)

		try {
			// Go to www.google.es
			// Check that the google logo is displayed
			isLogoDisplayed();

			// Check that the 'Buscar con Google' button is displayed
			isSearchButtonDisplayed();

			// Check that the 'Voy a tener suerte' button is displayed
			isLuckButtonDisplayed();

			// Check that the search field is displayed
			isSearchFieldDisplayed();

			// Do this search 'amazon'
			googleMainPage.doSearch("amazon");

			// Check that several results are displayed
			areSeveralResults();

		} finally {
			// Steps to clear the stage (Post steps)
		}

		log.info("[log-TestSet] " + this.getClass().getName() + " - End test method: " + method.getName());
	}

	/**
	 * Description: Do a search in Google, access to Amazon page and do Tests
	 * 
	 * Pre steps: - Open the browser
	 * 
	 * Steps: - Go to www.google.es - Do this search 'www.amazon.es' - Access to
	 * 'www.amazon.es' - Check that the logo is displayed - Access to the 'Todos los
	 * departamentos' dropdown - Select 'Informatica' option - Search on search
	 * field 'ordenadores' - Back to main page clicking on the logo - Check the
	 * basket - Click on 'login' and introduce a value in the login field - Back to
	 * main page - Deploy the dropdown - Select 'Relojes' option and do a search -
	 * Select Casio option and back to the search result page - Filter by 'Hombre'
	 * watches - Filter by '50 - 100 EUR' watches - Select Casio option more
	 * expensive than previous Casio watch - Add Casio watch to the basket - Check
	 * the basket with the new object - Click on right arrow - Click on right arrow
	 * 
	 * Post steps: - Close the browser
	 * 
	 */
	@Test(description = "googleDoSearchAndAccessToAmazonPage")
	public void googleDoSearchAndAccessToAmazonPage(Method method) {
		log.info("[log-TestSet] " + this.getClass().getName() + " - Start test method: " + method.getName());

		// Variable declaration and definition
		isReady(googleMainPage = new GoogleMainPage(driver));

		// Steps to build the stage (Pre steps)

		try {

			/*
			 * // Go to www.google.es // Do this search 'www.amazon.es'
			 * googleMainPage.doSearch("www.amazon.es");
			 * 
			 * // Access to 'www.amazon.es' amazonMainPage =
			 * googleMainPage.clickOnAmazonPage();
			 * 
			 * // Check that the logo is displayed isAmazonLogoDisplayed();
			 * 
			 * // TODO: Remove the following line when you complete the test
			 * //assertTrue("Developing test", false);
			 * 
			 * // Click on dropdown amazonMainPage.clickOnAmazonDespPage();
			 * 
			 * // Select "Informatica" option amazonMainPage.clickOnAmazonDespOptPage();
			 * 
			 * // Search "ordenadores" amazonMainPage.doSearch("ordenadores");
			 * 
			 * // Click on Amazon Logo amazonMainPage.clickOnAmazonLogoPage();
			 * 
			 * // Click on basket amazonMainPage.clickOnAmazonBasketPage();
			 * 
			 * // Click on login amazonMainPage.clickOnAmazonLoginPage();
			 * 
			 * // Check that the Amazon logo is displayed isAmazonLogoLoginDisplayed();
			 * 
			 * // Write Prueba on Email Field Login amazonLoginPage.doLogin("prueba");
			 * 
			 * // Back to the previous page amazonLoginPage.volver();
			 * 
			 * // Back to the previous page amazonLoginPage.volver();
			 * 
			 * // Click on dropdown amazonMainPage.clickOnAmazonDespPage();
			 * 
			 * // Select "Relojes" option amazonMainPage.clickOnAmazonDespRelojesOptPage();
			 * 
			 * 
			 * 
			 * // Select Cassio from search
			 * amazonMainPage.clickOnAmazonRelojCassioOptPage();
			 * 
			 * // Back to the previous page amazonLoginPage.volver();
			 * 
			 * // Click Hombre button amazonMainPage.clickOnAmazonRelojesHombreOptPage();
			 * 
			 * // Click 50-100 button amazonMainPage.clickOnAmazonRelojes50a100OptPage();
			 * 
			 * amazonMainPage.clickOnAmazonPrimeCheckBox();
			 * 
			 * // Select Cassio from filter "Hombre" and "50-100"
			 * amazonMainPage.clickOnAmazonRelojCassioCaroOptPage();
			 * 
			 * // Add to Basket amazonMainPage.clickOnAmazonAddToBasketPage();
			 * 
			 * // Click on basket amazonMainPage.clickOnAmazonBasketPage();
			 */

			// Go to www.google.es
			// Do this search 'www.amazon.es'
			googleMainPage.doSearch("www.amazon.es");

			// Access to 'www.amazon.es'
			amazonMainPage = googleMainPage.clickOnAmazonPage();

			// Check that the logo is displayed
			isAmazonLogoDisplayed();

			// Click on dropdown
			amazonMainPage.clickOnAmazonDropdown();

			// Select "Informatica" option
			amazonMainPage.clickOnAmazonDropdownOption();

			// Search "ordenadores"
			amazonMainPage.doSearch("ordenadores");

			// Click on Amazon Logo
			amazonMainPage.clickOnAmazonLogoPage();

			// Click on basket
			amazonMainPage.clickOnAmazonBasketPage();

			// Click on login
			amazonMainPage.clickOnAmazonLoginPage();

			// Check that the Amazon logo is displayed
			isAmazonLogoLoginDisplayed();

			// Write Prueba on Email Field Login
			amazonLoginPage.doLogin("prueba");

			// Back to the previous page
			amazonLoginPage.doBack();

			// Back to the previous page
			amazonLoginPage.doBack();

			// Click on dropdown
			amazonMainPage.clickOnAmazonDropdown();

			// Select "Relojes" option
			amazonMainPage.clickOnAmazonDropdownRelojesOption();

			// Select Cassio from search
			amazonMainPage.clickOnAmazonRelojCasioOption();

			// Back to the previous page
			amazonLoginPage.doBack();

			// Click Hombre button
			amazonMainPage.clickOnAmazonRelojesHombreOption();

			// Click 50-100 button
			amazonMainPage.clickOnAmazonRelojes50To100Option();

			// Select Cassio from filter "Hombre" and "50-100"
			amazonMainPage.clickOnAmazonRelojCasioExpensiveOption();

			// Add to Basket
			amazonMainPage.clickOnAmazonAddToBasketPage();

			// Click on basket
			amazonMainPage.clickOnAmazonBasketPage();

			// Click on Right Arrow button
			amazonMainPage.clickOnAmazonRightArrowBasket();
			amazonMainPage.clickOnAmazonRightArrowBasket();

			driver.sleep(5);

		} finally {
			// Steps to clear the stage (Post steps)
		}

		log.info("[log-TestSet] " + this.getClass().getName() + " - End test method: " + method.getName());
	}

	/**
	 * Description: Do a search in Google, access to Amazon page and do Tests
	 * 
	 * Pre steps: - Open the browser
	 * 
	 * Steps: - Go to www.google.es - Do this search 'www.amazon.es' - Access to
	 * 'www.amazon.es' - Check that the logo is displayed - Select Blu-Ray option
	 * from dropdown 'Todos los departamentos' without click - Search 'Pulp Fiction'
	 * on blu-ray section - Select Pulp Fiction film - Add Pulp Fiction to the
	 * basket - Open the basket - click on the dropdown of the number of product
	 * units - Select 2 units - Add other film to the basket - Check the basket with
	 * 2 films
	 * 
	 * Post steps: - Close the browser
	 * 
	 */
	@Test(description = "googleDoSearchAndAccessToAmazonFilterPage")
	public void googleDoSearchAndAccessToAmazonFilterPage(Method method) {
		log.info("[log-TestSet] " + this.getClass().getName() + " - Start test method: " + method.getName());

		// Variable declaration and definition
		isReady(googleMainPage = new GoogleMainPage(driver));

		// Steps to build the stage (Pre steps)

		try {
			// Go to www.google.es
			// Do this search 'www.amazon.es'
			googleMainPage.doSearch("www.amazon.es");

			// Access to 'www.amazon.es'
			amazonMainPage = googleMainPage.clickOnAmazonPage();

			// Check that the logo is displayed
			isAmazonLogoDisplayed();

			// Deploy dropdown without click and select cine and blu-ray
			amazonMainPage.selectOnAmazonDropdownWCBluRayOption();

			// Search Pulp Fiction
			amazonMainPage.doSearch("Pulp Fiction");

			driver.sleep(2);
			// Select a Pulp Fiction option
			amazonMainPage.clickOnAmazonPulpFictionFilm();

			driver.sleep(2);

			// Add to Basket
			amazonMainPage.clickOnAmazonAddToBasketPage();

			// Click on basket
			amazonMainPage.clickOnAmazonBasketPage();

			// Click on dropdown for select units of the basket
			amazonMainPage.clickOnAmazonSelectUnitsDropdown();

			// Click on option 2 of dropdown
			amazonMainPage.clickOnAmazonSelectUnitsOption2();

			driver.sleep(2);

			// Click on add to the basket for add another film to the basket
			amazonMainPage.clickOnAmazonAddOtherFilmToBasket();

			// Click on the basket
			amazonMainPage.clickOnAmazonBasketPage();
			// TODO: Remove the following line when you complete the test
			// assertTrue("Developing test", false);

		} finally {
			// Steps to clear the stage (Post steps)
		}

		log.info("[log-TestSet] " + this.getClass().getName() + " - End test method: " + method.getName());
	}

	/**
	 * Description: Do a search in Google, access to Zamzar page and do Tests
	 * 
	 * Pre steps: - Open the browser
	 * 
	 * Steps: - Go to www.google.es - Do this search 'zamzar' - Access to
	 * 'www.zamzar.com' - Check that the logo is displayed - Click on 'Choose Files'
	 * button - Select a image - Click on dropdown - Select 'jpg' option - Find word
	 * 'Formats' using a robot
	 * 
	 * Post steps: - Close the browser
	 * 
	 */
	@Test(description = "ZamzarPage")
	public void ZamzarPage(Method method) throws Exception {
		log.info("[log-TestSet] " + this.getClass().getName() + " - Start test method: " + method.getName());

		// Variable declaration and definition
		isReady(googleMainPage = new GoogleMainPage(driver));

		// Steps to build the stage (Pre steps)

		try {
			// Go to www.google.es
			// Do this search 'www.amazon.es'
			googleMainPage.doSearch("zamzar");

			// Access to 'www.amazon.es'
			zamzarMainPage = googleMainPage.clickOnZamzarPage();

			// Check that the logo is displayed
			isZamzarLogoDisplayed();

			// Click on choose file button
			zamzarMainPage.clickOnZamzarChooseFileButton2();

			driver.sleep(2);

			// Run method enterImg that contains Robot for select an image.
			zamzarMainPage.enterImg();

			driver.sleep(2);

			// Click on dropdown
			zamzarMainPage.clickOnZamzarDropdown();

			driver.sleep(2);

			// Click on dropdown option(option --> .jpg)
			zamzarMainPage.clickOnZamzarDropdownOption();
			driver.sleep(3);

			// Run method findRobot that contains Robot for find a String
			zamzarMainPage.findRobot();

			driver.sleep(5);

			// TODO: Remove the following line when you complete the test
			// assertTrue("Developing test", false);

		} finally {
			// Steps to clear the stage (Post steps)
		}

		log.info("[log-TestSet] " + this.getClass().getName() + " - End test method: " + method.getName());
	}

	/**
	 * Description: Do a search in Google, access to Imgur page and do Tests
	 * 
	 * Pre steps: - Open the browser
	 * 
	 * Steps: - Go to www.google.es - Do this search 'imgur' - Access to 'imgur.com'
	 * - Check that the logo is displayed - Click on 'New Post' button - Click on
	 * browse button - Select a image - Check if new post logo is displayed - Click
	 * on 'Add more images' button Click on browse button - Select a image - Click
	 * on 'Delete post' button - Click on 'Delete Post & Images'
	 * 
	 * Post steps: - Close the browser
	 * 
	 */
	@Test(description = "ImgurPage")
	public void ImgurPage(Method method) throws Exception {
		log.info("[log-TestSet] " + this.getClass().getName() + " - Start test method: " + method.getName());

		// Variable declaration and definition
		isReady(googleMainPage = new GoogleMainPage(driver));

		// Steps to build the stage (Pre steps)

		try {
			// Go to www.google.es
			// Do this search 'www.imgur.es'
			googleMainPage.doSearch("imgur");

			// Access to 'www.imgur.es'
			imgurMainPage = googleMainPage.clickOnImgurPage();

			// Check logo is displayed
			isImgurLogoDisplayed();

			// Click on NewPost button
			imgurMainPage.clickOnNewPostButton();

			// Click on choose file button
			imgurMainPage.clickOnChooseFileButton();

			driver.sleep(2);

			// Run method enterImg that contains Robot for select an image.
			imgurMainPage.enterImg();

			driver.sleep(5);

			// Check logo is displayed
			isImgurNewPostLogoDisplayed();

			// Click on add more image button
			imgurNewPostPage.clickOnImgurAddMoreImgButton();
			driver.sleep(3);

			// Click on choose file button
			imgurMainPage.clickOnChooseFileButton();

			// Run method enterImg that contains Robot for select an image.
			imgurNewPostPage.enterImg();
			driver.sleep(3);

			// Click on delete button after click on add more images.
			imgurNewPostPage.clickOnDeletePostAfterMoreImgButton();

			driver.sleep(5);

			// Click on delete confirm button
			imgurNewPostPage.clickOnDeletePostConfirmButton();
			driver.sleep(5);

		} finally {
			// Steps to clear the stage (Post steps)
		}

		log.info("[log-TestSet] " + this.getClass().getName() + " - End test method: " + method.getName());

	}

	/**
	 * Description: Do a search in Google, access to Automationtesting page and do
	 * Tests
	 * 
	 * Pre steps: - Open the browser
	 * 
	 * Steps: - Access to 'http://demo.automationtesting.in/Index.html' - Check that
	 * the logo is displayed - Run a method that create a PopUp in the login to
	 * register page - Check that the register logo is displayed - Write 'Jose' on
	 * firstName field - Write 'prueba' on lastName field - Write 'Submit' on
	 * address field - Write error message on email field - Write '987654321' on
	 * phone field - Click on Male option - Click on Movies option - Click on
	 * Languages field - Click on 'Spanish' language option - Click on Skills field
	 * - Select 'Java' skill option - Select 'Spain' country option - Click on
	 * Select Country field - Select a country option - Select '1995' year - Select
	 * '06' month - Select '11' day - Write 'prueba' on password field - Write
	 * 'prueba' on confirm password field - Click on 'Seleccionar archivo' - Select
	 * an image
	 * 
	 * Post steps: - Close the browser
	 * 
	 */
	@Test(description = "AutomationDemoMainPage")
	public void AutomationDemoMainPage(Method method) throws Exception {

		log.info("[log-TestSet] " + this.getClass().getName() + " - Start test method: " + method.getName());

		// Variable declaration and definition
		isReady(googleMainPage = new GoogleMainPage(driver));

		// Steps to build the stage (Pre steps)

		try {

			// Go to this page "http://demo.automationtesting.in/Index.html"
			driver.get("http://demo.automationtesting.in/Index.html");

			// Check logo is displayed
			isADSLogoDisplayed();

			// Write "prueba" on email field
			// automationDemoSiteMainPage.emailMain("prueba");

			// Click on Enterimg button
			// automationDemoSiteMainPage.clickOnEnterimgButton();

			driver.sleep(4);

			// This method create a PopUp in login to register page
			automationDemoSiteMainPage.clickOnADSPopUp();

			driver.sleep(2);

			// Check logo is displayed
			isADSRegisterLogoDisplayed();

			// Write "Jose" on firstName field
			automationDemoSiteRegisterPage.firstNameRegister("Jose");

			// Write "prueba" on lastName field
			automationDemoSiteRegisterPage.lastNameRegister("prueba");

			// Write "Esto es una prueba" on address field
			// automationDemoSiteRegisterPage.addressRegister("Esto es una prueba");

			// Capture Text of Submit button and put it on Address field
			automationDemoSiteRegisterPage.clickOnADSAddressSubmit();

			// Write "estoesunaprueba@prueba.prueba" on email field
			// automationDemoSiteRegisterPage.emailRegister("estoesunaprueba@prueba.prueba");
			automationDemoSiteRegisterPage.emailMessageRegister();

			// Write "987654321" on phone field
			automationDemoSiteRegisterPage.phoneRegister("987654321");
			driver.sleep(1);

			// Click on Male option
			automationDemoSiteRegisterPage.clickOnADSMaleOption();

			// Click on Movies option
			automationDemoSiteRegisterPage.clickOnADSMoviesOption();

			// Click on Languages field
			automationDemoSiteRegisterPage.clickOnADSLanguagesField();

			// Click on Spanish language option
			automationDemoSiteRegisterPage.clickOnADSSpanishLanguageOption();

			automationDemoSiteRegisterPage.clickOnADSEnglishLanguageOption();

			// Click on Skills field
			automationDemoSiteRegisterPage.clickOnADSSkillsField();

			// Click on on Java skill option
			automationDemoSiteRegisterPage.clickOnADSJavaSkillsOption();
			// automationDemoSiteRegisterPage.clickOnADSCountryField();

			driver.sleep(2);

			// Click on Spain country option
			automationDemoSiteRegisterPage.clickOnADSSpainCountryOption();

			// Click on Select Country field
			automationDemoSiteRegisterPage.clickOnADSSelectCountryField();

			// Click on Select Country option
			automationDemoSiteRegisterPage.clickOnADSSelectCountryOption();

			// automationDemoSiteRegisterPage.clickOnADSYearField();

			// Click on Year option
			automationDemoSiteRegisterPage.clickOnADSYearOption();
			// automationDemoSiteRegisterPage.clickOnADSMonthField();

			// Click on Month option
			automationDemoSiteRegisterPage.clickOnADSMonthOption();
			// automationDemoSiteRegisterPage.clickOnADSDayField();

			// Click on Day option
			automationDemoSiteRegisterPage.clickOnADSDayOption();

			// Write "prueba" as password
			automationDemoSiteRegisterPage.passRegister("prueba");

			// Write "prueba confirm" as confirm password
			automationDemoSiteRegisterPage.passConfirmRegister("prueba");

			driver.sleep(5);

			// Click on updateFile button
			automationDemoSiteRegisterPage.clickOnADSupdateFileButton();

			// This method run a robot that select a file
			automationDemoSiteRegisterPage.selectFile();

			driver.sleep(5);
		} finally {
			// Steps to clear the stage (Post steps)
		}

		log.info("[log-TestSet] " + this.getClass().getName() + " - End test method: " + method.getName());
	}

	/**
	 * Description: Do a search in Google,access to Automationtesting page and do
	 * Tests
	 * 
	 * Pre steps: - Open the browser
	 * 
	 * Steps: - Access to 'http://demo.automationtesting.in/Register.html' - Check
	 * that the register logo is displayed - Write 'Jose' on firstName field - Write
	 * 'prueba' on lastName field - Write 'Esto es una prueba' on address field -
	 * Write 'estoesunaprueba@prueba.prueba' on email field - Write '000000000' on
	 * phone field - Click on Male option - Click on Movies option - Click on
	 * Languages field - Click on 'Spanish' language option - Click on Skills field
	 * - Select 'Java' skill option - Select 'Spain' country option - Click on
	 * Select Country field - Select a country option - Select '1995' year - Select
	 * '06' month - Select '11' day - Write 'prueba' on password field - Write
	 * 'prueba confirm' on confirm password field - Click on 'Seleccionar un
	 * archivo' - Select an image
	 * 
	 * Post steps: - Close the browser
	 * 
	 */
	@Test(description = "AutomationDemoPage")
	public void AutomationDemoPage(Method method) throws Exception {

		log.info("[log-TestSet] " + this.getClass().getName() + " - Start test method: " + method.getName());

		// Variable declaration and definition
		isReady(googleMainPage = new GoogleMainPage(driver));

		// Steps to build the stage (Pre steps)

		try {

			// Go to this page "http://demo.automationtesting.in/Register.html"
			driver.get("http://demo.automationtesting.in/Register.html");

			// Check logo is displayed
			isADSRegisterLogoDisplayed();

			/**
			 * This method click on WebTable button using By.linkText selector
			 * 
			 * automationDemoSiteRegisterPage.clickOnADSWebTableLinkButton();
			 * driversleep(3000);
			 */

			/**
			 * This method click on WebTable button using By.partialLinkText selector
			 * 
			 * automationDemoSiteRegisterPage.clickOnADSWebTablePartialLinkButton();
			 * driver.sleep(10);
			 */

			// Write "Jose" on firstName field
			automationDemoSiteRegisterPage.firstNameRegister("Jose");

			// Write "prueba" on lastName field
			automationDemoSiteRegisterPage.lastNameRegister("prueba");

			// Write "Esto es una prueba" on address field
			automationDemoSiteRegisterPage.addressRegister("Esto es una prueba");

			// Write "estoesunaprueba@prueba.prueba" on email field
			// automationDemoSiteRegisterPage.emailRegister("estoesunaprueba@prueba.prueba");
			automationDemoSiteRegisterPage.emailMessageRegister();
			// Write "000000000" on phone field
			automationDemoSiteRegisterPage.phoneRegister("000000000");

			driver.sleep(2);

			// Click on Male option
			automationDemoSiteRegisterPage.clickOnADSMaleOption();

			// automationDemoSiteRegisterPage.clickOnADSFemaleOption();

			// Click on Movies option
			automationDemoSiteRegisterPage.clickOnADSMoviesOption();

			// Click on Languages field
			automationDemoSiteRegisterPage.clickOnADSLanguagesField();

			// Click on Spanish Languaje option
			automationDemoSiteRegisterPage.clickOnADSSpanishLanguageOption();

			// Click on Skills field
			automationDemoSiteRegisterPage.clickOnADSSkillsField();

			// Click on Java skill
			automationDemoSiteRegisterPage.clickOnADSJavaSkillsOption();

			// automationDemoSiteRegisterPage.clickOnADSCountryField();

			driver.sleep(2);

			// Click on Spain option
			automationDemoSiteRegisterPage.clickOnADSSpainCountryOption();

			// Click on Select Country field
			automationDemoSiteRegisterPage.clickOnADSSelectCountryField();

			// Click on EEUU option
			automationDemoSiteRegisterPage.clickOnADSSelectCountryOption();

			// Click on Year option
			automationDemoSiteRegisterPage.clickOnADSYearOption();

			// Click on Month option
			automationDemoSiteRegisterPage.clickOnADSMonthOption();

			// Click on Day option
			automationDemoSiteRegisterPage.clickOnADSDayOption();

			// Write "prueba" as password
			automationDemoSiteRegisterPage.passRegister("prueba");

			// Write "prueba confirm" as confirm password
			automationDemoSiteRegisterPage.passConfirmRegister("prueba confirm");

			driver.sleep(4);

			// Click on updateFile button
			automationDemoSiteRegisterPage.clickOnADSupdateFileButton();

			// This method run a robot that select a file.
			automationDemoSiteRegisterPage.selectFile();

			driver.sleep(4);

		} finally {
			// Steps to clear the stage (Post steps)
		}

		log.info("[log-TestSet] " + this.getClass().getName() + " - End test method: " + method.getName());
	}

	/**
	 * Description: Do a search in Google,access to Automationtesting page and do
	 * Tests
	 * 
	 * Pre steps: - Open the browser
	 * 
	 * Steps: - Go to www.google.es - Do this search 'automation demo site' - Access
	 * to 'http://demo.automationtesting.in/Register.html' - Check that the register
	 * logo is displayed - Click on 'WebTable' button - Run a robot that do double
	 * click on modify button and modify 'Email' and 'Phone' fields - Run a robot
	 * that delete a row of the table
	 * 
	 * Post steps: - Close the browser
	 * 
	 */
	@Test(description = "AutomationDemoSiteModifyAndDeleteWebTable")
	public void AutomationDemoSiteModifyAndDeleteWebTable(Method method) throws Exception {
		log.info("[log-TestSet] " + this.getClass().getName() + " - Start test method: " + method.getName());

		// Variable declaration and definition
		isReady(googleMainPage = new GoogleMainPage(driver));

		// Steps to build the stage (Pre steps)

		try {
			// Go to www.google.es
			// Do this search 'automation demo site'
			googleMainPage.doSearch("automation demo site");

			// Access to 'automation demo site'
			automationDemoSiteRegisterPage = googleMainPage.clickOnADSRegisterPage();

			// Check logo is displayed
			isADSRegisterLogoDisplayed();

			// Check logo is displayed
			isADSWebTableLogoDisplayed();

			// Click on WebTable button
			automationDemoSiteWebTable.clickOnADSWebTableButton();

			driver.sleep(10);

			// Run a robot that do double click on modify button and modify 'Email'
			automationDemoSiteWebTable.modifyNameData();

			driver.sleep(2);

			// Run a robot that modify 'phone number'
			automationDemoSiteWebTable.modifyPhoneData();

			driver.sleep(5);
			// This method run a robot that delete data of the table
			automationDemoSiteWebTable.deleteData();

			driver.sleep(2);

		} finally {
			// Steps to clear the stage (Post steps)
		}

		log.info("[log-TestSet] " + this.getClass().getName() + " - End test method: " + method.getName());
	}

	/**
	 * Description: Do a search in Google, access to Automationtesting page and do
	 * Tests
	 * 
	 * Pre steps: - Open the browser
	 * 
	 * Steps: - Go to www.google.es - Do this search 'automation demo site' - Access
	 * to 'http://demo.automationtesting.in/Register.html' - Check that the register
	 * logo is displayed - Click on 'FileDownload' button - Write on text area 'Esto
	 * es una prueba para ver si funciona correctamente el file download' - Click on
	 * 'Generate File' button of 'Generated Text File to Download' - Click on
	 * 'Download' button
	 * 
	 * Post steps: - Close the browser
	 * 
	 */
	@Test(description = "AutomationDemoSiteFileDownloadPage")
	public void AutomationDemoSiteFileDownloadPage(Method method) throws Exception {
		log.info("[log-TestSet] " + this.getClass().getName() + " - Start test method: " + method.getName());

		// Variable declaration and definition
		isReady(googleMainPage = new GoogleMainPage(driver));

		// Steps to build the stage (Pre steps)

		try {
			// Go to www.google.es
			// Do this search 'automation demo site'
			googleMainPage.doSearch("automation demo site");

			// Access to 'automation demo site'
			automationDemoSiteRegisterPage = googleMainPage.clickOnADSRegisterPage();

			// Check logo is displayed
			isADSRegisterLogoDisplayed();

			// Check logo is displayed
			isADSFileDownloadLogoDisplayed();

			// Click on FileDownload button
			automationDemoSiteFileDownloadPage.clickOnADSFileDownloadButton();

			// Write on a textarea the next message: "Esto es una prueba para ver si
			// funciona correctamente el file download"
			automationDemoSiteFileDownloadPage
					.bodyTxt("Esto es una prueba para ver si funciona correctamente el file download");

			// Click on Generate File button
			automationDemoSiteFileDownloadPage.clickOnADSCreateFileTxtButton();

			// Click on Download File Txt Button
			automationDemoSiteFileDownloadPage.clickOnADSDownloadFileTxtButton();

			driver.sleep(5);

		} finally {
			// Steps to clear the stage (Post steps)
		}

		log.info("[log-TestSet] " + this.getClass().getName() + " - End test method: " + method.getName());
	}

	/**
	 * Description: Do a search in Google, access to Automationtesting page
	 * 
	 * Pre steps: - Open the browser
	 * 
	 * Steps: - Go to "http://demo.automationtesting.in/Index.html" - Check that the
	 * logo is displayed - Write 'prueba' on access field - Click on 'Enterimg'
	 * button - Click on 'SwitchTo' button - Check that the SwitchTo logo is
	 * displayed - Click on 'click the button to display an alert box:' button -
	 * Accept the alert - Click on 'Alert with Ok & Cancel' - Click on 'click the
	 * button to display a confirm box:' button - Accept the alert - Click on 'Alert
	 * with Textbox' - Click on 'click the button to demonstrate the prompt box:'
	 * button - Accept the alert introducing 'Jose Manuel'
	 * 
	 * Post steps: - Close the browser
	 * 
	 */
	@Test(description = "AutomationDemoSwitchPage")
	public void AutomationDemoSwitchPage(Method method) throws Exception {

		log.info("[log-TestSet] " + this.getClass().getName() + " - Start test method: " + method.getName());

		// Variable declaration and definition
		isReady(googleMainPage = new GoogleMainPage(driver));

		// Steps to build the stage (Pre steps)

		try {
			// Go to "http://demo.automationtesting.in/Index.html"
			driver.get("http://demo.automationtesting.in/Index.html");

			// Check logo is displayed
			isADSLogoDisplayed();

			// Write "prueba" on email field
			automationDemoSiteMainPage.emailMain("prueba");

			// Click on Enterimg button
			automationDemoSiteMainPage.clickOnEnterimgButton();

			driver.sleep(5);

			// Check logo is displayed
			isADSRegisterLogoDisplayed();

			// Click on SwitchTo button
			automationDemoSiteRegisterPage.clickOnADSSwitchToButton();

			// Check logo is displayed
			isADSSwitchToAlertLogoDisplayed();

			// Click on OK alert
			automationDemoSiteSwitchToAlertPage.clickOnADSOKAlert();

			driver.sleep(2);

			// Accept the alert
			Alert alert = driver.switchTo().alert();
			driver.sleep(2);
			alert.accept();

			// This method run a robot that click on OkCancel button
			automationDemoSiteSwitchToAlertPage.enterRobotOKCancel();

			// This method run a robot that click on textBox button
			automationDemoSiteSwitchToAlertPage.textBoxRobot();

			driver.sleep(4);

		} finally {
			// Steps to clear the stage (Post steps)
		}

		log.info("[log-TestSet] " + this.getClass().getName() + " - End test method: " + method.getName());
	}

	/**
	 * Description: Do a search in Google, access to Automationtesting page and do
	 * Tests
	 * 
	 * Pre steps: - Open the browser
	 * 
	 * Steps: - Access to 'http://demo.automationtesting.in/Index.html' - Check that
	 * the logo is displayed - Write 'prueba' on access field - Click on 'Enterimg'
	 * button - Click on 'Resizable' button - Check that the Resizable logo is
	 * displayed - Resize the box using a robot
	 * 
	 * Post steps: - Close the browser
	 * 
	 */
	@Test(description = "AutomationDemoResizablePage")
	public void AutomationDemoResizablePage(Method method) throws Exception {

		log.info("[log-TestSet] " + this.getClass().getName() + " - Start test method: " + method.getName());

		// Variable declaration and definition
		isReady(googleMainPage = new GoogleMainPage(driver));

		// Steps to build the stage (Pre steps)

		try {
			// Access to http://demo.automationtesting.in/Index.html
			driver.get("http://demo.automationtesting.in/Index.html");

			// Check logo is displayed
			isADSLogoDisplayed();

			// Write "prueba" on email field
			automationDemoSiteMainPage.emailMain("prueba");

			// Click on Enterimg button
			automationDemoSiteMainPage.clickOnEnterimgButton();

			driver.sleep(4);

			// Check logo is displayed
			isADSResizableLogoDisplayed();

			// Click on resizable button
			automationDemoSiteResizablePage.clickOnADSResizableButton();

			driver.sleep(3);

			// This method run a robot that move mouse and resize the box
			automationDemoSiteResizablePage.moveMouseResizable();

			driver.sleep(5);
		} finally {
			// Steps to clear the stage (Post steps)
		}

		log.info("[log-TestSet] " + this.getClass().getName() + " - End test method: " + method.getName());
	}

	/**
	 * Description: Do a search in Google, access to Automationtesting page and do
	 * Tests
	 * 
	 * Pre steps: - Open the browser
	 * 
	 * Steps: Access to 'http://demo.automationtesting.in/Index.html' - Check that
	 * the logo is displayed - Write 'prueba' on access field - Click on 'Enterimg'
	 * button - Click on 'Drag And Drop' button - Check that the Drag and drop logo
	 * is displayed - Using a robot, click on objects and drag to next box
	 * 
	 * Post steps: - Close the browser
	 * 
	 */
	@Test(description = "AutomationDemoDragAndDropPage")
	public void AutomationDemoDragAndDropPage(Method method) throws Exception {

		log.info("[log-TestSet] " + this.getClass().getName() + " - Start test method: " + method.getName());

		// Variable declaration and definition
		isReady(googleMainPage = new GoogleMainPage(driver));

		// Steps to build the stage (Pre steps)

		try {
			// Go to www.google.es
			// Do this search 'demo.automation'
			// googleMainPage.doSearch("demo.automation");
			driver.get("http://demo.automationtesting.in/Index.html");
			// Access to 'automation demo site'
			// automationDemoSiteMainPage = googleMainPage.clickOnADSMainPage();

			// Check logo is displayed
			isADSLogoDisplayed();

			// Write "prueba" on email field
			automationDemoSiteMainPage.emailMain("prueba");

			// Click on Enterimg button
			automationDemoSiteMainPage.clickOnEnterimgButton();

			driver.sleep(5);

			// Check logo is displayed
			isADSDragAndDropLogoDisplayed();

			driver.sleep(3);

			// Click on Drop and drag button
			automationDemoSiteDragAndDropPage.clickOnADSDropAndDragButton();

			driver.sleep(3);

			// Click on elements and drag to the right box
			automationDemoSiteDragAndDropPage.moveItemsDragAndDrop();

			driver.sleep(5);
		} finally {
			// Steps to clear the stage (Post steps)
		}

		log.info("[log-TestSet] " + this.getClass().getName() + " - End test method: " + method.getName());
	}

	/**
	 * Description: Do a search in Google, access to Automationtesting page and do
	 * Tests
	 * 
	 * Pre steps: - Open the browser
	 * 
	 * Steps: - Access to 'http://demo.automationtesting.in/Register.html' - Check
	 * that the register logo is displayed - Click on 'FileUpload' button - Check
	 * that the fileUpload logo is displayed - Click on 'Browse' button - Select a
	 * image - Click on 'Remove' button
	 * 
	 * Post steps: - Close the browser
	 * 
	 */
	@Test(description = "AutomationDemoSiteFileUploadPage")
	public void AutomationDemoSiteFileUploadPage(Method method) throws Exception {
		log.info("[log-TestSet] " + this.getClass().getName() + " - Start test method: " + method.getName());

		// Variable declaration and definition
		isReady(googleMainPage = new GoogleMainPage(driver));

		// Steps to build the stage (Pre steps)

		try {
			// Go to www.google.es
			// Do this search 'automation demo site'
			// googleMainPage.doSearch("automation demo site");
			driver.get("http://demo.automationtesting.in/Register.html");
			// Access to 'automation demo site'
			// automationDemoSiteRegisterPage = googleMainPage.clickOnADSRegisterPage();

			// Check logo is displayed
			isADSRegisterLogoDisplayed();

			// Check logo is displayed
			isADSFileUploadLogoDisplayed();

			// Click on FileUpload button
			automationDemoSiteFileUploadPage.clickOnADSFileUploadButton();

			driver.sleep(2);

			// Click on Browser button
			automationDemoSiteFileUploadPage.clickOnBrowserButton();

			driver.sleep(2);

			// This method run a robot that select a file.
			automationDemoSiteFileUploadPage.selectFile();

			driver.sleep(5);

			// Click on remove file button.
			automationDemoSiteFileUploadPage.clickOnRemoveFileButton();

			driver.sleep(4);

		} finally {
			// Steps to clear the stage (Post steps)
		}

		log.info("[log-TestSet] " + this.getClass().getName() + " - End test method: " + method.getName());
	}

	/**
	 * Description: Do a search in Google, access to Dezlearn page and do Tests
	 * 
	 * Pre steps: - Open the browser
	 * 
	 * Steps: - Access to 'http://www.dezlearn.com/' - Check that the logo is
	 * displayed - Click on 'TestingPage' button - Check that the test logo is
	 * displayed - Click on 'Test PopUp' - Close the new window - Click on 'Alert
	 * Box' button - Accept the alert - Click on 'Confirm Seat' button - Accept the
	 * alert
	 * 
	 * Post steps: - Close the browser
	 * 
	 */
	@Test(description = "DezLearnPage")
	public void DezLearnPage(Method method) throws Exception {

		log.info("[log-TestSet] " + this.getClass().getName() + " - Start test method: " + method.getName());

		// Variable declaration and definition
		isReady(googleMainPage = new GoogleMainPage(driver));

		// Steps to build the stage (Pre steps)

		try {
			// Go to www.google.es
			// Do this search 'automation demo site'
			// googleMainPage.doSearch("dezlearn.com");
			driver.get("http://www.dezlearn.com/");
			// Access to 'automation demo site'
			// dezLearnMainPage = googleMainPage.clickOnDezLearnPage();

			// Check logo is displayed
			isDezLearnLogoDisplayed();

			// Write "prueba" on email field
			dezLearnMainPage.clickOnTestButton();

			// Check that DezlearnTest logo is displayed
			isDezLearnTestLogoDisplayed();

			// Click on PopUp button
			dezLearnTestPage.clickOnPopUpButton();

			driver.sleep(5);

			// Switch to the new windown and close it
			dezLearnTestPage.SwitchTabandClose();
			// Click on Alert button
			dezLearnTestPage.clickOnAlertButton();

			driver.sleep(2);

			// Check if alert is present and accept it
			dezLearnTestPage.isAlertPresent();
			driver.sleep(2);
			if (dezLearnTestPage.isAlertPresent()) {
				driver.switchTo().alert().accept();
			}

			// Click on Confirm Seat button
			dezLearnTestPage.clickOnConfirmSeatButton();

			// Check if alert is present and accept it
			dezLearnTestPage.isAlertPresent();
			driver.sleep(2);
			if (dezLearnTestPage.isAlertPresent()) {
				driver.switchTo().alert().accept();
			}

			driver.sleep(5);

		} finally {
			// Steps to clear the stage (Post steps)
		}

		log.info("[log-TestSet] " + this.getClass().getName() + " - End test method: " + method.getName());
	}

	/**
	 * Description: Do a search in Google, access to JQuery UI page and do Tests
	 * 
	 * Pre steps: - Open the browser
	 * 
	 * Steps: - Access to 'http://jqueryui.com/demos/' - Check that the logo is
	 * displayed - Click on 'Effect' button - Check that the Effect logo is
	 * displayed - Switch to Box frame - Deploy dropdrown - Select 'Size' option -
	 * Click on 'Run Effect' button
	 * 
	 * Post steps: - Close the browser
	 * 
	 */
	@Test(description = "JQueryUIDemosEffectPage")
	public void JQueryUIDemosEffectPage(Method method) throws Exception {
		log.info("[log-TestSet] " + this.getClass().getName() + " - Start test method: " + method.getName());

		// Variable declaration and definition
		isReady(googleMainPage = new GoogleMainPage(driver));

		// Steps to build the stage (Pre steps)

		try {
			// Go to www.google.es
			// Do this search 'jquery UI demos'
			// googleMainPage.doSearch("jquery UI demos");
			driver.get("http://jqueryui.com/demos/");
			// Access to 'JQuery UI demos page'
			// jqueryUIDemosPage = googleMainPage.clickOnJUIDemosPage();

			// Check if JQuery UI logo is displayed
			isJUILogoDisplayed();

			// Click on JQuery Effect button
			jqueryUIDemosPage.clickOnJUIEffectButton();

			// Check if JQuery UI Effect logo is displayed
			isJUIEffectLogoDisplayed();

			// This method change to box frame to work on it
			jqueryUIEffectOptionPage.switchToBoxFrame();

			// Click on JQuery UI Effect option button
			jqueryUIEffectOptionPage.clickOnJUIEffectOptionButton();
			driver.sleep(3);
			// Click on JQuery UI Effect Size option
			jqueryUIEffectOptionPage.clickOnJUIEffectSizeOption();

			// Click on JQuery UI Effect Run button
			jqueryUIEffectOptionPage.clickOnJUIEffectRunButton();

			driver.sleep(4);

		} finally {
			// Steps to clear the stage (Post steps)
		}

		log.info("[log-TestSet] " + this.getClass().getName() + " - End test method: " + method.getName());
	}

	/**
	 * Description: Do a search in Google, access to JQuery UI page and do Tests
	 * 
	 * Pre steps: - Open the browser
	 * 
	 * Steps: - Access to 'http://jqueryui.com/demos/' - Check that the logo is
	 * displayed - Click on 'Droppable' button - Check that the droppable logo is
	 * displayed - Switch to Box frame - Take first box and drag it into second box
	 * 
	 * Post steps: - Close the browser
	 * 
	 */
	@Test(description = "JQueryUIDemosDroppablePage")
	public void JQueryUIDemosDroppablePage(Method method) throws Exception {
		log.info("[log-TestSet] " + this.getClass().getName() + " - Start test method: " + method.getName());

		// Variable declaration and definition
		isReady(googleMainPage = new GoogleMainPage(driver));

		// Steps to build the stage (Pre steps)

		try {
			// Go to www.google.es
			// Do this search 'jquery UI demos'
			// googleMainPage.doSearch("jquery UI demos");
			driver.get("http://jqueryui.com/demos/");
			// Access to 'JQuery UI demos page'
			// jqueryUIDemosPage = googleMainPage.clickOnJUIDemosPage();

			// Check if JQuery UI logo is displayed
			isJUILogoDisplayed();

			// Click on JQuery Droppable button
			jqueryUIDemosPage.clickOnJUIDroppableButton();

			// Check if JQuery UI Effect logo is displayed
			isJUIEffectLogoDisplayed();

			// This method change to box frame to work on it
			jqueryUIEffectOptionPage.switchToBoxFrame();

			driver.sleep(3);

			// This method click and hold a element and release it on the next element
			jqueryUIDemosPage.dragAndDropBox();

			driver.sleep(4);

		} finally {
			// Steps to clear the stage (Post steps)
		}

		log.info("[log-TestSet] " + this.getClass().getName() + " - End test method: " + method.getName());
	}

	/**
	 * Description: Do a search in Google, access to JQuery UI page and do Tests
	 * 
	 * Pre steps: - Open the browser
	 * 
	 * Steps: - Access to 'http://jqueryui.com/demos/' - Check that the logo is
	 * displayed - Click on 'Resizable' button - Check that the resizable logo is
	 * displayed - Switch to Box frame - Resize the box - Switch to default "frame"
	 * - Click on 'Demos' button
	 * 
	 * Post steps: - Close the browser
	 * 
	 */
	@Test(description = "JQueryUIResizableOptionPage")
	public void JQueryUIResizableOptionPage(Method method) throws Exception {
		log.info("[log-TestSet] " + this.getClass().getName() + " - Start test method: " + method.getName());

		// Variable declaration and definition
		isReady(googleMainPage = new GoogleMainPage(driver));

		// Steps to build the stage (Pre steps)

		try {
			// Go to www.google.es
			// Do this search 'jquery UI demos'
			// googleMainPage.doSearch("jquery UI demos");
			driver.get("http://jqueryui.com/demos/");
			// Access to 'JQuery UI Demos Page'
			// jqueryUIDemosPage = googleMainPage.clickOnJUIDemosPage();

			// Check that logo is displayed
			isJUILogoDisplayed();

			// Click on Resizable button
			jqueryUIDemosPage.clickOnJUIResizableButton();

			// Check if JQuery UI Resizable logo is displayed
			isJUIResizableLogoDisplayed();

			// This method change to Box frame to work on it
			jqueryUIResizableOptionPage.switchToBoxFrame();

			// This method click on right bottom corner and move it for resize the box
			jqueryUIResizableOptionPage.resizableOption();

			// This method return to default "frame"
			jqueryUIResizableOptionPage.switchToDefault();

			// Click on Demos button
			jqueryUIResizableOptionPage.clickOnJUIDemosButton();

			driver.sleep(6);

		} finally {
			// Steps to clear the stage (Post steps)
		}

		log.info("[log-TestSet] " + this.getClass().getName() + " - End test method: " + method.getName());
	}

	/**
	 * Description: Do a search in Google, access to JQuery UI page and do Tests
	 * 
	 * Pre steps: - Open the browser
	 * 
	 * Steps: - Access to 'http://jqueryui.com/demos/' - Check that the logo is
	 * displayed - Click on 'Autocomplete' button - Check that the autocomplete logo
	 * is displayed - Switch to Box frame - Write 'Ja' on tag field - Select 'Java'
	 * option
	 * 
	 * Post steps: - Close the browser
	 * 
	 */
	@Test(description = "JQueryUIAutocompletePage")
	public void jQueryUIAutocompletePage(Method method) {
		log.info("[log-TestSet] " + this.getClass().getName() + " - Start test method: " + method.getName());

		// Variable declaration and definition
		isReady(googleMainPage = new GoogleMainPage(driver));

		// Steps to build the stage (Pre steps)

		try {

			// Go to this page "http://jqueryui.com/demos/"
			driver.get("http://jqueryui.com/demos/");

			// Check that the logo is displayed
			isJUIAutocompleteLogoDisplayed();

			// Click on Autocomplete button
			jqueryUIAutocompletePage.clickOnJUIAutocompleteButton();

			driver.sleep(4);

			// This method change to Box frame to work on it
			jqueryUIAutocompletePage.switchToBoxFrame();

			// Write 'Ja' on tag field
			jqueryUIAutocompletePage.writeOnJUITagField("Ja");

			driver.sleep(5);

			// Click on 'Java' option
			jqueryUIAutocompletePage.clickOnJUIJavaOption();

			driver.sleep(5);
		} finally {
			// Steps to clear the stage (Post steps)
		}

		log.info("[log-TestSet] " + this.getClass().getName() + " - End test method: " + method.getName());
	}

	/**
	 * Description: Do a search in Google, access to JQuery UI page and do Tests
	 * 
	 * Pre steps: - Open the browser
	 * 
	 * Steps: - Access to 'http://jqueryui.com/demos/' - Check that the logo is
	 * displayed - Click on 'Controlgroup' button - Check that the controlgroup logo
	 * is displayed - Switch to Box frame - Click on 'Compact Car' dropdown - Select
	 * 'Mid Size' option - Click on Standard button - Click on insurance button -
	 * Click 'Up arrow' button 6 times - Click on 'Compact Car' dropdown of second
	 * box - Select 'Full Size' option - Click on 'Automatic' option - Click 'Up
	 * arrow' 4 times - Switch to default "frame" - Click on search field - Select
	 * 'Java' option
	 * 
	 * Post steps: - Close the browser
	 * 
	 */
	@Test(description = "JQueryUIControlGroupPage")
	public void jQueryUIControlGroupPage(Method method) throws AWTException {
		log.info("[log-TestSet] " + this.getClass().getName() + " - Start test method: " + method.getName());

		// Variable declaration and definition
		isReady(googleMainPage = new GoogleMainPage(driver));

		// Steps to build the stage (Pre steps)

		try {

			// Go to this page "http://jqueryui.com/demos/"
			driver.get("http://jqueryui.com/demos/");

			// Check that the logo is displayed
			isJUIControlGroupLogoDisplayed();

			// Click on Controlgroup button
			jqueryUIControlGroupPage.clickOnJUIControlGroupButton();

			driver.sleep(3);

			// This method change to Box frame to work on it
			jqueryUIControlGroupPage.switchToBoxFrame();

			// Click on 'Compact Car' first box dropdown
			jqueryUIControlGroupPage.clickOnJUICompactCarFirstBoxDropdown();

			driver.sleep(3);

			// Click on 'Mid Size' option
			jqueryUIControlGroupPage.clickOnJUIMidSizeOption();

			driver.sleep(3);

			// Click on 'Standard' option
			jqueryUIControlGroupPage.clickOnJUIStandardOption();

			driver.sleep(3);

			// Click on 'Insurance' option
			jqueryUIControlGroupPage.clickOnJUIInsuranceOption();

			driver.sleep(3);

			// Click on 'Up arrow' button 6 times
			jqueryUIControlGroupPage.clickOnJUIUpButton();
			driver.sleep(3);
			jqueryUIControlGroupPage.clickOnJUIUpButton();
			driver.sleep(3);
			jqueryUIControlGroupPage.clickOnJUIUpButton();
			driver.sleep(3);
			jqueryUIControlGroupPage.clickOnJUIUpButton();
			driver.sleep(3);
			jqueryUIControlGroupPage.clickOnJUIUpButton();
			driver.sleep(3);
			jqueryUIControlGroupPage.clickOnJUIUpButton();
			driver.sleep(6);

			// Click on 'Compact Car' second box dropdown
			jqueryUIControlGroupPage.clickOnJUICompactCarSecondBox();

			driver.sleep(3);

			// Select 'Full Size' option
			jqueryUIControlGroupPage.clickOnJUIFullSizeOption();

			driver.sleep(3);

			// Click on 'Automatic' option
			jqueryUIControlGroupPage.clickOnJUIAutomaticOption();

			driver.sleep(3);

			// Click on 'Up arrow' second box button 4 times
			jqueryUIControlGroupPage.clickOnJUIUpSecondBoxButton();
			jqueryUIControlGroupPage.clickOnJUIUpSecondBoxButton();
			jqueryUIControlGroupPage.clickOnJUIUpSecondBoxButton();
			jqueryUIControlGroupPage.clickOnJUIUpSecondBoxButton();

			driver.sleep(6);

			// This method switch to default "frame"
			jqueryUIControlGroupPage.switchToDefault();

			// Click on Search field
			jqueryUIControlGroupPage.clickOnJUISearchField();
			driver.sleep(5);
		} finally {
			// Steps to clear the stage (Post steps)
		}

		log.info("[log-TestSet] " + this.getClass().getName() + " - End test method: " + method.getName());
	}

	/**
	 * Description: Do a search in Google, access to JQuery UI page and do Tests
	 * 
	 * Pre steps: - Open the browser
	 * 
	 * Steps: - Access to 'http://jqueryui.com/demos/' - Check that the logo is
	 * displayed - Click on 'Datepicker' button - Check that the datepicker logo is
	 * displayed - Switch to Box frame - Click on 'Date' field - Click 'Right arrow'
	 * 2 times - Select '11' day button - Click on 'Date' field
	 * 
	 * Post steps: - Close the browser
	 * 
	 */
	@Test(description = "JQueryUIDatepickerPage")
	public void jQueryUIDatepickerPage(Method method) {
		log.info("[log-TestSet] " + this.getClass().getName() + " - Start test method: " + method.getName());

		// Variable declaration and definition
		isReady(googleMainPage = new GoogleMainPage(driver));

		// Steps to build the stage (Pre steps)

		try {

			// Go to this page "http://jqueryui.com/demos/"
			driver.get("http://jqueryui.com/demos/");

			driver.sleep(2);

			// Check that the logo is displayed
			isJUIDatepickerLogoDisplayed();

			// Click on Datepicker button
			jqueryUIDatepickerPage.clickOnJUIDatepickerButton();

			// This method change to Box frame to work on it
			jqueryUIDatepickerPage.switchToBoxFrame();

			// Click on Date field
			jqueryUIDatepickerPage.clickOnJUIDateField();

			driver.sleep(2);

			// Click on 'Right arrow' button 2 times
			jqueryUIDatepickerPage.clickOnJUIRightArrowCalendarButton();
			driver.sleep(2);
			jqueryUIDatepickerPage.clickOnJUIRightArrowCalendarButton();
			driver.sleep(2);

			// Select '11' day button
			jqueryUIDatepickerPage.clickOnJUIDay11Button();

			driver.sleep(3);

			// Click on Date field
			jqueryUIDatepickerPage.clickOnJUIDateField();

			driver.sleep(5);

		} finally {
			// Steps to clear the stage (Post steps)
		}

		log.info("[log-TestSet] " + this.getClass().getName() + " - End test method: " + method.getName());
	}

	/**
	 * Description: Do a search in Google, access to JQuery UI page and do Tests
	 * 
	 * Pre steps: - Open the browser
	 * 
	 * Steps: - Access to 'http://jqueryui.com/demos/' - Check that the selectable
	 * logo is displayed - Click on 'Selectable' button - Switch to Box frame -
	 * Click on 'Item1' option - Click on 'Item2' option - Click on 'Item3' option -
	 * Click on 'Item4' option - Click on 'Item5' option - Click on 'Item6' option -
	 * Click on 'Item7' option - Click on 'Item6' option - Click on 'Item5' option -
	 * Click on 'Item4' option - Click on 'Item3' option - Click on 'Item2' option -
	 * Click on 'Item1' option
	 * 
	 * Post steps: - Close the browser
	 * 
	 */
	@Test(description = "JQueryUISelectablePage")
	public void JQueryUISelectablePage(Method method) {
		log.info("[log-TestSet] " + this.getClass().getName() + " - Start test method: " + method.getName());

		// Variable declaration and definition
		isReady(googleMainPage = new GoogleMainPage(driver));

		// Steps to build the stage (Pre steps)

		try {

			// Go to this page "http://jqueryui.com/demos/"
			driver.get("http://jqueryui.com/demos/");

			// Check that the Selectable logo is displayed
			isJUISelectableLogoDisplayed();

			driver.sleep(2);

			// Click on Selectable button
			jqueryUISelectablePage.ClickOnSelectableButton();

			// This method change to Box frame to work on it
			jqueryUISelectablePage.switchToBoxFrame();

			// Click on Item1 option
			jqueryUISelectablePage.clickOnItem1Option();

			driver.sleep(2);

			// Click on Item2 option
			jqueryUISelectablePage.clickOnItem2Option();

			driver.sleep(2);

			// Click on Item3 option
			jqueryUISelectablePage.clickOnItem3Option();

			driver.sleep(2);

			// Click on Item4 option
			jqueryUISelectablePage.clickOnItem4Option();

			driver.sleep(2);

			// Click on Item5 option
			jqueryUISelectablePage.clickOnItem5Option();

			driver.sleep(2);

			// Click on Item6 option
			jqueryUISelectablePage.clickOnItem6Option();

			driver.sleep(2);

			// Click on Item7 option
			jqueryUISelectablePage.clickOnItem7Option();

			driver.sleep(2);

			// Click on Item6 option
			jqueryUISelectablePage.clickOnItem6Option();

			driver.sleep(2);

			// Click on Item5 option
			jqueryUISelectablePage.clickOnItem5Option();

			driver.sleep(2);

			// Click on Item4 option
			jqueryUISelectablePage.clickOnItem4Option();

			driver.sleep(2);

			// Click on Item3 option
			jqueryUISelectablePage.clickOnItem3Option();

			driver.sleep(2);

			// Click on Item2 option
			jqueryUISelectablePage.clickOnItem2Option();

			driver.sleep(2);

			// Click on Item1 option
			jqueryUISelectablePage.clickOnItem1Option();

			driver.sleep(2);
		} finally {
			// Steps to clear the stage (Post steps)
		}

		log.info("[log-TestSet] " + this.getClass().getName() + " - End test method: " + method.getName());
	}

	/**
	 * Description: Do a search in Google, access to JQuery UI page and do Tests
	 * 
	 * Pre steps: - Open the browser
	 * 
	 * Steps: - Access to 'http://jqueryui.com/demos/' - Check that the sortable
	 * logo is displayed - Click on 'Sortable' button - - Switch to Box frame - Swap
	 * 'Item position 7' to position 1 - (Disordering) - Swap 'Item position 6' to
	 * position 2 - Swap 'Item position 5' to position 3 - Swap 'Item position 7' to
	 * position 5 - (Ordering) - Swap 'Item position 4' to position 1 - Swap 'Item
	 * position 6' to position 2 - Swap 'Item position 5' to position 3 - Swap 'Item
	 * position 7' to position 4 - Swap 'Item position 6' to position 5 - Swap 'Item
	 * position 7' to position 6 - Click on 'Item2' option - Click on 'Item1' option
	 * 
	 * Post steps: - Close the browser
	 * 
	 */
	@Test(description = "JQueryUISortablePage")
	public void jQueryUISortablePage(Method method) {
		log.info("[log-TestSet] " + this.getClass().getName() + " - Start test method: " + method.getName());

		// Variable declaration and definition
		isReady(googleMainPage = new GoogleMainPage(driver));

		// Steps to build the stage (Pre steps)

		try {

			// Go to this page "http://jqueryui.com/demos/"
			driver.get("http://jqueryui.com/demos/");

			// Check that the Sortable logo is displayed
			isJUISortableLogoDisplayed();

			// Click on Sortable button
			jqueryUISortablePage.clickOnJUISortableButton();

			// This method change to Box frame to work on it
			jqueryUISortablePage.switchToBoxFrame();

			/**
			 * Disordering
			 */

			// Swap 'Item in the position 7' to position 1
			jqueryUISortablePage.clickAndHoldOnItem7To1Option();

			// Swap 'Item in the position 6' to position 2
			jqueryUISortablePage.clickAndHoldOnItem6To2Option();

			// Swap 'Item in the position 5' to position 3
			jqueryUISortablePage.clickAndHoldOnItem5To3Option();

			// Swap 'Item in the position 7' to position 5
			jqueryUISortablePage.clickAndHoldOnItem7To5Option();

			/**
			 * Ordering
			 */

			// Swap 'Item in the position 4' to position 1
			jqueryUISortablePage.clickAndHoldOnItem4To1OrderOption();

			// Swap 'Item in the position 6' to position 2
			jqueryUISortablePage.clickAndHoldOnItem6To2OrderOption();

			// Swap 'Item in the position 5' to position 3
			jqueryUISortablePage.clickAndHoldOnItem5To3OrderOption();

			// Swap 'Item in the position 7' to position 4
			jqueryUISortablePage.clickAndHoldOnItem7To4OrderOption();

			// Swap 'Item in the position 6' to position 5
			jqueryUISortablePage.clickAndHoldOnItem6To5OrderOption();

			// Swap 'Item in the position 7' to position 6
			jqueryUISortablePage.clickAndHoldOnItem7To6OrderOption();

			driver.sleep(5);
		} finally {
			// Steps to clear the stage (Post steps)
		}

		log.info("[log-TestSet] " + this.getClass().getName() + " - End test method: " + method.getName());
	}

	/**
	 * Description: Do a search in Google, access to JQuery UI Demos page and do
	 * Tests
	 * 
	 * Pre steps: - Open the browser
	 * 
	 * Steps: - Access to 'http://jqueryui.com/demos/' - Check that the logo is
	 * displayed - Click on 'Dialog' button - Check that the Dialog logo is
	 * displayed - Click on 'Model Form' Button - Switch to box frame - Write "Pepe"
	 * on name field - Write "pruebaPepe@prueba.prueba" on email field - Write
	 * "PassDePepe" on password field - Click on Create Account button
	 * 
	 * Post steps: - Close the browser
	 * 
	 */
	@Test(description = "jQueryUIDialogPage")
	public void jQueryUIDialogPage(Method method) {
		log.info("[log-TestSet] " + this.getClass().getName() + " - Start test method: " + method.getName());

		// Variable declaration and definition
		isReady(googleMainPage = new GoogleMainPage(driver));

		// Steps to build the stage (Pre steps)

		try {

			// Go to this page "http://jqueryui.com/demos/"
			driver.get("http://jqueryui.com/demos/");

			// Check that the logo is displayed
			// isJUILogoDisplayed();

			// Check that the Dialog logo is displayed
			isJUIDialogLogoDisplayed();

			// Click on JQueryUI Dialog button
			jqueryUIDialogPage.clickOnJUIDialogButton();

			// Click on JQueryUI modal form button
			jqueryUIDialogPage.clickOnJUIModalDialogButton();

			driver.sleep(2);

			// This method change to Box frame to work on it
			jqueryUIDialogPage.switchToBoxFrame();

			driver.sleep(2);

			// Click on Create User button
			jqueryUIDialogPage.clickOnJUICreateUserButton();

			driver.sleep(2);

			// Write "Pepe" on name field
			jqueryUIDialogPage.nameField("Pepe");

			driver.sleep(2);

			// Write "pruebaPepe@prueba.prueba" on email field
			jqueryUIDialogPage.emailField("pruebaPepe@prueba.prueba");

			driver.sleep(2);

			// Write "PassDePepe" on password field
			jqueryUIDialogPage.passField("PassDePepe");

			driver.sleep(3);

			// Click on Create New User button
			jqueryUIDialogPage.clickOnJUICreateAccButton();

			driver.sleep(5);

		} finally {
			// Steps to clear the stage (Post steps)
		}

		log.info("[log-TestSet] " + this.getClass().getName() + " - End test method: " + method.getName());
	}

	/**
	 * Description: Do a search in Google, access to JQuery UI Demos page and do
	 * Tests
	 * 
	 * Pre steps: - Open the browser
	 * 
	 * Steps: - Access to 'http://jqueryui.com/demos/' - Check that the logo is
	 * displayed - Click on 'Spinner' button - Check that the Spinner logo is
	 * displayed - Click on 'Map' Button - Switch to box frame - Write "37" on
	 * latitude field - Write "-6" on longitude field
	 * 
	 * Post steps: - Close the browser
	 * 
	 */
	@Test(description = "jQueryUISpinnerMapPage")
	public void jQueryUISpinnerMapPage(Method method) {
		log.info("[log-TestSet] " + this.getClass().getName() + " - Start test method: " + method.getName());

		// Variable declaration and definition
		isReady(googleMainPage = new GoogleMainPage(driver));

		// Steps to build the stage (Pre steps)

		try {

			// Go to this page "http://jqueryui.com/demos/"
			driver.get("http://jqueryui.com/demos/");

			// Check that the logo is displayed
			// isJUILogoDisplayed();

			// Check that the MapLogo logo is displayed
			isJUISpinnerMapLogoDisplayed();

			// Click on JQueryUI Spinner button
			jqueryUISpinnerMapPage.clickOnJUISpinnerButton();

			// Click on JQueryUI Spinner Map button
			jqueryUISpinnerMapPage.clickOnJUISpinnerMapButton();

			// This method change to Box frame to work on it
			jqueryUISpinnerMapPage.switchToBoxFrame();

			// Write "37" on latitude field
			jqueryUISpinnerMapPage.latitudeField("37");

			// Write "-6" on longitude field
			jqueryUISpinnerMapPage.longitudeField("-6");

			driver.sleep(5);

		} finally {
			// Steps to clear the stage (Post steps)
		}

		log.info("[log-TestSet] " + this.getClass().getName() + " - End test method: " + method.getName());
	}

	/**
	 * Description: Do a search in Google, access to JQuery UI ThemeRoller page and
	 * do Tests
	 * 
	 * Pre steps: - Open the browser
	 * 
	 * Steps: - Access to 'http://jqueryui.com/demos/' - Check that the logo is
	 * displayed - Click on 'Themes' button - Check that the ThemeRoller logo is
	 * displayed - Click on 'Third' option - Write 'Ja' on Autocomplete field -
	 * Select 'java' option - Click on 'Choice 1' option - Click on 'Standard'
	 * button - Click on 'Insurance' button - Click on 'Second' tab button - Click
	 * on 'Open Dialog' - Click on Ok of the new window - Move the Slider - Click on
	 * 'Right arrow' button 3 times - Select '11' day - Click on 'Select Menu'
	 * dropdown - Select 'Faster' option - Click on 'Up arrow' button 6 times -
	 * Click on 'Item 3' option - Click on 'Item 3-4' option
	 * 
	 * Post steps: - Close the browser
	 * 
	 */
	@Test(description = "jQueryUIThemeRollerPage")
	public void jQueryUIThemeRollerPage(Method method) {
		log.info("[log-TestSet] " + this.getClass().getName() + " - Start test method: " + method.getName());

		// Variable declaration and definition
		isReady(googleMainPage = new GoogleMainPage(driver));

		// Steps to build the stage (Pre steps)

		try {

			// Go to this page "http://jqueryui.com/demos/"
			driver.get("http://jqueryui.com/demos/");

			driver.sleep(2);

			// Check that the logo is displayed
			isJUIThemeRollerLogoDisplayed();

			// Click on Themes button
			jqueryUIThemeRollerPage.clickOnJUIThemeRollerButton();

			// Click on Third option
			jqueryUIThemeRollerPage.clickOnJUIThirdOption();

			driver.sleep(2);

			// Write 'Ja' on autocomplete field
			jqueryUIThemeRollerPage.writeOnJUIAutocompleteField("Ja");

			driver.sleep(2);

			// Select 'java' option
			jqueryUIThemeRollerPage.clickOnJUIJavaAutocompleteOption();

			driver.sleep(2);

			// Click on 'Choice 1' option
			jqueryUIThemeRollerPage.clickOnJUIChoice1Option();

			driver.sleep(2);

			// Click on 'Standard' button
			jqueryUIThemeRollerPage.clickOnJUIStandardButton();

			driver.sleep(2);

			// Click on 'Insurance' button
			jqueryUIThemeRollerPage.clickOnJUIInsuranceButton();

			driver.sleep(2);

			// Click on 'Second' tab option
			jqueryUIThemeRollerPage.clickOnJUISecondTabOption();

			driver.sleep(2);

			// Click on 'Open Dialog' button
			jqueryUIThemeRollerPage.clickOnJUIOpenDialogButton();

			driver.sleep(2);

			// Click on 'Ok' dialog button
			jqueryUIThemeRollerPage.clickOnJUIOkDialogButton();

			driver.sleep(2);

			// Move slider
			jqueryUIThemeRollerPage.sliderButton();

			driver.sleep(2);

			// Click on 'Right arrow' button 2 times
			jqueryUIThemeRollerPage.clickOnJUIRightArrowCalendarButton();
			jqueryUIThemeRollerPage.clickOnJUIRightArrowCalendarButton();

			// Select '11' day button
			jqueryUIThemeRollerPage.clickOnJUIDay11Button();

			driver.sleep(2);

			// Click on 'Select Menu' dropdwon
			jqueryUIThemeRollerPage.clickOnJUISelectMenuDropdown();

			driver.sleep(2);

			// Select 'Faster' option
			jqueryUIThemeRollerPage.clickOnJUIFasterOption();

			driver.sleep(2);

			// Click on 'Up arrow' button 6 times
			jqueryUIThemeRollerPage.clickOnJUIUpButton();
			jqueryUIThemeRollerPage.clickOnJUIUpButton();
			jqueryUIThemeRollerPage.clickOnJUIUpButton();
			jqueryUIThemeRollerPage.clickOnJUIUpButton();
			jqueryUIThemeRollerPage.clickOnJUIUpButton();
			jqueryUIThemeRollerPage.clickOnJUIUpButton();

			driver.sleep(2);

			// Click on 'Item 3' option
			jqueryUIThemeRollerPage.clickOnJUIItem3Option();

			driver.sleep(2);

			// Click on 'Item 3-4' option
			jqueryUIThemeRollerPage.clickOnJUIItem3_4Option();
			driver.sleep(2);

			// jqueryUIThemeRollerPage.takeScreenShotTest(driver, "capturaDePantalla1");

			driver.sleep(5);
		} finally {
			// Steps to clear the stage (Post steps)
		}

		log.info("[log-TestSet] " + this.getClass().getName() + " - End test method: " + method.getName());
	}

	/**
	 * Description: Do a search in Google, access to Omayo page and do
	 * Tests
	 * 
	 * Pre steps: - Open the browser
	 * 
	 * Steps: - Access to 'http://omayo.blogspot.com.es/' - Check that the Omayo
	 * logo is displayed - Accept cookies - Write on TextAreaTwo - Switch to frame1
	 * - Scroll to Cruises element - Click on Cruises button - Scroll to "Seattle"
	 * element - Switch to Default frame - Switch to frame2 - Click on Chapter1
	 * button - Scroll to TextArea field - Clear and write on TextAreabutton -
	 * Switch to Default frame - Open a new tab - Switch to new tab - Switch to
	 * first tab - Switch to Default frame - Scroll to TextAreaTwo after switch tabs
	 * - Write on TextAreaTwo after switch tabs
	 * 
	 * Post steps: - Close the browser
	 * 
	 */
	@Test(description = "omayoMainPage")
	public void omayoMainPage(Method method) {
		log.info("[log-TestSet] " + this.getClass().getName() + " - Start test method: " + method.getName());

		// Variable declaration and definition
		isReady(googleMainPage = new GoogleMainPage(driver));

		// Steps to build the stage (Pre steps)

		try {

			// Go to this page "http://omayo.blogspot.com.es/"
			driver.get("http://omayo.blogspot.com.es/");

			// Check that the Omayo logo is displayed
			isOmayoLogoDisplayed();

			// Accept cookies
			omayoMainPage.acceptCookies();

			// write on TextArea field Two the value of "textbox with preload text" field
			omayoMainPage.writeOnOmayoTextAreaFieldTwo();

			driver.sleep(3);

			// This method change to Box frame to work on it
			omayoMainPage.switchToBoxFrame1();

			driver.sleep(3);

			// This method Scroll to Cruises button
			omayoMainPage.scrollToElementCruisesButton();

			driver.sleep(2);

			// Click on Cruises button on Iframe1
			omayoMainPage.clickOnCruisesButtonIframe1();

			driver.sleep(3);

			// Scroll to Seattle element
			omayoMainPage.scrollToElementSeattle();

			driver.sleep(3);

			// This method change to Default frame1 to work on it
			omayoMainPage.switchToDefault();
			driver.sleep(1);

			// This method change to Box frame2 to work on it
			omayoMainPage.switchToBoxFrame2();

			driver.sleep(3);

			// Click on Chapter1 button on Iframe2
			omayoMainPage.clickOnChapter1ButtonIframe2();

			driver.sleep(2);

			// Scroll to TextArea button on Iframe2 Chapter1
			omayoMainPage.scrollToElementTextAreaButtonIframe2Chapter1();

			driver.sleep(2);

			// Clear and write on TextAreabutton on Iframe2 Chapter1
			omayoMainPage.clearAndWriteOnTextAreaButtonIframe2Chapter1();

			// This method change to Default frame to work on it
			omayoMainPage.switchToDefault();

			driver.sleep(1);

			// This method open a new tab, switch to new tab and switch to first tab
			omayoMainPage.openNewTab();

			driver.sleep(2);

			// // This method change to Default frame to work on it
			omayoMainPage.switchToDefault();

			// Scroll to TextAreaTwo after switch tabs
			omayoMainPage.scrollToElementTextAreaTwo();

			// Write on TextAreaTwo after switch tabs
			omayoMainPage.writeOnOmayoTextAreaFieldTwo2();

			driver.sleep(5);

		} finally {
			// Steps to clear the stage (Post steps)
		}

		log.info("[log-TestSet] " + this.getClass().getName() + " - End test method: " + method.getName());
	}

	/**
	 * Testing testNG Assert.assertEquals
	 */
	@Test(description = "fillSearchFormAndExecute")
	public void fillSearchFormAndExecute(Method method) {

		log.info("[log-TestSet] " + this.getClass().getName() + " - Start test method: " + method.getName());

		driver.get("http://autentia.com/?s");

		WebElement search = driver.findElement(By.id("s"));
		// search.sendKeys("formación");

		/*
		 * If instead of passing the string "formación" we pass the string "hola" will
		 * give us an error in the testNG since the Assert is looking for the string
		 * "Search for training" and not the string "hola"
		 */
		search.sendKeys("hola");

		search.submit();

		driver.sleep(4);
		driver.findElement(By.className("trail-end")).getText().startsWith("Búsqueda");
		driver.sleep(4);

		Assert.assertEquals(driver.findElement(By.className("trail-end")).getText(), "Búsqueda de \"formación\"");

		driver.sleep(4);

		log.info("[log-TestSet] " + this.getClass().getName() + " - End test method: " + method.getName());
	}

	/**
	 * Testing Assert.assertTrue and Assert.assertFalse
	 * 
	 * @param method
	 */
	@Test(description = "fillSearchFormAndExecute")
	public void fillSearchItemAndExecute(Method method) {

		log.info("[log-TestSet] " + this.getClass().getName() + " - Start test method: " + method.getName());

		driver.get("http://jqueryui.com/demos/");

		WebElement search = driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[3]/a"));

		search.click();

		WebElement item = driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[5]/a"));

		/*
		 * If we use assertTrue the test will execute correctly, but if we use
		 * assertFalse the test will found an error
		 */

		// Assert.assertTrue(item.isDisplayed());
		Assert.assertFalse(item.isDisplayed());

		log.info("[log-TestSet] " + this.getClass().getName() + " - End test method: " + method.getName());
	}

	// ************************ Methods *************************
	/**
	 * Checks if the search return several results
	 * 
	 * @return true if there are several results and false in the opposite case
	 */
	public boolean checkSeveralResults() {
		String resultClassName = "r";
		List<WebElement> elements = null;
		boolean isSeveral = false;

		driver.wait(By.className(resultClassName), 20);

		if (driver.isElementDisplayed(By.className(resultClassName))) {
			elements = driver.findElements(By.className(resultClassName));

			if (elements.size() > 1) {
				isSeveral = true;
			}
		}

		return isSeveral;
	}

	// ************************ Assertions *************************
	/**
	 * This assertion check if the search return several results
	 */
	public void areSeveralResults() {
		assertTrue("There aren't several results, it should have several results", this.checkSeveralResults());
	}

	/**
	 * This assertion check if logo is displayed
	 */
	public void isLogoDisplayed() {
		if (googleMainPage == null) {
			googleMainPage = new GoogleMainPage(driver);
		}
		assertTrue("The logo isn't displayed, it should be displayed", googleMainPage.isLogoDisplayed());
	}

	/**
	 * This assertion check if search button is displayed
	 */
	public void isSearchButtonDisplayed() {
		if (googleMainPage == null) {
			googleMainPage = new GoogleMainPage(driver);
		}

		/* Check by Name */
		assertTrue("The search button isn't displayed, it should be displayed",
				googleMainPage.isSearchButtonDisplayed());
	}

	/**
	 * This assertion check if luck button is displayed
	 */
	public void isLuckButtonDisplayed() {
		if (googleMainPage == null) {
			googleMainPage = new GoogleMainPage(driver);
		}
		assertTrue("The luck button isn't displayed, it should be displayed", googleMainPage.isLuckButtonDisplayed());
	}

	/**
	 * This assertion check if search field is displayed
	 */
	public void isSearchFieldDisplayed() {
		if (googleMainPage == null) {
			googleMainPage = new GoogleMainPage(driver);
		}
		assertTrue("The search field isn't displayed, it should be displayed", googleMainPage.isSearchFieldDisplayed());
	}

	/**
	 * This assertion check if emergya logo is displayed
	 */
	public void isEmergyaLogoDisplayed() {
		if (emergyaMainPage == null) {
			emergyaMainPage = new EmergyaMainPage(driver);
		}
		assertTrue("The logo isn't displayed, it should be displayed", emergyaMainPage.isEmergyaLogoDisplayed());
	}

	/**
	 * This assertion check if emergya logo is displayed
	 */
	public void isEmergyaSevillaAddressDisplayed() {
		if (emergyaContactPage == null) {
			emergyaContactPage = new EmergyaContactPage(driver);
		}
		assertTrue("The logo isn't displayed, it should be displayed",
				emergyaContactPage.isEmergyaSevillaAddressDisplayed());
	}

	/**
	 * This assertion check if emergya title is displayed
	 */
	public void isEmergyaTitleDisplayed() {
		if (emergyaTrabajaNosotrosPage == null) {
			emergyaTrabajaNosotrosPage = new EmergyaTrabajaNosotrosPage(driver);
		}
		assertTrue("The logo isn't displayed, it should be displayed",
				emergyaTrabajaNosotrosPage.isEmergyaTitleDisplayed());
	}

	/**
	 * This assertion check if amazon logo is displayed
	 */
	public void isAmazonLogoDisplayed() {
		if (amazonMainPage == null) {
			amazonMainPage = new AmazonMainPage(driver);
		}
		assertTrue("The logo isn't displayed, it should be displayed", amazonMainPage.isAmazonLogoDisplayed());
	}

	/**
	 * This assertion check if amazon logo is displayed
	 */
	public void isAmazonLogoLoginDisplayed() {
		if (amazonLoginPage == null) {
			amazonLoginPage = new AmazonLoginPage(driver);
		}
		assertTrue("The logo isn't displayed, it should be displayed", amazonLoginPage.isAmazonLogoLoginDisplayed());
	}

	/**
	 * This assertion check if zamzar logo is displayed
	 */
	public void isZamzarLogoDisplayed() {
		if (zamzarMainPage == null) {
			zamzarMainPage = new ZamzarMainPage(driver);
		}
		assertTrue("The logo isn't displayed, it should be displayed", zamzarMainPage.isZamzarLogoDisplayed());
	}

	/**
	 * This assertion check if imgur logo is displayed
	 */
	public void isImgurLogoDisplayed() {
		if (imgurMainPage == null) {
			imgurMainPage = new ImgurMainPage(driver);
		}
		assertTrue("The logo isn't displayed, it should be displayed", imgurMainPage.isImgurLogoDisplayed());
	}

	/**
	 * This assertion check if imgur new post logo is displayed
	 */
	public void isImgurNewPostLogoDisplayed() {
		if (imgurNewPostPage == null) {
			imgurNewPostPage = new ImgurNewPostPage(driver);
		}
		assertTrue("The logo isn't displayed, it should be displayed", imgurNewPostPage.isImgurNewPostLogoDisplayed());
	}

	/**
	 * This assertion check if Automation Demo Site logo is displayed
	 */
	public void isADSLogoDisplayed() {
		if (automationDemoSiteMainPage == null) {
			automationDemoSiteMainPage = new AutomationDemoSiteMainPage(driver);
		}
		assertTrue("The logo isn't displayed, it should be displayed", automationDemoSiteMainPage.isADSLogoDisplayed());
	}

	/**
	 * This assertion check if Automation Demo Site Register Logo is Displayed
	 */
	public void isADSRegisterLogoDisplayed() {
		if (automationDemoSiteRegisterPage == null) {
			automationDemoSiteRegisterPage = new AutomationDemoSiteRegisterPage(driver);
		}
		assertTrue("The logo isn't displayed, it should be displayed",
				automationDemoSiteRegisterPage.isADSRegisterLogoDisplayed());
	}

	/**
	 * This assertion check if Automation Demo Site WebTabñe logo is displayed
	 */
	public void isADSWebTableLogoDisplayed() {
		if (automationDemoSiteWebTable == null) {
			automationDemoSiteWebTable = new AutomationDemoSiteWebTablePage(driver);
		}
		assertTrue("The logo isn't displayed, it should be displayed",
				automationDemoSiteWebTable.isADSWebTableLogoDisplayed());
	}

	/**
	 * This assertion check if Automation Demo Site SwitchTo Alert logo is displayed
	 */
	public void isADSSwitchToAlertLogoDisplayed() {
		if (automationDemoSiteSwitchToAlertPage == null) {
			automationDemoSiteSwitchToAlertPage = new AutomationDemoSiteSwitchToAlertPage(driver);
		}
		assertTrue("The logo isn't displayed, it should be displayed",
				automationDemoSiteSwitchToAlertPage.isADSSwitchToAlertLogoDisplayed());
	}

	/**
	 * This assertion check if Automation Demo Site Resizable logo is displayed
	 */
	public void isADSResizableLogoDisplayed() {
		if (automationDemoSiteResizablePage == null) {
			automationDemoSiteResizablePage = new AutomationDemoSiteResizablePage(driver);
		}
		assertTrue("The logo isn't displayed, it should be displayed",
				automationDemoSiteResizablePage.isADSResizableLogoDisplayed());
	}

	/**
	 * This assertion check if Automation Demo Site FileDownload logo is displayed
	 */
	public void isADSFileDownloadLogoDisplayed() {
		if (automationDemoSiteFileDownloadPage == null) {
			automationDemoSiteFileDownloadPage = new AutomationDemoSiteFileDownloadPage(driver);
		}
		assertTrue("The logo isn't displayed, it should be displayed",
				automationDemoSiteFileDownloadPage.isADSFileDownloadLogoDisplayed());
	}

	/**
	 * This assertion check if Automation Demo Site Drag and Drop logo is displayed
	 */
	public void isADSDragAndDropLogoDisplayed() {
		if (automationDemoSiteDragAndDropPage == null) {
			automationDemoSiteDragAndDropPage = new AutomationDemoSiteDragAndDropPage(driver);
		}
		assertTrue("The logo isn't displayed, it should be displayed",
				automationDemoSiteDragAndDropPage.isADSDragAndDropLogoDisplayed());
	}

	/**
	 * This assertion check if dezlearn logo is displayed
	 */
	public void isDezLearnLogoDisplayed() {
		if (dezLearnMainPage == null) {
			dezLearnMainPage = new DezLearnMainPage(driver);
		}
		assertTrue("The logo isn't displayed, it should be displayed", dezLearnMainPage.isDezLearnLogoDisplayed());
	}

	/**
	 * This assertion check if dezlearn test logo is displayed
	 */
	public void isDezLearnTestLogoDisplayed() {
		if (dezLearnTestPage == null) {
			dezLearnTestPage = new DezLearnTestPage(driver);
		}
		assertTrue("The logo isn't displayed, it should be displayed", dezLearnTestPage.isDezLearnLogoDisplayed());
	}

	/**
	 * This assertion check if Automation Demo Site File upload logo is displayed
	 */
	public void isADSFileUploadLogoDisplayed() {
		if (automationDemoSiteFileUploadPage == null) {
			automationDemoSiteFileUploadPage = new AutomationDemoSiteFileUploadPage(driver);
		}
		assertTrue("The logo isn't displayed, it should be displayed",
				automationDemoSiteFileUploadPage.isADSFileUploadLogoDisplayed());
	}

	/**
	 * This assertion check if JQuery UI logo is displayed
	 */
	public void isJUILogoDisplayed() {
		if (jqueryUIDemosPage == null) {
			jqueryUIDemosPage = new JQueryUIDemosPage(driver);
		}
		assertTrue("The logo isn't displayed, it should be displayed", jqueryUIDemosPage.isJUILogoDisplayed());
	}

	/**
	 * This assertion check if JQuery UI Effect logo is displayed
	 */
	public void isJUIEffectLogoDisplayed() {
		if (jqueryUIEffectOptionPage == null) {
			jqueryUIEffectOptionPage = new JQueryUIEffectOptionPage(driver);
		}
		assertTrue("The logo isn't displayed, it should be displayed",
				jqueryUIEffectOptionPage.isJUIEffectLogoDisplayed());
	}

	/**
	 * This assertion check if JQuery UI Resizable logo is displayed
	 */
	public void isJUIResizableLogoDisplayed() {
		if (jqueryUIResizableOptionPage == null) {
			jqueryUIResizableOptionPage = new JQueryUIResizableOptionPage(driver);
		}
		assertTrue("The logo isn't displayed, it should be displayed",
				jqueryUIResizableOptionPage.isJUIResizableLogoDisplayed());
	}

	/**
	 * This assertion check if JQuery UI Autocomplete logo is displayed
	 */
	public void isJUIAutocompleteLogoDisplayed() {
		if (jqueryUIAutocompletePage == null) {
			jqueryUIAutocompletePage = new JQueryUIAutocompletePage(driver);
		}
		assertTrue("The logo isn't displayed, it should be displayed",
				jqueryUIAutocompletePage.isJUIAutocompleteLogoDisplayed());
	}

	/**
	 * This assertion check if JQuery UI Controlgroup logo is displayed
	 */
	public void isJUIControlGroupLogoDisplayed() {
		if (jqueryUIControlGroupPage == null) {
			jqueryUIControlGroupPage = new JQueryUIControlGroupPage(driver);
		}
		assertTrue("The logo isn't displayed, it should be displayed",
				jqueryUIControlGroupPage.isJUIControlGroupLogoDisplayed());
	}

	/**
	 * This assertion check if JQuery UI Datepicker logo is displayed
	 */
	public void isJUIDatepickerLogoDisplayed() {
		if (jqueryUIDatepickerPage == null) {
			jqueryUIDatepickerPage = new JQueryUIDatepickerPage(driver);
		}
		assertTrue("The logo isn't displayed, it should be displayed",
				jqueryUIDatepickerPage.isJUIDatepickerLogoDisplayed());
	}

	/**
	 * This assertion check if JQuery UI Selectable logo is displayed
	 */
	public void isJUISelectableLogoDisplayed() {
		if (jqueryUISelectablePage == null) {
			jqueryUISelectablePage = new JQueryUISelectablePage(driver);
		}
		assertTrue("The logo isn't displayed, it should be displayed",
				jqueryUISelectablePage.isJUISelectableLogoDisplayed());
	}

	/**
	 * This assertion check if JQuery UI Sortable logo is displayed
	 */
	public void isJUISortableLogoDisplayed() {
		if (jqueryUISortablePage == null) {
			jqueryUISortablePage = new JQueryUISortablePage(driver);
		}
		assertTrue("The logo isn't displayed, it should be displayed",
				jqueryUISortablePage.isJUISortableLogoDisplayed());
	}

	/**
	 * This assertion check if JQuery UI ThemeRoller logo is displayed
	 */
	public void isJUIThemeRollerLogoDisplayed() {
		if (jqueryUIThemeRollerPage == null) {
			jqueryUIThemeRollerPage = new JQueryUIThemeRollerPage(driver);
		}
		assertTrue("The logo isn't displayed, it should be displayed",
				jqueryUIThemeRollerPage.isJUIThemeRollerLogoDisplayed());
	}

	/**
	 * This assertion check if JQuery UI Dialog logo is displayed
	 */
	public void isJUIDialogLogoDisplayed() {
		if (jqueryUIDialogPage == null) {
			jqueryUIDialogPage = new JQueryUIDialogPage(driver);
		}
		assertTrue("The logo isn't displayed, it should be displayed", jqueryUIDialogPage.isJUIDialogLogoDisplayed());
	}

	/**
	 * This assertion check if JQuery UI Spinner Map logo is displayed
	 */
	public void isJUISpinnerMapLogoDisplayed() {
		if (jqueryUISpinnerMapPage == null) {
			jqueryUISpinnerMapPage = new JQueryUISpinnerMapPage(driver);
		}
		assertTrue("The logo isn't displayed, it should be displayed",
				jqueryUISpinnerMapPage.isJUISpinnerMapLogoDisplayed());
	}

	/**
	 * This assertion check if Omayo logo is displayed
	 */
	public void isOmayoLogoDisplayed() {
		if (omayoMainPage == null) {
			omayoMainPage = new OmayoMainPage(driver);
		}
		assertTrue("The logo isn't displayed, it should be displayed", omayoMainPage.isOmayoLogoDisplayed());
	}
}
