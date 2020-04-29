import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
public class webdriverMethods {
	
		public static void main(String args[])
		{
			System.setProperty("webdriver.gecko.driver",".\\Drivers\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.facebook.com/");
			//String pgsrc=driver.getPageSource();
			//System.out.println(pgsrc);
			String CurrentURL =driver.getCurrentUrl();
			System.out.println(CurrentURL);
			String title =driver.getTitle();
			System.out.println(title);
			String WindowHandle =driver.getWindowHandle();
			System.out.println(WindowHandle);
			driver.navigate().to("https://www.google.com/?gws_rd=ssl");
			driver.getWindowHandle();
			driver.close();
		}

	}


