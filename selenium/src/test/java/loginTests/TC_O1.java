package loginTests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import driverSetup.DriverSetup;
import globalVariables.GlobalVariables;
import navigationPages.DashboardPage;
import navigationPages.LoginPage;

public class TC_O1 {
	WebDriver driver = DriverSetup.SetupDriver();
	
	//PageObject
	LoginPage login = new LoginPage(driver);
	DashboardPage dashboard = new DashboardPage(driver);
	
	@BeforeTest
	public void startWebDriver() {
		driver.get(GlobalVariables.HOME_PAGE);
		driver.manage().window().maximize();
	}
	
	@Test
	public void TC_01_CorrectLogin() {
		boolean loginSucces;
		login.login(GlobalVariables.USER_ADMIN, GlobalVariables.PASSWORD_ADMIN);
		String currentUrl = driver.getCurrentUrl(); 
		loginSucces = login.validateLogin(currentUrl);
		Assert.assertTrue(loginSucces); //se puede poner un mensaje mas amigable. Por ejemplo "Contraseña o usuario invalido"
		dashboard.logout();
		
	}
	
	@AfterTest
	public void closeDriver() {
		driver.quit();
	}
	
	

}
