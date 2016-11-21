package com.orange_hrms.utils;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4jConfig {

	public static void Logg(String info){
		
		Logger loging4j=Logger.getLogger("Log4jConfig");
		PropertyConfigurator.configure("D:\\OrangeHRMS Project\\hrmsgit\\Orange_hrms\\src\\main\\resources\\log4j.properties");
		loging4j.info(info);
	}

}
