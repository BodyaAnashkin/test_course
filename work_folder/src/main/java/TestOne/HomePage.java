package TestOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public HomePage(WebDriver driver) {
        super();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@class='post_header']")
    private WebElement postHeaderButton;


    public void addNewPost(){postHeaderButton.click();}


    public boolean addPostButtonDisplayed(){
        return postHeaderButton.isDisplayed();
    }

}
