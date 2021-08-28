package comcast;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	public Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="user_name")
	private WebElement UsernameEdt;
	
	@FindBy(name="user_password")
	private WebElement PasswordEdt;
	
	@FindBy(id="submitbutton")
	private WebElement loginBtn;

	public WebElement getUsernameEdt() {
		return UsernameEdt;
	}

	public WebElement getPasswordEdt() {
		return PasswordEdt;
	}

	public WebElement getLoginEdt() {
		return loginBtn;
	}
	public void loginToApp(String username,String password)
	{
		UsernameEdt.sendKeys(username);
		PasswordEdt.sendKeys(password);
		loginBtn.click();
	}
	

}
