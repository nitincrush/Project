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

package com.test.AUT.utils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;
/**
 * Class to read property file.
 * <p>
 * <b>Usage:</b><br>
 * <code>PropertyFileReader propertyFileReader = new PropertyFileReader();</code>
 * <p>
 * @author Aman Kumar
 * @version 1.0
 */
public class PropertyFileReader {
	String filePath;


	/**
	 * This method will retun the property file path.
	 * <p>
	 * <b>Usage:</b><br>
	 * <code>
	 * PropertyFileReader propertyFileReader = new PropertyFileReader();<br>
	 * propertyFileReader.getFilePath();
	 * </code>
	 * <p>
	 * @return filePath
	 */
	public String getFilePath() {
		return filePath;
	}

	/**
	 * This method will be use to set the file path.
	 * <p>
	 * <b>Usage:</b><br>
	 * <code>
	 * PropertyFileReader propertyFileReader = new PropertyFileReader();<br>
	 * propertyFileReader.setFilePath(filePath);
	 * </code>
	 * <p>
	 * @param filePath: File location
	 */
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	/**
	 * This method will be used to fetch the values defined inside the property file.
	 * <p>
	 * <b>Usage:</b><br>
	 * <code>
	 * PropertyFileReader propertyFileReader = new PropertyFileReader();<br>
	 * propertyFileReader.getPropertyValue(propertyName);
	 * </code>
	 * <p>
	 * @param propertyName
	 * @return: Return the value of the property passed as an argument.
	 */
	public String  getPropertyValue(String propertyName)
	{
		String propertyValue = null;
		try{
			File file = new File(filePath);
			FileInputStream fileInput = new FileInputStream(file);
			Properties properties = new Properties();
			properties.load(fileInput);
			fileInput.close();

			Enumeration enuKeys = properties.keys();
			while (enuKeys.hasMoreElements()) {
				if(properties.getProperty(propertyName) != null)
				{
					propertyValue = properties.getProperty(propertyName);
					break;
				}

			}
			return propertyValue;
		}
		catch(Exception e){

			e.printStackTrace();
		}
		return null;

	}

	/**
	 * This method will be used to set the values for a property inside property file.
	 * <p>
	 * <b>Usage:</b><br>
	 * <code>
	 * PropertyFileReader propertyFileReader = new PropertyFileReader();<br>
	 * propertyFileReader.setPropertyValue(key, value);
	 * </code>
	 * <p>
	 * @param key
	 * @param value
	 */
	public void setPropertyValue(String key,String value)
	{

		try{
			Properties properties = new Properties();
			FileInputStream in = new FileInputStream(filePath);
			properties.load(in);
			in.close();

			FileOutputStream out = new FileOutputStream(filePath);
			properties.setProperty(key,value);
			properties.store(out, null);
			out.close();

		}
		catch(IOException e)
		{
			e.getMessage();
		}
	}

}








