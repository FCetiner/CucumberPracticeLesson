package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MainPageFunctionalities {

    public MainPageFunctionalities() {

        PageFactory.initElements(Driver.getDriver(),this);

    }

    //Locators

    @FindBy(xpath = "//a[@href='/login']")
    public WebElement signupButton;

    @FindBy(xpath = "//h2[.='New User Signup!']")
    public WebElement newUserSignUpText;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement nameBox;

    @FindBy(xpath = "(//input[@name='email'])[2]")
    public WebElement emailBox;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement signupButtonKayitSayfasi;

    @FindBy(xpath = "//b[contains (text(),'Enter Account Information')]")
    public WebElement createAccountPageVerification;


}
