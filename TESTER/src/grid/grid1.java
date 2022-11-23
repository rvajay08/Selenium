package grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class grid1 {

	public static void main(String[] args) throws MalformedURLException {
		String nodeurl="http://localhost:4444/wd/hub";
		String baseurl="https://www.google.com";
		DesiredCapabilities cap=DesiredCapabilities.firefox();
		cap.setBrowserName("firefox");;
		cap.setPlatform(Platform.WINDOWS);
		WebDriver d=new RemoteWebDriver(new URL(nodeurl),cap);
		//System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		d=new FirefoxDriver();
		d.get(baseurl);
		d.manage().window().maximize();
		d.close();
		
		
		// TODO Auto-generated method stub

	}

}
