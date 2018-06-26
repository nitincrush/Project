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
import java.io.IOException;

/**
 * Common utility functions.
 * <p>
 * <b>Usage:</b><br>
 * <code>utilHpWorkwise util = new utilHpWorkwise();</code>
 * <p>
 * @author      Aman Kumar
 * @version 	1.0
 */
public class utilHpWorkwise {

	public boolean flag=true;

	/**
	 * run the batch script using java runtime.
	 * <p>
	 * <b>Usage:</b><br>
	 * <code>
	 * utilHpWorkwise util = new utilHpWorkwise();
	 * util.executeBatchFile(pathWithName);
	 * </code>
	 * <p>
	 * @param pathWithName: Takes an argument as complete path with batch file name
	 */

	public void executeBatchFile(String pathWithName)
	{	try {
		Runtime.getRuntime().exec("cmd /c start "+pathWithName);
	} catch (IOException e) {
		System.out.println("unable to execute batch file"+pathWithName);
	}
	}

	/**
	 * Check for the file existence at a given folder location
	 * <p>
	 * <b>Usage:</b><br>
	 * <code>
	 * utilHpWorkwise util = new utilHpWorkwise();
	 * util.checkIfFileExist(path,fileName );
	 * </code>
	 * <p>
	 * @param path: Folder path
	 * @param fileName: Name of the file which is to be validated
	 * @return: True if file exists or false if file does not exists.
	 */
	public boolean checkIfFileExist(String path, String fileName)
	{
		File folder = new File(path);
		File[] listOfFiles = folder.listFiles();
		if(folder.exists())
		{
			for (int i = 0; i < listOfFiles.length; i++) {
				File file = listOfFiles[i];
				if(file.getName().equals(fileName))
				{
					return true;
				}
			}
		}
		else{
			return false;
		}
		return false;
	}

}
