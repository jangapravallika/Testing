package mavenproj;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class Extentreport {
	
	ExtentReports extent;
	
	@BeforeTest
	public void config()
	{
		String path=System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setDocumentTitle("NewTestResults");
		reporter.config().setReportName("ExtentAutomationReporst");
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("testEngineer", "PRAVALLIKA");
	}
	
	
	
	@Test
	public void sample()
	{
		extent.createTest("sample");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\Documents\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.get("https://www.flipkart.com/");
	System.out.println(d.getTitle());
	extent.flush();
	
		
		
	}
	
	
	

}
