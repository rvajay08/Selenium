package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/features/property.feature",
glue= {"stepDefinition"},
monochrome=true,
plugin= {"pretty","html:target/cucumber-reports/a1.html",
		"json:target/jsonreports/reports.json",
		"junit:target/junitreports/report.xml"})



public class tesrrunner1 {

}
