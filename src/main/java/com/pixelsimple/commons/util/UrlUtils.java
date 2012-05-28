/**
 * © PixelSimple 2011-2012.
 */
package com.pixelsimple.commons.util;

import java.util.regex.Matcher;

/**
 *
 * @author Akshay Sharma
 * May 27, 2012
 */
public class UrlUtils {
	
	private UrlUtils() {}
	
	public static String encodeSpaces(String url) {
		
		return url.replaceAll(" ", Matcher.quoteReplacement("%20"));
	}

}
