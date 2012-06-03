/**
 * © PixelSimple 2011-2012.
 */
package com.pixelsimple.commons.util;

import java.io.File;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.JoranConfigurator;
import ch.qos.logback.core.joran.spi.JoranException;
import ch.qos.logback.core.util.StatusPrinter;

/**
 *
 * @author Akshay Sharma
 * Jun 1, 2012
 */
public class LogUtils {
	
	private LogUtils() {}
	
	public static void initLogFromConfigFile(String logConfigFile) {
		File file = new File(logConfigFile);
		
		if (!file.exists()) {
			return;
		}
		
		// Not going to use system property way of doing things here, because more than one app on same jvm might use 
		// different log configs. Instead using joran configurator.
		//System.setProperty("logback.configurationFile", logConfigFile);

		// Taken from - http://logback.qos.ch/manual/configuration.html
		
		// assume SLF4J is bound to logback in the current environment
	    LoggerContext context = (LoggerContext) LoggerFactory.getILoggerFactory();
	    
	    try {
	      JoranConfigurator configurator = new JoranConfigurator();
	      configurator.setContext(context);
	      // Call context.reset() to clear any previous configuration, e.g. default 
	      // configuration. For multi-step configuration, omit calling context.reset().
	      context.reset(); 
	      configurator.doConfigure(logConfigFile);
	    } catch (JoranException je) {
	      // StatusPrinter will handle this
	    }
	    StatusPrinter.printInCaseOfErrorsOrWarnings(context);
	}
	
	public static void changeLogbackLogLevel(String loggerName, Level level) {
	    ch.qos.logback.classic.Logger logger = (ch.qos.logback.classic.Logger)LoggerFactory.getLogger(loggerName);
	    
	    if (logger != null) {
	    	logger.setLevel(level);
	    } else {
	    	// TODO: report some kinda error?
	    }
	}

}
