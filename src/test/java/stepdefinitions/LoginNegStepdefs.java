package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.HomePage;
import utilities.Driver;

public class LoginNegStepdefs {

    HomePage homePage = new HomePage();

    @And("user enters valid oder invalid {string}")
    public void userEntersValidOderInvalid(String arg0) {
        homePage.username.clear();
        homePage.username.sendKeys(arg0);
    }

    @And("user enters invalid oder valid {string}")
    public void userEntersInvalidOderValid(String arg0) {
        homePage.password.clear();
        homePage.password.sendKeys(arg0);
    }
    @Then("The Homepage should not be opened")
    public void theHomepageShouldNotBeOpened() {

        homePage.campusimg.isDisplayed();
    }

    @And("user clicks Loginbutton")
    public void userClicksLoginbutton() {

        homePage.loginButton.click();
    }

    @And("close the driver")
    public void closeTheDriver() {
        //Driver.closeDriver();
    }

}
