package seleniumBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificMethods {
public static ChromeDriver driver;

@BeforeMethod
public void BrowserLaunch() throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	Thread.sleep(3000);
	
}

@AfterMethod
public void CloseBrowser() {
	driver.close();
}
}
