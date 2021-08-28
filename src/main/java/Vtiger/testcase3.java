package Vtiger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/");
		Thread.sleep(3000);
		String parentwid = driver.getWindowHandle();
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();
		
		driver.findElement(By.name("lastname")).sendKeys("Dhyan");
		
		driver.findElement(By.cssSelector("img[@title='Select']")).click();
		driver.switchTo().window(driver.getWindowHandle());
		
		driver.switchTo().window(parentwid);
		

		
		
		
		
		
		

	}

}
