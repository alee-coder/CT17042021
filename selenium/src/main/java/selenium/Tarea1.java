package selenium;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tarea1 {

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
		
		WebElement directory = driver.findElement(By.id("menu_directory_viewDirectory"));
		
		directory.click();
		
		WebElement search = driver.findElement(By.id("searchDirectory_emp_name_empName"));
		WebElement searchBtn = driver.findElement(By.id("searchBtn"));
		
		search.sendKeys("Nathan");
		
		Select jobTitle = new Select(driver.findElement(By.id("searchDirectory_job_title")));
		jobTitle.selectByVisibleText("Sales Representative");
		
		searchBtn.click();
		
		String result = driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr[2]/td[2]/ul/li[1]")).getText();
		 
		if(result.contains("Nathan Elliot")) {
			System.out.println("El resultado de busqueda es correcto");
		}else {
			System.out.println("El resultado de busqueda es incorrecto");
		}
		
		driver.close(); //cierra la ventana actual

	}

}
