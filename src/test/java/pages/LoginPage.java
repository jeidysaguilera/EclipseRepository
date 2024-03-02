package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}


	@FindBy(id = "username")
	 WebElement text_user;
	//private By text_user=By.id("username");
	
	
	@FindBy(id = "password")
	WebElement text_pass;
	//private By text_pass=By.id("password");
	
	
	@FindBy(className = "radius")
	WebElement login;
	//private By login=By.className("radius");
	
	@FindBy(xpath = "//body/div[2]/div[1]/div[1]/a[1]")
	WebElement logout;
	//private By logout=By.xpath("//body/div[2]/div[1]/div[1]/a[1]");
	
	
	
	
	public void UserName(String username) {
		type(username, text_user);
	}
	
	
	public void Password(String password) {
		type(password, text_pass);
	}
	
	public void ClicLogin() {
		
	Clic(login);
	}
	
	
	public void LogoutisDisplay() {
		isDisplay(logout);
	}
	
	

	
}
