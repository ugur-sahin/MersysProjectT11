Feature: Position Categories Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly
    And Click on the element in the left Nav ry
      | humanResources     |
      | setupThree         |
      | positionCategories |

  Scenario: Add Position Categories
    And Click on the element in the Dialog ry
      | addButton |
    And User sending the keys in Dialog content ry
      | nameInput | grup11 |
    And Click on the element in the Dialog ry
      | saveButton |
    And Success message should be displayed ry

  Scenario: Edit  Position Categories
    And User editing on the Dialog content ry "grup11" edit "grup11edit"
    And Success message should be displayed ry

  Scenario: Delete Position Categories
    And User deleting on the dialog content ry "grup11edit"
    And Success message should be displayed ry














