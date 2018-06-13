package orangelive.selenium.pages.pim;

import orangelive.selenium.pages.AbstracBasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Map;

/**
 * Add Employee Page.
 */
public class AddEmployee extends AbstracBasePage {
    @FindBy(id = "firstName")
    private WebElement txtFieldFirstName;

    @FindBy(id = "middleName")
    private WebElement txtFieldMiddleName;

    @FindBy(id = "lastName")
    private WebElement txtFieldLastName;

    @FindBy(id = "btnSave")
    private WebElement btnSave;

    /**
     * Fill employee form.
     * @param employee Employee map
     */
    public void fillEmployee(Map<String, String> employee) {
        AddEmployee addEmployee = new AddEmployee();
        for (Map.Entry<String, String> entry : employee.entrySet()) {
            switch (entry.getKey()) {
                case "First Name":
                    addEmployee.insertFirstName(entry.getValue());
                    break;
                case "Middle Name":
                    addEmployee.insertMiddleName(entry.getValue());
                    break;
                case "Last Name":
                    addEmployee.insertLastName(entry.getValue());
                    break;
                default:
                    System.out.println("Key not found");
                    break;
            }
        }
    }

    /**
     * insert first name in field.
     * @param firstName String to be inserted in firstname field.
     */
    public void insertFirstName(final String firstName) {
        txtFieldFirstName.sendKeys(firstName);
    }

    /**
     * Insert value into Middle Name field.
     * @param middleName value to be inserted.
     */
    public void insertMiddleName(final String middleName) {
        txtFieldMiddleName.sendKeys(middleName);
    }

    /**
     * Insert value into lastname field.
     * @param lastName value to be inserted.
     */
    public void insertLastName(final String lastName) {
        txtFieldLastName.sendKeys(lastName);
    }

    /**
     * Click on Save Button.
     */
    public void clickSaveButton() {
        btnSave.click();
    }
}
