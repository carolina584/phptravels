package net.phptravels.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		tags= {"@tag3"},
		features="src/test/resources/features",
        glue= {"net.phptravels.stepdefinitions"},
        snippets= SnippetType.CAMELCASE)
public class net_Phptravels_runner {

}
