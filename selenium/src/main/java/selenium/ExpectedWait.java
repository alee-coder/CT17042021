package selenium;

import java.io.File;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpectedWait {

	public static void main(String[] args) {
		String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "driver" + File.separator; 
		System.setProperty("webdriver.chrome.driver", exePath + "chromedriver"); //agregando la propiedad con la ruta de chrome driver 
		WebDriver driver = new ChromeDriver(); // inicializando nuestro chrome driver
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize(); //maximizar ventana
		
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS); //Tarda 50 segundos en mostrar la excepción, se suma el tiempo con el otro wait
		
		
		//Obteniendo objetos webelement de la pagina web
		WebElement userName = new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(By.id("txtUsernam")));
	}

}
