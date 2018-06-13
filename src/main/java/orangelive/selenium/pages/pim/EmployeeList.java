package orangelive.selenium.pages.pim;

import orangelive.selenium.pages.AbstracBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Map;

/**
 * Employee List Page.
 */
public class EmployeeList extends AbstracBasePage {

    @FindBy(id = "menu_pim_addEmployee")
    private WebElement addEmployeeLink;

    @FindBy(id = "menu_pim_viewEmployeeList")
    private WebElement employeeListLink;

    @FindBy(css = "input[id=empsearch_employee_name_empName]")
    private WebElement employeeNameField;

    @FindBy(id = "empsearch_employee_name_empId")
    private WebElement javascriptEmployeeNameId;

    private final String javascriptEmployeeName = "empsearch_employee_name_empId";

    @FindBy(id = "searchBtn")
    private WebElement searchBtn;


    /**
     * Click on Add Employee link.
     */
    public void clickOnLinkAddEmployee() {
        addEmployeeLink.click();
    }

    /**
     * Fill Search form with employee Map.
     * @param employee Map with values to be filled
     */
    public void fillSearch(Map<String, String> employee) {
        for (Map.Entry<String, String> entry : employee.entrySet()) {
            switch (entry.getKey()) {
                case "Employee Name":
                    insertEmployeeNameField(entry.getValue());
                    break;
                default:
                    System.out.println("Key not found");
                    break;
            }
        }

    }

    /**
     * Click on Employee List link.
     */
    public void clickOnLinkEmployeeList() {
        employeeListLink.click();
    }

    /**
     * Insert Employee Name field.
     * @param value Value to be inserted in field.
     */
    public void insertEmployeeNameField(final String value) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("document.getElementById('empsearch_employee_name_empId').setAttribute('type', 'text')");
        try {
            Thread.sleep(2000);
            employeeNameField.sendKeys(value);
            employeeNameField.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /**
     * Click on Search button.
     */
    public void clickOnSearchBtn() {
        searchBtn.click();
    }


    /**
     * Verify if link exists in page.
     * @param value String to be verified
     * @return boolean
     */
    public boolean linkExist(String value) {
        if (driver.findElement(By.linkText(value)).isDisplayed()) {
            return true;
        }
        return false;
    }


}
