package com.crm.ExternelData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {
	

	public static String propertiesRead(String keyname) throws IOException {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("src\\test\\resources\\Listeners.properties");
		prop.load(fis);
	    String data = prop.getProperty(keyname);
	    return data;
	}

}
