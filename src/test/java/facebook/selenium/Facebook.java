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
}
