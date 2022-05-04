package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsBasedOnName {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement txt_name = driver.findElement(By.name("txtUsername"));
		WebElement txt_pwd = driver.findElement(By.name("txtUsername"));
		WebElement loginBtn = driver.findElement(By.name("Submit"));

		txt_name.sendKeys("Admin");
		txt_pwd.sendKeys("admin123");
		loginBtn.click();
		
		driver.quit();

	}

}
