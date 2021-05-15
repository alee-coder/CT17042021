package selenium;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticaDropDrawn {

	public static void main(String[] args) {
		String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "driver" + File.separator; 
		System.setProperty("webdriver.chrome.driver", exePath + "chromedriver"); //agregando la propiedad con la ruta de chrome driver 
		WebDriver driver = new ChromeDriver(); // inicializando nuestro chrome driver
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize(); //maximizar ventana
		
		//Obteniendo objetos webelement de la pagina web
		WebElement userName = driver.findElement(By.id("txtUsername"));
		WebElement userPsw = driver.findElement(By.id("txtPassword"));
		WebElement loginBtn = driver.findElement(By.id("btnLogin"));
		
		
		
		
		//Login
		userName.sendKeys("Admin");
		//Thread.sleep(3000); //3 seg de espera
		userPsw.sendKeys("admin123");
		//Thread.sleep(3000); //3 seg de espera
		loginBtn.click();
		//Thread.sleep(3000); //3 seg de espera
		
		WebElement leaveMenu = driver.findElement(By.className("quickLinkText"));
		leaveMenu.click();
		
		//declarando webelement tipo dropdowns
		Select leaveDropDown = new Select(driver.findElement(By.id("assignleave_txtLeaveType")));
		leaveDropDown.selectByVisibleText("US - Matternity");

	}

}
