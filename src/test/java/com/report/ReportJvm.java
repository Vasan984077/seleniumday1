package com.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Reportable;

public class ReportJvm {
	public static void generateJvmReprt(String Jsonfile) {
		//mention the path of JVM report where to store(target path)
		 File file = new File("C:\\Users\\Dell\\eclipse-workspace\\Cucumber\\target");
		 //create the object for configuration class
		Configuration configuration = new Configuration(file, "CucumberProject");
		
		
		// k:v -> browser ,Os and version
		configuration.addClassifications("browser", "chrome");
		configuration.addClassifications("browser version","113");
		configuration.addClassifications("OS","win11");
		configuration.addClassifications("sprint","34");
	
		List<String>Jsonfiles =new ArrayList<>();
		Jsonfiles.add(Jsonfile);
	
	ReportBuilder reportBuilder = new ReportBuilder(Jsonfiles,configuration);
	Reportable result = reportBuilder.generateReports();

}}
