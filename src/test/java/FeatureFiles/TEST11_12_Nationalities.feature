Feature: Subject Categories

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully


  Scenario: Add Nationalities, Edit Nationalities and Delete Nationalities
    And Click on the element in the left Nav
      | setupOne      |
      | parameters    |
      | nationalities |
    And Click on the element in the Dialog
      | addButton |
    And User sending the keys in Dialog content
      | nameInput | group11 |
    And Click on the element in the Dialog
      | saveButton |
    And Success message should be displayed
    And User edit item from Dialog2
      | group11 |
    And User sending the keys in Dialog content
      | nameInput | group111 |
    And Click on the element in the Dialog
      | saveButton |
    And Success message should be displayed
    And User delete item from Dialog
      | group111 |
    And Success message should be displayed

