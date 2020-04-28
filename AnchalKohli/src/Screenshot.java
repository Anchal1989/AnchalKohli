import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.File;
import java.io.IOException;
import com.google.common.io.Files;

public class Screenshot {
	public static void main(String args[]) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.google.com/?gws_rd=ssl");
		Thread.sleep(3000);
	    TakesScreenshot ts=(TakesScreenshot)driver;
	  File src=  ts.getScreenshotAs(OutputType.FILE);
	  File dst=new File("D:\\bill pay\\Amazon.png")  ;
	  Files.copy(src,dst);
	  driver.close();
	    
	}

}
