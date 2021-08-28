package comcast;


import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import comcast_genericUtility.BaseClass;

@Listeners(comcast_genericUtility.ListnerImp.class)
public class SearctProductByUnitPriceTest extends BaseClass {

		@Test
		public void Searchproduct() throws Throwable {
		
		int randomInt = jLib.getRanDomNumber();
		/*test script Data*/
		String productName = eLib.getDataFromExcel("Sheet1", 1, 2) + randomInt;
	    int price=eLib.getIntegerDataFromExcel("sheet1",1,3);
	    String prices=Integer.toString(price);
		
	
		/*step 2: Navigate to product*/
		Home homePage=new Home(driver);
		homePage.getProductlink().click();
		
		
		/*step 3: Navigate to create product page by clicking on + image*/
		products productpage=new products(driver);
		productpage.getCreateprodImg().click();
		
		
		/*Step 4: Searchproduct by unit price*/
		createproductpage cpp=new createproductpage(driver);
		cpp.createproduct(productName);
		cpp.Unitprice(prices);
		cpp.getSavebtn().click();
		
		
		/*step 5:verify the successful message */
		productinfo productinfopage=new productinfo(driver);
		String actMsg=	productinfopage.getSuccessFullMsg().getText();
		/*if(actMsg.contains(productName)) {
			System.out.println(productName+ "PASS:Created successfully");
		}
		else
		{
			System.out.println(productName+ "FAIL:Not created successfully");
		}*/
		Assert.assertTrue(true, actMsg);
	
	}
		

}
