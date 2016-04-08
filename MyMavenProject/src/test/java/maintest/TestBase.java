package maintest;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestBase {
  @Test
  public void f() throws InterruptedException {
  System.out.println("hello");
  FirefoxDriver driver = new FirefoxDriver();
  driver.get("https://google.com");
  Thread.sleep(1000);
  driver.close();
  }
  
}
