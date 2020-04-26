import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver",".\\Drivers\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		//driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.google.com/?gws_rd=ssl");
		Thread.sleep(3000);
		driver.close();
		
	}

}
