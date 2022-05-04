package webdriver_browser_command;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitAndCloseCommands {

	public QuitAndCloseCommands() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=  new ChromeDriver();
		driver.manage().window().maximize();
		
		String fb = driver.getWindowHandle();
		
		driver.get("http:wwwfacebook.com");
		
		System.out.println(driver.getTitle());
		
		driver.executeScript("window.open('http:www.google.com')");
		
		driver.switchTo().window(fb);
		
		WebElement forgotpd = driver.findElement(By.linkText("Forgotten password?"));
		forgotpd.click();
		
		
		
		Thread.sleep(2000);
		driver.close();
		Thread.sleep(5000);
		driver.quit();
		
	}
}
