Feature: Subject Categories

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly


  Scenario: Add Subject Categories,Edit Subject Categories and Delete Subject Categories
    And Click on the element in the left Nav IC
      | setupOne |
      | parameters    |
      | DocumentTypes |
    And Click on the element in the Dialog IC
      | addButton |
    And User sending the keys in Dialog content IC
      | nameInput | group11 |
      | Description | group11 |
    And Click on the element in the Dialog IC
      | Stage |
      | saveButton |
    And Success massage should be displayed IC
    And User edit item from Dialog IC
      | group11 |
    And User sending the keys in Dialog content IC
      | codeInput | group |
    And Click on the element in the Dialog IC
      | saveButton |
    And Success massage should be displayed IC
    And User delete item from Dialog IC
      | group11 |
    And Success massage should be displayed IC

