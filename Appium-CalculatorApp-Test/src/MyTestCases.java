import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class MyTestCases {
    
	
	 DesiredCapabilities Caps = new DesiredCapabilities();
	 AndroidDriver driver;
	
	@BeforeTest
	public void MySetUp() {
		
		Caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		Caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Malak");
		Caps.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
		
		File CalculatorApp = new File("src/MyCalApp/calculator.apk");
		Caps.setCapability(MobileCapabilityType.APP,CalculatorApp.getAbsolutePath());
		 
		
	}
	
	@Test(priority = 1)
	public void MyTest() throws MalformedURLException {
		   driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),Caps);
            List<WebElement> myButtons = driver.findElements(By.className("android.widget.ImageButton"));
            for(int i=0;i<myButtons.size();i++)
            {if(myButtons.get(i).getAttribute("resource-id").contains("digit"))
            	myButtons.get(i).click();}
          Assertion myassertion = new Assertion();
          String ExpectedValue="7894561230";
          String Actual = driver.findElement(By.id("com.google.android.calculator:id/formula")).getText();
          myassertion.assertEquals(Actual, ExpectedValue);
            
	}
	
	@Test()
	public void clickOnAllDigits() {}
	
	@AfterTest()
	public void CloseTest() {}
	
}
