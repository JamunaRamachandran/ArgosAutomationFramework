package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public WebDriver driver;

    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(className = "UwMfe")
    public WebElement accountBtn;

    @FindBy(id = "email-address")
    public WebElement emailIdTxtFld;

    @FindBy(id = "current-password")
    public WebElement passwordTxtFld;

    @FindBy(id = "yourEmailSubmitButton")
    public WebElement signInBtn;

    @FindBy(className = "_3lCcj")
    public WebElement argosImg;

    public void clickAccountBtn()
    {
        accountBtn.click();
    }

    public void enterEmailId(String emailId)
    {
         emailIdTxtFld.sendKeys(emailId);
    }
    public void enterPassword(String password)
    {
        passwordTxtFld.sendKeys(password);
    }

    public void clickSignInBtn()
    {
       signInBtn.click();
    }

    public void verifyLoginPageLanding(String expectedLoginPageTitle)
    {
        Assert.assertTrue(argosImg.isDisplayed());
        Assert.assertEquals(expectedLoginPageTitle,driver.getTitle());
    }

}
