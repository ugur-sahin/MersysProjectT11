Feature: Position Categories Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly
    And Click on the element in the left Nav ry
      | setupOne    |
      | schoolSetup |
      | locations   |

  Scenario: Location Add
    And Click on the element in the Dialog ry
      | addButton |
    And User sending the keys in Dialog content ry
      | nameInput | grup11 |
      | shortName | grup11 |
      | capacity  | 1233   |
    And Click on the element in the Dialog ry
      | saveButton |
    And Success message should be displayed ry

  Scenario: Location Edit
    And Click on the element in the Dialog ry
      | rEdit |
    And User Edit Location in the Dialog Content US
      | nameInput | grup11 edit |
      | shortName | grup11 edit |
      | capacity  | 1233   |
    And Click on the element in the Dialog ry
      | saveButton |
    And Success message should be displayed ry

  Scenario: Location Delete
    And Click on the element in the Dialog ry
      | deleteButton |
      | deleteDialogBtn |

    And Success message should be displayed ry












