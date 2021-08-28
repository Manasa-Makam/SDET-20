package comcast_genericUtility;

import java.io.File;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnerImp implements ITestListener{
	public void onTestFailure(ITestResult result) {
		String testName=result.getMethod().getMethodName();
		System.out.println("Exceute it.... I am the listener");
		
		EventFiringWebDriver edriver=new EventFiringWebDriver(BaseClass.sdriver);
		File SrcFile=edriver.getScreenshotAs(OutputType.FILE);
		File dstFile=new File("./Screenshot/"+testName+".png");
		try {
			FileUtils.copyFile(SrcFile,dstFile);
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
	

}
