import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Login 
{
	
	public static void main(String args[])
	{
		
		WebDriver driver = new ChromeDriver(); //Creates a 'Driver' object of the 'Web Driver' interface and the 'Chrome Driver' class.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //Implicit Wait
		driver.get("https://rahulshettyacademy.com/locatorspractice/"); //This is the URL used for testing.
                // Checking the login with Invalid credentials.
                driver.findElement(By.id("inputUsername")).sendKeys("test");  // ID locator is used.
		driver.findElement(By.name("inputPassword")).sendKeys("1234"); //Name locator is used.
		driver.findElement(By.className("submit")).click(); //Class Name locator is used.
                // Checks the validation that comes after enter invalid credentails.
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText()); // CSS Selector locator is used. (CSS Selector and Xpath are the two important locators widely used)
		driver.findElement(By.linkText("Forgot your password?")).click(); //LinkTest locator is used.
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John"); //xpath locator is used.
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@test.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();   // to take absolute xpath : //form/path[2] - where form is the parent html tag and path is the child of it.
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@example.com"); //not a convenient approach
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("1234567899");  // absolute xpath using html tags
		driver.findElement(By.className("reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
  }	
}
