
package assignment1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class automate {
	@Test 
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("incognito");
		
	//	WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		
		
		driver.get("https://live.browserstack.com");
		driver.findElement(By.id("user_email_login")).sendKeys("testbrowserstack40@gmail.com");
        driver.findElement(By.id("user_password")).sendKeys("Since1988@1234");
        driver.findElement(By.name("commit")).click();
       // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        TimeUnit.SECONDS.sleep(20); // Wait for 30 seconds
        // wait.until(ExpectedConditions.visibility)
        String expectedURL = "https://live.browserstack.com/dashboard";
        String currentURL = driver.getCurrentUrl();
     
        if (currentURL.contains(expectedURL)) {
            System.out.println("Test passed - URL match found!");
            Assert.assertTrue(true);
        } else {
            System.out.println("Test failed - URL match not found!");
            Assert.fail();
        }
        
        driver.quit();
	} 

}
