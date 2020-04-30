import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMethods {
	public static void main(String args[]) throws AWTException {
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://localhost/login.do");
		Actions actions=new Actions(driver);
		WebElement actlink=driver.findElement(By.linkText("actiTIME Inc."));
		actions.contextClick(actlink).perform();
		Robot r =new Robot();
		r.keyPress(KeyEvent.VK_W);
		r.keyRelease(KeyEvent.VK_W);
		driver.manage().window().maximize();

	//	WebElement feature=driver.findElement(By.linkText("Features"));
		WebElement feature=driver.findElement(By.xpath("//a[text()='Features']"));
		actions.moveToElement(feature).perform();
		WebElement sub=driver.findElement(By.linkText("Workflow Adjustment"));
		actions.moveToElement(sub).click().perform();		
		//driver.close();
	}

}
