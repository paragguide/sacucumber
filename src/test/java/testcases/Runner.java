package testcases;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src//test//resources//feature//document.feature",
		tags = "(@amazon and @uid) or @google",
		glue = {"testcases"},
		dryRun = false,
		monochrome = true,
		plugin = {"pretty",
				 "junit:src/test/java/report/junit/report.xml",
				 "json:src/test/java/report/json/report.json",
				 "html:src/test/java/report/html/report.html"
				 },
		publish = true
		)
public class Runner 
{
    // empty
}
