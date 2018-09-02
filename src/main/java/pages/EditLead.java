package pages;

import org.openqa.selenium.WebElement;

import wdMethods.ProjectMethods;

public class EditLead extends ProjectMethods {
	
	public EditLead editlead(String data) {
		WebElement editlead = locateElement ("xpath" , "//td//input[@name='companyName']");
		type(editlead , data);
		return this;
	}
	public ViewLeads update() {
		WebElement update = locateElement ("name" , "submitButton");
		click(update);
		return new ViewLeads();

}
}