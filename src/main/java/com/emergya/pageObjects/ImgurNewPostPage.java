package com.emergya.pageObjects;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

import org.apache.log4j.Logger;

import com.emergya.selenium.drivers.EmergyaWebDriver;
import com.emergya.selenium.pageObject.BasePageObject;

public class ImgurNewPostPage extends BasePageObject {
	/**
	 * Logger class initialization.
	 */
	static Logger log = Logger.getLogger(GoogleMainPage.class);

	/**
	 * Items keys selectors.
	 */
	private static final String IMG_LOGO_IMGUR_NEW_POST = "logoImgur";

	private static final String ADD_MORE_IMG_BUTTON = "addMoreImages";
	private static final String ADD_MORE_IMG_AFTER_MORE_IMG_BUTTON = "addMoreImgAfterMoreImg";
	private static final String DELETE_POST_BUTTON = "deletePost";
	private static final String DELETE_POST_AFTER_MORE_IMG_BUTTON = "deletePostAfterMoreImg";
	private static final String DELETE_POST_CONFIRM_BUTTON = "deleteConfirm";

	/**
	 * Constructor method
	 * 
	 * @param driver
	 *            selenium webdriver
	 */
	public ImgurNewPostPage(EmergyaWebDriver driver) {
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

		boolean status = this.isElementVisibleByXPath(IMG_LOGO_IMGUR_NEW_POST);

		log.info("[log-PageObjects] " + this.getClass().getSimpleName() + " - End isReady method");

		return status;
	}

	/**
	 * This method click on Add more images button
	 * 
	 * @return
	 */
	public ImgurNewPostPage clickOnImgurAddMoreImgButton() {
		log.info(
				"[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnImgurAddMoreImgButton method");

		if (this.isElementVisibleByXPath(ADD_MORE_IMG_BUTTON)) {
			this.getElementByXPath(ADD_MORE_IMG_BUTTON).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnImgurAddMoreImgButton method");
		return new ImgurNewPostPage(driver);
	}

	/**
	 * This method click on add more images button after intro more images
	 * 
	 * @return
	 */
	public ImgurNewPostPage clickOnImgurAddMoreImgAfterMoreImgButton() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName()
				+ "]- Start clickOnImgurAddMoreImgAfterMoreImgButton method");

		if (this.isElementVisibleByXPath(ADD_MORE_IMG_AFTER_MORE_IMG_BUTTON)) {
			this.getElementByXPath(ADD_MORE_IMG_AFTER_MORE_IMG_BUTTON).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName()
				+ "]- End clickOnImgurAddMoreImgAfterMoreImgButton method");
		return new ImgurNewPostPage(driver);
	}

	/**
	 * This method run a robot that select a file
	 * 
	 * @throws Exception
	 */
	public void enterImg() throws Exception {

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start enterImg method");

		StringSelection ss = new StringSelection(
				"/home/jmcaceres/proyectos/qa-emergya-quickstart/src/main/resources/files/capt2.png");
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

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End enterImg method");

	}

	/**
	 * This method click on delete post button
	 * 
	 * @return
	 */
	public ImgurNewPostPage clickOnDeletePostButton() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start clickOnDeletePostButton method");

		if (this.isElementVisibleByXPath(DELETE_POST_BUTTON)) {
			this.getElementByXPath(DELETE_POST_BUTTON).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnDeletePostButton method");
		return new ImgurNewPostPage(driver);
	}

	/**
	 * This method click on delete post button after we update more images
	 * 
	 * @return
	 */
	public ImgurNewPostPage clickOnDeletePostAfterMoreImgButton() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName()
				+ "]- Start clickOnDeletePostAfterMoreImgButton method");

		if (this.isElementVisibleByXPath(DELETE_POST_AFTER_MORE_IMG_BUTTON)) {
			this.getElementByXPath(DELETE_POST_AFTER_MORE_IMG_BUTTON).click();
		}

		log.info("[log-pageObjects]" + this.getClass().getSimpleName()
				+ "]- End clickOnDeletePostAfterMoreImgButton method");
		return new ImgurNewPostPage(driver);
	}

	/**
	 * This method click on delete post confirm button
	 * 
	 * @return
	 */
	public ImgurNewPostPage clickOnDeletePostConfirmButton() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName()
				+ "]- Start clickOnDeletePostConfirmButton method");

		if (this.isElementVisibleByXPath(DELETE_POST_CONFIRM_BUTTON)) {
			this.getElementByXPath(DELETE_POST_CONFIRM_BUTTON).click();
		}

		log.info(
				"[log-pageObjects]" + this.getClass().getSimpleName() + "]- End clickOnDeletePostConfirmButton method");
		return new ImgurNewPostPage(driver);
	}

	/**
	 * This method check if Imgur New Post logo is displayed
	 */
	public boolean isImgurNewPostLogoDisplayed() {
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- Start isImgurNewPostLogoDisplayed method");
		log.info("[log-pageObjects]" + this.getClass().getSimpleName() + "]- End isImgurNewPostLogoDisplayed method");

		return this.isElementVisibleByXPath(IMG_LOGO_IMGUR_NEW_POST);
	}

}
