package Runner;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import wdMethods.SeMethods;

public class Hook extends SeMethods{
	@Before
	public void beforecucumber(Scenario sc) {
		startResult();
		testCaseName = sc.getName();
		testCaseDescription =sc.getId();
		category = "Smoke";
		author= "Babu";
		startApp("chrome", "http://leaftaps.com/opentaps");
		
		
		}
	@After
	public void aftercucumber(Scenario sc) {
		closeAllBrowsers();
		stopResult();
	}

}
