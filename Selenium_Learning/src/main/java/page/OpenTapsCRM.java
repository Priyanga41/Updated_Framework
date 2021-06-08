package page;

import seleniumBase.ProjectSpecificMethods;

public class OpenTapsCRM extends ProjectSpecificMethods{
	
	public viewLeadPage UpdateCname( ) {
		driver.findElementById("updateLeadForm_companyName").sendKeys("TCS");
		driver.findElementByName("submitButton").click();
		return new viewLeadPage();
	}
	
	public viewLeadPage DupliLead() {
		driver.findElementByClassName("smallSubmit").click();
		return new viewLeadPage();
	}
}
