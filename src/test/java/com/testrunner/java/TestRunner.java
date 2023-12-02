package com.testrunner.java;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.report.ReportJvm;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
	@CucumberOptions(features = "src\\test\\resources\\FeatureFiles", glue = "com.stepdefinition",plugin = {"pretty","json:Reports/cucumber.json","junit:Reports/cucumber.xml","html:Reports/cucumber.html"})
	
	
	public class TestRunner {
		
		@AfterClass
		public static  void generateJvmReprt() {
			
			ReportJvm.generateJvmReprt("Reports/cucumber.json");
		}
	
	
}
