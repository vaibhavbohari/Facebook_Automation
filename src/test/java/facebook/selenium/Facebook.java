package facebook.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Facebook {
	@Test

	public void Login () throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\VAIBHAV\\QAAutomation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("vaibhavbohari@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("vaibhav@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("testPassword");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
		driver.close();
		
	}
	@Test
	public void registration() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\VAIBHAV\\QAAutomation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Vaibhav");
		Thread.sleep(2000);
		
		driver.findElement(By.name("lastname")).sendKeys("Bohari");
		Thread.sleep(2000);
		driver.findElement(By.name("reg_email__")).sendKeys("Vaibhavbohari@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Vaibhavbohari@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password_step_input")).sendKeys("Vaib@0123");
		Thread.sleep(2000);
		
		driver.findElement(By.name("birthday_day")).sendKeys("4");
		Thread.sleep(2000);
		driver.findElement(By.id("month")).sendKeys("Oct");
		Thread.sleep(2000);
		driver.findElement(By.id("year")).sendKeys("1997");
		Thread.sleep(2000);
		driver.findElements(By.name("sex")).get(1).click();
		Thread.sleep(2000);
		driver.findElement(By.name("websubmit")).click();
		driver.close();
	}
}

