
package utility;

import com.ElementWrapper;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.util.concurrent.TimeUnit;


public class Hook extends ElementWrapper {

	public static WebDriver driver;



	@Before("@web")
	public void setUp()
	{
		ElementWrapper ele =new ElementWrapper();

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		driver = new ChromeDriver( options );
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}


	public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

		TakesScreenshot scrShot =((TakesScreenshot)webdriver);
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile=new File(fileWithPath);
		FileUtils.copyFile(SrcFile, DestFile);

	}

	

	@After
	public void tearDown()
	{
		driver.quit();
	}


	public static WebDriver getDriver()
	{
		return driver;
	}
}
