package comcast;

import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class sample_test {
	
	
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	WebDriver driver = new ChromeDriver();
	ExtentHtmlReporter reporter;
	ExtentReports reports;
	ExtentTest test;
	@BeforeSuite
	
	public void setup() {
		String ldt = LocalDateTime.now().toString().replace(":","-");
		reporter=new ExtentHtmlReporter("./SDET-20/Extentreport/SDET"+ldt+".html");
		
		System.out.println("Before Suite executed");
		reporter.config().setDocumentTitle("SDET-20");
		reporter.config().setTheme(Theme.DARK);
		reports= new ExtentReports();
		reports.attachReporter(reporter);
		
	}
		
	@BeforeClass
	public void configBC() {
		System.out.println("=============Launch the Browser=======");
		System.setProperty("Webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		driver.manage().window().maximize();
		driver.get("http://localhost:8888");
	}
		
	@BeforeMethod
		public void config() {
			driver.findElement(By.name("user_name")).sendKeys("admin");
			driver.findElement(By.name("user_password")).sendKeys("admin");
			driver.findElement(By.id("submitButton")).click();
	}
	@Test
	public void test() {
		 test=reports.createTest("test");
			String title = driver.getTitle();
			System.out.println("Title:" +title);
			
			
			driver.findElement(By.linkText("Organizations")).click();
			String Org_title=driver.getTitle();
			System.out.println("Organisation page Title: "+Org_title);
		}
		
	@AfterMethod
	public void configAM() {
		
		WebElement Adminstrater = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		Actions act=new Actions(driver);
		act.moveToElement(Adminstrater).perform();
	      WebElement SignOut=driver.findElement(By.linkText("Sign Out"));
		
		SignOut.click();
	}
	
	@AfterClass
	public void configAC() {
		System.out.println("=============Close the Browser=======");
		driver.quit();
	}
	
	@AfterSuite
	public void configAS() {
		reports.flush();
		System.out.println("========================close DB========================");
	}

			
			
			
			
			
		
		

	}


