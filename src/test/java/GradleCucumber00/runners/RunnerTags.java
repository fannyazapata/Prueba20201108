package GradleCucumber00.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/demo.feature",
                  tags = "@stories",
                  glue = "GradleCucumber00.stepdefinitions",
                  snippets = SnippetType.CAMELCASE)


public class RunnerTags {

}
