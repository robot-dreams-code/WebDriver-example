package rd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikiLoginPage {
    public WebDriver driver;

    public WikiLoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(id = "wpName1")
    WebElement nameField;

    @FindBy(id = "wpPassword1")
    WebElement passwordField;

    @FindBy(id = "wpLoginAttempt")
    WebElement loginButton;

    public void inputName(String name) {
        nameField.sendKeys(name);
    }

    public void inputPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }
}
