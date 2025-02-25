package testRunner2;

import org.junit.runner.RunWith;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = ".//Features//OrangeHRMLogin.feature",   // Path to your feature files
    glue = "stepDefinitions",// Path to your step definitions 
    dryRun=false,
    monochrome=true,//avoid unnessary data in console
    plugin = {"pretty", "html:target/test-output.html"}  // Optional plugins for reporting
)
public class HRMTestRun extends AbstractTestNGCucumberTests {

}
