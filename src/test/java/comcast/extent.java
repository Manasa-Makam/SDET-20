package comcast;

import org.testng.Assert;
import org.testng.annotations.Test;

public class extent extends sample_test{
	
	@Test
	public void getTitleFromHome() {
		test=reports.createTest("getTitleFromHome");
		
		String ExpTitle="Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM";
		
		String ActTitle=driver.getTitle();
		Assert.assertEquals(ExpTitle,ActTitle);
		
	}

}
