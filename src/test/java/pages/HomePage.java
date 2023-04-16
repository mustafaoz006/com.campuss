package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//button[text()='Accept all cookies']")
    public WebElement acceptButton;

    @FindBy(xpath = "//input[@id='mat-input-0']")
    public WebElement username;
    @FindBy(xpath = "//input[@id='mat-input-1']")
    public WebElement password;
    @FindBy(xpath ="//span[contains(text(),'LOGIN')]" )
    public WebElement loginButton;
    @FindBy(xpath = "//img")
    public WebElement campusimg;
}
