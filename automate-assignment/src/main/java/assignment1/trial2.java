package assignment1;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class trial2 {

	@Test
	public void testOnFirefox() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.browserstack.com/users/sign_in");
		driver.manage().window().maximize();

		String title = driver.getTitle();
		System.out.println("The page title is: " + title);

		WebElement uName = driver.findElement(By.id("user_email_login"));
		WebElement pswd = driver.findElement(By.id("user_password"));
		WebElement loginBtn1 = driver.findElement(By.id("user_submit"));

		uName.sendKeys("onboardingBrowserStack@gmail.com");
		pswd.sendKeys("FakingIt@123");
		loginBtn1.click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

  		driver.quit();
	}

//	@Test
//	public void testOnChrome() {
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.browserstack.com/users/sign_in");
//		driver.manage().window().maximize();
//
//		String title = driver.getTitle();
//		System.out.println("The page title is: " + title);
//
//		WebElement uName = driver.findElement(By.id("user_email_login"));
//		WebElement pswd = driver.findElement(By.id("user_password"));
//		WebElement loginBtn1 = driver.findElement(By.id("user_submit"));
//
//		uName.sendKeys("onboardingBrowserStack@gmail.com");
//		pswd.sendKeys("FakingIt@123");
//		loginBtn1.click();
//
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//  		driver.quit();
//	}
//
//	@Test
//	public void testOnSafari() {
//		WebDriver driver = new SafariDriver();
//		driver.get("https://www.browserstack.com/users/sign_in");
//		driver.manage().window().maximize();
//
//		String title = driver.getTitle();
//		System.out.println("The page title is: " + title);
//
//		WebElement uName = driver.findElement(By.id("user_email_login"));
//		WebElement pswd = driver.findElement(By.id("user_password"));
//		WebElement loginBtn1 = driver.findElement(By.id("user_submit"));
//
//		uName.sendKeys("onboardingBrowserStack@gmail.com");
//		pswd.sendKeys("FakingIt@123");
//		loginBtn1.click();
//
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//  		driver.quit();
//	}
//	
//	@Test
//	public void testOnEdge() {
//		WebDriver driver = new EdgeDriver();
//		driver.get("https://www.browserstack.com/users/sign_in");
//		driver.manage().window().maximize();
//
//		String title = driver.getTitle();
//		System.out.println("The page title is: " + title);
//
//		WebElement uName = driver.findElement(By.id("user_email_login"));
//		WebElement pswd = driver.findElement(By.id("user_password"));
//		WebElement loginBtn1 = driver.findElement(By.id("user_submit"));
//
//		uName.sendKeys("onboardingBrowserStack@gmail.com");
//		pswd.sendKeys("FakingIt@123");
//		loginBtn1.click();
//
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//  		driver.quit();
//	}
//	
//	@Test
//	public void testOnIE() {
//		WebDriver driver = new InternetExplorerDriver();
//		driver.get("https://www.browserstack.com/users/sign_in");
//		driver.manage().window().maximize();
//
//		String title = driver.getTitle();
//		System.out.println("The page title is: " + title);
//
//		WebElement uName = driver.findElement(By.id("user_email_login"));
//		WebElement pswd = driver.findElement(By.id("user_password"));
//		WebElement loginBtn1 = driver.findElement(By.id("user_submit"));
//
//		uName.sendKeys("onboardingBrowserStack@gmail.com");
//		pswd.sendKeys("FakingIt@123");
//		loginBtn1.click();
//
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//  		driver.quit();
//	}
}







