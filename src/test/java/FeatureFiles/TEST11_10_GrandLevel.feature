Feature: Position Categories Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully
    And Click on the element in the left Nav
      | setupOne    |
      | parameters  |
      | gradeLevels |

  Scenario: Location Add
    And Click on the element in the Dialog
      | addButton |
    And User sending the keys in Dialog content
      | nameInput  | 11group |
      | shortName  | 11group |
      | orderInput | 1       |
    And Click on the element in the Dialog
      | saveButton |
    And Success message should be displayed

  Scenario: Location Edit
    And Click on the element in the Dialog
      | rEdit |
    And User Edit Location in the Dialog Content US
      | nameInput  | 11group edit |
      | shortName  | 11group edit |
      | orderInput | 1            |
    And Click on the element in the Dialog
      | saveButton |
    And Success message should be displayed

  Scenario: Location Delete
    And Click on the element in the Dialog
      | deleteButton    |
      | deleteDialogBtn |
    And Success message should be displayed