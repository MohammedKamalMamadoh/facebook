package testRunner;

import cucumber.api.CucumberOptions;
import tests.TestBase;

@CucumberOptions(features = {"src/test/java/features"}
,glue = {"stepDefinition"}
,plugin = {"pretty","html:target/cucumber_html_report"})
public class Runner extends TestBase {

	
}
