package appfeatureStep;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import driverfactoryClass.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class AppHooks 
{ 
	WebDriver driver;
	@Before
	public void initiateBrowser() throws IOException  
	{
		Properties prop=new Properties(); 
		String path =System.getProperty("user.dir")+"//src//test//resources//config.properties";
		FileInputStream fis=new FileInputStream(path);
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		DriverFactory df=new DriverFactory();
		driver = df.initBrowser(browserName);
		// maximize 
		driver.manage().window().maximize();
	}

	@After(order=2)
	public void tearDown(Scenario scenario)
	{

		String scenarioName = scenario.getName();
		String Name = scenarioName.replaceAll(" ", "");
		TakesScreenshot ts=(TakesScreenshot)driver;
		byte[] source = ts.getScreenshotAs(OutputType.BYTES);
		scenario.attach(source, "snap/png", Name);

	}
	@After(order=1)
	public void quiteBrowser() {
		driver.quit();

	}

}
