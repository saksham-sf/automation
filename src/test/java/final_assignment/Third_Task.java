package final_assignment;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Third_Task {
	WebDriver driver = new ChromeDriver();

	@Test
	public void f() throws InterruptedException {
		WebElement email = driver.findElement(By.id("login_email"));
		email.sendKeys("maruti_staffing@yopmail.com");
		WebElement pwd = driver.findElement(By.id("login_password"));
		pwd.sendKeys("Tester@1234");
		driver.findElement(By.className("page-card-actions")).click();
//		if (driver.getCurrentUrl() == "https://qa-new.tempguru.co/app/staff-home") {
		Thread.sleep(10000);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
//		Set<String> ids = driver.getWindowHandles();
//		Iterator<String> it = ids.iterator();
//		String parentId = it.next();
//		String childId = it.next();
//		driver.switchTo().window(childId);
		driver.findElement(By.xpath("//div[@class='widget-body']/a/span[2]")).click();
		Thread.sleep(10000);

		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-sm primary-action']/span")).click();
		Thread.sleep(4000);
		WebElement company_type = driver.findElement(By.xpath("//div[@class='link-field ui-front']/div/input"));
		company_type.sendKeys("Exclusive Hiring");
		Thread.sleep(8000);
		company_type.submit();
		Thread.sleep(8000);
		WebElement lastname = driver.findElement(By.xpath(
				"//div[@class='row form-section card-section visible-section'][2]/div[2]/div[2]/form/div/div/div[2]/div/input"));
		lastname.sendKeys("Anything");
		Thread.sleep(4000);
		WebElement firstname = driver.findElement(By.xpath(
				"//div[@class='row form-section card-section visible-section'][2]/div[2]/div[1]/form/div[2]/div/div[2]/div/input"));
		firstname.sendKeys("test");
		Thread.sleep(5000);
		Select quantity = new Select(
				driver.findElement(By.xpath("//div[@class='control-input flex align-center']/select")));
		quantity.selectByIndex(1);
		Thread.sleep(6000);
		WebElement email_id = driver.findElement(By.xpath(
				"//div[@class='row form-section card-section visible-section'][2]/div[2]/div[1]/form/div/div/div[2]/div/input"));
		email_id.sendKeys("saksham41@yopmail.com");
		driver.findElement(By.xpath("//div[@class='section-head collapsed']")).click();
		WebElement company = driver.findElement(By.xpath(
				"//div[@class='row form-section card-section visible-section'][3]/div[2]/div/form/div/div/div[2]/div/div/div/input"));
		company.sendKeys("Exclusive Maruti");
		Thread.sleep(8000);
		WebElement lastname1 = driver.findElement(By.xpath(
				"//div[@class='row form-section card-section visible-section'][2]/div[2]/div[2]/form/div/div/div[2]/div/input"));
		lastname1.sendKeys("Anything");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"page-User\"]/div[1]/div/div/div[2]/div[3]/button[2]")).click();
		Thread.sleep(26000);
		driver.findElement(By.xpath("/html/body/div[6]/div/div/div[1]/div[2]/button[2]")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@id=\"home-profile\"]/span/div")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@id=\"toolbar-user\"]/a[4]")).click();
		Thread.sleep(8000);
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
		mail_emailed.sendKeys("saksham41@yopmail.com");
		mail_emailed.submit();
		driver.findElement(By.xpath("//*[@id='e_ZwVkZGN5ZGtlZmNkZQNjAGpjBQHmAt==']/button")).click();
		ArrayList<String> tabs3 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs3.get(1));
		Thread.sleep(18000);
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

//		quantity.selectByVisibleText("2");
//		driver.findElement(By.xpath("//*[contains(@href,'Shakti Ram')]")).click();

//		}
	}

	@BeforeMethod
	public void beforeMethod() {
		String baseUrl = "https://qa-new.tempguru.co/login";
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		System.out.println("Launching Google Chrome browser");
		driver.get(baseUrl);
//		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void afterMethod() {
	}

}
