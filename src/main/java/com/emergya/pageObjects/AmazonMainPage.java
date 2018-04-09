package com.emergya.pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.interactions.Actions;


import com.emergya.selenium.drivers.EmergyaWebDriver;
import com.emergya.selenium.pageObject.BasePageObject;

public class AmazonMainPage extends BasePageObject {

	/**
	 * Logger class initialization.
	 */
	static Logger log = Logger.getLogger(GoogleMainPage.class);

	/**
	 * Items keys selectors.
	 */
	private static final String IMG_LOGO_AMAZON = "imgLogoAmazon";
	private static final String SEARCH_FIELD = "searchField";
	private static final String SEARCH_BUTTON = "searchButton";
	private static final String LOGIN_OPTION = "loginOption";
	private static final String BASKET_OPTION = "basketOption";
	private static final String DESPLEGABLE_OPTION = "dropdownOption";
	private static final String INFORMATICA_SELECCION_OPTION = "selectInformatica";
	private static final String RELOJES_SELECCION_OPTION = "selectRelojes";
	private static final String RELOJES_HOMBRE_SELECCION_OPTION = "optionRelojesHombre";
	private static final String RELOJ_CASIO_OPTION = "selectCasio";
	private static final String RELOJ_CASIO_EXPENSIVE_OPTION = "selectCasioExpensive";
	private static final String RELOJ_CASIO_EXPENSIVE_PRIME_OPTION = "selectCasioExpensivePrime";
	private static final String ADD_TO_BASKET = "addToBasket";
	private static final String PRIME_CHECKBOX = "prime";
	private static final String DROPDOWN_WITHOUT_CLICK = "dropdownWithoutClick";
	private static final String ALL_OPTIONS = "allOption";
	private static final String DROPDOWN_WC_CINE_OPTION = "optionCine";
	private static final String DROPDOWN_WC_BLURAY_OPTION = "optionBluRay";
	private static final String SELECT_FILM = "selectFilm2";
	private static final String SELECT_UNITS = "dropdownBasket";
	private static final String SELECT_UNITS_2_OPTION = "option2UnitsBasket";
	private static final String ADD_OTHER_FILM_TO_BASKET = "addOtherFilmToBasket";
	private static final String RIGHT_ARROW_BASKET = "rightArrowBasket";


	/**
	 * Constructor method
	 * 
	 * @param driver
	 *            selenium webdriver
	 */
	public AmazonMainPage(EmergyaWebDriver driver) {
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

		boolean status = this.isElementVisibleById(IMG_LOGO_AMAZON);

		log.info("[log-PageObjects] " + this.getClass().getSimpleName() + " - End isReady method");

		return status;
	}

	/**
	 * This method do a search in Amazon by a string search
	 * 
	 * @param stringSearch
	 */
	public void doSearch(String stringSearch) {
		log.info("[log-" + this.getClass().getSimpleName() + "]- Start doSearch -[" + this.getClass().getSimpleName()
				+ "- method]");

		if (this.isElementVisibleById(SEARCH_FIELD)) {
			this.getElementById(SEARCH_FIELD).sendKeys(stringSearch);

			if (this.isElementVisibleByXPath(SEARCH_BUTTON)) {
				this.getElementByXPath(SEARCH_BUTTON).click();
			}

		}

		log.info("[log-" + this.getClass().getSimpleName() + "]- End doSearch -[" + this.getClass().getSimpleName()
				+ "- method]");
	}

	/**
	 * This method click on Amazon Logo
	 * 
	 * @return
	 */
	public AmazonMainPage clickOnAmazonLogoPage() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnAmazonLogoPage method");

		this.getElementById(IMG_LOGO_AMAZON).click();

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnAmazonLogoPage method");
		return new AmazonMainPage(driver);
	}

	/**
	 * This method click on Amazon's basket
	 * 
	 * @return
	 */
	public AmazonMainPage clickOnAmazonBasketPage() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnAmazonBasketPage method");


		if (this.isElementVisibleByXPath(BASKET_OPTION)) {
			this.getElementByXPath(BASKET_OPTION).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnAmazonBasketPage method");
		return new AmazonMainPage(driver);
	}

	/**
	 * This method click on Amazon's Login
	 * 
	 * @return
	 */
	public AmazonMainPage clickOnAmazonLoginPage() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnAmazonLoginPage method");


		if (this.isElementVisibleByXPath(LOGIN_OPTION)) {
			this.getElementByXPath(LOGIN_OPTION).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnAmazonLoginPage method");
		return new AmazonMainPage(driver);
	}

	/**
	 * This method click on dropdown "All departments"
	 * 
	 * @return
	 */
	public AmazonMainPage clickOnAmazonDropdown() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnAmazonDropdown method");


		if (this.isElementVisibleByXPath(DESPLEGABLE_OPTION)) {
			this.getElementByXPath(DESPLEGABLE_OPTION).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnAmazonDropdown method");
		return new AmazonMainPage(driver);
	}

	/**
	 * This method select "informatica" option from the dropdown
	 * 
	 * @return
	 */
	public AmazonMainPage clickOnAmazonDropdownOption() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnAmazonDropdownOption method");


		if (this.isElementVisibleByXPath(INFORMATICA_SELECCION_OPTION)) {
			this.getElementByXPath(INFORMATICA_SELECCION_OPTION).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnAmazonDropdownOption method");
		return new AmazonMainPage(driver);
	}
	
	/**
	 * This method select "relojes" option from the dropdown
	 * 
	 * @return
	 */
	public AmazonMainPage clickOnAmazonDropdownRelojesOption() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnAmazonDropdownRelojesOption method");


		if (this.isElementVisibleByXPath(RELOJES_SELECCION_OPTION)) {
			this.getElementByXPath(RELOJES_SELECCION_OPTION).click();
		}
		
		if (this.isElementVisibleByXPath(SEARCH_BUTTON)) {
			this.getElementByXPath(SEARCH_BUTTON).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnAmazonDropdownRelojesOption method");
		return new AmazonMainPage(driver);
	}
	
	/**
	 * This method click on "Hombre" button
	 * 
	 * @return
	 */
	public AmazonMainPage clickOnAmazonRelojesHombreOption() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnAmazonRelojesHombreOption method");


		if (this.isElementVisibleById(RELOJES_HOMBRE_SELECCION_OPTION)) {
			this.getElementById(RELOJES_HOMBRE_SELECCION_OPTION).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnAmazonRelojesHombreOption method");
		return new AmazonMainPage(driver);
	}
	
	/**
	 * This method click on "50-100" button
	 * 
	 * @return
	 */
	public AmazonMainPage clickOnAmazonRelojes50To100Option() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnAmazonRelojes50To100Option method");


		if (this.isElementVisibleById(RELOJES_HOMBRE_SELECCION_OPTION)) {
			this.getElementById(RELOJES_HOMBRE_SELECCION_OPTION).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnAmazonRelojes50To100Option method");
		return new AmazonMainPage(driver);
	}
	
	/**
	 * This method select "Casio" product from the search page
	 * 
	 * @return
	 */
	public AmazonMainPage clickOnAmazonRelojCasioOption() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnAmazonRelojCasioOption method");


		if (this.isElementVisibleByXPath(RELOJ_CASIO_OPTION)) {
			this.getElementByXPath(RELOJ_CASIO_OPTION).click();
		}
		

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnAmazonRelojCasioOption method");
		return new AmazonMainPage(driver);
	}
	
	/**
	 * This method select "Casio" product from the search page with options "Hombre" and "50-100"
	 * 
	 * @return
	 */
	public AmazonMainPage clickOnAmazonRelojCasioExpensiveOption() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnAmazonRelojCasioExpensiveOption method");


		if (this.isElementVisibleByXPath(RELOJ_CASIO_EXPENSIVE_OPTION)) {
			this.getElementByXPath(RELOJ_CASIO_EXPENSIVE_OPTION).click();
		}
		

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnAmazonRelojCasioExpensiveOption method");
		return new AmazonMainPage(driver);
	}
	
	/**
	 * This method select "Casio" product from the search page with options "Hombre","50-100" and prime
	 * 
	 * @return
	 */
	public AmazonMainPage clickOnAmazonRelojCasioCaroPrimeOption() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnAmazonRelojCasioCaroPrimeOption method");


		if (this.isElementVisibleByXPath(RELOJ_CASIO_EXPENSIVE_PRIME_OPTION)) {
			this.getElementByXPath(RELOJ_CASIO_EXPENSIVE_PRIME_OPTION).click();
		}
		

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnAmazonRelojCasioCaroPrimeOption method");
		return new AmazonMainPage(driver);
	}
	
	/**
	 * This method add product to basket
	 * 
	 * @return
	 */
	public AmazonMainPage clickOnAmazonAddToBasketPage() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnAmazonAddToBasketPage method");


		if (this.isElementVisibleById(ADD_TO_BASKET)) {
			this.getElementById(ADD_TO_BASKET).click();
		}
		

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnAmazonAddToBasketPage method");
		return new AmazonMainPage(driver);
	}
	
	/**
	 * This method click prime option filter
	 * 
	 * @return
	 */
	public AmazonMainPage clickOnAmazonPrimeCheckBox() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnAmazonPrimeCheckBox method");


		if (this.isElementVisibleByName(PRIME_CHECKBOX)) {
			this.getElementByName(PRIME_CHECKBOX).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnAmazonPrimeCheckBox method");
		return new AmazonMainPage(driver);
	}
	
	/**
	 * This method select a dropdown without click, and click in a option.
	 * 
	 * @return
	 */
	public AmazonMainPage selectOnAmazonDropdownWC() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start selectOnAmazonDropdownWC method");
		
		Actions actions = new Actions(driver);
		actions.moveToElement(this.getElementByXPath(DROPDOWN_WITHOUT_CLICK)).moveToElement(this.getElementByXPath(ALL_OPTIONS)).click().build().perform();

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End selectOnAmazonDropdownWC method");
		return new AmazonMainPage(driver);
	}
	
	/**
	 * This method select a dropdown without click, and click in BluRay option.
	 * 
	 * @return
	 */
	public AmazonMainPage selectOnAmazonDropdownWCBluRayOption() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start selectOnAmazonDropdownWCBluRayOption method");
		
		Actions actions = new Actions(driver);
		actions.moveToElement(this.getElementByXPath(DROPDOWN_WITHOUT_CLICK)).moveToElement(this.getElementByXPath(DROPDOWN_WC_CINE_OPTION))
		.moveToElement(this.getElementByXPath(DROPDOWN_WC_BLURAY_OPTION)).click().build().perform();

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End selectOnAmazonDropdownWCBluRayOption method");
		return new AmazonMainPage(driver);
	}
	
	/**
	 * This method select Pulp Fiction Film after search
	 * 
	 * @return
	 */
	public AmazonMainPage clickOnAmazonPulpFictionFilm() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnAmazonPulpFictionFilm method");


		if (this.isElementVisibleByXPath(SELECT_FILM)) {
			this.getElementByXPath(SELECT_FILM).click();
		}
		

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnAmazonPulpFictionFilm method");
		return new AmazonMainPage(driver);
	}
	
	/**
	 * This method click on dropdown select units of basket
	 * 
	 * @return
	 */
	public AmazonMainPage clickOnAmazonSelectUnitsDropdown() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnAmazonSelectUnitsDropdown method");


		if (this.isElementVisibleByXPath(SELECT_UNITS)) {
			this.getElementByXPath(SELECT_UNITS).click();
		}
		

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnAmazonSelectUnitsDropdown method");
		return new AmazonMainPage(driver);
	}
	
	/**
	 * This method select option 2 from dropdown
	 * 
	 * @return
	 */
	public AmazonMainPage clickOnAmazonSelectUnitsOption2() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnAmazonSelectUnitsOption2 method");


		if (this.isElementVisibleByXPath(SELECT_UNITS_2_OPTION)) {
			this.getElementByXPath(SELECT_UNITS_2_OPTION).click();
		}
		

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnAmazonSelectUnitsOption2 method");
		return new AmazonMainPage(driver);
	}
	
	/**
	 * This method click on add to basket and add a new film to the basket
	 * 
	 * @return
	 */
	public AmazonMainPage clickOnAmazonAddOtherFilmToBasket() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnAmazonAddOtherFilmToBasket method");


		if (this.isElementVisibleByXPath(ADD_OTHER_FILM_TO_BASKET)) {
			this.getElementByXPath(ADD_OTHER_FILM_TO_BASKET).click();
		}
		

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnAmazonAddOtherFilmToBasket method");
		return new AmazonMainPage(driver);
	}
	
	/**
	 * This method do click on right arrow button of the basket
	 * 
	 * @return
	 */
	public AmazonMainPage clickOnAmazonRightArrowBasket() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnAmazonRightArrowBasket method");


		if (this.isElementVisibleByXPath(RIGHT_ARROW_BASKET)) {
			this.getElementByXPath(RIGHT_ARROW_BASKET).click();
		}
		

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnAmazonRightArrowBasket method");
		return new AmazonMainPage(driver);
	}
	
	
	/**
	 * This method check Amazon Logo is Displayed
	 * 
	 * @return
	 */
	public boolean isAmazonLogoDisplayed() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start isAmazonLogoDisplayed method");
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End isAmazonLogoDisplayed method");

		return this.isElementVisibleById(IMG_LOGO_AMAZON);
	}
}
