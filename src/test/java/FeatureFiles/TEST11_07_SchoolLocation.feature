Feature: Position Categories Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly
    And Click on the element in the left Nav ry
      | setupOne    |
      | schoolSetup |
      | locations   |

  Scenario:
    And Click on the element in the Dialog ry
      | addButton |
    And User sending the keys in Dialog content ry
      | nameInput | grup11 |
      | shortName | grup11 |
      | capacity | 1233 |
    And Click on the element in the Dialog US







