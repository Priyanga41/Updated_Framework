package testCases;

import org.testng.annotations.Test;

import page.LoginPage;
import seleniumBase.ProjectSpecificMethods;

public class TC_002_EditLead extends ProjectSpecificMethods{
	
	@Test
	public void EditLead() throws InterruptedException {
		new LoginPage().enterUserName().enterPassword().ClickLogin().ClickLink()
		.ClickLeads().FindLead().FRLead().EditLead().UpdateCname();
	}

}
