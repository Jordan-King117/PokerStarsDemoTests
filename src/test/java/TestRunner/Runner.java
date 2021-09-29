package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/Features/OddsFormat.feature",
        glue     = "StepDefs",
        dryRun   = false,
        plugin   = {"pretty", "html:test-output"}
        )
public class Runner {


}
