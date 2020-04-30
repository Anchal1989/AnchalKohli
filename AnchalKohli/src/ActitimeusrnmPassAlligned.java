import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActitimeusrnmPassAlligned 	{
	public static void main(String args[]) throws InterruptedException {

	System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("http://localhost/login.do");
	WebElement usr = driver.findElement(By.id("username"));
	int ux=usr.getLocation().getX();
	System.out.println("x component of user field is "+ux);
	int uh=usr.getSize().getHeight();
	System.out.println("Height component of user field is "+uh);
	int uw=usr.getSize().getWidth();
	System.out.println("Width component of user field is "+uw);
	
	WebElement pwd = driver.findElement(By.cssSelector("[type='password']"));
	int px=pwd.getLocation().getX();
	System.out.println("x component of user field is "+px);
	int ph=usr.getSize().getHeight();
	System.out.println("Height component of user field is "+ph);
	int pw=usr.getSize().getWidth();
	System.out.println("Width component of user field is "+pw);
	
	if (ux==px&&uh==ph&&uw==pw )
	{
		System.out.println("username and password fields are properly alligned");
	}
	else 
	{
		System.out.println("username and password fields are not properly alligned");
	}
		

	driver.close();

}
}