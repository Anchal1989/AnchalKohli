import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class locators {
public static void main(String args[]) throws InterruptedException
{
	System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.amazon.in/");
	String title=driver.getTitle();
	System.out.println(title);
	Thread.sleep(3000);
	//WebElement crt =driver.findElement(By.id("nav-cart-count"));
	//WebElement crt =driver.findElement(By.cssSelector ("span[id='nav-cart-count']"));
	//crt.click();
	WebElement trprm=driver.findElement(By.linkText("Try Prime"));
	trprm.click();
	WebElement name=driver.findElement(By.name("submit"));
	name.click();
	WebElement cont=driver.findElement(By.className("a-button-input"));
	cont.click();
	//WebElement eml=driver.findElement(By.cssSelector("input[id='ap_email']"));
	//eml.sendKeys("abc@gmail.com");
	WebElement eml=driver.findElement(By.cssSelector("input#ap_email"));
	eml.sendKeys("abc@gmail.com");
	driver.close();
	
}
}