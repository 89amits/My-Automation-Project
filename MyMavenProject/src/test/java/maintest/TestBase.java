package maintest;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestBase {
	File f=new File("F://Git//MyMavenProject//Config.file");
	FileInputStream fis =new FileInputStream(f);
    Properties prop = new Properties();
    prop.load(fis);
  @Test
  @Parameters({"browser_name"})
  public void f(String browser_name) throws InterruptedException {
	  //String browser_name="Chrome";
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
  else {
	  String IE_Path="F://selenium//Jars//IEDriverServer.exe";
	  System.setProperty("webdriver.IE.driver",IE_Path);
	  WebDriver driver = new InternetExplorerDriver();
	 // DesiredCapabilities cap = new DesiredCapabilities();
	  driver.get("https://google.com");
	  
  }
  
}
}
