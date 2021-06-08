package page;

import seleniumBase.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods {
	
	public MyLeadPage ClickLeads() {
		driver.findElementByLinkText("Leads").click();
		return new MyLeadPage();
	}

}
