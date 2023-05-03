import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class MyTestCases extends parameter {

	/*@Test(invocationCount = 2) 
	public void checkTheWebSiteLanguage()
	{
		
		
		String[] mywebsitelanguage = {"https://ae.almosafer.com/en" , "https://ae.almosafer.com/ar" };
		
		Random rand = new Random();
		
		//System.out.println(rand+"************"); hai r7 t3tene eshi mo mfhom lahek r7 ast5dem nextint
		//System.out.println(rand.nextInt(0,80000)%2);
		
		
		int RandomNumber = rand.nextInt(0,80000)%2;
		driver.get(mywebsitelanguage[RandomNumber]);
		
		String ActualTitle = driver.getTitle();
		//System.out.println(ActualTitle);
		//myassertion.assertEquals(ActualTitle,"فنادق، احجز فنادق رخيصة واحصل على أسعار منخفضة على المسافر");
		
		if(RandomNumber==1)
		{
			myassertion.assertEquals(ActualTitle,"فنادق، احجز فنادق رخيصة واحصل على أسعار منخفضة على المسافر.");
		}
		else
		{
			myassertion.assertEquals(ActualTitle,"Hotels, book cheap hotels & get discounted prices on Almosafer");
	
		}
		myassertion.assertAll();
	
	}
	*/
	
	
	
	
	/*@Test()
	public void Default_currency_is_correct_SAR()
	{
		String defaultCurrency = "SAR";
		WebElement currencyInWebSite = driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[1]/div[2]/div/div[1]/div/button"));
		//el 3omleh hea 3barah 3n web element la hek 5zntha be mota3'er mn no3 webelement
        
		String ActualCurreny = currencyInWebSite.getText();
		myassertion.assertEquals(ActualCurreny, defaultCurrency);
		myassertion.assertAll();
	}*/
	
	
	
	
	/*
	 @Test()
	 public void logo () {
		
		// driver.findElement(By.xpath("//*[@id=\"__next\"]/footer/div[3]/div[3]/div[1]/div[2]/div/div[1]/svg[2]")).click();
	
		 WebElement divContainsVsaLogo = driver.findElement(By.xpath("//*[@id=\"__next\"]/footer/div[3]/div[3]/div[1]/div[2]/div/div[1]"));
		 List<WebElement> mydiv= divContainsVsaLogo.findElements(By.tagName("svg"));
		 System.out.println(mydiv.size());
		String ActualVsaID =  mydiv.get(1).getAttribute("data-testid");
		String ExpectedVsaID = "Footer__VisaCardLogo";
		 myassertion.assertEquals(ActualVsaID, ExpectedVsaID);
	     myassertion.assertAll();
	 }
	*/
	
	/*
	@Test()
	 public void  TestTwo() {
		 
		WebElement Vsa = driver.findElement(By.cssSelector("[data-testid=\"Footer__VisaCardLogo\"]"));
		Vsa.isDisplayed();
		myassertion.assertEquals(Vsa.isDisplayed(), true);
		myassertion.assertAll();
		
	} */
	
		@Test()
		public void  hotel_tab_is_not_selected()
		{
			
			WebElement hotleTab = driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tab-hotels\"]"));
			//lw st5damt is_selected hon r7 trj3li false 7ta lw hea selected l2no el hotle tab mn no3 div 
			//System.out.println(hotleTab.isSelected());
			
			//hl2 r7 a3ml inspect w ashof attribute b2kdle lw hotle tab selected or no r7 ala8i eshi esmo aria selected ba5o el xpath ll eshi eli b7tweha
			String Expectedvalue = "false";
			String Actualvalue =  hotleTab.getAttribute("aria-selected");
			myassertion.assertEquals(Actualvalue, Expectedvalue);
			myassertion.assertAll();
		}
	
/*	
	@Test(invocationCount = 5)
	public void location_field()
	{
		
		String[] mywebsitelanguage = {"https://ae.almosafer.com/en" , "https://ae.almosafer.com/ar" };
		String[] EnglishCities = {"Dubai","Jeddah","Riyadh"};
		String[] ArabicCities = {"دبي","جدة"};
		Random rand = new Random();
		int RandomNumberWebSite = rand.nextInt(2); //nextInt bound -- bt3ni aw8f 3nd el bound el m76o6
		int RandomArabic = rand.nextInt(2);
		int RandomEnglish = rand.nextInt(3);
		
		driver.get(mywebsitelanguage[RandomNumberWebSite]);
		
		if(RandomNumberWebSite==0)
		{
			driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tabpane-flights\"]/div/div[2]/div[1]/div/div[2]/div[1]/div/div/div/input")).sendKeys(EnglishCities[RandomEnglish]);
			driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tabpane-flights\"]/div/div[2]/div[1]/div/div[2]/div[3]/div[1]/div/div/input")).sendKeys("Amman, Jordan");
			driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tabpane-flights\"]/div/div[2]/div[2]/div/div[2]/div/button")).click();
		}
		else {
			driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tabpane-flights\"]/div/div[2]/div[1]/div/div[2]/div[1]/div/div/div/input")).sendKeys(ArabicCities[RandomArabic]);
			driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tabpane-flights\"]/div/div[2]/div[1]/div/div[2]/div[3]/div[1]/div/div/input")).sendKeys("Amman, Jordan");
			driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tabpane-flights\"]/div/div[2]/div[2]/div/div[2]/div/button")).click();
		}
	}
	*/
	
	
	//select from hotle
	
	@Test(invocationCount = 3)
	public void Randomly_select_number_of_visitor() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3)); 
		Random myRandom = new Random();
		int myRadoooom = myRandom.nextInt(2);
		driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tab-hotels\"]")).click(); //hotle tab
	
		WebElement roomSelection = driver.findElement(By.xpath("(//select[@class='tln3e3-1 eFsRGb'])[1]"));
		
		Select mySelector = new Select(roomSelection);
	    mySelector.selectByIndex(myRadoooom);
	    System.out.println(roomSelection.getText());
		
	}
		
		
		
		
		
	
	
		@AfterTest
		public void closeTheBrowser()
		{
			driver.close();
		}
}
