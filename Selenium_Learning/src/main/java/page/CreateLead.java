package page;

import seleniumBase.ProjectSpecificMethods;

public class CreateLead extends ProjectSpecificMethods{

	public CreateLead enterCompanyName() {
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
		return this;
	}
	
	public CreateLead enterFirstName() {
		driver.findElementById("createLeadForm_firstName").sendKeys("Sample");
		return this;
	}
	
	public CreateLead enterLastName() {
		driver.findElementById("createLeadForm_lastName").sendKeys("Lead");
		return this;
	}
	
	public viewLeadPage submit() {
		driver.findElementByClassName("smallSubmit").click();
		return new viewLeadPage();
	}
}
