package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsBasedOnLinkText {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http:www.facebook.com");
		
		driver.findElement(By.linkText("Facebook Lite")).click();
		
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
