Feature: Position Categories Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully
    And Click on the element in the left Nav
      | setupOne    |
      | schoolSetup |
      | locations   |

  Scenario: Location Add
    And Click on the element in the Dialog
      | addButton |
    And User sending the keys in Dialog content
      | nameInput | grup11 |
      | shortName | grup11 |
      | capacity  | 1233   |
    And Click on the element in the Dialog
      | saveButton |
    And Success message should be displayed

  Scenario: Location Edit
    And Click on the element in the Dialog
      | rEdit |
    And User Edit Location in the Dialog Content US
      | nameInput | grup11 edit |
      | shortName | grup11 edit |
      | capacity  | 1233        |
    And Click on the element in the Dialog
      | saveButton |
    And Success message should be displayed

  Scenario: Location Delete
    And Click on the element in the Dialog
      | deleteButton    |
      | deleteDialogBtn |
    And Success message should be displayed












