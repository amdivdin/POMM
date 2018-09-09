package project;

import org.openqa.selenium.WebElement;

public class details extends ProjectMethods{
	public details detail()
	{try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		WebElement name = locateElement("xpath","//input[@name='firstName']");
		type(name,"Divya");
		return this;
		
	}
	public bazzzar viewfund() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement fund = locateElement("linktext","View Mutual Funds");
		click(fund);
		return new bazzzar();
		
	}
	
}