package TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentsReportsBasicDemo {
	
	public static void main(String args[]) {
		
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extenthtml.html");
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

        ExtentTest test1 = extent.createTest("google search test", "test to google search functionality");
        ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		test1.log(Status.INFO, "starting testcase");
		
		driver.manage().window().maximize();
		String url="https://www.google.com";
		driver.get(url);
		test1.pass("navigated to google page");
		
		
		driver.findElement(By.name("q")).sendKeys("Automation");
		test1.pass("enter text in searchbox");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

		test1.pass("press keyboard enter key");
		
		driver.close();
		
		test1.pass("close the browser");
		test1.info("test completed");
		
		extent.flush();
		driver.quit();

	}

}
