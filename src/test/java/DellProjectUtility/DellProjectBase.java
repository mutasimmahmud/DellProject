package DellProjectUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DellProjectBase {
	public static WebDriver driver;
	public static Properties pro;
	

	public DellProjectBase() {
		try {
			FileInputStream file= new FileInputStream (System.getProperty("user.dir")+"\\src\\test\\java\\DellProjectConfiguration\\DellProject.properties");
		    pro =new Properties();
			pro.load(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Please check your code");
			e.printStackTrace();
		}
	}
	public void DellProjectBrowser() {
		String Browser= pro.getProperty("DellBrowser1");
		if(Browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.edge.driver",(System.getProperty("user.dir")+"\\Edgewebdriver\\msedgedriver.exe"));
			driver= new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		
	}
		else if(Browser.equalsIgnoreCase("FF"));
		
}
	public static void DellProjectURL(String URL) {
		driver.get("https://www.dell.com/en-us");
	}
}
