package com.orange_hrms.utils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import junit.framework.Assert;

public class Listener implements ITestListener{
	
	@Override
	public void onTestStart(ITestResult result) {
	Log4jConfig.Logg("onTest Start--"+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Log4jConfig.Logg(result.getName()+"---Test Success");
		Log4jConfig.Logg(result.getStatus()+"---getStatus Test ");
		Reporter.log("onTestSuccess execute "+result.getTestName(),true);
		Assert.assertEquals("success", "success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Log4jConfig.Logg(result.getName()+"---Test Failure");
		Log4jConfig.Logg(result.getTestName()+"---Test Failure");
		Log4jConfig.Logg(result.getTestClass()+"---Test Failure");
		Log4jConfig.Logg(result.getAttributeNames()+"---Atribute Test Failure");
		Log4jConfig.Logg(result.getStatus()+"---getStatus Test Failure");
		Reporter.log("onTestFailure execute"+result.getTestName(),true);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println(context.getHost());
	}
}
