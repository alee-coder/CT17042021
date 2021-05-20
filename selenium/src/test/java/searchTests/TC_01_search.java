package searchTests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import driverSetup.DriverSetup;
import globalVariables.GlobalVariables;
import navigationPages.DashboardPage;
import navigationPages.DirectoryPage;
import navigationPages.LoginPage;

public class TC_01_search {
	
	WebDriver driver = DriverSetup.SetupDriver();
	
	//PageObject
	LoginPage login = new LoginPage(driver);
	DashboardPage dashboard = new DashboardPage(driver);
	DirectoryPage directory = new DirectoryPage(driver);
	
	@BeforeTest
	public void startWebDriver() {
		driver.get(GlobalVariables.HOME_PAGE);
		driver.manage().window().maximize();
	}
	
	@Test
	public void TC_01_CorrectSearch() throws InterruptedException{
		boolean loginSucces;
		login.login(GlobalVariables.USER_ADMIN, GlobalVariables.PASSWORD_ADMIN);
		String currentUrl = driver.getCurrentUrl(); 
		loginSucces = login.validateLogin(currentUrl);
		Assert.assertTrue(loginSucces); //se puede poner un mensaje mas amigable. Por ejemplo "Contraseña o usuario invalido"
		dashboard.openDirectory();
		directory.makeSearch("Nathan", "Sales Representative", "1");  
		directory.validateResult("Nathan Elliot");
		
	}
	
	@AfterTest
	public void closeDriver() {
		driver.quit();
	}

}
