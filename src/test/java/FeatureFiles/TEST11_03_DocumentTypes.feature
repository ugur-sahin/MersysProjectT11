Feature: Subject Categories

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly


  Scenario: Add ,Edit and Delete Document Types
    And Click on the element in the left Nav IC
      | setupOne |
      | parameters    |
      | DocumentTypes |
    And Click on the element in the Dialog IC
      | addButton |
    And User sending the keys in Dialog content IC
      | nameInput | selimDocuments |
      | Description | myDocuments |
    And Click on the element in the Dialog IC
      | Stage |
      | studentRegistration |
    And Click to TAB Key IC
    And Click on the element in the Dialog IC
      | saveButton |
    And Success massage should be displayed IC
    And User edit item from Dialog IC
      | selimDocuments |
    And User sending the keys in Dialog content IC
      | nameInput | selimDocumentsss |
    And Click on the element in the Dialog IC
      | saveButton |
    And Success massage should be displayed IC
    And User delete item from Dialog IC
      | selimDocumentsss |
    And Success massage should be displayed IC

