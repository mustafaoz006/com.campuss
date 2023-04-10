package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DashboardPage;
import pages.HomePage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class LoginPoStepdefs {
    HomePage homePage=new HomePage();
    DashboardPage dashboardPage= new DashboardPage();

    @Given("user is on the campus homepage")
    public void userIsOnTheCampusHomepage() {
       Driver.getDriver().get(ConfigurationReader.getProperty("homePageUrl"));
    }

    @And("user accepts the cookies")
    public void userAcceptsTheCookies() {

        homePage.acceptButton.click();
    }
    @And("user enters valid username")
    public void userEntersValidUsername() {
      homePage.username.sendKeys(ConfigurationReader.getProperty("admin"));

    }

    @And("user enters valid password")
    public void userEntersValidPassword() {

        homePage.password.sendKeys(ConfigurationReader.getProperty("adminPassword"));
    }

    @When("user clicks Login button")
    public void userClicksLoginButton() {
        homePage.loginButton.click();
    }

    @Then("The Homepage should be opened")
    public void theHomepageShouldBeOpened() {

        dashboardPage.dashboard.isDisplayed();
    }


}
