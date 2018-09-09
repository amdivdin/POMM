package project;

import org.openqa.selenium.WebElement;

public class bank extends ProjectMethods{
public details account() {
	WebElement loc5 = locateElement("xpath","//span[contains(text(),'ICICI')]");
	click(loc5);
	return new details();
}
}
