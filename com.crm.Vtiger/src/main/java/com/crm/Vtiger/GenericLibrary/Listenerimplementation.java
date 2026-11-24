package com.crm.Vtiger.GenericLibrary;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.google.common.io.Files;

public class Listenerimplementation extends Baseclass  implements ITestListener{
ExtentReports report;
ExtentTest test;
	@Override
	public void onTestStart(ITestResult result) {
		String testname = result.getName();
		test=report.createTest(testname);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String methodname = result.getName();
		test.log(Status.PASS,methodname+"test script passed successfully");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		String name=result.getName();

		TakesScreenshot t=(TakesScreenshot)driver;
		File src=t.getScreenshotAs(OutputType.FILE);
		JavaUtility j=new JavaUtility();
		String dateandTimestamp = j.getDateAndTime("dd-MM-yyyy hh-mm-ss");
		File dest=new File("./Screenshots/"+name+dateandTimestamp+".png");
		try {
			Files.copy(src, dest);
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		ITestListener.super.onTestFailure(result);
		test.log(Status.FAIL,test+"test script failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP,test+"test script passed successfully");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
		ExtentSparkReporter reporter=new ExtentSparkReporter("./ExtentReports/report.html");
		reporter.config().setDocumentTitle("Vtiger Organisation Report");
		reporter.config().setReportName("Excecution Details");
		reporter.config().setTheme(Theme.DARK);
		report = new ExtentReports();
		report.attachReporter(reporter);
		report.setSystemInfo("url","http://localhost:8888");
		report.setSystemInfo("OS", "Windows");
		report.setSystemInfo("Browser", "Chrome");
		report.setSystemInfo("TestEngineer", "Raj");
	}

	@Override
	public void onFinish(ITestContext context) {
		
		report.flush();
	}

}
