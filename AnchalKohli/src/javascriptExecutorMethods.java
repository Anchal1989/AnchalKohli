

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;

		public class javascriptExecutorMethods {
		public static void main(String args[]) throws InterruptedException {
			
			System.setProperty("webdriver.gecko.driver",".\\Drivers\\geckodriver.exe");
			WebDriver driver =new FirefoxDriver();
			//driver.get("http://localhost/login.do");
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.location = 'http://localhost/login.do'");
			String url = js.executeScript("return document.URL;").toString();
			System.out.println("URL of the site = "+url);	
			
			String title = js.executeScript("return document.title;").toString();
			System.out.println("Title of the site = "+title);
			
			String dmn = js.executeScript("return document.domain;").toString();
			System.out.println("Domain of the site = "+dmn);	
			
			//js.executeScript("alert('Hello Anchal')");
			
			js.executeScript("window.ScrollBy(0,1000)");
			
			Thread.sleep(3000);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			//js.executeScript("document.getElementById('username').value='admin'");
			//js.executeScript("document.getElementByType('password').value='manager'");
			//js.executeScript("arguments[0].click();", button);
			
			driver.close();
		
		
	}

	}

