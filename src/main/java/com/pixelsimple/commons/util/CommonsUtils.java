/**
 * © PixelSimple 2011-2012.
 */
package com.pixelsimple.commons.util;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Akshay Sharma
 * Dec 16, 2011
 */
public class CommonsUtils {
	private static final Logger LOG = LoggerFactory.getLogger(CommonsUtils.class);

	private CommonsUtils() {}
	
	public static final String NEW_LINE_CHARACTER = System.getProperty("line.separator");
	
//	/**
//	 * Convert an input of type: 
//	 * 	key1DELIMvalue1
//	 *  key2DELIMvalue2
//	 *  ..
//	 *  
//	 *  into a map with keys as key1, key2 ... and values as value1, value2 ...
//	 * 
//	 * @param keyValueStrings
//	 * @return
//	 */
//	public static Map<String, String> convertMultiLineDelimitedStringsToMap(String keyValueStrings, String delim) {
//		Map<String, String> keyValues = new HashMap<String, String>();
//		String [] keyValueLine = keyValueStrings.split(CommonsUtils.NEW_LINE_CHARACTER);
//		
//		for (String keyValue : keyValueLine) {
//			int equalIndex = keyValue.indexOf(delim);
//			
//			if (equalIndex != -1) {
//				String key = keyValue.substring(0, equalIndex);
//				String value = keyValue.substring(equalIndex + 1);
//				keyValues.put(key, value);
//			}
//		}
//		LOG.debug("convertMultiLineDelimitedStringsToMap::keyValues::{} ", keyValues);
//		
//		return keyValues;
//	}
		

	
}
