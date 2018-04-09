package com.emergya.pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.emergya.selenium.drivers.EmergyaWebDriver;
import com.emergya.selenium.pageObject.BasePageObject;

public class JQueryUISortablePage extends BasePageObject{

	/**
	 * Logger class initialization.
	 */
	static Logger log = Logger.getLogger(GoogleMainPage.class);

	/**
	 * Items keys selectors.
	 */
	private static final String IMG_LOGO_JUI = "logoJUI";
	private static final String SORTABLE_BUTTON = "sortableButton";
	private static final String ITEM_POS_1_OPTION = "item1";
	private static final String ITEM_POS_2_OPTION = "item2";
	private static final String ITEM_POS_3_OPTION = "item3";
	private static final String ITEM_POS_4_OPTION = "item4";
	private static final String ITEM_POS_5_OPTION = "item5";
	private static final String ITEM_POS_6_OPTION = "item6";
	private static final String ITEM_POS_7_OPTION = "item7";
	

	/**
	 * Constructor method
	 * 
	 * @param driver
	 *            selenium webdriver
	 */
	public JQueryUISortablePage(EmergyaWebDriver driver) {
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
	 * This method click on Sortable button
	 * 
	 * @return
	 */
	public JQueryUISortablePage clickOnJUISortableButton() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName()
				+ "]- Start clickOnJUISortableButton method");

		if (this.isElementVisibleByXPath(SORTABLE_BUTTON)) {
			this.getElementByXPath(SORTABLE_BUTTON).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName()
				+ "]- End clickOnJUISortableButton method");
		return new JQueryUISortablePage(driver);
	}
	
	/**
	 * Disordering
	 */
	
	/**
	 * This method disorder the items swapping Item in position 7 to position 1
	 * 
	 * @return
	 */
	public JQueryUISortablePage clickAndHoldOnItem7To1Option() {
		log.info("[log-PageObjects] " + this.getClass().getSimpleName() + " - Start ClickAndHoldOnItem7To1Option method");
		
		Actions builder = new Actions(driver);
		driver.sleep(2);
		//builder.clickAndHold(this.getElementByXPath(ITEM7_OPTION)).release(this.getElementByXPath(ITEM1_OPTION)).build().perform();
		
		WebElement item7 = driver.findElement(By.cssSelector("#sortable > li:nth-child(7) > span"));
		WebElement item1 = driver.findElement(By.cssSelector("#sortable > li:nth-child(1) > span"));
		
		driver.sleep(2);
		builder.dragAndDrop(item7, item1).build().perform();
		
		
		
		log.info("[log-PageObjects] " + this.getClass().getSimpleName() + " - End ClickAndHoldOnItem7To1Option method");
		return new JQueryUISortablePage(driver);
	}
	
	/**
	 * This method disorder the items, swapping Item in position 6 to position 2
	 * 
	 * @return
	 */
	public JQueryUISortablePage clickAndHoldOnItem6To2Option() {
		log.info("[log-PageObjects] " + this.getClass().getSimpleName() + " - Start ClickAndHoldOnItem6To2Option method");
		
		Actions builder = new Actions(driver);
		driver.sleep(2);
		builder.clickAndHold(this.getElementByXPath(ITEM_POS_6_OPTION)).release(this.getElementByXPath(ITEM_POS_2_OPTION)).build().perform();
		
		
		log.info("[log-PageObjects] " + this.getClass().getSimpleName() + " - End ClickAndHoldOnItem6To2Option method");
		return new JQueryUISortablePage(driver);
	}
	
	/**
	 * This method disorder the items, swapping Item in position 5 to position 3
	 * 
	 * @return
	 */
	public JQueryUISortablePage clickAndHoldOnItem5To3Option() {
		log.info("[log-PageObjects] " + this.getClass().getSimpleName() + " - Start ClickAndHoldOnItem5To3Option method");
		
		Actions builder = new Actions(driver);
		driver.sleep(2);
		builder.clickAndHold(this.getElementByXPath(ITEM_POS_5_OPTION)).release(this.getElementByXPath(ITEM_POS_3_OPTION)).build().perform();
		
		
		
		log.info("[log-PageObjects] " + this.getClass().getSimpleName() + " - End ClickAndHoldOnItem5To3Option method");
		return new JQueryUISortablePage(driver);
	}
	
	
	/**
	 * This method disorder the items, swapping Item in position 7 to position 5
	 * 
	 * @return
	 */
	public JQueryUISortablePage clickAndHoldOnItem7To5Option() {
		log.info("[log-PageObjects] " + this.getClass().getSimpleName() + " - Start ClickAndHoldOnItem7To5Option method");
		
		Actions builder = new Actions(driver);
		driver.sleep(2);
		builder.clickAndHold(this.getElementByXPath(ITEM_POS_7_OPTION)).release(this.getElementByXPath(ITEM_POS_5_OPTION)).build().perform();
		
		
		log.info("[log-PageObjects] " + this.getClass().getSimpleName() + " - End ClickAndHoldOnItem7To5Option method");
		return new JQueryUISortablePage(driver);
	}
	
	
	/**
	 * Ordering
	 */
	
	/**
	 * This method order the items, swapping Item in position 4 to position 1
	 * 
	 * @return
	 */
	public JQueryUISortablePage clickAndHoldOnItem4To1OrderOption() {
		log.info("[log-PageObjects] " + this.getClass().getSimpleName() + " - Start ClickAndHoldOnItem4To1OrderOption method");
		
		Actions builder = new Actions(driver);
		driver.sleep(2);
		builder.clickAndHold(this.getElementByXPath(ITEM_POS_4_OPTION)).release(this.getElementByXPath(ITEM_POS_1_OPTION)).build().perform();
		
		
		log.info("[log-PageObjects] " + this.getClass().getSimpleName() + " - End ClickAndHoldOnItem4To1OrderOption method");
		return new JQueryUISortablePage(driver);
	}
	
	
	/**
	 * This method order the items, swapping Item in position 6 to position 2
	 * 
	 * @return
	 */
	public JQueryUISortablePage clickAndHoldOnItem6To2OrderOption() {
		log.info("[log-PageObjects] " + this.getClass().getSimpleName() + " - Start ClickAndHoldOnItem6To2OrderOption method");
		
		Actions builder = new Actions(driver);
		driver.sleep(2);
		builder.clickAndHold(this.getElementByXPath(ITEM_POS_6_OPTION)).release(this.getElementByXPath(ITEM_POS_2_OPTION)).build().perform();
		
		
		log.info("[log-PageObjects] " + this.getClass().getSimpleName() + " - End ClickAndHoldOnItem6To2OrderOption method");
		return new JQueryUISortablePage(driver);
	}
	
	/**
	 * This method order the items, swapping Item in position 5 to position 3
	 * 
	 * @return
	 */
	public JQueryUISortablePage clickAndHoldOnItem5To3OrderOption() {
		log.info("[log-PageObjects] " + this.getClass().getSimpleName() + " - Start ClickAndHoldOnItem5To3OrderOption method");
		
		Actions builder = new Actions(driver);
		driver.sleep(2);
		builder.clickAndHold(this.getElementByXPath(ITEM_POS_5_OPTION)).release(this.getElementByXPath(ITEM_POS_3_OPTION)).build().perform();
		
		
		log.info("[log-PageObjects] " + this.getClass().getSimpleName() + " - End ClickAndHoldOnItem5To3OrderOption method");
		return new JQueryUISortablePage(driver);
	}
	
	/**
	 * This method order the items, swapping Item in position 7 to position 4
	 * 
	 * @return
	 */
	public JQueryUISortablePage clickAndHoldOnItem7To4OrderOption() {
		log.info("[log-PageObjects] " + this.getClass().getSimpleName() + " - Start ClickAndHoldOnItem7To4OrderOption method");
		
		Actions builder = new Actions(driver);
		driver.sleep(2);
		builder.clickAndHold(this.getElementByXPath(ITEM_POS_7_OPTION)).release(this.getElementByXPath(ITEM_POS_4_OPTION)).build().perform();
		
		
		log.info("[log-PageObjects] " + this.getClass().getSimpleName() + " - End ClickAndHoldOnItem7To4OrderOption method");
		return new JQueryUISortablePage(driver);
	}
	
	/**
	 * This method order the items, swapping Item in position 6 to position 5
	 * 
	 * @return
	 */
	public JQueryUISortablePage clickAndHoldOnItem6To5OrderOption() {
		log.info("[log-PageObjects] " + this.getClass().getSimpleName() + " - Start ClickAndHoldOnItem6To5OrderOption method");
		
		Actions builder = new Actions(driver);
		driver.sleep(2);
		builder.clickAndHold(this.getElementByXPath(ITEM_POS_6_OPTION)).release(this.getElementByXPath(ITEM_POS_5_OPTION)).build().perform();
		
		
		log.info("[log-PageObjects] " + this.getClass().getSimpleName() + " - End ClickAndHoldOnItem6To5OrderOption method");
		return new JQueryUISortablePage(driver);
	}
	
	/**
	 * This method order the items, swapping Item in position 7 to position 6
	 * 
	 * @return
	 */
	public JQueryUISortablePage clickAndHoldOnItem7To6OrderOption() {
		log.info("[log-PageObjects] " + this.getClass().getSimpleName() + " - Start ClickAndHoldOnItem7To6OrderOption method");
		
		Actions builder = new Actions(driver);
		driver.sleep(2);
		builder.clickAndHold(this.getElementByXPath(ITEM_POS_7_OPTION)).release(this.getElementByXPath(ITEM_POS_6_OPTION)).build().perform();
		
		
		log.info("[log-PageObjects] " + this.getClass().getSimpleName() + " - End ClickAndHoldOnItem7To6OrderOption method");
		return new JQueryUISortablePage(driver);
	}
	
	
	
	/**
	 * This method change to box frame
	 * 
	 * @return
	 */
	public JQueryUISortablePage switchToBoxFrame() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start switchToBoxFrame method");

		WebElement iframe = driver.findElement(By.cssSelector(".demo-frame"));

		driver.switchTo().frame(iframe);

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End switchToBoxFrame method");
		return new JQueryUISortablePage(driver);
	}
	
	
	/**
	 * This method check if JQuery UI Sortable logo is displayed
	 */
	public boolean isJUISortableLogoDisplayed() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start isJUISortableLogoDisplayed method");
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End isJUISortableLogoDisplayed method");

		return this.isElementVisibleByXPath(IMG_LOGO_JUI);
	}
}
