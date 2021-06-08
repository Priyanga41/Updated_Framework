package testCases;

import org.testng.annotations.Test;

import page.LoginPage;
import seleniumBase.ProjectSpecificMethods;

public class TC_001_CreateLead extends ProjectSpecificMethods {
	
	@Test
	public void CreateLeadTC() {
		new LoginPage()
		.enterUserName().enterPassword().ClickLogin().ClickLink().ClickLeads()
		.ClickCreateLead().enterCompanyName().enterFirstName().enterLastName()
		.submit().VerifyName();
		
	}

}
