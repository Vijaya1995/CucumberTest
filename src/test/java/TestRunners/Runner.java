package TestRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

public class Runner {

    @CucumberOptions(features = "Features",
            glue = {"StepDefination"},
            plugin = {"pretty", "html:target/cucumber-reports", "json:target/cucumber.json"},
            monochrome = true,
            publish = true)
    public class TestRunner {

    }

}

