package webdriver_browser_command;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebdriverNavigation {

	public WebdriverNavigation() {
	}

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http:www.facebook.com");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.linkText("Forgotten password?")).click();
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		
		driver.navigate().refresh();
		System.out.println(driver.getTitle());
		
		driver.quit();
		
		
	}

}
