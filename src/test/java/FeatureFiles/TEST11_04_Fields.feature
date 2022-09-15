Feature: Fields Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly
    And Click on the element in the left Nav ry
      | setupOne    |
      | parameters |
      | fields   |

  Scenario: Fields Add
    And Click on the element in the Dialog stall
      | fieldAdd |
    And User sending the keys in Dialog content ry
      | nameInput | grup11 |
      | codeInput | grup11 |
    And Click on the element in the Dialog ry
      | saveButton |
    And Success message should be displayed ry

  Scenario: Edit  Fields
    And User editing on the Dialog content ry "grup11" edit "grup11edit"
    And Success message should be displayed ry

  Scenario: Delete Fields
    And User deleting on the dialog content ry "grup11edit"
    And Success message should be displayed ry

