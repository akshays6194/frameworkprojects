package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorBasedOnClassname {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http:www.facebook.com");
		WebElement fb_heading = driver.findElement(By.className("_8eso"));

		String heading = fb_heading.getText();
		System.out.println(heading);
		driver.quit();

	}

}
