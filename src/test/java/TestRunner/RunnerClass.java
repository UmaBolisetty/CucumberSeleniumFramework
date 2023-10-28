package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty","html:target/cucumber-reports", "json:target/Cucumber.json", "html:target/html_report.html",
		"junit:target/JunitReport/report.xml" }, features = "src/test/resources/Features", glue = {
				"StepDefinitions" }, monochrome = true, dryRun = false, tags = " @CustomerAddressChangeWithLast4DigitsOfSSNCheck")
public class RunnerClass {
	
}