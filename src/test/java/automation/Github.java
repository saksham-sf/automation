package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Github {
	WebDriver driver;

	@Test
	public void f() {
		String baseUrl = "https://github.com/";

		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		System.out.println("Launching Google Chrome browser");
		driver = new ChromeDriver();
		driver.get(baseUrl);
//		String testTitle = "Free QA Automation Tools For Everyone";
//		String originalTitle = driver.getTitle();
//		Assert.assertEquals(originalTitle, testTitle);
		driver.manage().timeouts().pageLoadTimeout(1000, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Sign in")).click();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		WebElement user_name = driver.findElement(By.xpath("//*[@id=\"login_field\"]"));

		WebElement pwd = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		pwd.sendKeys("SS!!10may");
		user_name.sendKeys("saksham_sf");
		driver.findElement(By.xpath("//*[@id=\"login\"]/div[4]/form/div/input[11]")).click();
	}

	@BeforeMethod
	public void beforeMethod() {
	}

	@AfterMethod
	public void afterMethod() {
	}

}
