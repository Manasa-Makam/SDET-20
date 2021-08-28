package comcast;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(comcast_genericUtility.ListnerImp.class)
public class SearchProductByAlphbet {
	
	@Test
	public static void SearchProduct() {
		String productname="Nokia";

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
		cpp.createproduct(productname);
		
		cpp.getSavebtn().click();
		
		
		homePage.getProductlink().click();
		
		productpage.getAlphabetbtn().click();
		
		homePage.logout();
		
		
	}

}
