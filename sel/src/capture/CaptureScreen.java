package capture;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreen {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement txt_username = driver.findElement(By.name("email"));
		WebElement txt_password = driver.findElement(By.name("pass"));
		WebElement loginBtn = driver.findElement(By.name("login"));
		
		txt_username.sendKeys("Vasant@gmail.com");
		txt_password.sendKeys("vasant@223$");
		
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File srcSource = ts.getScreenshotAs(OutputType.FILE);
		File srcDest = new File("./Screenshots/fb_login.png");
		
		FileHandler.copy(srcSource, srcDest);
		loginBtn.click();
						
		FileHandler.copy(ts.getScreenshotAs(OutputType.FILE), new File("./Screenshots/fb_homepage.png"));
		driver.quit();	
		
	}

}