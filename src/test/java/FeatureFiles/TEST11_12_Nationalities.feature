Feature: Subject Categories

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly


  Scenario: Add Nationalities, Edit Nationalities and Delete Nationalities
    And Click on the element in the left Nav
      | setupOne         |
      | parameters    |
      | Nationalities |
    And Click on the element in the Dialog2
      | addButton |
    And User sending the keys in Dialog content2
      | nameInput | group11 |
    And Click on the element in the Dialog2
      | saveButton |
    And Success massage should be displayed2
    And User edit item from Dialog2
      | group11 |
    And User sending the keys in Dialog content2
      | nameInput | group111 |
    And Click on the element in the Dialog2
      | saveButton |
    And Success massage should be displayed2
    And User delete item from Dialog
      | group111 |
    And Success massage should be displayed2

