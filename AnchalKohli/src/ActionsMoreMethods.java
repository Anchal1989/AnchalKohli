import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMoreMethods {
	public static void main(String args[]) throws AWTException {
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.actimind.com");
		Actions actions=new Actions(driver);
		WebElement actlink=driver.findElement(By.linkText("AREAS OF EXPERTISE"));
		//actions.moveToElement(actlink).perform();
		WebElement cld=driver.findElement(By.linkText("Cloud Applications"));
		//actions.moveToElement(cld).click().perform();
		actions.moveToElement(actlink).moveToElement(cld).click().perform();
		driver.manage().window().maximize();
			
		//driver.close();
	}
}
