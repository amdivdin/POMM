package project;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

public class bazzzar extends ProjectMethods {
	public bazzzar getdata() {
	
		
		 List<WebElement> li = driver.findElementsByXPath("//div[@class='offer-section-column col-same-height col-middle card']//li/span");
		for(WebElement ele:li) {
			System.out.println(ele.getText());
		}
		return this;
	}

	public bazzzar get() {
		List<WebElement> li1 = driver.findElementsByXPath("//div[@class='offer-section-column col-same-height col-middle investment-amount']/span[@class='js-title']");
		for(WebElement ele1:li1) {
			System.out.println(ele1.getText());
		}
		return this;
	}
	
	
	
}
