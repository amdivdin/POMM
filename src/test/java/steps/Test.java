package steps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CreateLeadPage;
import pages.HomePage;
import pages.LogInPage;
import pages.MyHomePage;
import wdMethods.ProjectMethods;


public class Test extends ProjectMethods {
	@Given("Enter the username as DemoSalesManager")
	public Test typeUserName(String data) {
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, data);
		return this;
	}
	@And("Enter the password as crmsfa")
	public Test typePassword(String data) {
		WebElement elePassword = locateElement("id", "password");
		type(elePassword, data);
		return this;
	}
	@And("click on Login button")
	public HomePage clickLogin() {
		WebElement eleLogin = locateElement("class", "decorativeSubmit");
		click(eleLogin);
		return new HomePage();
	}
	
	@And("click on CRMSFA")
	public MyHomePage clickCRMSFA() {
		WebElement eleCRMSFA = locateElement("linktext", "CRM/SFA");
		click(eleCRMSFA);
		return new MyHomePage();
	}
	@And("click on create lead")
	public CreateLeadPage clickCreateLead() {
		WebElement eleCreateLead = locateElement("linktext", "Create Lead");
		click(eleCreateLead);
		return new CreateLeadPage();
	}
	@And("Enter Company name as (.*)")
public Test typeCompanyName(String data) {
	WebElement eleCompanyName = locateElement("id", "createLeadForm_companyName");
	type(eleCompanyName, data);
	return this;
}
@And("Enter First name as (.*)")
public Test typeFirstName	(String data) {
	WebElement eleFirstName = locateElement("id", "createLeadForm_firstName");
	type(eleFirstName, data);
	return this;
}
@And("Enter Last name as (.*)")
public Test typeLastName	(String data) {
	WebElement eleLastName = locateElement("id", "createLeadForm_lastName");
	type(eleLastName, data);
	return this;
}
@When("Click on create lead")
public Test clickCreateLead1() {
	WebElement eleCreateLead= locateElement("class", "smallSubmit");
	click(eleCreateLead);
	return this; 
}



@Then("verify Lead is created successfully")
public void verify() {
	System.out.println("verified successfully");
}
}
