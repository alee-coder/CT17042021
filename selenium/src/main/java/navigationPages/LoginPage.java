package navigationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this); //Inicializamos los Page Objects con Page Factory
										//this es un keyword con el que decimos que se utiliza lo que esta en la clase y que los web
										//elements estaran declarados en la clase
	}
	
	//Login PageObjects/WebElements
	@FindBy(id="txtUsername")
	private WebElement UserName;
	
	@FindBy(id="txtPassword")
	private WebElement UserPsw;
	
	@FindBy(id="btnLogin")
	private WebElement LogInBtn;
	
	public void login (String user, String password) {
		UserName.sendKeys(user);
		UserPsw.sendKeys(password);
		LogInBtn.click();
	}
	
	public boolean validateLogin(String url) {
		String expectedURL = "https://opensource-demo.orangehrmlive.com/index.php/dashboard"; //cambiar a variable global
		boolean CorrectUrl = url.equals(expectedURL);
		return CorrectUrl;
	}

}
