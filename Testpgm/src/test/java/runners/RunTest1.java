package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/features",
        tags = "@Regression or @Sanity or @Negative", 
        glue = {"stepDefinitions", "utilities" },
        plugin = {"pretty", "html:target/cucumber/jsonReports/cucumber.html"
        }
)

public class RunTest1 {

}
