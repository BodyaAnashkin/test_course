package TestOne;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.testng.AssertJUnit.assertTrue;

public class MySite {
    WebDriver driver;
    RegPage reg;
    LogInPage logIn;
    StartPage start;
    HomePage home;
    PostPage newPost;
    Screenshots screenshots;

    private String site = "https://localhost:3000";

    @BeforeClass
    public void initDriver(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }

    @Test
    public void RegisterNewUser1(){
        String email = "User@gmail.com", password = "123456", name = "Petro Semenov";
        driver.get(site);
        start = new StartPage(driver);
        start.clickOnRegisterButton();
        reg = new RegPage(driver);
        reg.Register(email,password,name);
    }

    @Test
    public void AddNewPost() throws IOException, InterruptedException {
        String email = "Test@gmail.com", password = "Test234A";
        String namePost = "Banana", textPost = "I love BANANA";
        driver.get(site);
        start = new StartPage(driver);
        start.clickOnLoginButton();
        logIn = new LogInPage(driver);
        logIn.logIn(email,password);
        home = new HomePage(driver);
        home.addNewPost();
        newPost = new PostPage(driver);
        newPost.fillTextNewPost(namePost,textPost);
        }

    @Test
    public void LoginInvalidUser(){
        String email = "123", password = "123456a";
        driver.get(site);
        start = new StartPage(driver);
        start.clickOnLoginButton();
        logIn = new LogInPage(driver);
        logIn.logIn(email,password);
        assertTrue(logIn.InvalidMassageName());
        assertThat(logIn.setErrorNameText(),
                equalTo(String.format("Неправильная почта")));
    }



   @AfterClass
    public void endTest() throws IOException, InterruptedException {
        screenshots = new Screenshots();
        screenshots.screenshotes(driver,"EndTest");
        driver.quit();
    }
}
