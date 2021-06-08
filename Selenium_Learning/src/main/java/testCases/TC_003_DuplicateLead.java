package testCases;

import org.testng.annotations.Test;

import page.LoginPage;
import seleniumBase.ProjectSpecificMethods;

public class TC_003_DuplicateLead extends ProjectSpecificMethods{
	
	@Test
	public void DupliLead() throws InterruptedException {
		new LoginPage().enterUserName().enterPassword().ClickLogin().ClickLink().ClickLeads()
		.FindLead().dulplicateLead().DuplicateLead().DupliLead();
	}

}
