package Vtiger;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class testcase1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("http://localhost:8888/");
		Thread.sleep(3000);
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.linkText("Organizations")).click();
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		driver.findElement(By.name("accountname")).sendKeys("kotak");
		
		 WebElement industry_dd = driver.findElement(By.name("industry"));
		 industry_dd.click();
		 Select s=new Select(industry_dd);
		 s.selectByVisibleText("Banking");
		 
		WebElement rating_dd = driver.findElement(By.name("rating"));
		rating_dd.click();
		 Select s1=new Select(rating_dd);
		 s1.selectByVisibleText("Active");
		 
		 WebElement assignTo_dd=driver.findElement(By.name("assigned_user_id"));
		 assignTo_dd.click();
		 Select s2=new Select(assignTo_dd);
		 s2.selectByVisibleText("Administrator");
		 
		  driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		  Thread.sleep(3000);
		 Actions action=new Actions(driver);
		  action.moveToElement(driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG'])")));
		  driver.findElement(By.linkText("Sign Out")).click();
	
		
		driver.quit();
		

	}

}
