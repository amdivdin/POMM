package pages;

import org.openqa.selenium.WebElement;

import wdMethods.ProjectMethods;

public class MyHomePage extends ProjectMethods{

	
	public FindLeads clickLeads() {
		WebElement eleLeads = locateElement("linktext", "Leads");
		click(eleLeads);
		return new FindLeads();
	}
	
}









