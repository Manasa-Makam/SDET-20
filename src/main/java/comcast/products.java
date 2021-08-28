package comcast;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class products {
	public products(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createprodImg;
	
	public WebElement getCreateprodImg() {
		return createprodImg;
	}
	@FindBy(xpath="//td[@id='alpha_13']/..")
	private WebElement SearchAlphabetbtn;
	
	public WebElement getAlphabetbtn() {
		return SearchAlphabetbtn;
	}
	
	

}
