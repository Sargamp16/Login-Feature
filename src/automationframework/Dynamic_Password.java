package automationframework;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Dynamic_Password {
	
		
		public static void main(String args[]) throws InterruptedException
		{
			String name="hi";
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //implicit wait - tag name doesn't exists
			String password = getPassword(driver); //only static methods can be called directly without creating any object.
			driver.get("https://rahulshettyacademy.com/locatorspractice/");
			driver.findElement(By.cssSelector("#inputUsername")).sendKeys(name);
			driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys(password); //regular expression using CSS Selector
			driver.findElement(By.className("submit")).click();
			Thread.sleep(2000);
			System.out.println(driver.findElement(By.tagName("p")).getText());
			Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
			Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container']h2")).getText(),"Hello"+name+",");
			driver.findElement(By.xpath("//*[text()='Log Out']")).click();
			driver.close();
		}
		public static String getPassword(WebDriver driver) throws InterruptedException
		{
			driver.get("https://rahulshettyacademy.com/locatorspractice/");
			driver.findElement(By.linkText("Forgot your password?")).click();
			Thread.sleep(1000);
			driver.findElement(By.className("reset-pwd-btn")).click();
			String passwordText = driver.findElement(By.cssSelector("form p")).getText(); // Please use temporary password 'rahulshettyacademy' to Login.
			String[] passwordArray = passwordText.split("'"); 
			//0th index : Please user temporary password 
			//1st index: rahulshettyacademy to Login.
			String password=passwordArray[1].split("'")[0];
			return password;
			
		}

	}

