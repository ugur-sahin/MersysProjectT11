Feature: Position Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully
    And Click on the element in the left Nav
      | humanResources |
      | setupThree     |
      | positions      |

  Scenario: Add Position
    And Click on the element in the Dialog
      | addButton |
    And User sending the keys in Dialog content
      | nameInput | grup11 |
      | shortName | G11    |
    And Click on the element in the Dialog
      | activeBtn  |
      | saveButton |
    And Success message should be displayed

  Scenario: Edit  Position
    And User editing on the Dialog content ry "grup11" edit "grup11edit"
    And Success message should be displayed

  Scenario: Delete Position
    And User deleting on the dialog content ry "grup11edit"
    And Success message should be displayed