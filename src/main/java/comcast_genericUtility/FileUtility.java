package comcast_genericUtility;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	public String getPropertyKeyValue(String key) throws Throwable {
   	 FileInputStream fis = new FileInputStream("./data/testdata.properties");
   	 Properties pobj = new Properties();
   	 pobj.load(fis);
   	 String value = pobj.getProperty(key);
		return value;
   	
   }
}



