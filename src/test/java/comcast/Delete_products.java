package comcast;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Delete_products {

	public static void main(String[] args) {
		String productName="Keyboard";
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://localhost:8888/");
		
		Login loginpage=new Login(driver);
		loginpage.loginToApp("admin","admin");
		
		Home homePage=new Home(driver);
		homePage.getProductlink().click();
		
		products productpage=new products(driver);
		productpage.getCreateprodImg().click();
		
		createproductpage cpp=new createproductpage(driver);
		cpp.createproduct(productName);
		cpp.getSavebtn().click();
		
		
		homePage.getProductlink().click();
		
		cpp.inlistbox();
		cpp.getSearchnowbtn().click();
		
		cpp.searchfor(productName);
		cpp.mulipleselect();
		cpp.getDeletebtn().click();
		
		homePage.logout();
		
		

	}

}
