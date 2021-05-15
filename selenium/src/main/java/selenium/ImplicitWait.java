package selenium;

import java.io.File;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
	public static void main(String[] args) {

		String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "driver" + File.separator; 
		System.setProperty("webdriver.chrome.driver", exePath + "chromedriver"); //agregando la propiedad con la ruta de chrome driver 
		WebDriver driver = new ChromeDriver(); // inicializando nuestro chrome driver
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize(); //maximizar ventana
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //Tarda 5 segundos en mostrar la excepción
		
		//Obteniendo objetos webelement de la pagina web
		WebElement userName = driver.findElement(By.id("txtUsernam"));
		
	}

}
