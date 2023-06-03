package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

// mononchrome=true used to define/show console data in formated way


@CucumberOptions(features="src/test/resources/features", tags="@sanity or @prodnew", glue={"steps"}, monochrome=true, plugin= {"html:target/cucumber-reports/cucumber-html-report.html", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class RunGlue extends AbstractTestNGCucumberTests {
	
	
	

}
