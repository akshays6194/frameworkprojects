package webdriver_browser_command;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public WindowHandle() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=  new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http:wwwfacebook.com");
		
		System.out.println("1st tab tite is-"+driver.getTitle());
		
		driver.executeScript("window.open('http:www.youtube.com')");
		
	
		    // considering that there is only one tab opened in that point.
		    String fb = driver.getWindowHandle();
		    
		    ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
		    newTab.remove(fb);
		    // change focus to new tab
		    driver.switchTo().window(newTab.get(0));
		    
		    driver.navigate().to("http:www.google.com");
			System.out.println("2st tab tite is-"+driver.getTitle());

		    // Do what you want here, you are in the new tab
			
			
			driver.executeScript("window.open('http:www.gmail.com')");
			Thread.sleep(3000);
			driver.switchTo().window(fb);
			Thread.sleep(3000);
			WebElement forgotpd = driver.findElement(By.linkText("Forgotten password?"));
			forgotpd.click();
			
			ArrayList<String> newtab2 = new ArrayList<String>(driver.getWindowHandles());
		    // change focus back to old tab		 
			 newtab2.remove(fb);
			driver.switchTo().window(newtab2.get(1));
			Thread.sleep(3000);
			System.out.println("3rd tab tite is-"+driver.getTitle());
			
			
			driver.switchTo().window(fb);
			System.out.println("1st tab tite after click is-"+driver.getTitle());
			Thread.sleep(3000);
			driver.close();
		    
		
		Thread.sleep(3000);
		 driver.switchTo().window(newTab.get(0));
		driver.navigate().to("http:www.youtube.com");
		System.out.println("2nd tab tite after navigation is-"+driver.getTitle());
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(newtab2.get(1));
		driver.navigate().to("http:www.facebook.com");
		System.out.println("3nd tab tite after navigation is-"+driver.getTitle());
		Thread.sleep(3000);
		driver.quit();
		
	}

}
