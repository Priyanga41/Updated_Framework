package page;

import seleniumBase.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{
	
	public LoginPage enterUserName() 
	{
		driver.findElementByName("USERNAME").sendKeys("demosalesmanager");
		return this;
	}
	
	public LoginPage enterPassword() {
		driver.findElementById("password").sendKeys("crmsfa");
		return this;
	}
	
	public HomePage ClickLogin() {
		driver.findElementByClassName("decorativeSubmit").click();
		return new HomePage();
	}
}
