package project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Age extends ProjectMethods {
public Age ageSlide() {
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Actions builder=new Actions(driver);
	WebElement loc = locateElement("xpath","//div[@class='rangeslider__handle']");
	for (int i = 0; i < 5; i++) {
		builder.dragAndDropBy(loc, 5, 0).perform();
	
	}
	return this;
}
public Age calendar() {
	WebElement loc1 = locateElement("linktext","Jun 1995");
	click(loc1);
	return this;
	
}
public Age day() {
	
	WebElement loc2 = locateElement("xpath","//div[contains(text(),'11')]");
	click(loc2);
	return this;
}
public income contin() {
	WebElement loc3 = locateElement("linktext","Continue");
	click(loc3);
	return new income();
}

}
