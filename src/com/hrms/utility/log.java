package com.hrms.utility;

import org.apache.log4j.Logger;

import com.hrms.utili.Log;

public class log {
	//Initialize Log4j logs
	private static Logger Log = Logger.getLogger(Log.class.getName());
	// Need to create these methods, so that they can be called
	public static void info(String message) {
	 Log.info(message); }


}
