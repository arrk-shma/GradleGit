package myPackage;

import java.util.logging.Level;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;



public class Example1Test {

	@Test
	public void chromeMessaageDisabling() {
		java.util.logging.Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
		System.setProperty(
				ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,
				"true");
		//System.setProperty("webdriver.chrome.silentOutput", "true");
		System.setProperty("webdriver.chrome.driver",
				".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://techbeacon.com/");
		Assert.assertTrue(driver.getTitle().equalsIgnoreCase("App Dev & Testing, DevOps, Enterprise IT, and Security: Experts share practical knowledge | TechBeacon"),"Incorrect Page Title");
		driver.quit();
	}

	@Test
	public void studyChromeOptions() {
		System.setProperty(
				ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,
				"true");
		System.setProperty("webdriver.chrome.driver",
				".\\Drivers\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); 
		
		//options.addArguments("disable-infobars");
		options.addArguments("--headless");
		options.addArguments("--disable-gpu");
	/*	DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(ChromeOptions.CAPABILITY, options);*/

		WebDriver driver = new ChromeDriver(options);
		System.out.println("Headless browser launched");
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		Assert.assertTrue(driver.getTitle().equalsIgnoreCase("Google"),"Incorrect Page Title");
		driver.quit();

	}
}
