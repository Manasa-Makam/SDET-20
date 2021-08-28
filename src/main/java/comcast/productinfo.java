package comcast;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productinfo {
	public productinfo(WebDriver driver) {
	PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//span[@class='lvtHeaderText']")
		private WebElement SuccessFullMsg;
	
	public WebElement getSuccessFullMsg() {
		return SuccessFullMsg;
	}

}
