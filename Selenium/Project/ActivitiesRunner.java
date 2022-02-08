package crmTest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "Features",
        glue = {"stepDefinitions"},
        plugin = { "pretty", "html:target/cucumber-reports/reports" },
        tags = "@CRM"
)

public class ActivitiesRunner {
    //empty
}

