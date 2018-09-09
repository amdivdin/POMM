package project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Homepage extends ProjectMethods {
public Homepage mouseover() {
	Actions builder=new Actions(driver);
	WebElement inves = locateElement("linktext","INVESTMENTS");
	builder.moveToElement(inves).perform();
	return this;
	
}
public MutalFunds mutualInvestment() {
	
	WebElement mutual = locateElement("linktext","Mutual Funds");
	click(mutual);
	return new MutalFunds();
	
}
}
