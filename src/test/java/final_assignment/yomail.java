package final_assignment;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class yomail {
	WebDriver driver = new ChromeDriver();

	@Test
	public void f() throws InterruptedException {
		String baseUrl = "https://yopmail.com/en/";
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		System.out.println("Launching Google Chrome browser");
		driver.get(baseUrl);
//		String testTitle = "Free QA Automation Tools For Everyone";
//		String originalTitle = driver.getTitle();
//		Assert.assertEquals(originalTitle, testTitle);
//		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(8000);
		WebElement mail_emailed = driver.findElement(By.xpath("//*[@id=\"login\"]"));
		mail_emailed.sendKeys("saksham3@yopmail.com");
		mail_emailed.submit();

//		driver.findElement(By.xpath("//*[@id='e_ZwVkZGN5ZGtlZmNkZQNjAGpjBQHmAt==']/button")).click();
		Thread.sleep(10000);
		driver.switchTo().frame("ifinbox");
		driver.findElement(By.xpath("//button[@class='lm']//span[contains(text(),'Maruti d')]/ancestor::button"))
				.click();
//		driver.findElement(By.xpath("//button[@class='lm']//span[contains(text(),'Maruti d')]/ancestor::button"))
//				.click();
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript(
//				"document.evaluate(`//button[@class='lm']//span[contains(text(),'Maruti d')]/ancestor::button`, document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue.click()");
		Thread.sleep(8000);
		driver.switchTo().defaultContent();
		Thread.sleep(10000);
		driver.switchTo().frame("ifmail");

		driver.findElement(By.linkText("Go To TAG")).click();
		Thread.sleep(4000);
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		Thread.sleep(18000);
		driver.findElement(By.xpath("//*[@id=\"new_password\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"new_password\"]")).sendKeys("Test@123");
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@id=\"confirm_password\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"confirm_password\"]")).sendKeys("Test@123");
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@id=\"update\"]")).click();
//		driver.findElement(By.linkText("Maruti d")).click();
//		List<WebElement> links = driver.findElements(By.xpath("//button[@class='lm']/div/span[2]"));

		// int a = 0;
//		String text;
//		System.out.println("asdda" + links);
//		for (WebElement objlink : links) {
//			text = objlink.getText();
//			if (text != "") {
//				a++;
//				if (text.contains("Maruti d")) {
//					System.out.println("index =" + (a - 1));
//				}
//				System.out.println(text);
//			}
//		}
	}

	@BeforeMethod
	public void beforeMethod() {
	}

	@AfterMethod
	public void afterMethod() {
	}

}
