package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import project.Homepage;
import project.ProjectMethods;

public class projectTestcase extends ProjectMethods {
	@BeforeTest
	public void setData() {
		testCaseName = "TC001_CreateLead";
		testCaseDescription ="Create a lead";
		category = "Smoke";
		author= "Babu";
		
	}
	@Test
	public void test() throws InterruptedException {
		new Homepage()
		.mouseover()
		.mutualInvestment()
		.clicksearch()
		.ageSlide()
		.calendar()
		.day()
        .contin()
        
        .salary()
        .con()
        
       .account()
        .detail()
        .viewfund()
        .getdata()
        .get();
        
	}
	}
	
	


