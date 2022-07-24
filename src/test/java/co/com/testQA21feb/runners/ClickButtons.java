package co.com.testQA21feb.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/clickbuttons.feature",
        glue = "co.com.testQA21feb.stepdefinitions.clickbuttons",
        snippets = SnippetType.CAMELCASE
        )

public class ClickButtons {
}
