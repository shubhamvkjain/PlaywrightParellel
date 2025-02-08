package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/Features",     // Path to feature files
    glue = "Steps",         // Package where step definitions are located
    plugin = {
        "pretty",                                 // Prints feature files in a readable format
        "html:target/cucumber-reports/report.html",// HTML report
        "json:target/cucumber-reports/report.json",// JSON report
        "junit:target/cucumber-reports/report.xml" // JUnit report
    },
    monochrome = true,                           // More readable console output
    dryRun = false                             // Verifies if step definitions exist
                 // Run tests with these tags
)
public class TestRunner {
    // This class should be empty
    // Its purpose is to serve as an entry point for running tests
}