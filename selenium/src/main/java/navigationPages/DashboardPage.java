package navigationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	public DashboardPage(WebDriver driver) {
		PageFactory.initElements(driver, this); //Inicializamos los Page Objects con Page Factory
										//this es un keyword con el que decimos que se utiliza lo que esta en la clase y que los web
										//elements estaran declarados en la clase
	}
	
	//dashboard objects
	@FindBy(id="welcome")
	private WebElement welcomeDrpDown;
	
	@FindBy(xpath="//*[@id=\"welcome-menu\"]/ul/li[3]/a")
	private WebElement logOutBtn;
	
	@FindBy(id="menu_directory_viewDirectory")
	private WebElement directoryMenu;
	
	public void logout() {
		welcomeDrpDown.click();
		logOutBtn.click();
	}
	
	public void openDirectory() {
		directoryMenu.click();
	}
	
	
	

}
