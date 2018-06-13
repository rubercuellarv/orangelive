package orangelive.selenium.pages;

import orangelive.selenium.browser.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Documentation.
 */
public abstract class AbstracBasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    /**
     * HomePage constructor.
     */
    public AbstracBasePage() {
        driver = DriverManager.getInstance().getDriver();
        wait = DriverManager.getInstance().getWait();
        PageFactory.initElements(driver, this);
    }


}
