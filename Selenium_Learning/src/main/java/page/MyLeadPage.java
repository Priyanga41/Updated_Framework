package page;

import seleniumBase.ProjectSpecificMethods;

public class MyLeadPage extends ProjectSpecificMethods{
	
	public CreateLead ClickCreateLead() {
		
		driver.findElementByLinkText("Create Lead").click();
		return new CreateLead();

	}

	public FindLeads FindLead() {
		driver.findElementByLinkText("Find Leads").click();
		return new FindLeads();
		
	}
	
	public MergeLead MergeLead() {
		driver.findElementByLinkText("Merge Leads").click();
		return new MergeLead();
	}
}
