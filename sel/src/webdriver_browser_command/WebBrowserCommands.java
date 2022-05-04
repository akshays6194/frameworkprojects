package webdriver_browser_command;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebBrowserCommands {

	public WebBrowserCommands() {
		
	}

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=  new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http:www.facebook.com");
		
		String fb_title  = driver.getTitle();
		
		System.out.println(fb_title);
		
		String url =driver.getCurrentUrl();
		
		System.out.println(url);
		
		String pagesourse= driver.getPageSource();
		System.out.println(pagesourse);
		
		driver.quit();
		
	}

}
