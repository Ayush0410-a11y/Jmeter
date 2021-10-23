package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
	
	@Test
	public void WebdriverTest() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\PHASE-3 jmeter http\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(1000);
		driver.quit();
		
	}

}
