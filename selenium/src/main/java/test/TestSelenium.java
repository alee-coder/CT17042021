package test;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class TestSelenium {

	public static void main(String[] args) {
		String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "driver" + File.separator; //setear la ruta del chromedriver																											
		
		System.setProperty("webdriver.chrome.driver", exePath + "chromedriver"); //agregando la propiedad con la ruta de chrome driver 
		WebDriver driver = new ChromeDriver(); // inicializando nuestro chrome driver
		driver.get("https://my-testing.getclue.com/");
		 
		 //FIREFOX 
		System.setProperty("webdriver.gecko.driver", exePath + "geckodriver"); 
		WebDriver driver2 = new FirefoxDriver(); // inicializando nuestro chrome driver 
		driver2.get("https://my-testing.getclue.com/");
		 
		
		//SAFARI
		System.setProperty("ebdriver.safari.driver", exePath + "safaridriver");
		WebDriver driver3 = new SafariDriver();
		driver3.get("https://my-testing.getclue.com/");
		//linea nueva de codigo

	}

}
