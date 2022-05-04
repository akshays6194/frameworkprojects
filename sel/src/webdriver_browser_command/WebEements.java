package webdriver_browser_command;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebEements {

	public WebEements() {
	}

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=  new ChromeDriver();
		
		driver.get("http:www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement forgotpwd=driver.findElement(By.linkText("Forgotten password?"));
		forgotpwd.click();
	
		
		List<WebElement> list_ele= driver.findElements(By.tagName("a"));
		
		int total_list = list_ele.size();
		
		System.out.println("Total no.of anchor tag on fb login page="+total_list);
		driver.close();
	}

}
