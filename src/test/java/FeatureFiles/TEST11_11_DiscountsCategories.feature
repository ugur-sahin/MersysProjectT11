Feature: Discounts Categories

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully


  Scenario: Add ,Edit and Delete Discounts Categories
    And Click on the element in the left Nav
      | setupOne   |
      | parameters |
      | Discounts  |
    And Click on the element in the Dialog
      | addButton |
    And User sending the keys in Dialog content
      | Description2    | Selim  |
      | integrationCode | 1907   |
      | priority        | 545454 |
    And Click on the element in the Dialog
      | saveButton |
    And Success message should be displayed
    And User edit item from Dialog SK
      | Selim |
    And User sending the keys in Dialog content
      | Description2 | Selim01 |
    And Click on the element in the Dialog
      | saveButton |
    And Success message should be displayed
    And User delete item from Dialog SK
      | Selim01 |
    And Success message should be displayed

