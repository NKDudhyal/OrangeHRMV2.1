package com.hrm.utilities;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ER {

	public static ExtentReports reports;
	public static ExtentReports generateER() {
		if(reports == null) {
			reports = new ExtentReports();
			File destination_path = new File(System.getProperty("user.dir")+"\\reports\\extentreport.html");
			ExtentSparkReporter SparkR = new ExtentSparkReporter(destination_path);
			
			SparkR.config().setTheme(Theme.DARK);
			SparkR.config().setDocumentTitle("Hello title");
			SparkR.config().setTimeStampFormat("dd/MM/YYYY hh/mm/ss");
			
			reports.attachReporter(SparkR);
		}
		
		return reports;
	}
}
