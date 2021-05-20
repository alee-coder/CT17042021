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
			
		WebElement phoneNumber = driver.findElement(By.className("phone-input_input__1pOun"));
		phoneNumber.click();
		phoneNumber.sendKeys("(333) 666 9999"); // //input[@placeholder="Enter your phone number (required)"]
		
		// //*[contains(text(),'Argentina')]
		
		WebElement signInBtn = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/form/button")); 
		signInBtn.click();
		
		//driver.close(); //cierra la ventana actual
	}

}
