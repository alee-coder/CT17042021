package test;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Ejemplo_SoftAssert {
	
	SoftAssert softAssert = new SoftAssert();
	
  @Test
  public void ejemploSoft() {
	  int a = 5, b=10, x=8, y=8;
	  
	  softAssert.assertEquals(a, b);
	  softAssert.assertEquals(x, y);
	  
	  softAssert.assertAll(); //muestra informacionsobre cuales fallaron pero no detiene la ejecución
  }
  
  @Test
  public void sfAssertSelenium() {
	  	String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "driver" + File.separator; 
		System.setProperty("webdriver.chrome.driver", exePath + "chromedriver"); //agregando la propiedad con la ruta de chrome driver 
		WebDriver driver = new ChromeDriver(); // inicializando nuestro chrome driver
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "OrangeHRM";
		String badTitle = "orange";
		
		softAssert.assertEquals(actualTitle, expectedTitle);
		softAssert.assertEquals(badTitle, expectedTitle);
		
		driver.quit(); //cierra la ventana actual. Solo se cierra sino falla, el assertAll hace que falle por eso lo pongo antes, asi se cierra la pantalla antes de los resultados
		
		softAssert.assertAll();
  }
  
}
