package testCases;

import org.testng.annotations.Test;

import page.LoginPage;
import seleniumBase.ProjectSpecificMethods;

public class TC_005_DeleteLead extends ProjectSpecificMethods{
	@Test
	public void deleteLEed() throws InterruptedException {
		new LoginPage().enterUserName().enterPassword().ClickLogin().ClickLink()
		.ClickLeads().FindLead().Dlead().DeleteLead();
	}

}
