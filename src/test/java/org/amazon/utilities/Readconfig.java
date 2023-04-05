package org.amazon.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readconfig {

	Properties pro;

	public Readconfig() {

		try {

			File f = new File("/org.apache.frameworkpratice/src/test/resources/config.properties");
			FileInputStream fi = new FileInputStream(f);
			Properties pro = new Properties();
			pro.load(fi);

		} catch (Exception e) {

			System.out.println("Exception should be" + e.getMessage());

		}
	}

	public String gamilUser() {
		String baseURL = pro.getProperty("email");
		return baseURL;

	}

	public String getUerName() {
		String gemail = pro.getProperty("email");
		return gemail;
	}

	public String getPassword() {
		String gmailPass = pro.getProperty("password");
		return gmailPass;
	}

}