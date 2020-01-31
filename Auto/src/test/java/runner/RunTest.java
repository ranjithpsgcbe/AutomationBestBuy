package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.Test;




// Uncomment @RunWith if you are using Junit to run Test 
 //@RunWith(CucumberWithSerenity.class)

@CucumberOptions(features={"src//test//java//features//SimpleScenario.feature"}
					,glue={"stepdefinations","utility"}
					,plugin = {"pretty", "html:target/cucumber"}
					, tags ={"@web"}
		)
@Test
public class RunTest extends AbstractTestNGCucumberTests{

}
