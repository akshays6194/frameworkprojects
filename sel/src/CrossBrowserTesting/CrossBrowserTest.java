package CrossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowserTest {

	public CrossBrowserTest() {
		// TODO Auto-generated constructor stub
	}
		static WebDriver driver;
	public static void launchBrowser(String bname,String url){
		
		if(bname.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			 driver = new FirefoxDriver();
	}
		else if(bname.equals("Chrome")){
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			driver =new ChromeDriver();
			
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.close();
	}
	public static void main(String[]args){
		
		CrossBrowserTest.launchBrowser("Chrome", "http:www.google.com");
		CrossBrowserTest.launchBrowser("Firefox", "http:www.google.com");
		
	}
}
