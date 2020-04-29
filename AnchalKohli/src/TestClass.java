import java.lang.String;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
public class TestClass 
{
	public static void main(String args[]) throws InterruptedException
	{
	System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://demo.actitime.com/login.do");
	Thread.sleep(3000);
	
	//ways to click on clock image
	//WebElement cl=driver.findElement(By.xpath("//td[1][@id='logoContainer']/div/div/img"));
	
	
	//ways to click on login button
	//WebElement lgn=driver.findElement(By.xpath("//div[text()='Login ']"));
	//WebElement lgn=driver.findElement(By.xpath("//a[@id='loginButton']/div"));
	WebElement lgn=driver.findElement(By.xpath("//a[@id='loginButton']/div[text()='Login ']"));
	lgn.click();
	driver.close();
	}
}
