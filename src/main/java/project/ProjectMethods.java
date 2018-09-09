package project;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import wdMethods.SeMethods;

public class ProjectMethods extends SeMethods {
	
	@BeforeMethod
	public void login() {
		startApp("chrome", "https://www.bankbazaar.com/");
	
}
}
