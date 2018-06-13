package orangelive.selenium.pages;


import orangelive.selenium.browser.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Documentation.
 */
public class Home extends AbstracBasePage {

    @FindBy(css = "#menu_pim_viewPimModule b")
    private WebElement linkPim;

    /**
     * Click on Pim link.
     */
    public void clickPim() {
        DriverManager.getInstance().getWait()
                .until(ExpectedConditions.elementToBeClickable(linkPim));
        linkPim.click();
    }
}
