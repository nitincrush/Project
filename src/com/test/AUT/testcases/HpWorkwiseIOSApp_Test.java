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

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.test.AUT.Reporter.BaseTest;
import com.test.AUT.pages.HpWorkwiseIOSApp_Page;
import com.test.AUT.utils.PropertyFileReader;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

/**
 * Test Case Class of WorkWise Android Application.
 * <p>
 * <b>Usage:</b><br>
 * <code>HpWorkwiseAndroidApp_Test hpWorkwiseAndroidApp_Test = new HpWorkwiseAndroidApp_Test();</code>
 * <p>
 * @author Aman Kumar
 * @version 1.0
 */
public class HpWorkwiseIOSApp_Test extends BaseTest {
	static PropertyFileReader propertyFileReader;	
	@SuppressWarnings("rawtypes")
	private AppiumDriver driver;
	static WebDriverWait wait;
	
	HpWorkwiseIOSApp_Page hpWorkwiseIOSApp_Page;
	//String IOSUDID;//Hp Workwise: Samsung S5
	//String bundleID;
	
	String AndroidDeviceName;
	String platformVersion;
	String appPackage;
	String appActivity;	

	/**
	 * Creates and initializes <code>driver</code> object of type <code>AndroidDriver</code>.
	 * <p>
	 * In order to create <code>driver</code>, user needs to pass the
	 * <code>AndroidDriver</code> capabilities <code>DesiredCapabilities</code> for the test
	 * application.
	 * <p>
	 * This function also created Implicit and explicit waits for interaction methods defined inside page class.
	 * <p>
	 * <b>Usage:</b><br>
	 * <code>
	 * HpWorkwiseAndroidApp_Test hpWorkwiseAndroidApp_Test = new HpWorkwiseAndroidApp_Test();<br>
	 * hpWorkwiseAndroidApp_Test.setUp();
	 * </code>
	 * <p>
	 */
	@SuppressWarnings("rawtypes")
	@BeforeClass
	public void setUp() {
		System.out.println("Inside Setup");
		propertyFileReader=new PropertyFileReader();
		propertyFileReader.setFilePath(System.getProperty("user.dir") +"\\src\\com\\test\\properties\\app.properties");
		AndroidDeviceName = propertyFileReader.getPropertyValue("ANDROIDDEVICENAME");
		platformVersion=propertyFileReader.getPropertyValue("PLATFORMVERSION");
		appPackage=propertyFileReader.getPropertyValue("APP_PACKAGE");
		appActivity=propertyFileReader.getPropertyValue("APP_ACTIVITY");
		
		//bundleID=propertyFileReader.getPropertyValue("APP_BUNDLE_ID");
		//IOSUDID=propertyFileReader.getPropertyValue("IOS_UDID");


		//Creating object for test reporter.
		//test=extent.createTest("HpWorkwiseAndroidApp_Test");
		//Statement logging for Test Report.
	//	test.log(Status.INFO, "Creating Android Driver");
		System.out.println("Settings capablities");
		DesiredCapabilities capabilities = new DesiredCapabilities();		
	//	capabilities.setCapability("platformName", "Android");       
		//capabilities.setCapability(IOSMobileCapabilityType.BUNDLE_ID,bundleID);
		//capabilities.setCapability(MobileCapabilityType.UDID,IOSUDID);
        
		capabilities.setCapability("deviceName",AndroidDeviceName);		
		capabilities.setCapability("platformVersion", platformVersion);
		capabilities.setCapability("appPackage", appPackage);
		capabilities.setCapability("appActivity", appActivity);
		try {
			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			System.out.println("Creating Driver");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

		//Global Implicit wait declaration.
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		// Object creation for Explicit wait and timeout unit set is 60 seconds.

		wait  = new WebDriverWait(driver, 60);

		//IOS Page class object creation and page factory initialization.
		hpWorkwiseIOSApp_Page = PageFactory.initElements(driver, HpWorkwiseIOSApp_Page.class);
		System.out.println("end of program1");
	}

	/**
	 * This function will prepare Workwise Android App to ready for bluetooth pairing with Desktop App.
	 * <p>
	 * <b>Usage:</b><br>
	 * <code>
	 * HpWorkwiseAndroidApp_Test hpWorkwiseAndroidApp_Test = new HpWorkwiseAndroidApp_Test();<br>
	 * hpWorkwiseAndroidApp_Test.makeBluetoothDiscoverableFromHpWorkWiseApp();
	 * </code>
	 * <p>
	 */
	@Test
	public void makeBluetoothDiscoverableFromHpWorkWiseApp(){
		System.out.println("end of program2");

		//1. Calling Interaction method for clicking on SKIP button.
		hpWorkwiseIOSApp_Page.tapSkip_button(wait);

		//Calling Interaction method to tap on OK button for Allowing App to use location in order to enable Bluetooth beacons.
	//	hpWorkwiseIOSApp_Page.tapOk_button(wait);

		//Calling Interaction method to tap on ALLOW button to access test device location.
		//hpWorkwiseIOSApp_Page.tapPermission_allow_button(wait);

		//2. Calling Interaction method to tap on MAKE PHONE VISIBLE button.
		hpWorkwiseIOSApp_Page.tapMake_phone_visible_button(wait);

		//3. Calling Interaction method to tap on yes button make test device visible for 300 seconds.
		hpWorkwiseIOSApp_Page.tapOk_button2(wait);

		//Calling Interaction method to tap on ALLOW button to allow permission to test device to take picture and record Video.
		//hpWorkwiseIOSApp_Page.tapPermission_allow_button2(wait);

		//4. Calling Interaction method to tap on MANUAL PAIR button.
		hpWorkwiseIOSApp_Page.tapManual_pair_button(wait);


	}

/*	public void enterPassKey(String Passkey) throws InterruptedException{
		hpWorkwiseIOSApp_Page.enterPassKey(wait, Passkey);
		Thread.sleep(3000);
		hpWorkwiseIOSApp_Page.tapPairButton(wait);
	}*/
	/**
	 * This function will accept the passcode confirmation and pair the Android device with Desktop Application.
	 * <p>
	 * <b>Usage:</b><br>
	 * <code>
	 * HpWorkwiseAndroidApp_Test hpWorkwiseAndroidApp_Test = new HpWorkwiseAndroidApp_Test();<br>
	 * hpWorkwiseAndroidApp_Test.enableBluetoothDiscoverableFromHpWorkWiseApp();
	 * </code>
	 * <p>
	 */
/*	public void enableBluetoothDiscoverableFromHpWorkWiseApp(){

		//Calling Interaction method to tap on pass code confirmation OK button.
		hpWorkwiseIOSApp_Page.tapPass_code_confirmation_ok_button(wait);

	}*/

	/**
	 * This function will complete the calibration setup at Android app side and user will be able to see the PC information.
	 * <p>
	 * <b>Usage:</b><br>
	 * <code>
	 * HpWorkwiseAndroidApp_Test hpWorkwiseAndroidApp_Test = new HpWorkwiseAndroidApp_Test();<br>
	 * hpWorkwiseAndroidApp_Test.endAppSetup();
	 * </code>
	 * <p>
	 */
/*	public void endAppSetup(){
		//Calling Interaction method to tap on OK button to finish setup.
		hpWorkwiseIOSApp_Page.tapPair_finish_ok_button(wait);
	}*/

	/**
	 * This function will initiated step to generate application log by tapping 4 times on App Name Icon inside settings screen.
	 * Then copy the generated app log from android device sdcard to preferred PC location
	 * <p>
	 * <b>Usage:</b><br>
	 * <code>
	 * HpWorkwiseAndroidApp_Test hpWorkwiseAndroidApp_Test = new HpWorkwiseAndroidApp_Test();<br>
	 * hpWorkwiseAndroidApp_Test.collectAppLog();
	 * </code>
	 * <p>
	 * @throws IOException
	 * @throws InterruptedException
	 */
	
	
	
	
	
	/*public void collectAppLog() throws IOException, InterruptedException{
		//Calling Interaction method to tap on workwise application settings icon.
		hpWorkwiseIOSApp_Page.tapSettings_icon_image(wait);
		for(int i=0;i<4;i++){
			//Calling Interaction method to tap on HP logo.
			hpWorkwiseIOSApp_Page.tapIv_app_name_button(wait);
		}
		Thread.sleep(2000);

		//Process to copy application log to PC/Laptop.
		@SuppressWarnings("unused")
		Process p=Runtime.getRuntime().exec("adb pull /sdcard/Android/data/com.hp.iot.workwise/cache C:/WorkwiseAppLog");
		Thread.sleep(15000);
	}*/


}
