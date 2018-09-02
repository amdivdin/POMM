package pages;

import org.openqa.selenium.WebElement;

import wdMethods.ProjectMethods;

public class ViewLeads extends ProjectMethods {
	
	public EditLead clickedit() {
	WebElement clickedit = locateElement ("linktext" , "Edit");
	click(clickedit);
	return new EditLead();
	

}
}