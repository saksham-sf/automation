package final_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Second_Task {
	WebDriver driver = new ChromeDriver();

	@Test
	public void f() throws InterruptedException {
		WebElement email = driver.findElement(By.id("login_email"));
		email.sendKeys("maruti_staffing@yopmail.com");
		WebElement pwd = driver.findElement(By.id("login_password"));
		pwd.sendKeys("Tester@1234");
		driver.findElement(By.className("page-card-actions")).click();
		Thread.sleep(25000);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//div[@class='widget-body']/a/span[2]")).click();
		Thread.sleep(25000);
		driver.findElement(By.xpath("//div[@class='list-paging-area level']/div/div/button[3]")).click();
		Thread.sleep(5000);
//		List<WebElement> rows = driver.findElements(
//				By.xpath("//*[@id=\"page-List/User/List\"]/div[2]/div/div/div[2]/div/div[3]/div[2]/div[1]/div[2]"));
//		System.out.println("No of rows are : " + rows);
//		List<WebElement> links = driver.findElements(By.tagName("a"));
//		int a = 0;
//		String text;
//		for (WebElement objlink : links) {
//			text = objlink.getText();
//			if (text != "") {
//				a++;
////				if (text.contains("Test Anything")) {
////					System.out.println("index =" + (a - 1));
////				}
//////				System.out.println(text);
//			}
//		}
//		System.out.println("No. of Elements Present on the Screen =" + (a - 9) / 3);
		int count = driver.findElements(By.cssSelector("div.frappe-list div.list-row-container")).size();
		System.out.println("No. of Elements Displayed =" + count);
	}

	@BeforeMethod
	public void beforeMethod() {
		String baseUrl = "https://qa-new.tempguru.co/login";
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		System.out.println("Launching Google Chrome browser");
		driver.get(baseUrl);
//		String testTitle = "Free QA Automation Tools For Everyone";
//		String originalTitle = driver.getTitle();
//		Assert.assertEquals(originalTitle, testTitle);
//		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void afterMethod() {
	}

}
