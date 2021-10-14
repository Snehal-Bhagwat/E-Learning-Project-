package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/Feature",
		glue = {"StepDefination", "Hooks"},
		
		
		//tags = {"@i1", "@i2", "@i3", "@i4", "@i5", "@i6", "@i7", "@i8", "@i9"},
		//tags = {"@i1"},
		//tags = {"@i2"},
		//tags = {"@i3"},
		//tags = {"@i4"},
		//tags = {"@i5"},
		//tags = {"@i6"},
		//tags = {"@i7"},
		//tags = {"@i8"},											
		//tags = {"@i9"},
		//dryRun= true,
		//monochrome = true,
		
	
		
		plugin= {"pretty", "html:target/cucumber-pretty", "junit:target/report.xml", "json:target/cucumber.json"}
		)

public class testrunner {

}