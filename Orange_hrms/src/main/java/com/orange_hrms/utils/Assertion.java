package com.orange_hrms.utils;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class Assertion {

	public static void AssertTrue(String expcepted) {
		try {
			Assert.assertTrue(expcepted, true);
			Log4jConfig.Logg("Successfully enter into Orange HRMS ");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void AssertEquil(String expected, String actual) {
		try{
			Assert.assertEquals(expected, actual);
		}catch(Exception e){
			System.out.println(e);
		}
	}

	public static void AssertFails(String expcepted) {
		try{
			Assert.assertFalse(expcepted, false);
			}catch(Exception e){
			System.out.println(e);
		}
	}
}
