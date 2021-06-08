package page;

import seleniumBase.ProjectSpecificMethods;

public class viewLeadPage extends ProjectSpecificMethods {
	
	public viewLeadPage VerifyName() {
		String Fname = driver.findElementById("viewLead_firstName_sp").getText();
		System.out.println(Fname);
		return this;
	}
	
	public OpenTapsCRM EditLead() {
		driver.findElementByLinkText("Edit").click();
		return new OpenTapsCRM();		
	}
	
	public viewLeadPage DeleteLead() {
		driver.findElementByClassName("subMenuButtonDangerous").click();
		return this;
	}
	
	public OpenTapsCRM DuplicateLead() {
		driver.findElementByLinkText("Duplicate Lead").click();
		return new OpenTapsCRM();
	}

}
