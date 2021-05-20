package navigationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class DirectoryPage {
	
	public DirectoryPage(WebDriver driver) {
		PageFactory.initElements(driver, this); //Inicializamos los Page Objects con Page Factory
										//this es un keyword con el que decimos que se utiliza lo que esta en la clase y que los web
										//elements estaran declarados en la clase
	}
	
	//directoy objects
	@FindBy(id="searchDirectory_emp_name_empName")
	private WebElement nameBar;
	
	@FindBy(id="searchDirectory_job_title")
	private WebElement jobtitleBar;
	
	@FindBy(id="searchDirectory_location")
	private WebElement locationBar;
	
	@FindBy(id="searchBtn")
	private WebElement searchBtn;
	
	@FindBy(xpath="//*[@id=\"resultTable\"]/tbody/tr[2]/td[2]/ul/li[1]/b")
	private WebElement resultTable;
	
	public void makeSearch(String name, String jobTitle, String location) throws InterruptedException {
		Select jobtitleDD = new Select(jobtitleBar);
		Select locationDD = new Select(locationBar);
		
		nameBar.sendKeys(name);
		jobtitleDD.selectByVisibleText(jobTitle);
		//Thread.sleep(3000);
		//locationDD.selectByVisibleText(location); //Aqui se me complico hacerlo por texto visible, no salia
		locationDD.selectByValue(location);
		//Thread.sleep(3000);
		searchBtn.click();
		//Thread.sleep(3000);
	}
	
	public boolean validateResult(String expected) {
		String searcResult = resultTable.getText();
		boolean CorrectResult = searcResult.equals(expected);
		return CorrectResult;
	}
	

}
