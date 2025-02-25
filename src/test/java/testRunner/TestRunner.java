package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
    features = ".//Features//Login.feature",   // Path to your feature files
    glue = "stepDefinitions",// Path to your step definitions 
    dryRun=false,
    monochrome=true,//avoid unnessary data in console
    plugin = {"pretty", "html:test-output"}  // Optional plugins for reporting
)


public class TestRunner {

}
