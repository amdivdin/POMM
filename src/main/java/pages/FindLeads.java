package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindLeads extends ProjectMethods{

	public FindLeads() {
		PageFactory.initElements(driver, this);
	}
	public  FindLeads ClickFindLeads() {
		WebElement ClickFind = locateElement ("linktext" , "Find Leads");
click(ClickFind);
return this;

	}
	@CacheLookup
	@FindBy(xpath="(//input[@name='firstName'])[3]")
	WebElement Fname;
public FindLeads TypeFname(String data) {
	//WebElement Fname = locateElement ("xpath" ,"(//input[@name='firstName'])[3]");
	
	type(Fname ,data);
	return this;
	
}
@CacheLookup
@FindBy(xpath="//button[contains(text(),'Find Leads')]")
WebElement Fdlead;
	public FindLeads Fdlead() {
		//WebElement Fdlead = locateElement ("xpath" , "//button[contains(text(),'Find Leads')]");
		click(Fdlead);
		return this;
	}
	@FindBy(linkText="Divya")
   
	WebElement lead;
	public ViewLeads lead() {
		//WebElement lead = locateElement ("linktext" , "divya");
		click(lead);
		return new ViewLeads();
		
	}
	
}