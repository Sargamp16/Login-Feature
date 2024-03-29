package automationframework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Login2 
{
	
	public static void main(String args[]) throws InterruptedException
	{
		String name="hi sargam";
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //implicit wait - tag name doesn't exists
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys(name);
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy"); //regular expression using CSS Selector
		driver.findElement(By.className("submit")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container']h2")).getText(),"Hello"+name+",");
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		driver.close();
	}
	

}
