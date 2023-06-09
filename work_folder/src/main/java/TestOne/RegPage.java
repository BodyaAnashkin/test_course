package TestOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegPage {

    public RegPage(WebDriver driver) {
        super();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@class='email']")
    private WebElement emailField;
    @FindBy(xpath = "//input[@class='password']")
    private WebElement passwordField;
    @FindBy(xpath = "//input[@class='nameuser']")
    private WebElement pictureField;
    @FindBy(className = "MuiButton-fullWidth")
    private WebElement regButton;

    public void Register(String email, String password, String fullName){

        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        pictureField.sendKeys(fullName);

        regButton.click();
    }

}
