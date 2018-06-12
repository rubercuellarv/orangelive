package orangelive.stepsdefinitions.employee;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import orangelive.selenium.pages.Home;
import orangelive.selenium.pages.pim.AddEmployee;
import orangelive.selenium.pages.pim.EmployeeList;
import java.util.Map;


/**
 * Employee Steps.
 */
public class EmployeeSteps {

    private Home home;
    private EmployeeList employeeList;
    private AddEmployee addEmployee;

    /**
     * Cons.
     * @param home Home Page.
     * @param addEmployee addEmployee page.
     */
    public EmployeeSteps(final Home home, final AddEmployee addEmployee) {
        this.home = home;
        this.employeeList = new EmployeeList();
        this.addEmployee = addEmployee;
    }

    /**
     * Test.
     */
    @When("^I click on PIM$")
    public void iClickOnPIM() {
        home.clickPim();
    }

    /**
     * Test.
     */
    @And("^I click on AddEmployee tab$")
    public void iClickOnAddEmployeeTab() {
        employeeList.clickOnLinkAddEmployee();
    }


    /**
     * Test.
     * @param employee doc.
     */
    @And("^Insert the data for new employee:$")
    public void insertTheDataForNewEmployee(final Map<String, String> employee) {
        addEmployee.fillEmployee(employee);
    }

    /**
     * Test.
     */
    @And("^I click on Save button$")
    public void iClickOnSaveButton() {
        addEmployee.clickSaveButton();
    }

    /**
     * Test.
     */
    @And("^I click on Employee List tab$")
    public void iClickOnEmployeeList()  {
        employeeList.clickOnLinkEmployeeList();
    }

    /**
     * Test.
     * @param employeeToSearch test.
     */
    @And("^I insert the data for search employee:$")
    public void insertTheDataForSearchEmployee(final Map<String, String> employeeToSearch) {
        employeeList.fillSearch(employeeToSearch);
    }

    /**
     * Test.
     */
    @And("^I click on Search button$")
    public void iClickOnSearchButton() {
        employeeList.clickOnSearchBtn();
    }

}
