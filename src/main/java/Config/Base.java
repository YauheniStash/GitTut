package Config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public WebDriver driver;
	
	public WebDriver browserInit () throws IOException {
		FileInputStream file=new FileInputStream("C:\\My programs\\Java projects\\GitTut\\src\\main\\java\\Config\\config.properties");
		Properties prop=new Properties();
		prop.load(file);
				if (prop.getProperty("browser").equals("chrome"))
		{   System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\My programs\\\\\\\\Java projects\\\\\\\\chromedriver.exe");
			driver=new ChromeDriver();
		}
				driver.manage().window().maximize();				
				driver.get(prop.getProperty("URL"));
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;
		
	}

}
