package webapp_testing;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Webapp_test {
	
	public static void main(String[] args) throws InterruptedException {
		String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "driver" + File.separator; 
		System.setProperty("webdriver.chrome.driver", exePath + "chromedriver"); //agregando la propiedad con la ruta de chrome driver 
		WebDriver driver = new ChromeDriver(); // inicializando nuestro chrome driver
		driver.get("https://my-testing.getclue.com/");
		
		driver.manage().window().maximize(); //maximizar ventana
		
		WebElement prefix = driver.findElement(By.className("phone-input_flag_container__ngFMo"));
		prefix.click();
		
		//declarando webelement tipo dropdowns
		Select prefixDropDown = new Select(driver.findElement(By.className("modal_content__1uZru")));
		prefixDropDown.selectByVisibleText("Canada");
		
		
		//WebElement phoneNumber = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/form/div/div[1]/input"));
		//phoneNumber.sendKeys("3336669999");
		
		//WebElement signInBtn = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/form/button")); 
		//signInBtn.click();
		
		//driver.close(); //cierra la ventana actual
	}

}
