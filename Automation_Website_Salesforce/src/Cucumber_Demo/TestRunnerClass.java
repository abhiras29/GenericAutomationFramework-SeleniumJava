package Cucumber_Demo;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/ModuleTestSuite/Sortings.feature"
		,tags={"Given","MergeSort"}
		,glue = {"Sortings_StepDefinition"}
		,format = {"pretty","html:/Users/abhishekr/Documents/Selenium_workspace"}
		)

public class TestRunnerClass {
	
	}
	
