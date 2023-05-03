package appium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;


public class MyClass {
     
	  DesiredCapabilities caps = new DesiredCapabilities();

	
	@BeforeTest
	public void myBeforeTestAndSetup() throws MalformedURLException{
		
	//	File app = new File("src/appium/calculator.apk");
		
		
		  DesiredCapabilities caps = new DesiredCapabilities();
//		   caps.setCapability("plateformName", "Android"); //old Style ,ca
		   //or
		   caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");  
		   
//           caps.setCapability("devicename", "Malak");		
		   //or
		   caps.setCapability(MobileCapabilityType.DEVICE_NAME,"Malak");
		   
           caps.setCapability("chromedriverExecutable", "C:\\Users\\20140175036\\Desktop\\chromeWebDriver\\chromedriver.exe");		   
		  caps.setCapability(MobileCapabilityType.BROWSER_NAME,"chrome");
		//   caps.setCapability(MobileCapabilityType.APP,app.getAbsolutePath());
		  AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);
			driver.get("https://www.google.com");

	}

	
	@AfterTest
	public void AfterTestAndFinish() {}
	
}
