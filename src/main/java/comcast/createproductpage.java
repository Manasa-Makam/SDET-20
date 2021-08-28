package comcast;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class createproductpage {
	
	public createproductpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(name="productname")
		private WebElement ProductNameEdt;
		
	
	@FindBy(id="unit_price")
		private WebElement UnitpriceEdt;
	
	//@FindBy(name="button")
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement Savebtn;
	
	public WebElement getSavebtn() {
		return Savebtn;
	}
	
	
	@FindBy(name="submit")
	private WebElement searchnowbtn;
	
	@FindBy(name="search_text")
		private WebElement searchforbtn;
	
	@FindBy(id="bas_searchfield")
		private WebElement Inlistbox;
	
	public WebElement getInlistbox() {
		return Inlistbox;
	}
	@FindBy(name="selectall")
		private WebElement multipleproduct;
	

	public WebElement getMultipleproduct() {
		return multipleproduct;
	}
	
	@FindBy(xpath="//input[@value='Delete']")
		private WebElement deletebtn;

	public WebElement getDeletebtn() {
		return deletebtn;
	}
	
	
	public WebElement getSearchnowbtn() {
		return searchnowbtn;
	}

	public WebElement getUnitpriceEdt() {
		return UnitpriceEdt;
	}
	
	public WebElement getSearchforbtn() {
		return searchforbtn;
	}

	public WebElement getProductNameEdt() {
		return ProductNameEdt;
	}
	
	public void createproduct(String productName) 
	{
		ProductNameEdt.sendKeys(productName);
		
	}
	public void Unitprice(String prices)
	{
		UnitpriceEdt.sendKeys(prices);
		//Savebtn.click();
		
	}
	
		
	public void searchfor(String productname)
	{
		searchforbtn.sendKeys(productname);
	}
	
	public void inlistbox()
	{
		Select s=new Select(Inlistbox);
		s.selectByVisibleText("Product Name");
	
	}
	public void mulipleselect()
	{
		Select s=new Select(multipleproduct);
		s.getAllSelectedOptions();
	}
}
	
		
	
	

	
		
		
		
		
	

