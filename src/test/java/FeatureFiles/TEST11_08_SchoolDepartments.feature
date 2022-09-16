Feature: School Departments Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly
    And Click on the element in the left Nav ry
      | setupOne    |
      | schoolSetup |
      | departments |

  Scenario: Add School Departments
    And Click on the element in the Dialog ry
      | addButton |
    And User sending the keys in Dialog content ry
      | nameInput | grup11 |
      | codeInput | 11     |
    And Click on the element in the Dialog ry
      | activeBtn |
      | saveButton |
    And Success message should be displayed ry

  Scenario: Edit School Departments
    And Click on the element in the Dialog ry
      | rEdit |
    And User Edit Location in the Dialog Content US
      | nameInput | grup11edit |
      | codeInput | 1112       |
    And Click on the element in the Dialog ry
      | saveButton |
    And Success message should be displayed ry

  Scenario: Delete School Departments
    And Click on the element in the Dialog ry
      | deleteButton |
      | deleteDialogBtn |
    And Success message should be displayed ry

