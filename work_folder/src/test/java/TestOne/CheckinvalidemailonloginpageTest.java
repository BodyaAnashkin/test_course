package TestOne;// Generated by Selenium IDE

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class CheckinvalidemailonloginpageTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @BeforeTest
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @AfterTest
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void checkinvalidemailonloginpage() {
    // Test name: Check invalid email on login page
    // Step # | name | target | value | comment
    // 1 | open | https://rozetka.com.ua/ |  | 
    driver.get("https://rozetka.com.ua/");
    // 2 | setWindowSize | 1382x744 |  | 
    driver.manage().window().setSize(new Dimension(1382, 744));
    // 3 | mouseOver | css=.header-actions__item--user use |  | 
    {
      WebElement element = driver.findElement(By.cssSelector(".header-actions__item--user use"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 4 | mouseOut | css=.header-actions__item--user use |  | 
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    // 5 | click | css=.header-actions__item--user use |  | 
    driver.findElement(By.cssSelector(".header-actions__item--user use")).click();
    // 6 | click | id=auth_email |  | 
    driver.findElement(By.id("auth_email")).click();
    // 7 | type | id=auth_email | asdasd@daw.asd | 
    driver.findElement(By.id("auth_email")).sendKeys("asdasd@daw.asd");
    // 8 | type | id=auth_email | asdasd@daw.asaa | 
    driver.findElement(By.id("auth_email")).sendKeys("asdasd@daw.asaa");
    // 9 | click | id=auth_pass |  | 
    driver.findElement(By.id("auth_pass")).click();
    // 10 | type | id=auth_pass | asdadcvsa32 | 
    driver.findElement(By.id("auth_pass")).sendKeys("asdadcvsa32");
    // 11 | click | css=.auth-modal__submit |  | 
    driver.findElement(By.cssSelector(".auth-modal__submit")).click();
    // 12 | close |  |  | 
    driver.close();
  }
}