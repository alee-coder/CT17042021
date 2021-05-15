package selenium;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practica {

	public static void main(String[] args) throws InterruptedException { //el throws se agrego para usar el sleep
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
	
		
		
		//Metodos del explorador
		String title = driver.getTitle(); //obtener titulo de la pagina
		System.out.println("El titulo es: " + title);
		
		
		String urlDashboard = driver.getCurrentUrl(); //obtener url de la pagina actual
		System.out.println("La url es: " + urlDashboard);
		
		//verificar elementos desplegados
		//boolean assignLeave = driver.findElement(By.xpath("//*[@id=\"dashboard-quick-launch-panel-menu_holder\"]/table/tbody/tr/td[1]/div/a/span")).isDisplayed();
		boolean assignLeave = driver.findElement(By.className("quickLinkText")).isDisplayed();
		
		
		if(assignLeave){
			System.out.println("La opción esta desplegada");
			
		}
		
		//obtener el texto
		String welcomeMsj = driver.findElement(By.id("welcome")).getText();
		if(welcomeMsj.contains("Paul")){ //tambien se puede usar equals
			System.out.println("El texto es Paul");
			
		}else {
			System.out.println("El texto no es Paul");
		}
		
		//Cerrando Navegador web
		driver.close(); //cierra la ventana actual
		//driver.quit(); //cierra todas las ventanas del webdriver
		
		
	}

}
