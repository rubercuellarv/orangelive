Feature: Employee

  Scenario: Create employee
    Given I login with my crendetials
    When I click on PIM
    And I click on AddEmployee tab
    And Insert the data for new employee:
      | First Name        | Purple      |
      | Middle Name       | Hrm         |
      | Last Name         | Automation  |
    And I click on Save button
    And I click on Employee List tab
    And I insert the data for search employee:
      | Employee Name | Purple Hrm Automation |
    And I click on Search button
    Then Verify "Purple Hrm" is displayed

