package TestOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StartPage {
    public StartPage(WebDriver driver) {
        super();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[@class='login']")
    private WebElement loginButton;

    @FindBy(xpath = "//button[@class='registration']")
    private WebElement registerButton;

    public void clickOnLoginButton(){loginButton.click();}
    public void clickOnRegisterButton(){registerButton.click();}

}
