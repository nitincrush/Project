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
 * Page Class of Hockey App website. It have all the locator & Interaction functions for downloading Android apk for
 * Workwise G2.
 * <p>
 * <b>Usage:</b><br>
 * <code>HockeyApp_Page hockeyApp_Page = new HockeyApp_Page();</code>
 * <p>
 * @author Aman Kumar
 * @version 1.0
 */

public class HockeyApp_Page
{
	/**
	 * Locators for buttons, links and popup buttons used used for HOCKEY App website for APK Download.
	 */

	public static final String ID_LOCATOR_EMAIL_TEXT_FIELD = "user_email";

	public static final String ID_LOCATOR_PASSWORD_TEXT_FIELD = "user_password";

	public static final String XPATH_LOCATOR_SIGN_IN_BUTTON = ".//*[@id='sign_in']/div[2]/div[1]/input";

	public static final String XPATH_LOCATOR_ALLPLATFORM_DROPDOWN = "html/body/div[2]/div[2]/div/div[2]/ul/li[2]/a";

	public static final String XPATH_LOCATOR_ALLPLATFORM_ANDROID_DROPDOWN_ITEM = "html/body/div[2]/div[2]/div/div[2]/ul/li[2]/ul/li[3]/a";

	public static final String XPATH_LOCATOR_SEARCH_APPS_TEXT_FIELD = "html/body/div[2]/div[2]/div/div[2]/div[1]/form/input";

	public static final String XPATH_LOCATOR_ANDROID_G2_BUILD_LINK = ".//*[@id='apps']/tbody/tr[2]/td[2]/div";

	public static final String XPATH_LOCATOR_DOWNLOAD_BUTTON = "html/body/div[1]/div[2]/div/div[1]/div/div[3]/div[6]/div[1]/a";

	/**
	 * Page Factory initialization of all web elements which are defined in this Page class
	 */

	@FindBy(how=How.ID, using=ID_LOCATOR_EMAIL_TEXT_FIELD)
    private WebElement emailTextField;

    @FindBy(how=How.ID, using=ID_LOCATOR_PASSWORD_TEXT_FIELD)
    private WebElement passwordTextField;

    @FindBy(how=How.XPATH, using=XPATH_LOCATOR_SIGN_IN_BUTTON)
    private WebElement signinButton;

    @FindBy(how=How.XPATH, using=XPATH_LOCATOR_ALLPLATFORM_DROPDOWN)
    private WebElement allplatform_dropdown;

    @FindBy(how=How.XPATH, using=XPATH_LOCATOR_ALLPLATFORM_ANDROID_DROPDOWN_ITEM)
    private WebElement allplatform_android_dropdown_item;

    @FindBy(how=How.XPATH, using=XPATH_LOCATOR_SEARCH_APPS_TEXT_FIELD)
    private WebElement search_apps_textfield;

    @FindBy(how=How.XPATH, using=XPATH_LOCATOR_ANDROID_G2_BUILD_LINK)
    private WebElement android_g2_build_link;

    @FindBy(how=How.XPATH, using=XPATH_LOCATOR_DOWNLOAD_BUTTON)
    private WebElement download_button;

    /**
	 * Interaction method to Enter, email text inside Email Text Filed.
	 * <p>
	 * <b>Usage:</b><br>
	 * <code>
	 * HockeyApp_Page hockeyApp_Page = new HockeyApp_Page();<br>
	 * hockeyApp_Page.enterEmailTextField(wait,textToBeEntered);
	 * </code>
	 * <p>
	 * @param wait: Waits for the presence of element identified by locator like <code>Id, Name, Xapth, ClassName, TagName, Link</code>
	 * @param textToBeEntered: Email
	 */
    public void enterEmailTextField(WebDriverWait wait, String textToBeEntered){
        System.out.println("[HPBuiltDownload : enterEmailTextField] Entering '" + textToBeEntered + "' in emailTextField text field");
        emailTextField=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(ID_LOCATOR_EMAIL_TEXT_FIELD)));
        emailTextField.clear();
        emailTextField.sendKeys(textToBeEntered);
    }

    /**
   	 * Interaction method to Enter, password text inside Password Text Filed.
   	 * <p>
   	 * <b>Usage:</b><br>
   	 * <code>
   	 * HockeyApp_Page hockeyApp_Page = new HockeyApp_Page();<br>
   	 * hockeyApp_Page.enterPasswordTextField(wait,textToBeEntered);
   	 * </code>
   	 * <p>
   	 * @param wait: Waits for the presence of element identified by locator like <code>Id, Name, Xapth, ClassName, TagName, Link</code>
   	 * @param textToBeEntered: Email
   	 */
    public void enterPasswordTextField(WebDriverWait wait,String textToBeEntered){
        System.out.println("[HPBuiltDownload : enterPasswordTextField] Entering '" + textToBeEntered + "' in passwordTextField text field");
        passwordTextField=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(ID_LOCATOR_PASSWORD_TEXT_FIELD)));
        passwordTextField.clear();
        passwordTextField.sendKeys(textToBeEntered);
    }

    /**
   	 * Interaction method to click on SignIn button.
   	 * <p>
   	 * <b>Usage:</b><br>
   	 * <code>
   	 * HockeyApp_Page hockeyApp_Page = new HockeyApp_Page();<br>
   	 * hockeyApp_Page.clickSigninButton(wait);
   	 * </code>
   	 * <p>
   	 * @param wait: Waits for the presence of element identified by locator like <code>Id, Name, Xapth, ClassName, TagName, Link</code>
   	 */
    public void clickSigninButton(WebDriverWait wait){
        System.out.println("[HPBuiltDownload : clickSigninButton] clicking signinButton button");
        signinButton=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(XPATH_LOCATOR_SIGN_IN_BUTTON)));
        signinButton.click();
    }

    /**
   	 * Interaction method to click on Platform dropdown.
   	 * <p>
   	 * <b>Usage:</b><br>
   	 * <code>
   	 * HockeyApp_Page hockeyApp_Page = new HockeyApp_Page();<br>
   	 * hockeyApp_Page.clickAllplatformDropdown(wait);
   	 * </code>
   	 * <p>
   	 * @param wait: Waits for the presence of element identified by locator like <code>Id, Name, Xapth, ClassName, TagName, Link</code>
   	 */
    public void clickAllplatformDropdown(WebDriverWait wait){
        System.out.println("[HPBuiltDownload : clickAllplatformDropdown] clicking allplatform dropdown");
        allplatform_dropdown=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(XPATH_LOCATOR_ALLPLATFORM_DROPDOWN)));
        allplatform_dropdown.click();
    }

    /**
   	 * Interaction method to select Android from the Platform dropdown list.
   	 * <p>
   	 * <b>Usage:</b><br>
   	 * <code>
   	 * HockeyApp_Page hockeyApp_Page = new HockeyApp_Page();<br>
   	 * hockeyApp_Page.selectAllplatformAndroidDdropdownItem(wait);
   	 * </code>
   	 * <p>
   	 * @param wait: Waits for the presence of element identified by locator like <code>Id, Name, Xapth, ClassName, TagName, Link</code>
   	 */
    public void selectAllplatformAndroidDdropdownItem(WebDriverWait wait){
        System.out.println("[selectAllplatformAndroidDdropdownItem : allplatform_android_dropdown_item] Selecting Android from All Platform drop down.");
        allplatform_android_dropdown_item =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(XPATH_LOCATOR_ALLPLATFORM_ANDROID_DROPDOWN_ITEM)));
        allplatform_android_dropdown_item.click();
    }

    /**
   	 * Interaction method to Enter, build name inside search text field.
   	 * <p>
   	 * <b>Usage:</b><br>
   	 * <code>
   	 * HockeyApp_Page hockeyApp_Page = new HockeyApp_Page();<br>
   	 * hockeyApp_Page.enterSearchAppsTextfield(wait,textToBeEntered);
   	 * </code>
   	 * <p>
   	 * @param wait: Waits for the presence of element identified by locator like <code>Id, Name, Xapth, ClassName, TagName, Link</code>
   	 * @param textToBeEntered: Email
   	 */
    public void enterSearchAppsTextfield(WebDriverWait wait, String textToBeEntered  ){
    	System.out.println("[HPBuiltDownload : enterSearchAppsTextfield] Entering '" + textToBeEntered + "' in Search app text field");
        search_apps_textfield =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(XPATH_LOCATOR_SEARCH_APPS_TEXT_FIELD)));
        search_apps_textfield.clear();
        search_apps_textfield.sendKeys(textToBeEntered);
    }

    /**
   	 * Interaction method to click on searched Android build link.
   	 * <p>
   	 * <b>Usage:</b><br>
   	 * <code>
   	 * HockeyApp_Page hockeyApp_Page = new HockeyApp_Page();<br>
   	 * hockeyApp_Page.clickAndroidG2BuildLink(wait);
   	 * </code>
   	 * <p>
   	 * @param wait: Waits for the presence of element identified by locator like <code>Id, Name, Xapth, ClassName, TagName, Link</code>
   	 */
    public void clickAndroidG2BuildLink(WebDriverWait wait){
        System.out.println("[HPBuiltDownload : clickAndroidG2BuildLink] clicking android g2 build link.");
        android_g2_build_link =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(XPATH_LOCATOR_ANDROID_G2_BUILD_LINK)));
        android_g2_build_link.click();
    }

    /**
   	 * Interaction method to click on Download button.
   	 * <p>
   	 * <b>Usage:</b><br>
   	 * <code>
   	 * HockeyApp_Page hockeyApp_Page = new HockeyApp_Page();<br>
   	 * hockeyApp_Page.clickDownloadButton(wait);
   	 * </code>
   	 * <p>
   	 * @param wait: Waits for the presence of element identified by locator like <code>Id, Name, Xapth, ClassName, TagName, Link</code>
   	 */
    public void clickDownloadButton(WebDriverWait wait){
        System.out.println("[HPBuiltDownload : clickDownloadButton] clicking download button.");
        download_button =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(XPATH_LOCATOR_DOWNLOAD_BUTTON)));
        download_button.click();
    }

 }