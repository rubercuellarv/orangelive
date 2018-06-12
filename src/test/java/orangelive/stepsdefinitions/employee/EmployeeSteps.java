package orangelive.stepsdefinitions.employee;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import javax.xml.bind.SchemaOutputResolver;

public class EmployeeSteps {

    @Given("^I login with my crendetials$")
    public void iLoginWithMyCrendetials() {
        System.out.println("test");
    }

    @When("^I click on PIM$")
    public void iClickOnPIM() {
        System.out.println("test");
    }

    @And("^I click on AddEmployee tab$")
    public void iClickOnAddEmployeeTab() {
        System.out.println("test");
    }


    @And("^Insert the data for new employee:$")
    public void insertTheDataForNewEmployee() {
        System.out.println("test");
    }

    @And("^I click on Save button$")
    public void iClickOnSaveButton() {
        System.out.println("test");
    }

    @And("^I click on Employee List tab$")
    public void iClickOnEmployeeListTab() {
        System.out.println("Test");
    }

    @And("^I insert the data for search employee:$")
    public void iInsertTheDataForSearchEmployee() {
        System.out.println("test");
    }

    @And("^I click on Search button$")
    public void iClickOnSearchButton() {
        System.out.println("test");
    }

    @Then("^Verify \"([^\"]*)\" is displayed$")
    public void verifyIsDisplayed(String arg0) {
        System.out.println("test");
    }
}
