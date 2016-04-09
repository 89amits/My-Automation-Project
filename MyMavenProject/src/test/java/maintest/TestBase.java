package maintest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestBase {
  @Test
  @Parameters({"browser_name"})
  public void f(String browser_name) throws InterruptedException {
  System.out.println("hello");
  if(browser_name.equalsIgnoreCase("Firefox")){
  FirefoxDriver driver = new FirefoxDriver();
  driver.get("https://google.com");
  Thread.sleep(1000);
  }
  else if(browser_name.equalsIgnoreCase("Chrome")){
	  String Chrome_Path="F://selenium//Jars//chromedriver.exe";
	  System.setProperty("webdriver.chrome.driver",Chrome_Path);
	  ChromeDriver driver = new ChromeDriver();
	 // DesiredCapabilities cap = new DesiredCapabilities();
	  driver.get("https://google.com");
	  
  }
  
}
}
