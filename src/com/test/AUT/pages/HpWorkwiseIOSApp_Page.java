/*
 * Copyright (c) Capgemini Technology Services India Limited. All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Capgemini
 * Technology Services India Limited. ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Capgemini.
 *
 * CAPGEMINI MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF
 * THE SOFTWARE, EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED
 * TO THE IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR A
 * PARTICULAR PURPOSE, OR NON-INFRINGEMENT. IGATE SHALL NOT BE LIABLE FOR
 * ANY DAMAGES SUFFERED BY LICENSEE AS A RESULT OF USING, MODIFYING OR
 * DISTRIBUTING THIS SOFTWARE OR ITS DERIVATIVES.
 */

package com.test.AUT.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Page Class of WorkWise Android Application. It have all the locator & Interaction functions for Bluetooth Paring & Calibration.
 * <p>
 * <b>Usage:</b><br>
 * <code>HpWorkwiseAndroidApp_Page hpWorkwiseAndroidApp_Page = new HpWorkwiseAndroidApp_Page();</code>
 * <p>
 * @author Aman Kumar
 * @version 1.0
 */

public class HpWorkwiseIOSApp_Page {

	/**
	 * Locators for buttons, links and popup buttons used used for workwise bluetooth paring and calibration.
	 */

	public static final String XPATH_LOCATOR_SKIP_BUTTON = "//*[@text='SKIP']";

	public static final String XPATH_LOCATOR_OK_BUTTON = "android:id/button1";

	public static final String ID_LOCATOR_PERMISSION_ALLOW_BUTTON = "com.android.packageinstaller:id/permission_allow_button";

	public static final String XPATH_LOCATOR_MAKE_PHONE_VISIBLE_BUTTON = "//*[@text='Make phone visible']";
	//Make phone visisble for 300 seconds for bluetooth pair
	public static final String XPATH_LOCATOR_OK_BUTTON2 = "//*[@text='Allow']";

	public static final String XPATH_LOCATOR_PASS_KEY_TEXT_FIELD = "//*[@class='UIAView' and @width>0 and @height>0 and ./parent::*[@class='UIAView' and ./parent::*[@class='UIACollectionView']]]";

	public static final String ID_LOCATOR_PERMISSION_ALLOW_BUTTON2 = "com.android.packageinstaller:id/permission_allow_button";

	public static final String XPATH_LOCATOR_MANUAL_PAIR_BUTTON = "//*[@text='Manual Pairing']";

	public static final String ID_LOCATOR_PASS_CODE_CONFIRMATION_OK_BUTTON = "android:id/button1";

	public static final String XPATH_LOCATOR_PAIR_FINISH_OK_BUTTON = "//*[@text='OK']";

	public static final String NAME_LOCATOR_SETTINGS_ICON_IMAGE = "HP WorkWise";

	public static final String ID_LOCATOR_IV_APP_NAME_BUTTON = "com.hp.iot.workwise:id/iv_app_name";

	public static final String XPATH_LOCATOR_PAIR_BUTTON = "//*[@text='Pair']";

	/**
	 * Page Factory initialization of all Android elements which are defined in this Page class
	 */


	@FindBy(how=How.XPATH, using=XPATH_LOCATOR_SKIP_BUTTON)
	public WebElement skip_button;

	@FindBy(how=How.XPATH, using=XPATH_LOCATOR_OK_BUTTON)
	public WebElement ok_button;

	@FindBy(how=How.ID, using=ID_LOCATOR_PERMISSION_ALLOW_BUTTON)
	public WebElement permission_allow_button;

	@FindBy(how=How.XPATH, using=XPATH_LOCATOR_MAKE_PHONE_VISIBLE_BUTTON)
	public WebElement make_phone_visible_button;

	@FindBy(how=How.XPATH, using=XPATH_LOCATOR_OK_BUTTON2)
	public WebElement ok_button2;

	@FindBy(how=How.ID, using=ID_LOCATOR_PERMISSION_ALLOW_BUTTON2)
	public WebElement permission_allow_button2;

	@FindBy(how=How.XPATH, using=XPATH_LOCATOR_MANUAL_PAIR_BUTTON)
	public WebElement manual_pair_button;

	@FindBy(how=How.ID, using=ID_LOCATOR_PASS_CODE_CONFIRMATION_OK_BUTTON)
	public WebElement pass_code_confirmation_ok_button;

	@FindBy(how=How.XPATH, using=XPATH_LOCATOR_PAIR_FINISH_OK_BUTTON)
	public WebElement pair_finish_ok_button;

	@FindBy(how=How.NAME, using=NAME_LOCATOR_SETTINGS_ICON_IMAGE)
	public WebElement settings_icon_image;

	@FindBy(how=How.ID, using=ID_LOCATOR_IV_APP_NAME_BUTTON)
	public WebElement iv_app_name_button;

	@FindBy(how=How.XPATH, using=XPATH_LOCATOR_PASS_KEY_TEXT_FIELD)
	public WebElement pass_key_text_field;

	@FindBy(how=How.XPATH, using=XPATH_LOCATOR_PAIR_BUTTON)
	public WebElement pair_button;


	/**
	 * Tap on SKIP button
	 * <p>
	 * <b>Usage:</b><br>
	 * <code>
	 * HpWorkwiseAndroidApp_Page hpWorkwiseAndroidApp_Page = new HpWorkwiseAndroidApp_Page();<br>
	 * hpWorkwiseAndroidApp_Page.tapSkip_button(wait);
	 * </code>
	 * <p>
	 * @param wait: Waits for the presence of element identified by locator like <code>Id, Name, Xapth, ClassName, TagName, AccessiblityID</code>
	 */
	public void tapSkip_button(WebDriverWait wait){

		System.out.println("Clicking Skip Button on Android Device.");
		skip_button =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(XPATH_LOCATOR_SKIP_BUTTON)));
		skip_button.click();
	}

	/**
	 * Tap on OK button
	 * <p>
	 * <b>Usage:</b><br>
	 * <code>
	 * HpWorkwiseAndroidApp_Page hpWorkwiseAndroidApp_Page = new HpWorkwiseAndroidApp_Page();<br>
	 * hpWorkwiseAndroidApp_Page.tapOk_button(wait);
	 * </code>
	 * <p>
	 * @param wait: Waits for the presence of element identified by locator like <code>Id, Name, Xapth, ClassName, TagName, AccessiblityID</code>
	 */
	public void tapOk_button(WebDriverWait wait){

		System.out.println("Clicking Ok Button on Android Device.");
		ok_button =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(XPATH_LOCATOR_OK_BUTTON)));
		ok_button.click();
	}

	/**
	 * Tap on PERMISSION ALLOW button.
	 * <p>
	 * <b>Usage:</b><br>
	 * <code>
	 * HpWorkwiseAndroidApp_Page hpWorkwiseAndroidApp_Page = new HpWorkwiseAndroidApp_Page();<br>
	 * hpWorkwiseAndroidApp_Page.tapPermission_allow_button(wait);
	 * </code>
	 * <p>
	 * @param wait: Waits for the presence of element identified by locator like <code>Id, Name, Xapth, ClassName, TagName, AccessiblityID</code>
	 */
	public void tapPermission_allow_button(WebDriverWait wait){

		System.out.println("Clicking Permission Allow button on Android Device.");
		permission_allow_button =wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(ID_LOCATOR_PERMISSION_ALLOW_BUTTON)));
		permission_allow_button.click();
	}

	/**
	 * Tap on MAKE PHONE VISIBLE button.
	 * <p>
	 * <b>Usage:</b><br>
	 * <code>
	 * HpWorkwiseAndroidApp_Page hpWorkwiseAndroidApp_Page = new HpWorkwiseAndroidApp_Page();<br>
	 * hpWorkwiseAndroidApp_Page.tapMake_phone_visible_button(wait);
	 * </code>
	 * <p>
	 * @param wait: Waits for the presence of element identified by locator like <code>Id, Name, Xapth, ClassName, TagName, AccessiblityID</code>
	 */
	public void tapMake_phone_visible_button(WebDriverWait wait){

		System.out.println("Clicking Make Phone Visisble Button on Android Device.");
		make_phone_visible_button =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(XPATH_LOCATOR_MAKE_PHONE_VISIBLE_BUTTON)));
		make_phone_visible_button.click();
	}

	/**
	 * Tap on OK button.
	 * <p>
	 * <b>Usage:</b><br>
	 * <code>
	 * HpWorkwiseAndroidApp_Page hpWorkwiseAndroidApp_Page = new HpWorkwiseAndroidApp_Page();<br>
	 * hpWorkwiseAndroidApp_Page.tapOk_button2(wait);
	 * </code>
	 * <p>
	 * @param wait: Waits for the presence of element identified by locator like <code>Id, Name, Xapth, ClassName, TagName, AccessiblityID</code>
	 */
	public void tapOk_button2(WebDriverWait wait){

		System.out.println("Clicking ok Button on Android Device.");
		ok_button2 =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(XPATH_LOCATOR_OK_BUTTON2)));
		ok_button2.click();
	}

	/**
	 * Tap on PERMISSION ALLOW button. This Appears for second time during bluetooth paring.
	 * <p>
	 * <b>Usage:</b><br>
	 * <code>
	 * HpWorkwiseAndroidApp_Page hpWorkwiseAndroidApp_Page = new HpWorkwiseAndroidApp_Page();<br>
	 * hpWorkwiseAndroidApp_Page.tapPermission_allow_button2(wait);
	 * </code>
	 * <p>
	 * @param wait: Waits for the presence of element identified by locator like <code>Id, Name, Xapth, ClassName, TagName, AccessiblityID</code>
	 */
	public void tapPermission_allow_button2(WebDriverWait wait){

		System.out.println("Clicking Permission Allow Button on Android Device.");
		permission_allow_button2 =wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(ID_LOCATOR_PERMISSION_ALLOW_BUTTON2)));
		permission_allow_button2.click();
	}

	/**
	 * Tap on MANUAL PAIR button.
	 * <p>
	 * <b>Usage:</b><br>
	 * <code>
	 * HpWorkwiseAndroidApp_Page hpWorkwiseAndroidApp_Page = new HpWorkwiseAndroidApp_Page();<br>
	 * hpWorkwiseAndroidApp_Page.tapManual_pair_button(wait);
	 * </code>
	 * <p>
	 * @param wait: Waits for the presence of element identified by locator like <code>Id, Name, Xapth, ClassName, TagName, AccessiblityID</code>
	 */
	public void tapManual_pair_button(WebDriverWait wait){

		System.out.println("Clicking Maual Pair Button on Android Device.");
		manual_pair_button =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(XPATH_LOCATOR_MANUAL_PAIR_BUTTON)));
		manual_pair_button.click();
	}

	/**
	 * Tap on PASS CODE CONFIRMATION OK button.
	 * <p>
	 * <b>Usage:</b><br>
	 * <code>
	 * HpWorkwiseAndroidApp_Page hpWorkwiseAndroidApp_Page = new HpWorkwiseAndroidApp_Page();<br>
	 * hpWorkwiseAndroidApp_Page.tapPass_code_confirmation_ok_button(wait);
	 * </code>
	 * <p>
	 * @param wait: Waits for the presence of element identified by locator like <code>Id, Name, Xapth, ClassName, TagName, AccessiblityID</code>
	 */
	public void tapPass_code_confirmation_ok_button(WebDriverWait wait){

		System.out.println("Clicking Pass code confirmation OK button on Android Device.");
		pass_code_confirmation_ok_button =wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(ID_LOCATOR_PASS_CODE_CONFIRMATION_OK_BUTTON)));
		pass_code_confirmation_ok_button.click();
	}

	/**
	 * Tap on PAIR FINISH OK button.
	 * <p>
	 * <b>Usage:</b><br>
	 * <code>
	 * HpWorkwiseAndroidApp_Page hpWorkwiseAndroidApp_Page = new HpWorkwiseAndroidApp_Page();<br>
	 * hpWorkwiseAndroidApp_Page.tapPair_finish_ok_button(wait);
	 * </code>
	 * <p>
	 * @param wait: Waits for the presence of element identified by locator like <code>Id, Name, Xapth, ClassName, TagName, AccessiblityID</code>
	 */
	public void tapPair_finish_ok_button(WebDriverWait wait){

		System.out.println("Clicking Pair Finish Ok Button on Android Device.");
		pair_finish_ok_button =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(XPATH_LOCATOR_PAIR_FINISH_OK_BUTTON)));
		pair_finish_ok_button.click();
	}

	/**
	 * Tap on SETTINGS ICON IMAGE.
	 * <p>
	 * <b>Usage:</b><br>
	 * <code>
	 * HpWorkwiseAndroidApp_Page hpWorkwiseAndroidApp_Page = new HpWorkwiseAndroidApp_Page();<br>
	 * hpWorkwiseAndroidApp_Page.tapSettings_icon_image(wait);
	 * </code>
	 * <p>
	 * @param wait: Waits for the presence of element identified by locator like <code>Id, Name, Xapth, ClassName, TagName, AccessiblityID</code>
	 */
	public void tapSettings_icon_image(WebDriverWait wait){

		System.out.println("Clicking settings ICON.");
		settings_icon_image =wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(NAME_LOCATOR_SETTINGS_ICON_IMAGE)));
		settings_icon_image.click();
	}

	/**
	 * Tap on HP LOGO IMAGE.
	 * <p>
	 * <b>Usage:</b><br>
	 * <code>
	 * HpWorkwiseAndroidApp_Page hpWorkwiseAndroidApp_Page = new HpWorkwiseAndroidApp_Page();<br>
	 * hpWorkwiseAndroidApp_Page.tapIv_app_name_button(wait);
	 * </code>
	 * <p>
	 * @param wait: Waits for the presence of element identified by locator like <code>Id, Name, Xapth, ClassName, TagName, AccessiblityID</code>
	 */
	public void tapIv_app_name_button(WebDriverWait wait){

		System.out.println("Tapping on app name for generating logs.");
		iv_app_name_button =wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(ID_LOCATOR_IV_APP_NAME_BUTTON)));
		iv_app_name_button.click();
	}

	public void enterPassKey(WebDriverWait wait, String Passkey){

		//System.out.println("Tapping on app name for generating logs.");
		pass_key_text_field =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(XPATH_LOCATOR_PASS_KEY_TEXT_FIELD)));
		pass_key_text_field.sendKeys(Passkey);
	}


	public void tapPairButton(WebDriverWait wait){

		System.out.println("Clicking Pair Finish Ok Button on Android Device.");
		pair_button =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(XPATH_LOCATOR_PAIR_BUTTON)));
		pair_button.click();
	}

}
