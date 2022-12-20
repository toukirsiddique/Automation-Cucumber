package step_definitions;

import io.cucumber.java.en.*;
import pages.SignIn;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static utilities.DriverSetup.getDriver;

public class LoginStep {
    SignIn signIn = new SignIn();


    @Given("User is on Signin page")
    public void user_is_on_signin_page() {
        getDriver().get("https://www.rokomari.com/login");
    }
    @When("User enters username {string} and password {string}")
    public void user_enters_username_and_password(String username, String password) {
        signIn.enterUsername(username);
        signIn.enterPassword(password);

    }
    @When("User clicks on login button")
    public void user_clicks_on_login_button() {

        signIn.clickSigninButton();
    }

    @Then("user see the login page title {string}")
    public void userSeeTheLoginPageTitle(String title) {
        assertEquals(getDriver().getCurrentUrl(), title);

    }

    @Then("user see the error message {string}")
    public void userSeeTheErrorMessage(String errorMessage) {
        assertEquals(signIn.getElementText(signIn.ERROR_MESSAGE), errorMessage);
    }

    @When("User enters {string} and {string}")
    public void userEntersUsernameAndPassword(String username, String password) {
        user_enters_username_and_password(username, password);
    }

    @But("user shouldn't see the account page title {string}")
    public void userShouldnTSeeTheAccountPageTitle(String title) {
        assertNotEquals(getDriver().getTitle(), title);
    }

    @When("user enter <string> and <string>")
    public void userEnterUsernameAndPassword(String username, String password) {
        user_enters_username_and_password(username, password);
    }

    @Then("user see the <string>")
    public void userSeeTheError_message(String error_title) {
        assertEquals(getDriver().getTitle(), "Wrong email/phone or password");
    }

    @But("user shouldn't see the <string>")
    public void userShouldnTSeeTheAccountpage_title(String accountpage_title) {
        userShouldnTSeeTheAccountPageTitle(accountpage_title);
    }
}
