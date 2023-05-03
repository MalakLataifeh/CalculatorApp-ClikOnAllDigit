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
	
	//lecture13
	////////////////////////////////////////
	
	
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
		//hai lma a3ml click 3l logo ka svg ma r7 yt3rf 3leha 
		// driver.findElement(By.xpath("//*[@id=\"__next\"]/footer/div[3]/div[3]/div[1]/div[2]/div/div[1]/svg[2]")).click();
		 
		//la hek r7 ast5dm al div eli be7tawi had al logo
		 
		 WebElement divContainsVsaLogo = driver.findElement(By.xpath("//*[@id=\"__next\"]/footer/div[3]/div[3]/div[1]/div[2]/div/div[1]"));
		 
		 //hl2 r7 a5le ydower joa had el div 3la ai eshi mn no3 svg 
		 List<WebElement> mydiv= divContainsVsaLogo.findElements(By.tagName("svg"));
		 System.out.println(mydiv.size());
		 
		 //hon 7katlo yjebli l value tab3t el attribute datatestid
		String ActualVsaID =  mydiv.get(1).getAttribute("data-testid");
		
		String ExpectedVsaID = "Footer__VisaCardLogo";
		 myassertion.assertEquals(ActualVsaID, ExpectedVsaID);
	     myassertion.assertAll();
	 }
	*/
	
	/*
	@Test()
	 public void  sobhiTest() {
		 
		WebElement Vsa = driver.findElement(By.cssSelector("[data-testid=\"Footer__VisaCardLogo\"]"));
		Vsa.isDisplayed();
		myassertion.assertEquals(Vsa.isDisplayed(), true);
		myassertion.assertAll();
		
	} */
	
	
	//Ahmadtest
	
	
	
	
	///////////////////////////////////////////
	//Array
	
	/*
	@Test()
	public void myTest()
	{
	//static array
	int myarrayOne[] = new int [10];
	for(int i=0; i< myarrayOne.length;i++)
	{
		myarrayOne[i]=3;
		
	}
	*/
	
	
	
	/*
	@Test()
	public void myTest()
	{
	//dynamic array//hon bi hai el array ma blzmni bi size mo3an
		
		
	//int myarraytwo[]= {};
	
	//hai hon  lo tab3tha jowa el for r7 y3tene enha out of index l2no el lenght zero fa ma b9er t7ki index 90 direkt la hek r7 ast5dm el for 
	//myarraytwo[90]=33;
	/*for (int i= 0 ;i<myarraytwo.length;i++)
	{
	System.out.println(myarraytwo.length);
		
	}}*/
	
	/*
	@Test()
	public void myTest() {
	//hai hak el dynamic lazem a7ot el 8yam ben el {}	
int myarraytwo[]= {0,1,2,3,9,11,33,33,44,22,11,39};

	}*/
	
	
	
	/*
	
	//list
	@Test()
	public void mytestThree()
	{
	//List<Integer> mylistThree = new ArrayList<Integer>();
	//List<WebElement> mylistFour = driver.findElements(By.tagName("a"));   //a is link 
	//List<WebElement> mylistFour = driver.findElements(By.tagName("img"));
    //System.out.println(mylistFour.size());
		int myarraytwo[]= {0,1,2,3,9,11,33,33,44,22,11,39};
		List<Integer> mylistFive = new ArrayList<Integer>() ; 
	
		for(int i=0;i<myarraytwo.length;i++)
		{
		mylistFive.add(myarraytwo[i]);
		//hai r7 kol marah ytb3li el size 1,2,3,4,..,12
		System.out.println(mylistFive.size());
			
			
		}
		
	}
		*/
	
	
	
	
	
	
	
	
	/*
		
		@Test()
		public void mytestFour() {
//		List<Integer> mylistThree = new ArrayList<Integer>();
//		mylistThree.add(100);
//		System.out.println(mylistThree.get(0));
//			
			
			//this will get all pic in website and print it
			
			List<WebElement> mylistFour = driver.findElements(By.tagName("img"));
			for(int i=0;i<mylistFour.size();i++) {
				
				String pic=  mylistFour.get(i).getAttribute("src");
				System.out.println(pic);
			}
			
		}
		*/
		
		
		
		/*
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
		}*/
	
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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3)); //hai 9'ftha 3shan lma enta8l mn tab el flight la tab el hotel b3den edwor 3l select bdonha r7 y9'rob error l2no ma l78
		Random myRandom = new Random();
		int myRadoooom = myRandom.nextInt(2);
		driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tab-hotels\"]")).click(); //hotle tab
	
		WebElement roomSelection = driver.findElement(By.xpath("(//select[@class='tln3e3-1 eFsRGb'])[1]"));
		
		Select mySelector = new Select(roomSelection);
	    mySelector.selectByIndex(myRadoooom);
	    System.out.println(roomSelection.getText());
		
	}
		
		
		
		
		
	
	
//		@AfterTest
//		public void closeTheBrowser()
//		{
//			driver.close();
//		}
}