package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = "/Users/lutfunrita/IdeaProjects/CalculatorCucumber/src/test/java/featurefile/Calculator.feature",
        glue="step"
        //dryRun = true
)

public class CalculateTestRunner extends AbstractTestNGCucumberTests {
}
