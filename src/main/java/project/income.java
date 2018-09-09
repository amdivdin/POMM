package project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class income  extends ProjectMethods {
public income salary() {
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	WebElement sal = locateElement("xpath","//div[@class='rangeslider__handle-label']");
	
	Actions builder=new Actions(driver);
	for (int i = 0; i < 8; i++) {
		builder.dragAndDropBy(sal, 5, 0).perform();
		
	
	}
	return this;
}
	public bank con() {
		WebElement loc4 = locateElement("linktext","Continue");
		click(loc4);
		return new bank();
		
	}
	
}
