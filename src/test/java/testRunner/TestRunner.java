package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions( 
		features= {".//FeatureFile/E2E.feature"},
		glue="stepDefinitionFile",
		plugin= {"pretty",
				"html:reports/myreportCucumber.html",
				"rerun:target/rerun.txt",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				},
		tags="@sanity",
		dryRun=false,
		monochrome = true,
		publish=true
		

		)

public class TestRunner {

}
