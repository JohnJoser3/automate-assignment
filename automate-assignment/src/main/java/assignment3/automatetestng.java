package assignment3;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class automatetestng {
	WebDriver driver;
	
  @Test
  public void main() {
	  
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://live.browserstack.com");
//	  driver.manage().window().maximize();
//	  String title = driver.getTitle();
//	  	System.out.println("The page title on Chrome is : " +title);
	  WebElement userName = driver.findElement(By.id("user_email_login"));
	  WebElement password = driver.findElement(By.id("user_password"));
	  WebElement button = driver.findElement(By.name("commit"));
//	  //WebElement loginBtn2 = driver.findElement(By.id("enterprise_user_submit"));
	  userName.sendKeys("testbrowserstack40@gmail.com");
	  password.sendKeys("Since1988@1234");
	  button.click();
	  try {
		TimeUnit.SECONDS.sleep(20);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
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
//	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	  String actualUrl="https://live.browserstack.com/dashboard";
//	  String expectedUrl= driver.getCurrentUrl();
//	  System.out.println("Resulting page on Chrome is: " +expectedUrl);
//
//		//Assert.assertEquals(expectedUrl,actualUrl);
//		
//		//Closing browser session
//		driver.quit();
//  }
//}
//
//




//
//
//
//
//package assignment3;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//
//public class automatetestng {
//	WebDriver driver;
//	@Test 
//	
//	public static void main(String[] args) {
//		
////		System.setProperty("webdriver.chrome.driver", "/Users/johnjose/Downloads/chromedriver_mac_arm64/chromedriver");
////		ChromeOptions options = new ChromeOptions();
////		options.addArguments("incognito");
//		
////		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		
//		
//		driver.get("https://live.browserstack.com");
//		driver.findElement(By.id("user_email_login")).sendKeys("testbrowserstack40@gmail.com");
//        driver.findElement(By.id("user_password")).sendKeys("Since1988@1234");
//        driver.findElement(By.name("commit")).click();
//       // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
////        TimeUnit.SECONDS.sleep(20); // Wait for 30 seconds
//        // wait.until(ExpectedConditions.visibility)
//        String expectedURL = "https://live.browserstack.com/dashboard";
//        String currentURL = driver.getCurrentUrl();
//     
//        if (currentURL.contains(expectedURL)) {
//            System.out.println("Test passed - URL match found!");
//             //Assert.assertTrue(true);
//        } else {
//            System.out.println("Test failed - URL match not found!");
//          //  Assert.fail();
//        }
//        
//        driver.quit();
//	} 
//
//}
//
