package project;

import org.openqa.selenium.WebElement;

public class MutalFunds extends ProjectMethods {

	public Age clicksearch() throws InterruptedException  {
		Thread.sleep(3000);
		WebElement clickSearch = locateElement("linktext","Search for Mutual Funds");
		
		click(clickSearch);
		return new Age();
	}
}
