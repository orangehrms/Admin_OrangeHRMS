package com.orange_hrms.utils;

import org.testng.Assert;

public class Assertion {

	public static void assertTrue(boolean expected) {
		try {
			Assert.assertTrue(expected, "Expected true but get false");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void assertFalse(boolean expcepted) {
		try {
			Assert.assertFalse(expcepted, "Expected false but get true");
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void assertEquil(Object expected, Object actual) {
		try {
			Assert.assertEquals(actual, expected, "expecting is not equals but get equal");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void assertNotEquil(Object expected, String actual) {
		try {
			Assert.assertNotEquals(expected, actual, "expecting is equals but get not equal");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void assertNull(Object expected) {
		try {
			Assert.assertNull(expected, "expecting object is null");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void assertNotNull(Object expected) {
		try {
			Assert.assertNotNull(expected, "expecting object is not null");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void assertEquil(Object sendKeys, String actual) {
		// TODO Auto-generated method stub
		
	}

}
