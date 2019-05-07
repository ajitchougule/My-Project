package pack1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonTest {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new FirefoxDriver();
		FileInputStream fis = new FileInputStream("./CommonData/data.properties");
		Properties pobj = new Properties();
		pobj.load(fis);
		String uRl = pobj.getProperty("url");
		String userName = pobj.getProperty("username");
		String passWord = pobj.getProperty("password");
		System.out.println(uRl);
		System.out.println(userName);
		System.out.println(passWord);
		driver.get(uRl);

	}

}
