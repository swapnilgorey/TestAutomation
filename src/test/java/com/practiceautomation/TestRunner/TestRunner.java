package com.practiceautomation.TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@CucumberOptions(
        plugin={"pretty","html:target/cucumber-reports/cucumber.html",
                "json:target/cucumber-reports/cucumber.json"},
        features={"src/features"},
        glue={"com.practiceautomation.StepDef"},
        dryRun = false,
        strict = true

)

public class TestRunner extends AbstractTestNGCucumberTests {
    private TestNGCucumberRunner testNGCucumberRunner;

    @BeforeClass(alwaysRun = true)
    public void SetupClass() throws Exception{
        this.testNGCucumberRunner=new TestNGCucumberRunner(this.getClass());
    }
    @Test(dataProvider="features")
    public void feature (CucumberFeatureWrapper cucumberFeature){
        testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
    }
    @DataProvider
    public Object[][] features(){ return testNGCucumberRunner.provideFeatures();}

    @AfterClass(alwaysRun = true)
    public void tearDownClass() throws Exception{
        testNGCucumberRunner.finish();
    }
}

