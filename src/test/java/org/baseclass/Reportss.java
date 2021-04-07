package org.baseclass;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reportss {
	public static  void generatJVMReport(String json) {
		
		
		File file=new File("F:\\eclipse-workspace\\AssessmentLennox\\Report");
		Configuration conf=new Configuration(file, "LennoxAssesment");
		conf.addClassifications("interview", "6/4/2021");
		conf.addClassifications("platfrom", "Window");
		conf.addClassifications("Browser", "chrome");
		List<String>li=new ArrayList<String>();
		li.add(json);
		ReportBuilder builder=new ReportBuilder(li, conf);
		builder.generateReports();
			}

}
