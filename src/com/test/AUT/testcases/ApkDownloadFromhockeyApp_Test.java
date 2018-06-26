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

package com.test.AUT.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.test.AUT.pages.HockeyApp_Page;
import com.test.AUT.utils.PropertyFileReader;

public class ApkDownloadFromhockeyApp_Test {
	static PropertyFileReader propertyFileReader;

	static WebDriver driver;
	static HockeyApp_Page hockeyApp_page;
	static WebDriverWait wait;
	static String appUrl;
	static String chromeDriverPath;
	static String Email;
	static String Password;
	static String BuildToBeSearched;

	/**
	 * This method will be called prior to any test method defined in this class.
	 * Creates and initializes <code>driver</code> object of type <code>WebDriver</code>.
	 * <p>
	 * In order to create <code>driver</code>, user needs to set the
	 * <code>ChromeDriver</code> path <code>System.setProperty("webdriver.chrome.driver",chromeDriverPath);</code>
	 * <p>
	 * This function also created Implicit and explicit waits for interaction methods defined inside page class.
	 * <p>
	 */
	@BeforeClass
	public static void setup() {
		propertyFileReader=new PropertyFileReader();
		propertyFileReader.setFilePath(System.getProperty("user.dir") +"\\src\\com\\test\\properties\\app.properties");
		appUrl=propertyFileReader.getPropertyValue("APP_URL");
		chromeDriverPath=System.getProperty("user.dir") + propertyFileReader.getPropertyValue("CHROMEDRIVER_PATH");
		Email=propertyFileReader.getPropertyValue("HOCKEY_APP_LOGIN_EMAIL");
		Password=propertyFileReader.getPropertyValue("HOCKEY_APP_LOGIN_PASSWORD");
		BuildToBeSearched=propertyFileReader.getPropertyValue("HOCKEY_APP_BUILD_TO_SEARCH");

		// Setting up the chrome driver path
		System.setProperty("webdriver.chrome.driver",chromeDriverPath);

		//Object creation for chrome driver.
		driver = new ChromeDriver();

		hockeyApp_page =  PageFactory.initElements(driver, HockeyApp_Page.class);

		//Global Implicit wait declaration.
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		// Object creation for Explicit wait and timeout unit set is 60 seconds.
		wait=new WebDriverWait(driver, 60);

		//launch the Chrome browser and open the application url
		driver.get(appUrl);

		//maximize the browser window
		driver.manage().window().maximize();

	}


	/**
	 * This method will perform all the operation from logging into the HockeyApp website
	 * till the downloading of the Android G2 APK.
	 */
	@Test
	public void ApkDownloadFromhockeyApp() {

		//Calling Interaction method to enter email in the Email text field.
		hockeyApp_page.enterEmailTextField(wait, Email);

		//Calling Interaction method to enter Password in the password text field.
		hockeyApp_page.enterPasswordTextField(wait, Password);
		

		//Calling Interaction method to click on the Signin button.
		hockeyApp_page.clickSigninButton(wait);

		//Calling Interaction method to click on platform dropdown.
		hockeyApp_page.clickAllplatformDropdown(wait);

		//Calling Interaction method to select Android from the platform dropdown.
		hockeyApp_page.selectAllplatformAndroidDdropdownItem(wait);

		//Calling Interaction method to enter G2 in the search app text field.
		hockeyApp_page.enterSearchAppsTextfield(wait, BuildToBeSearched);

		//Calling Interaction method to click on Android G2 build link.
		hockeyApp_page.clickAndroidG2BuildLink(wait);

		//Calling Interaction method to click on Download button.
		hockeyApp_page.clickDownloadButton(wait);


	}

}