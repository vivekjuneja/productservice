package org.juneja.productsample.utils;

import hello.RandomString;

/**
 * Random generation utility
 * 
 * @author admin
 *
 */
public class RandomUtils {
	
	
	private static final int _10 = 10;
	private static RandomString randomStr = new RandomString(_10);

	public static String generateRandomStr() {
		return randomStr.nextString();
	}
	
	
}
