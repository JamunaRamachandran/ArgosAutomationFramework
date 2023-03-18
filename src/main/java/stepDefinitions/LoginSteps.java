package stepDefinitions;

import functionalLibrary.CommonFunctions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;

public class LoginSteps extends CommonFunctions {

    LoginPage loginPage = new LoginPage(driver);

    @Given("I am on HomePage {string} with title {string}")
    public void openLoginPage(String url,String expectedLoginPageTitle)
    {
        driver.get(url);
        loginPage.verifyLoginPageLanding(expectedLoginPageTitle);

    }
    @When("I click account button and get redirect to login page")
    public void clickAccountBtn()
    {
        loginPage.clickAccountBtn();
    }

    @When("I do login with my EmailId {string} and password {string}")
    public void doSignIn(String emailId, String password)
    {
        loginPage.enterEmailId(emailId);
        loginPage.enterPassword(password);
        loginPage.clickSignInBtn();
    }

    @Then("I click signIn Button successfully login with username {string}")
    public void verifyLogin(String expectedUsername)
    {
        loginPage.verifyLoginPageLanding(expectedUsername);
    }


}
