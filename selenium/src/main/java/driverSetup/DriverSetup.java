package driverSetup;

import java.io.File;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DriverSetup {
	
	public static WebDriver SetupDriver() {
		String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "driver" + File.separator; 
		WebDriver driver;
	
		System.setProperty("webdriver.chrome.driver", exePath + "chromedriver"); //agregando la propiedad con la ruta de chrome driver 
		driver = new ChromeDriver(); // inicializando nuestro chrome driver
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
				
		
	}

}
