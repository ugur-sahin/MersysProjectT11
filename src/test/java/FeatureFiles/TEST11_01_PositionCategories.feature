Feature: Position Categories Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully
    And Click on the element in the left Nav
      | humanResources     |
      | setupThree         |
      | positionCategories |


  Scenario: Add Position Categories
    And Click on the element in the Dialog
      | addButton |
    And User sending the keys in Dialog content
      | nameInput | grup11 |
    And Click on the element in the Dialog
      | saveButton |
    And Success message should be displayed


  Scenario: Edit  Position Categories
    And User editing on the Dialog content ry "grup11" edit "grup11edit"
    And Success message should be displayed


  Scenario: Delete Position Categories
    And User deleting on the dialog content ry "grup11edit"
    And Success message should be displayed














