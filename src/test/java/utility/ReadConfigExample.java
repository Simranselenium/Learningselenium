package utility;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfigExample {

	public static void main(String[] args) throws Exception {
		
		
		
		FileInputStream fis = new FileInputStream("C:\\Users\\91995\\eclipse-workspace\\com.deloitte.banking\\testData\\config.properties");  //window
		
		FileInputStream fis1 = new FileInputStream("C:/Users/91995/eclipse-workspace/com.deloitte.banking/testData/config.properties");        //window/non-window
		
		FileInputStream fis2 = new FileInputStream(".\\testData\\config.properties");
		
		
		
		Properties prop = new Properties();
		
		prop.load(fis2);
		
		
		System.out.println("read data from file, sampleApp: " + prop.getProperty("sampleApp"));
		System.out.println("read data from file, username: " + prop.getProperty("username"));
		System.out.println("read data from file, password: " + prop.getProperty("password"));

	}

}
