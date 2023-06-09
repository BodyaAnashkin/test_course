package TestOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
    public LogInPage(WebDriver driver) {
        super();
        PageFactory.initElements(driver, this);
    }
    @FindBy(className = "MuiButton-fullWidth")
    private WebElement logInButton;
    @FindBy(xpath = "//input[@class='email']")
    private WebElement emailField;
    @FindBy(xpath = "//input[@class='password']")
    private WebElement passwordField;
    @FindBy(className = "invalid_name_massage")
    private WebElement invalidNameMassage;

    public void logIn(String email, String password){
        emailField.sendKeys(email);
        passwordField.sendKeys(password);

    }

    public void logInButtonClick(){
        logInButton.click();
    }
    public String setErrorNameText(){
        return invalidNameMassage.getText();
    }

    public boolean InvalidMassageName(){
        return invalidNameMassage.isDisplayed();
    }

}
