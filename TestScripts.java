package TestScripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Demo.Loginpage;
import utils.ExcelReader;
import utils.ExcelReaderNew;
public class TestScripts {

	WebDriver driver;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	Loginpage obj ;
	
	@BeforeSuite
	public void setup()
	{

		  htmlReporter = new ExtentHtmlReporter("extenthtml.html");
	     extent = new ExtentReports();
	     extent.attachReporter(htmlReporter);
	}
	
@BeforeClass
public void setuptest() 
{
		
	
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String url="https://www.saucedemo.com/v1/";
		driver.get(url);
		
	}


	@Test(priority=1,dataProvider = "testData")
	
	public void login(String username, String password) throws InterruptedException {
		
        ExtentTest test1 = extent.createTest("swablab", "test to swablab functionality");

		
		Loginpage obj = new Loginpage(driver);

		
		obj.verify();
	    obj.enterUsername(username);
		test1.pass("enter username");

	    obj.enterPassword(password);
		test1.pass("enter password");

        obj.clickLogin();
		test1.pass("click login button");

        obj.ClickMenubtn();	
        obj.verifyMenuItems();
        obj.crossbtn();
	    obj.verifyCartbutton();
	    obj.Click_SauceLabsBackpack();
	    obj.bagname();
        obj.GetDesc_Backpack();
     	obj.GetPrice_backbag();

	    obj.Click_addCart();	
	    obj.Click_SauceLab_bikeLight();
        obj.bikelightname();
        obj.GetDesc_Bikelight();
	    obj.GetPrice_bikelight();
        obj.Click_addCart1();
        obj.VerifyCartItem();
        obj.verifyItemsIncart();
 	    obj.checkPriceAndRemove();       
        obj.checkout();
       
	}
        
        @Test(priority=2,dataProvider = "testData1")
       public void Checkoutitem(String firstname,String lastname,String postal) {
        	
    		Loginpage obj = new Loginpage(driver);
  	
        	obj.InfoVerification();
            obj.FirstName(firstname);
            obj.Last_name(lastname);
            obj.Postal_code(postal);
            obj.Clickcontinue();
            obj.VerifyCheckoutDetails();
            obj.clickFinish();
            obj.MsgVerification();
            obj.ClickCross();
            obj.logout();
        }
      	
	
	 @DataProvider(name = "testData")
	    public Object[][] testData() throws IOException {
	        // Specify the Excel file path and sheet name
	        String filePath = "C:\\Users\\SilpaNair\\eclipse-workspace\\SwagLabsDemo\\Excel\\data.xlsx";
	        String sheetName = "Sheet1";

	        return ExcelReader.readTestData(filePath, sheetName);
	    }
	 
	 
	 @DataProvider(name = "testData1")
	    public Object[][] testData1() throws IOException {
	        // Specify the Excel file path and sheet name
	        String filePath = "C:\\Users\\SilpaNair\\eclipse-workspace\\SwagLabsDemo\\Excel\\data.xlsx";
	        String sheetName = "Sheet2";

	        return ExcelReaderNew.readTestData1(filePath, sheetName);
	    }
	 
	 
		
@AfterClass
public void end() 
{
	driver.close();
	driver.quit();
}

@AfterSuite
public void endup()

{
	extent.flush();
	
}

}
