package runnerclass;

import org.baseclass.Reportss;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="F:\\eclipse-workspace\\AssessmentLennox\\src\\test\\resources\\Leennoxuser1.feature", glue="stepDefinitions",
dryRun=false,monochrome=true,plugin= {"html:report","json:F:\\eclipse-workspace\\AssessmentLennox\\Report\\123.json"} )
public class RunnerClass {
	@AfterClass
	public static  void gntreprot() {
		Reportss.generatJVMReport("F:\\eclipse-workspace\\AssessmentLennox\\Report\\123.json");

	}
}
