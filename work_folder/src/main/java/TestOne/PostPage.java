package TestOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PostPage {
    public PostPage(WebDriver driver) {
        super();
        PageFactory.initElements(driver, this);
    }

    String Testname = "Test Post About Banana";
    String Testtext = "I love BANANA";

    @FindBy(xpath = "//input[@class='name_post']")
    private WebElement nameField;
    @FindBy(xpath = "//input[@class='login']")
    private WebElement postField;
    @FindBy(xpath = "//button[@class='add_post']")
    private WebElement addPostButton;

    public void fillTextNewPost(String namePost,String Text){
        nameField.sendKeys(namePost);
        postField.sendKeys(Text);
    }

    public void addTestPost(){
        nameField.sendKeys(Testname);
        postField.sendKeys(Testtext);
    }

    public void clickOnLoginButton(){addPostButton.click();}

}
