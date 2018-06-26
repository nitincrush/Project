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

package com.test.AUT.Reporter;

import java.io.File;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

/**
 * Base class for reporting engine. Every test case class will extend this class if user wants to Integrate HTML Report.
 * <p>
 * <b>Usage:</b><br>
 * <code>Class A extend BaseTest</code>
 * <p>
 * @author Aman Kumar
 * @version 1.0
 */
public class BaseTest
{
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest test;


	/**
	 * This method will be called as a setup before a test suite.
	 * <p>
	 * Creates and initializes extent report.
	 * <p>
	 * Set System Information
	 * <p>
	 * Set HTML test report default lables
	 */
	@BeforeSuite
	public void setUp()
	{
		//htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/TestReports/SampleHTMLTestReport.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

		extent.setSystemInfo("OS", "Windows 10");
		extent.setSystemInfo("Host Name", "Capgemini");
		extent.setSystemInfo("Environment", "Test");
		extent.setSystemInfo("User Name", "admin");
		extent.loadConfiguration(new File(System.getProperty("user.dir")+"extent-config.xml"));

		htmlReporter.config().setChartVisibilityOnOpen(true);
		htmlReporter.config().setDocumentTitle("HP WorkWise Demo Report");
		htmlReporter.config().setReportName("WorkWise Test Report");
		htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
		htmlReporter.config().setTheme(Theme.DARK);
	}

	/**
	 * This method is called when all the test finish their execution. This method will flush the test information
	 * gathered while running the all the test cases in a suite
	 */
	@AfterSuite
	public void tearDown()
	{
		extent.flush();
	}
}
