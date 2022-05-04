package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorBasedOnCssSelector {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http:www.facebook.com");
		System.out.println(driver.findElement(By.cssSelector("._8eso")).getText());
		driver.findElement(By.cssSelector("#email")).sendKeys("abc@gmail.com");
		driver.findElement(By.cssSelector("#pass")).sendKeys("abc@123");

		driver.findElement(By.name("login")).click();

		System.out.println(driver.getTitle());
		
		driver.quit();
		
	}

}
