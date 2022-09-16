Feature: School Departments Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully
    And Click on the element in the left Nav
      | setupOne    |
      | schoolSetup |
      | departments |

  Scenario: Add School Departments
    And Click on the element in the Dialog
      | addButton |
    And User sending the keys in Dialog content
      | nameInput | grup11 |
      | codeInput | 11     |
    And Click on the element in the Dialog
      | activeBtn |
      | saveButton |
    And Success message should be displayed

  Scenario: Edit School Departments
    And Click on the element in the Dialog
      | rEdit |
    And User Edit Location in the Dialog Content US
      | nameInput | grup11edit |
      | codeInput | 1112       |
    And Click on the element in the Dialog
      | saveButton |
    And Success message should be displayed

  Scenario: Delete School Departments
    And Click on the element in the Dialog
      | deleteButton |
      | deleteDialogBtn |
    And Success message should be displayed

