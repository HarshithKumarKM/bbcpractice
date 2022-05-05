package com.mindtree.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="./src/test/resources/BBCFeatures",
                 glue= {"com.mindtree.stepDefinitions"},
                 monochrome = true,
                 plugin={"pretty","html:CucumberReports/HtmlReports", 
                 "junit:CucumberReports/JUnitReports/report.xml",
                 "json:CucumberReports/cucumber.json",
                 })
public class RunTest {

}
