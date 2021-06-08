package page;

import seleniumBase.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods{
	
	public MyHomePage ClickLink() {
		driver.findElementByLinkText("CRM/SFA").click();
		return new MyHomePage();
	}
	
	public LoginPage Logout() {
		driver.findElementByClassName("decorativeSubmit").click();
		return new LoginPage();
	}

}
