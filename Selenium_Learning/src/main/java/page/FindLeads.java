package page;

import seleniumBase.ProjectSpecificMethods;

public class FindLeads extends ProjectSpecificMethods {
	
	public viewLeadPage FRLead() throws InterruptedException {
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("a");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		return new viewLeadPage();
	}
	
	public viewLeadPage Dlead() throws InterruptedException {
		driver.findElementByXPath("(//span[@class='x-tab-strip-text '])[2]").click();
		driver.findElementByName("phoneNumber").sendKeys("97");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		return new viewLeadPage();		
	}
	
	public viewLeadPage dulplicateLead() throws InterruptedException {
		driver.findElementByXPath("(//span[@class='x-tab-strip-text '])[3]").click();
		driver.findElementByName("emailAddress").sendKeys("@gmail.com");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		return new viewLeadPage();	
	}
	
}
