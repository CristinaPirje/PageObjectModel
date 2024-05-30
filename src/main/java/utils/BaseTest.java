package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	
	public WebDriver driver;
	//@Parameters({"url"})
	@BeforeClass
	public void setup(String appUrl) {
		driver= new EdgeDriver();
		driver.manage().window().maximize();
	driver.get("https://keybooks.ro/");
		
		//driver.get(appUrl);
	}
	@AfterClass
	
	public void tearDown() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();//inchide toate taburile
		//driver.close();//inchide tabul curent
		
	}

}
