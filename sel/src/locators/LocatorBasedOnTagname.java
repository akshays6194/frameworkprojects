package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorBasedOnTagname {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http:www.facebook.com");
		List<WebElement> list_a = driver.findElements(By.tagName("a"));
		int count = list_a.size();
		System.out.println("total links: " + count);

		for (WebElement ele : list_a) {

			String linktext = ele.getText();
			System.out.println(linktext);
			if (linktext.equals("Terms")) {
				ele.click();
				break;
			}
		}
		Thread.sleep(3000);
		driver.quit();
	}

}
