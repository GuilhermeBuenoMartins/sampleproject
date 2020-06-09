package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        glue = "step",
        features = "src/test/resources",
        plugin = {"pretty", "html:target/cucumber"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class RunTest { }
