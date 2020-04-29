//Login in to actime application
//Url : http://localhost:8080/login.do
//UN - admin, PWD - manager
//click on Settings
//Click on the Types of Work link present in the window
//click on the Set by Default link for a type of work called “testing”

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class ActitimeIndDepenPath {
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost/login.do");
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.cssSelector("[type='password']")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='popup_menu_label'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Types of Work']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[text()='set by default']")).click();
		driver.findElement(By.xpath("//a[text()='testing']//..//a[text()='set by default']")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
