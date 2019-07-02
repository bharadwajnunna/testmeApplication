package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
/*@CucumberOptions(features= "features", glue = {"stepDefinition"} )*/
@CucumberOptions(features= "src/test/resources/features",
					glue = "stepdefinition",
					plugin= {"pretty",
							"json:target/cucumber.json"})

					/*plugin= {"pretty",
								"html:target/cucumber-html-report",
								"json:target/cucumber-json-report/report.json",
		   						"junit:target/cucumber-xml-report/report.xml"})*/
public class testrunner {

}
