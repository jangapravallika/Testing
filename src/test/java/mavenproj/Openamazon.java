package mavenproj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Openamazon {

	
	WebDriver driver;
	@BeforeTest
	public void conn()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\Documents\\chromedriver.exe");
	 driver = new ChromeDriver();
		
	}
	@Test
	public void open()
	{
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getTitle());
	}
	
}
