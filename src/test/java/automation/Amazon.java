package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Amazon {
	WebDriver driver;

	@Test
	public void f() {

		String baseUrl = "https://www.amazon.in/";

		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		System.out.println("Launching Google Chrome browser");
		driver = new ChromeDriver();
		driver.get(baseUrl);
//		String testTitle = "Free QA Automation Tools For Everyone";
//		String originalTitle = driver.getTitle();
//		Assert.assertEquals(originalTitle, testTitle);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("Iphone 13");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		driver.findElement(By.linkText("Apple iPhone 13 Pro (128GB) - Graphite")).click();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//		driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
//		Select quantity = new Select(driver.findElement(By.xpath("//*[@id=\"quantity\"]")));
//		quantity.selectByIndex(1);
//		quantity.selectByVisibleText("2");
		driver.findElement(By.id("submit.add-to-cart")).click();
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Starting Test On Chrome Browser");
	}

	@AfterMethod
	public void afterMethod() {
//		driver.close();
		System.out.println("Finished Test On Chrome Browser");
	}
}
