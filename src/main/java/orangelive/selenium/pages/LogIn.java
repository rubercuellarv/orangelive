package orangelive.selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Class for login.
 */
public class LogIn extends AbstracBasePage {
    @FindBy(id = "txtUsername")
    private WebElement usernameTextField;

    @FindBy(id = "txtPassword")
    private WebElement passwordTextField;

    @FindBy(id = "btnLogin")
    private WebElement btnLogin;


    /**
     * Home Login.
     * @param user  Username for login
     * @param password Password for login.
     * @return Home.
     */
    public static Home login(final String user, final String password) {
        LogIn logIn = new LogIn();
        logIn.setUsername(user);
        logIn.setPassword(password);
        return logIn.clickLoginButton();
    }

    /**
     * Setting username in text field.
     * @param username Username to be inserted.
     */
    public void setUsername(final String username) {
        usernameTextField.sendKeys(username);
    }

    /**
     * Set password in textfield.
     * @param password Password from user to be logged.
     */
    public void setPassword(final String password) {
        passwordTextField.sendKeys(password);
    }

    /**
     * Click on Login button.
     * @return Home.
     */
    public Home clickLoginButton() {
        btnLogin.click();
        return new Home();
    }
}
