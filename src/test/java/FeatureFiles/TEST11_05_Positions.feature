Feature: Position Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly
    And Click on the element in the left Nav ry
      | humanResources |
      | setupThree     |
      | positions      |

  Scenario: Add Position
    And Click on the element in the Dialog ry
      | addButton |
    And User sending the keys in Dialog content ry
      | nameInput | grup11 |
      | shortName | G11    |
    And Click on the element in the Dialog ry
      | activeBtn  |
      | saveButton |
    And Success message should be displayed ry

  Scenario: Edit  Position
    And User editing on the Dialog content ry "grup11" edit "grup11edit"
    And Success message should be displayed ry

  Scenario: Delete Position
    And User deleting on the dialog content ry "grup11edit"
    And Success message should be displayed ry