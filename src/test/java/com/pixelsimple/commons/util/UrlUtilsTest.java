/**
 * © PixelSimple 2011-2012.
 */
package com.pixelsimple.commons.util;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Akshay Sharma
 * May 27, 2012
 */
public class UrlUtilsTest {

	/**
	 * Test method for {@link com.pixelsimple.commons.util.UrlUtils#encodeSpaces(java.lang.String)}.
	 */
	@Test
	public void encodeSpaces() {
		Assert.assertEquals(UrlUtils.encodeSpaces("http://blah.com/path?param=a path with spaces"),
				"http://blah.com/path?param=a%20path%20with%20spaces");

		Assert.assertEquals(UrlUtils.encodeSpaces("http://blah.com/path?param=apathwithoutspaces"),
				"http://blah.com/path?param=apathwithoutspaces");

		Assert.assertEquals(UrlUtils.encodeSpaces("http://blah.com/path?param=a path with spaces&param2=more space"),
				"http://blah.com/path?param=a%20path%20with%20spaces&param2=more%20space");

	}

}
