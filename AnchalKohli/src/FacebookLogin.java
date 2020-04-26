import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class FacebookLogin {
public static void main(String args[]) throws InterruptedException
{
	System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(3000);
	WebElement eml = driver.findElement(By.id("email"));
	Thread.sleep(1000);
	eml.sendKeys("abc@gmail.com");
	WebElement pwd = driver.findElement(By.id("pass"));
	pwd.sendKeys("abcd1234");
	Thread.sleep(1000);
	WebElement lgn = driver.findElement(By.id("loginbutton"));
	lgn.click();
	String title = driver.getTitle();
	System.out.println(title);
	if(title.equals("Facebook – log in or sign up"))
	System.out.println("Incorrect Login");
	Thread.sleep(3000);
	driver.close();
	}
}
