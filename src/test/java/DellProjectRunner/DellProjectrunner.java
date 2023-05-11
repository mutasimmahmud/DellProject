package DellProjectRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import DellProjectUtility.DellProjectBase;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/DellFolder"},
plugin = {"json:target/cucumber.json"},
glue = "DellProjectStepDefinition")//tags = {"@Sanity"})
public class DellProjectrunner extends AbstractTestNGCucumberTests {
	
@BeforeTest
public void DellProjectOpenURL() {
	DellProjectBase test= new DellProjectBase();
	test.DellProjectBrowser();
	
}
@AfterTest
public void DellProjectCloseURL() {
	DellProjectBase test= new DellProjectBase();
	test.driver.quit();
}
}
