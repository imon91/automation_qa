package testRunner.webRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import util.ExcelReader;

import java.io.IOException;

@CucumberOptions(tags ="@smoke", features = {
        "src/test/resources/features/webFeatures/formSubmission.feature"},
        glue = {"stepDefinition"},   monochrome = true,
        dryRun = false,
        plugin = {
                "pretty","html:build/reports/webReport/formFillUp/formFillUp.html"
        })
@Test
public class CucumberRunnerFile extends AbstractTestNGCucumberTests {


}
