package comcast;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Home {
	
	WebDriver driver;
	public Home(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Products")
		private WebElement Productlink;
	
	@FindBy(xpath="//a[text()='Sign Out']")
		private WebElement signoutlink;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
		private WebElement administatorImg;
	
	
	public WebElement getAdministatorImg() {
		return administatorImg;
	}


	public WebElement getSignoutlink() {
		return signoutlink;
	}


	public WebElement getProductlink() {
		return Productlink;
	}
	
	public void logout() {
		Actions act=new Actions(driver);
		act.moveToElement(administatorImg).perform();
		signoutlink.click();
	}

	
}
		
	
	


