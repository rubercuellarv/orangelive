package orangelive.stepsdefinitions.employee;

import cucumber.api.java.en.Then;
import orangelive.selenium.pages.pim.EmployeeList;

import static org.junit.Assert.assertTrue;

/**
 * Employee assertions.
 */
public class EmployeeAssertions {
    private EmployeeList employeeList = new EmployeeList();

    /**
     * Doc.
     * @param employee test
     */
    @Then("^Verify \"([^\"]*)\" is displayed$")
    public void verifyIsDisplayed(String employee) {
        assertTrue(employeeList.linkExist(employee));
    }


}
